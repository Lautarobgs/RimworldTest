package com.rimworld.carina.demo.rimworldtest;

import com.rimworld.carina.demo.gui.pages.common.RimworldHomePage;
import com.rimworld.carina.demo.gui.pages.desktop.RimworldCreateAccount;
import com.rimworld.carina.demo.gui.pages.desktop.RimworldLogInPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RimworldWikiTest9 implements IAbstractTest {

    @Test
    @MethodOwner(owner = "lucas")
    public void failedCreatedAccount(){
        WebDriver driver = getDriver();
        RimworldHomePage homePage = new RimworldHomePage(driver) {};
        homePage.open();

        RimworldLogInPage logInPage = homePage.clickLogin();

        RimworldCreateAccount creatingAccount = logInPage.clickCreate();

        String user = "lucasRibeiro";
        String password = "solvd";
        String confirm = "solvd";
        creatingAccount.typeInEnterUsername(user);
        creatingAccount.typeInEnterPassword(password);
        creatingAccount.typeConfirmPassword(confirm);
        creatingAccount.clickCreate();

        String urlCreateAccount = "https://rimworldwiki.com/index.php?title=Special:CreateAccount&returnto=Main+Page";
        String urlAfterLogin = logInPage.getCurrentUrl();

        Assert.assertEquals(urlCreateAccount,urlAfterLogin);
    }
}
