package com.rimworld.carina.demo.rimworldtest;

import com.rimworld.carina.demo.gui.pages.common.RimworldHomePage;
import com.rimworld.carina.demo.gui.pages.desktop.RimworldSpecialPages;
import com.rimworld.carina.demo.gui.pages.desktop.RimworldUserListPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RimworldWikiTest10 implements IAbstractTest {
    @Test
    @MethodOwner(owner = "lucas")
    public void checkLogInPageFailed(){
        WebDriver driver = getDriver();
        RimworldHomePage homePage = new RimworldHomePage(driver) {};
        homePage.open();

        RimworldSpecialPages specialPage = homePage.clickSpecial();

        RimworldUserListPage userPage = specialPage.clickUserList();

        String user = "Zesly";
        userPage.clickUsername(user);
        userPage.checkBox1();
        userPage.showAll();
        String response = userPage.showResponse();

        Assert.assertEquals("Zesty",response);

    }
}
