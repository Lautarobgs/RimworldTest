package com.rimworld.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RimWorldWikiAboutPage extends AbstractPage {

    @FindBy(css = "a[title='Special:ListUsers'] b")
    private ExtendedWebElement numberOfRegisteredUsers;

    public RimWorldWikiAboutPage(WebDriver driver) {
        super(driver);
    }

    public String getNumberOfRegisteredUsers() {
        return numberOfRegisteredUsers.getText();
    }

    public boolean registeredUsersIsGreaterThan(int actualValue, int testValue) {
        return testValue > actualValue;
    }

}
