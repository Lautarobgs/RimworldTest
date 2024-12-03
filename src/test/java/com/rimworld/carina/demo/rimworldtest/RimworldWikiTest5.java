package com.rimworld.carina.demo.rimworldtest;

import com.rimworld.carina.demo.gui.pages.common.RimworldHomePage;
import com.rimworld.carina.demo.gui.pages.desktop.RimworldDraftingPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RimworldWikiTest5 implements IAbstractTest {

    @Test
    @MethodOwner(owner = "lucas")
    public void linkCheckDrafting(){
        WebDriver driver = getDriver();
        RimworldHomePage homePage = new RimworldHomePage(driver) {};
        homePage.open();

        RimworldDraftingPage rimworldDraftingPage = homePage.clickDrafting();
        String actualHref = rimworldDraftingPage.getCurrentUrl();
        String expectedHref = "https://rimworldwiki.com/wiki/Drafting";
        String title = rimworldDraftingPage.getTitle();
        String expectedTitle = "Drafting - RimWorld Wiki";
        Assert.assertEquals(actualHref,expectedHref);
        Assert.assertEquals(title,expectedTitle);
    }
}
