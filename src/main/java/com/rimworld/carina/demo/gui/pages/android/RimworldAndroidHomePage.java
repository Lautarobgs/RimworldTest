package com.rimworld.carina.demo.gui.pages.android;


import com.rimworld.carina.demo.mobile.gui.pages.common.WelcomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AbstractPage.class)
public class RimworldAndroidHomePage extends AbstractPage {

    public RimworldAndroidHomePage(WebDriver driver) {
        super(driver);
    }
    public void open() {
        super.open();
    }
}
