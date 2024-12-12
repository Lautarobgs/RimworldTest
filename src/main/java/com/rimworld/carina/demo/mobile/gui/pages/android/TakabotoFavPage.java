package com.rimworld.carina.demo.mobile.gui.pages.android;

import com.zebrunner.carina.utils.android.IAndroidUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.mobile.devices.MobileAbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TakabotoFavPage extends MobileAbstractPage implements IAndroidUtils {

    @FindBy(id = "jp.takoboto:id/foundRowRootLinearLayout")
    private ExtendedWebElement favWords;

    public TakabotoFavPage(WebDriver driver) {
        super(driver);
    }


    @Override
    public boolean isOpened() {
        return false;
    }
    // Método para verificar si el elemento 'favWords' existe
    public boolean isFavWordsPresent() {
        return favWords.isElementPresent();  // Verifica si el elemento está presente en la página
    }

    // Método para verificar si el elemento 'favWords' es visible
    public boolean isFavWordsVisible() {
        return favWords.isVisible();  // Verifica si el elemento es visible en la pantalla
    }
}
