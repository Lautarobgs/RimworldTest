package com.rimworld.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RimworldBodyPartsPage extends AbstractPage {

    public RimworldBodyPartsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[title='Body parts']")
    private ExtendedWebElement bodyPartsLink;

    public RimworldBodyPartsPage clickBodyParts(){
        bodyPartsLink.click();
        return new RimworldBodyPartsPage(driver);
    }
}
