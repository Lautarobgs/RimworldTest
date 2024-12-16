package com.rimworld.carina.demo.rimworldtest;

import com.rimworld.carina.demo.gui.pages.common.RimworldHomePage;
import com.rimworld.carina.demo.gui.pages.desktop.RimWorldWikiAboutPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RimworldWikiTest13 implements IAbstractTest {

    @Test
    @MethodOwner(owner = "franco")
    public void checkRegisteredUsers() {
        WebDriver driver = getDriver();
        RimworldHomePage homePage = new RimworldHomePage(driver) {};
        homePage.open();

        RimWorldWikiAboutPage aboutPage = homePage.clickAboutRimWorldWikiLink();

        int greaterThan = 2000; // <= 3957 fails the test
        int numberUsersRegistered = Integer.parseInt(aboutPage.getNumberOfRegisteredUsers().replace(",", ""));

        Assert.assertTrue(aboutPage.registeredUsersIsGreaterThan(numberUsersRegistered, greaterThan),
                "The actual number of users registered is " + numberUsersRegistered );
    }

}
