package com.rimworld.carina.demo.gui.pages.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RimworldSearchresultPage extends AbstractPage {

    @FindBy(id = "mw-search-ns0")
    private ExtendedWebElement checkNs0;

    @FindBy(id = "mw-search-ns2")
    private ExtendedWebElement checkNs2;

    @FindBy(xpath = "//*[@id='mw-content-text']/div[2]/ul[1]/li[1]/div[1]/a")
    private ExtendedWebElement firstResultLink;

    public RimworldSearchresultPage(WebDriver driver) {
        super(driver);
    }

    // Método para desactivar ns0 y activar ns2
    public void toggleCheckboxes() {
        if (checkNs0.isChecked()) {
            checkNs0.click();
        }
        if (!checkNs2.isChecked()) {
            checkNs2.click();
        }
    }

    // Métodos para verificar el estado de los checkboxes (opcional, para pruebas)
    public boolean isCheckNs0Checked() {
        return checkNs0.isChecked();
    }

    public boolean isCheckNs2Checked() {
        return checkNs2.isChecked();
    }

    public RimworldGuidePage clickFirstResult() {
        firstResultLink.click();
        return new RimworldGuidePage(getDriver());
    }

}
