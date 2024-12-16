package com.rimworld.carina.demo.rimworldtest;

import com.rimworld.carina.demo.gui.pages.common.RimworldHomePage;
import com.rimworld.carina.demo.gui.pages.desktop.RimworldContributionsPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RimworldWikiTest12 implements IAbstractTest {

    @Test
    @MethodOwner(owner = "franco")
    public void searchUserContributions() {
        WebDriver driver = getDriver();
        RimworldHomePage homePage = new RimworldHomePage(driver) {};
        homePage.open();

        String username = "Franco";

        RimworldContributionsPage contributionsPage = homePage.clickContributions();
        RimworldContributionsPage contributionsPageRefreshed = contributionsPage.clickExtendSpan();
        RimworldContributionsPage contributionsPageResults = contributionsPageRefreshed.writeUsernameForSearch(username);

        String actualMessage = contributionsPageResults.userNotRegisteredMessage();
        Assert.assertEquals(actualMessage, "User account \"" + username + "\" is not registered.",
                "You're not registered.");

    }

}
