package com.rimworld.carina.demo.mobile.gui.pages.android;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.mobile.devices.MobileAbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TakabotoWordPage extends MobileAbstractPage implements IMobileUtils {

    @FindBy(id = "jp.takoboto:id/WordMenuFavoriteAction")
    private ExtendedWebElement favButton;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    private ExtendedWebElement navigateUpButton;

    public TakabotoWordPage(WebDriver driver) {
        super(driver);
    }

    // Método para hacer clic en el botón de favoritos y regresar a la página principal
    public TakabotoMain clickFav() {
        favButton.click();  // Hacer clic en el botón de favoritos
        navigateUpButton.click();  // Hacer clic en el botón de navegación para volver
        return new TakabotoMain(driver);  // Regresar a la página principal
    }
    @Override
    public boolean isOpened() {
        return false;
    }
}
