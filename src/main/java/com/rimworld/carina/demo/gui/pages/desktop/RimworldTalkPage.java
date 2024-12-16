package com.rimworld.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RimworldTalkPage extends AbstractPage {

    @FindBy(xpath = "//label[text()='You currently are not able to participate. You can try logging in.']")
    private ExtendedWebElement tryLoggingInLabel;

    @FindBy(css = "input[placeholder='Start a new topic']")
    private ExtendedWebElement startNewTopicInput;

    public RimworldTalkPage(WebDriver driver) {
        super(driver);
    }

    public RimworldTalkPage clickStartNewTopic() {
        startNewTopicInput.click();

        return new RimworldTalkPage(driver);
    }

    public String tryLoggingInMessage() {
        return tryLoggingInLabel.getText();
    }

}
