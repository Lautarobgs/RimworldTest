package com.rimworld.carina.demo.rimworldtest;

import com.rimworld.carina.demo.gui.pages.common.RimworldHomePage;
import com.rimworld.carina.demo.gui.pages.desktop.RimWorldRitualsPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RimworldWikiTest6 implements IAbstractTest {

    @Test
    @MethodOwner(owner = "lucas")
    public void linkCheckRituals(){
        WebDriver driver = getDriver();
        RimworldHomePage homePage = new RimworldHomePage(driver) {};
        homePage.open();

        RimWorldRitualsPage rimworldRitualsPage = homePage.clickRituals();
        String actualHref = rimworldRitualsPage.getCurrentUrl();
        String expectedHref = "https://rimworldwiki.com/wiki/Rituals";
        String title = rimworldRitualsPage.getTitle();
        String expectedTitle = "Rituals - RimWorld Wiki";
        Assert.assertEquals(actualHref,expectedHref);
        Assert.assertEquals(title,expectedTitle);
    }
}
