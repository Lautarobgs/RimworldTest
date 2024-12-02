package com.rimworld.carina.demo.gui.pages.common;

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

    public SearchResultPage clickSearchButton2(){
        searchButton.click();
        return new SearchResultPage(driver);
    }

    public ViewHistoryPage clickHistory(){
        viewHistory.click();
        return new ViewHistoryPage(driver);
    }
    @Override
    public void open() {
        super.open();
    }
}
