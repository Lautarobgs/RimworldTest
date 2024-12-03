package com.rimworld.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RimworldDraftingPage extends AbstractPage {

    public RimworldDraftingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[title='Drafting']")
    private ExtendedWebElement draftingLink;

    public RimworldDraftingPage clickDrafting(){
        draftingLink.click();
        return new RimworldDraftingPage(driver);
    }
}
