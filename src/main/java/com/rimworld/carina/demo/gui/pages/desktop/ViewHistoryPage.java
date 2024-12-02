package com.rimworld.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class ViewHistoryPage extends AbstractPage {
    @FindBy(css = "#pagehistory li[data-mw-revid] a.mw-changeslist-date")
    private List<ExtendedWebElement> dates;
    public ViewHistoryPage(WebDriver driver) {
        super(driver);
    }
    public List<String> getdatesToString(){
        return dates.stream()
                .map(ExtendedWebElement::getText)
                .collect(Collectors.toList());
    }
    public void printDates() {
        System.out.println("Number of dates found: " + dates.size());
        dates.forEach(date -> System.out.println(date.getText()));
    }
}
