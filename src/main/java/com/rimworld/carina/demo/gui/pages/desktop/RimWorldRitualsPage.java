package com.rimworld.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RimWorldRitualsPage extends AbstractPage {

    public RimWorldRitualsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[title='Rituals']")
    private ExtendedWebElement ritualsLink;

    public RimWorldRitualsPage clickRituals(){
        ritualsLink.click();
        return new RimWorldRitualsPage(driver);
    }
}
