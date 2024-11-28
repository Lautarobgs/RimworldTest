package com.rimworld.carina.demo.gui.pages.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class RimworldHomePage extends AbstractPage {


    @FindBy(id = "searchInput")
    private ExtendedWebElement searchBar;

    @FindBy(id = "searchButton")
    private ExtendedWebElement searchButton;

    public RimworldHomePage(WebDriver driver) {
        super(driver);
    }

    // Método para escribir en la barra de búsqueda
    public void typeInSearchBar(String query) {
        searchBar.click();
        searchBar.type(query);  // Escribir la consulta en la barra de búsqueda
    }

    // Método para hacer clic en el botón de búsqueda
    public void clickSearchButton() {
        searchButton.click();  // Hacer clic en el boton de busqueda
    }

    @Override
    public void open() {
        super.open();

    }
}
