package com.rimworld.carina.demo.rimworldtest;

import com.rimworld.carina.demo.gui.pages.common.HomePageBase;
import com.rimworld.carina.demo.gui.pages.common.RimworldHomePage;
import com.rimworld.carina.demo.gui.pages.desktop.RimworldMaterialsPage;
import com.rimworld.carina.demo.gui.pages.desktop.RimworldTalkMaterialsPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RimworldWikiTest3 implements IAbstractTest {
    @Test
    @MethodOwner(owner = "lauta")
    public void testEdit(){
        WebDriver driver = getDriver();

        // Abre la homepage
        RimworldHomePage homePage = new RimworldHomePage(driver) {};
        homePage.open();

        RimworldMaterialsPage rimworldMaterialsPage = homePage.clickMaterials();
        RimworldTalkMaterialsPage rimworldTalkMaterialsPage = rimworldMaterialsPage.clickDiscussion();
        rimworldTalkMaterialsPage.writeDiscussion("This is a test", "lorem ipsum");

        Assert.assertTrue(rimworldTalkMaterialsPage.areFieldsFilled(), "Both fields must be filled with text.");
    }
}
