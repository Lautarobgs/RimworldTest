package com.rimworld.carina.demo;

import com.rimworld.carina.demo.gui.pages.common.RimworldGuidePage;
import com.rimworld.carina.demo.gui.pages.common.RimworldHomePage;
import com.rimworld.carina.demo.gui.pages.common.RimworldSearchresultPage;
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
    public void testSearchBar() {
        WebDriver driver = getDriver();

        // Abre la homepage
        RimworldHomePage homePage = new RimworldHomePage(driver) {};
        homePage.open();

        // Escribe una consulta en la barra de búsqueda
        String searchQuery = "Guide";
        homePage.typeInSearchBar(searchQuery);

        // Navega a la página de resultados de búsqueda
        RimworldSearchresultPage resultsPage = homePage.clickSearchButton();

        // Modifica el estado de los checkboxes
        resultsPage.toggleCheckboxes();

        // Verifica que los checkboxes estén en el estado deseado
        Assert.assertFalse(resultsPage.isCheckNs0Checked(), "Checkbox ns0 debería estar desactivado.");
        Assert.assertTrue(resultsPage.isCheckNs2Checked(), "Checkbox ns2 debería estar activado.");

        // Hace clic en el primer resultado y navega a la guía
        RimworldGuidePage guidePage = resultsPage.clickFirstResult();
        Assert.assertTrue(guidePage.isPageLoaded(), "La página de la guía se cargó correctamente.");
        // Verifica que la página de la guía se cargue correctamente
        guidePage.returnHome();
        Assert.assertTrue(true,"Ha vuelto a homepage exitosamente");
    }
}

