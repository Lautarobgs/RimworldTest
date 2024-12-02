package com.rimworld.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RimworldMaterialsPage extends AbstractPage {
    public RimworldMaterialsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "#ca-talk a")
    private ExtendedWebElement discussionLink;

    public RimworldTalkMaterialsPage clickDiscussion(){
        discussionLink.click();
        return new RimworldTalkMaterialsPage(driver);
    }
}
