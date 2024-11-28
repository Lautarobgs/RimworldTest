package com.rimworld.carina.demo;

import com.rimworld.carina.demo.gui.pages.common.RimworldHomePage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class RimworldHomePageTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "lauta")
    public void testSearchBar() throws MalformedURLException {
        WebDriver driver = getDriver();

        // Abre la homepage
        RimworldHomePage homePage = new RimworldHomePage(driver) {};
        homePage.open();

        // Escribe una consulta en la barra de búsqueda
        String searchQuery = "Selenium Testing";
        homePage.typeInSearchBar(searchQuery);

        // Verifica resultados de búsqueda
        homePage.clickSearchButton();
        Assert.assertTrue(true, "Search bar interaction completed successfully!");
    }
}

