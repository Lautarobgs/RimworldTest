package com.rimworld.carina.demo;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class TriviaAPITest {
    @Test
    public void testFetchTriviaQuestions() {
        // URL CONFIG
        RestAssured.baseURI = "https://opentdb.com";

        // GET 10 TRIVIA QUESTIONS
        given()
                .queryParam("amount", 10) // Define the number of questions to fetch
                .queryParam("category", 9) // Specify the category: General Knowledge
                .queryParam("difficulty", "medium") // Set the difficulty level: Medium
                .when()
                .get("/api.php") // Make a GET request to the trivia API endpoint
                .then()
                .log().all()
                .statusCode(200)
                .body("response_code", equalTo(0)) // Ensure there were no errors in the request
                .body("results.size()", equalTo(10)) // Check that 10 questions were returned
                .body("results[0].question", notNullValue()); // Validate that the first question is not null
    }
}

