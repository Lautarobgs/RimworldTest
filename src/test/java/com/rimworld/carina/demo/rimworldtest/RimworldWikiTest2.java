package com.rimworld.carina.demo.rimworldtest;

import com.rimworld.carina.demo.gui.pages.common.RimworldHomePage;
import com.rimworld.carina.demo.gui.pages.desktop.ViewHistoryPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class RimworldWikiTest2 implements IAbstractTest {

    @DataProvider(name = "dateFormats")
    public Object[][] provideDateFormats() {
        return new Object[][]{
                {"\\d{2}:\\d{2}, \\d{1,2} [A-Za-z]+ \\d{4}"}, // True
                {"\\d{1,2}/\\d{1,2}/\\d{4}"},                // False MM/DD/YYYY
                {"\\d{4}-\\d{2}-\\d{2}"}                     // False Formato ISO (YYYY-MM-DD)
        };
    }

    @Test(dataProvider = "dateFormats")
    @MethodOwner(owner = "lauta")
    public void verifyDatesWithDataProvider(String regex) {
        WebDriver driver = getDriver();

        // Homepage
        RimworldHomePage homePage = new RimworldHomePage(driver) {};
        homePage.open();

        // History Page
        ViewHistoryPage historyPage = homePage.clickHistory();

        // Obtaining dates
        List<String> datesAsString = historyPage.getdatesToString();
        historyPage.printDates(); // Imprime las fechas encontradas

        // Verifying date format
        boolean allValid = datesAsString.stream().allMatch(date -> date.matches(regex));

        Assert.assertTrue(allValid, "Some dates do not match the format: " + regex);
    }
}
