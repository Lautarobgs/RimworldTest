package com.rimworld.carina.demo.gui.pages.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RimworldGuidePage extends AbstractPage {
    @FindBy(xpath = "//*[@id=\"p-logo\"]/a")
    private ExtendedWebElement homeLogo;
    public RimworldGuidePage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageLoaded() {
        return driver.getTitle().contains("Guide"); // Ejemplo: verifica si el título contiene "Guide"
    }
    public void returnHome(){
        this.homeLogo.click();
    }
}
