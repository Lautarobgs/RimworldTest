package com.rimworld.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class RimworldCreateAccount extends AbstractPage {

    @FindBy(id = "mw-createaccount-join")
    private ExtendedWebElement goToCreate;

    @FindBy(id = "wpName2")
    private ExtendedWebElement usernameField;

    @FindBy(id = "wpPassword2")
    private ExtendedWebElement passwordField;

    @FindBy(id = "wpRetype")
    private ExtendedWebElement confirmPassword;

    @FindBy(id = "wpEmail")
    private ExtendedWebElement emailField;

    @FindBy(id = "wpRealName")
    private ExtendedWebElement nameField;

    @FindBy(id = "wp-input-captchaWord")
    private ExtendedWebElement captcha;

    @FindBy(id = "wpCreateaccount")
    private ExtendedWebElement create;

    public RimworldCreateAccount(WebDriver driver) {
        super(driver);
    }

    public RimworldCreateAccount clickLogIn(){
        goToCreate.click();
        return new RimworldCreateAccount(driver);
    }

    public void typeInEnterUsername(String username){
        usernameField.click();
        usernameField.type(username);
    }

    public void typeInEnterPassword(String password){
        passwordField.click();
        passwordField.type(password);
    }

    public void typeConfirmPassword(String password){
        confirmPassword.click();
        confirmPassword.type(password);
    }

    public void typeEmail(String email){
        emailField.click();
        emailField.type(email);
    }

    public void typeName(String name){
        nameField.click();
        nameField.type(name);
    }

    public void typeCaptcha(String answer){
        captcha.click();
        captcha.type(answer);
    }

    public void clickCreate(){
        create.click();
    }
}
