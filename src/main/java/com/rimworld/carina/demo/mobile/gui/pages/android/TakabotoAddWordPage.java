package com.rimworld.carina.demo.mobile.gui.pages.android;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.mobile.devices.MobileAbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TakabotoAddWordPage extends MobileAbstractPage implements IMobileUtils {
    @FindBy(id = "jp.takoboto:id/contribWordMainPartEditText")
    private ExtendedWebElement japWord;
    @FindBy(id = "jp.takoboto:id/contribWordReadingEditText")
    private ExtendedWebElement romWord;
    @FindBy(id = "jp.takoboto:id/contribWordTranslationEditText")
    private ExtendedWebElement translation;


    public TakabotoAddWordPage(WebDriver driver) {
        super(driver);
    }

    public void writeJapWord(String text){
        japWord.type(text);
    }
    public void writeRomWord(String text){
        romWord.type(text);
    }
    public void writeTranslation(String text){
        romWord.type(text);
    }
    @Override
    public boolean isOpened() {
        return false;
    }
    public boolean areFieldsFilled() {
        // Verifica si los tres campos contienen texto (es decir, si no están vacíos)
        return !japWord.getText().isEmpty() &&
                !romWord.getText().isEmpty() &&
                !translation.getText().isEmpty();
    }
}
