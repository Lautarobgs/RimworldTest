package com.rimworld.carina.demo.androidtest;

import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoMain;
import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoStudyGamePage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TakabotoTest9 implements IAbstractTest {

    @Test
    @MethodOwner(owner = "franco")
    public void testDownloadMoreStudyGames() {
        R.CONFIG.put("capabilities.app", "D:\\LABA\\Automation\\APK\\takoboto-1.9.8.apk",true);
        TakabotoMain homePage = new TakabotoMain(getDriver());

        TakabotoStudyGamePage studyGamePage = homePage.goToStudyGamePage();
        TakabotoStudyGamePage newStudyGamePage = studyGamePage.clickDownloadMoreButton();

        Assert.assertTrue(newStudyGamePage.parentPanelIsDisplayed(), "The panel has not appeared.");
    }

}
