package com.rimworld.carina.demo.rimworldtest;

import com.rimworld.carina.demo.gui.pages.common.RimworldHomePage;
import com.rimworld.carina.demo.gui.pages.desktop.SearchResultPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class RimworldWikiTest1 implements IAbstractTest {
    @DataProvider(name = "searchQueries")
    public Object[][] provideSearchQueries() {
        return new Object[][]{
                {"armors"},
                {"weapons"},
                {"colonists"}
        };
    }

    @Test(dataProvider = "searchQueries")
    @MethodOwner(owner = "lauta")
    public void verifyWordinSearch(String searchQuery) {
        WebDriver driver = getDriver();

        // Opening homepage
        RimworldHomePage homePage = new RimworldHomePage(driver) {};
        homePage.open();

        // Using searchbar
        homePage.typeInSearchBar(searchQuery);
        SearchResultPage results = homePage.clickSearchButton2();

        // Obtaining texts from search results
        List<String> resultsValue = results.getSearchResults();

        resultsValue.forEach(System.out::println);

        // Verifying if all texts contain the word
        boolean allContainWord = resultsValue.stream()
                .allMatch(result -> containsWord(result, searchQuery));

        // Assert
        Assert.assertTrue(allContainWord, "Not all search results contain the word '" + searchQuery + "'.");
    }

    public boolean containsWord(String text, String word) {
        return text != null && word != null && text.toLowerCase().contains(word.toLowerCase());
    }
}
