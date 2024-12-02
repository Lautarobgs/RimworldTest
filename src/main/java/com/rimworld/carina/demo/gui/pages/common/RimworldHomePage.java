package com.rimworld.carina.demo.gui.pages.common;

import com.rimworld.carina.demo.gui.pages.desktop.RimworldMaterialsPage;
import com.rimworld.carina.demo.gui.pages.desktop.RimworldSourcePage;
import com.rimworld.carina.demo.gui.pages.desktop.SearchResultPage;
import com.rimworld.carina.demo.gui.pages.desktop.ViewHistoryPage;
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

    @FindBy(css = "#ca-history > a")
    private ExtendedWebElement  viewHistory;

    @FindBy(css = "a[title='Materials']")
    private ExtendedWebElement materialsLink;

    @FindBy(css = "a[title^='This page is protected.'][accesskey='e']")
    private ExtendedWebElement viewSourceLink;

    public RimworldHomePage(WebDriver driver) {
        super(driver);
    }

    public void typeInSearchBar(String query) {
        searchBar.click();
        searchBar.type(query);
    }

    public RimworldSourcePage clickSourcePage(){
        viewSourceLink.click();
        return new RimworldSourcePage(driver);
    }

    public RimworldSearchresultPage clickSearchButton() {
        searchButton.click();
        return new RimworldSearchresultPage(driver); // Devuelve la página de resultados
    }

    public SearchResultPage clickSearchButton2(){
        searchButton.click();
        return new SearchResultPage(driver);
    }

    public ViewHistoryPage clickHistory(){
        viewHistory.click();
        return new ViewHistoryPage(driver);
    }

    public RimworldMaterialsPage clickMaterials() {
        materialsLink.click();
        return new RimworldMaterialsPage(driver); // Devuelve la página de resultados
    }
    @Override
    public void open() {
        super.open();
    }
}
