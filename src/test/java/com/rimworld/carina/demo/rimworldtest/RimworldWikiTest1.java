package com.rimworld.carina.demo.rimworldtest;

import com.rimworld.carina.demo.gui.pages.common.RimworldHomePage;
import com.rimworld.carina.demo.gui.pages.desktop.SearchResultPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class RimworldWikiTest1 implements IAbstractTest {
    @Test
    @MethodOwner(owner = "lauta")
    public void verifyWordinSearch(){
        WebDriver driver = getDriver();

        // Abre la homepage
        RimworldHomePage homePage = new RimworldHomePage(driver) {};
        homePage.open();

        // Escribe una consulta en la barra de búsqueda
        String searchQuery = "armor"; // Palabra a buscar
        homePage.typeInSearchBar(searchQuery);
        SearchResultPage results = homePage.clickSearchButton2();

        // Obtiene los textos de los resultados de búsqueda
        List<String> resultsValue = results.getSearchResults();

        // Optional
        //resultsValue.forEach(System.out::println);

        // Verifica si todos los textos contienen la palabra
        boolean allContainWord = resultsValue.stream()
                .allMatch(result -> containsWord(result, searchQuery));

        // Assert para comprobar la condición
        Assert.assertTrue(allContainWord, "Not all search results contain the word 'armor'.");
    }
    public boolean containsWord(String text, String word) {
        return text != null && word != null && text.toLowerCase().contains(word.toLowerCase());
    }
}
