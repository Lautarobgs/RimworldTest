package com.rimworld.carina.demo.androidtest;

import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoCategoryPage;
import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoMain;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TakabotoTest10 implements IAbstractTest {

    @Test
    @MethodOwner(owner = "franco")
    public void testSubscribedMessageHasBeenHidden() {
        R.CONFIG.put("capabilities.app", "D:\\LABA\\Automation\\APK\\takoboto-1.9.8.apk",true);
        TakabotoMain homePage = new TakabotoMain(getDriver());

        TakabotoCategoryPage categoryPage = homePage.goToCatPage();
        TakabotoCategoryPage categoryPage1 = categoryPage.clickOnlineTextView();
        TakabotoCategoryPage categoryPage2 = categoryPage1.clickOnlineHideButton();

        Assert.assertFalse(categoryPage2.subscribedMembersPanelHasDisappeared(), "The message is still there.");
    }

}
