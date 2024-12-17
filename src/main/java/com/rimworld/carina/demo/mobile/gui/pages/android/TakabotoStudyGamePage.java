package com.rimworld.carina.demo.mobile.gui.pages.android;

import com.zebrunner.carina.utils.android.IAndroidUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.mobile.devices.MobileAbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TakabotoStudyGamePage extends MobileAbstractPage implements IAndroidUtils {

    @FindBy(id = "jp.takoboto:id/gameSelectorButtonDownloadMore")
    private ExtendedWebElement downloadMoreButton;

    @FindBy(id = "android:id/parentPanel")
    private ExtendedWebElement parentPanel;

    public TakabotoStudyGamePage(WebDriver driver) {
        super(driver);
    }

    public TakabotoStudyGamePage clickDownloadMoreButton() {
        downloadMoreButton.click();

        return new TakabotoStudyGamePage(driver);
    }

    public boolean parentPanelIsDisplayed() {
        return parentPanel.isElementPresent();
    }

    @Override
    public boolean isOpened() {
        return false;
    }
}
