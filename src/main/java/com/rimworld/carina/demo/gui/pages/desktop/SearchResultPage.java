package com.rimworld.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class SearchResultPage extends AbstractPage {

    @FindBy(css = ".mw-search-results > .mw-search-result > .searchresult")
    private List<ExtendedWebElement> searchResults;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }
    public List<String> getSearchResults(){
       return searchResults.stream()
               .map(ExtendedWebElement::getText)
               .collect(Collectors.toList());
    }
}
