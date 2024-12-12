package com.rimworld.carina.demo.mobile.gui.pages.android;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.mobile.devices.MobileAbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TakabotoHiraganaPage extends MobileAbstractPage implements IMobileUtils {

    @FindBy(id = "jp.takoboto:id/foundRowRootLinearLayout")
    private List<ExtendedWebElement> letters;
    public TakabotoHiraganaPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return false;
    }
    public boolean areLettersLoaded() {
        // Verificar si la lista de 'letters' tiene elementos
        return !letters.isEmpty();  // Devuelve true si la lista tiene elementos, false si está vacía
    }

}
