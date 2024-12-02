package com.rimworld.carina.demo.rimworldtest;

import com.rimworld.carina.demo.gui.pages.common.RimworldHomePage;
import com.rimworld.carina.demo.gui.pages.desktop.ViewHistoryPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class RimworldWikiTest2 implements IAbstractTest {
    @Test
    @MethodOwner(owner = "lauta")
    private void verifyDates() {
        WebDriver driver = getDriver();

        //Homepage
        RimworldHomePage homePage = new RimworldHomePage(driver) {};
        homePage.open();

        // HistoryPage
        ViewHistoryPage historyPage = homePage.clickHistory();

        // Obtaining dates
        List<String> datesAsString = historyPage.getdatesToString();
        historyPage.printDates();  // Imprime las fechas encontradas

        // Verifying date format
        boolean allValid = datesAsString.stream().allMatch(this::isValidFormat);

        Assert.assertTrue(allValid, "Some dates are not in the valid format.");
    }


    public boolean isValidFormat(String input) {
        // Regex
        String regex = "\\d{2}:\\d{2}, \\d{1,2} [A-Za-z]+ \\d{4}";
        return input.matches(regex);
    }
}
