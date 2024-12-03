package com.rimworld.carina.demo.rimworldtest;

import com.rimworld.carina.demo.gui.pages.common.RimworldHomePage;
import com.rimworld.carina.demo.gui.pages.desktop.RimworldBodyPartsPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RimworldWikiTest7 implements IAbstractTest {

    @Test
    @MethodOwner(owner = "lucas")
    public void linkCheckBodyParts(){
        WebDriver driver = getDriver();
        RimworldHomePage homePage = new RimworldHomePage(driver) {};
        homePage.open();

        RimworldBodyPartsPage rimworldBodyPartsPage = homePage.clickBodyParts();
        String actualHref = rimworldBodyPartsPage.getCurrentUrl();
        String expectedHref = "https://rimworldwiki.com/wiki/Body_Parts";
        String title = rimworldBodyPartsPage.getTitle();
        String expectedTitle = "Body Parts - RimWorld Wiki";
        Assert.assertEquals(actualHref,expectedHref);
        Assert.assertEquals(title,expectedTitle);
    }
}
