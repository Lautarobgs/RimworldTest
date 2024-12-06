package com.rimworld.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RimworldSpecialPages extends AbstractPage {

    @FindBy(css = "#t-specialpages > a")
    private ExtendedWebElement specialPageClick;

    @FindBy(css = "#mw-content-text > div:nth-child(8) > ul > li:nth-child(16) > a")
    private ExtendedWebElement userList;

    public RimworldSpecialPages(WebDriver driver) {
        super(driver);
    }

    public RimworldSpecialPages clickSpecialPage(){
        specialPageClick.click();
        return new RimworldSpecialPages(driver);
    }

    public RimworldUserListPage clickUserList(){
        userList.click();
        return new RimworldUserListPage(driver);
    }
}