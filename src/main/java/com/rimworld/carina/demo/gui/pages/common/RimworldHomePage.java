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

    public void typeInSearchBar(String query) {
        searchBar.click();
        searchBar.type(query);
    }

    public RimworldSearchresultPage clickSearchButton() {
        searchButton.click();
        return new RimworldSearchresultPage(driver); // Devuelve la página de resultados
    }

    @Override
    public void open() {
        super.open();
    }
}
