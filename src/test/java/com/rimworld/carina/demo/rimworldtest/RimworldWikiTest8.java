package com.rimworld.carina.demo.rimworldtest;

import com.rimworld.carina.demo.gui.pages.common.RimworldHomePage;
import com.rimworld.carina.demo.gui.pages.desktop.RimworldLogInPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RimworldWikiTest8 implements IAbstractTest {

    @Test
    @MethodOwner(owner = "lucas")
    public void checkLogInPageFailed(){
        WebDriver driver = getDriver();
        RimworldHomePage homePage = new RimworldHomePage(driver) {};
        homePage.open();

        RimworldLogInPage logInPage = homePage.clickLogin();
        String user = "lucasRibeiro";
        String password = "solvd";
        logInPage.typeInEnterUsername(user);
        logInPage.typeInEnterPassword(password);
        logInPage.tryingToLogin();

        String urlLogin = "https://rimworldwiki.com/index.php?title=Special:UserLogin&returnto=Main+Page";
        String urlAfterLogin = logInPage.getCurrentUrl();

        Assert.assertEquals(urlLogin,urlAfterLogin);
    }
}
