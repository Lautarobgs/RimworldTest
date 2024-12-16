package com.rimworld.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RimworldContributionsPage extends AbstractPage {

    @FindBy(xpath = "//span[text()='Expand']")
    private ExtendedWebElement expandSpan;

    @FindBy(id = "ooui-php-3")
    private ExtendedWebElement usernameInput;

    @FindBy(css = "button.oo-ui-inputWidget-input > span.oo-ui-labelElement-label")
    private ExtendedWebElement searchButton;

    @FindBy(css = "div.mw-userpage-userdoesnotexist.error > p")
    private ExtendedWebElement userNotRegisteredParagraph;

    public RimworldContributionsPage(WebDriver driver) {
        super(driver);
    }

    public RimworldContributionsPage clickExtendSpan() {
        expandSpan.click();

        return new RimworldContributionsPage(driver);
    }

    public RimworldContributionsPage writeUsernameForSearch(String username) {
        usernameInput.click();
        usernameInput.type(username);
        searchButton.click();

        return new RimworldContributionsPage(driver);
    }

    public String userNotRegisteredMessage() {
        return userNotRegisteredParagraph.getText();
    }

}
