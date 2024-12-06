package com.rimworld.carina.demo.gui.pages.desktop;

import com.rimworld.carina.demo.gui.pages.common.RimworldSearchresultPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RimworldLogInPage extends AbstractPage {


    @FindBy(id = "wpName1")
    private ExtendedWebElement usernameField;

    @FindBy(id = "wpPassword1")
    private ExtendedWebElement passwordField;

    @FindBy(id = "wpRemember")
    private ExtendedWebElement keepLogged;

    @FindBy(id = "wpLoginAttempt")
    private ExtendedWebElement tryLogin;

    @FindBy(id = "pt-login")
    private ExtendedWebElement logInLink;

    @FindBy(id = "mw-createaccount-join")
    private ExtendedWebElement goToCreate;

    public RimworldLogInPage(WebDriver driver) {
        super(driver);
    }

    public void typeInEnterUsername(String username){
        usernameField.click();
        usernameField.type(username);
    }

    public void typeInEnterPassword(String password){
        passwordField.click();
        passwordField.type(password);
    }

    public void tryingToLogin(){
        tryLogin.click();
    }

    public RimworldLogInPage clickLogIn(){
        logInLink.click();
        return new RimworldLogInPage(driver);
    }

    public RimworldCreateAccount clickCreate(){
        goToCreate.click();
        return new RimworldCreateAccount(driver);
    }

}
