package com.rimworld.carina.demo.mobile.gui.pages.android;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.mobile.devices.MobileAbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TakabotoCategoryPage extends MobileAbstractPage implements IMobileUtils {

    public TakabotoCategoryPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//android.widget.TextView[@text='OFFICIAL']")
    private ExtendedWebElement officialTextView;

    @FindBy(xpath = "//android.widget.TextView[@text='Hiragana\n71 words']")
    private ExtendedWebElement hiraganaCategory;

    public TakabotoHiraganaPage gotoHiraganaCat(){
        officialTextView.click();
        hiraganaCategory.click();
        return new TakabotoHiraganaPage(driver);
    }

    @Override
    public boolean isOpened() {
        return false;
    }

    public String getHiraganaCategoryText() {
        return hiraganaCategory.getText();
    }

}
