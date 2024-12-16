package com.rimworld.carina.demo.rimworldtest;

import com.rimworld.carina.demo.gui.pages.common.RimworldHomePage;
import com.rimworld.carina.demo.gui.pages.desktop.RimworldTalkPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RimworldWikiTest11 implements IAbstractTest {

    @Test
    @MethodOwner(owner = "franco")
    public void startNewTopicWithoutLoggingIn() {
        WebDriver driver = getDriver();
        RimworldHomePage homePage = new RimworldHomePage(driver) {};
        homePage.open();

        RimworldTalkPage talkPage = homePage.clickTalk();
        RimworldTalkPage talkPageRefreshed = talkPage.clickStartNewTopic();

        String actualMessage = talkPageRefreshed.tryLoggingInMessage();
        Assert.assertEquals(actualMessage, "You currently are not able to participate. You can try logging in.",
                "Failed because you're not logged in.");

    }

}
