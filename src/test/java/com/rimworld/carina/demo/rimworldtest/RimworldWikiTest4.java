package com.rimworld.carina.demo.rimworldtest;

import com.rimworld.carina.demo.gui.pages.common.RimworldHomePage;
import com.rimworld.carina.demo.gui.pages.desktop.RimworldSourcePage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RimworldWikiTest4 implements IAbstractTest {
    @Test
    @MethodOwner(owner = "lauta")
    private void checkSource(){
        WebDriver driver = getDriver();

        // Abre la homepage
        RimworldHomePage homePage = new RimworldHomePage(driver) {};
        homePage.open();
        RimworldSourcePage rimworldSourcePage = homePage.clickSourcePage();
        System.out.println(rimworldSourcePage.checkText());
        Assert.assertTrue(rimworldSourcePage.isTextAreaNotEmpty(), "Field must have a text");
    }

}
