package com.rimworld.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RimworldUserListPage extends AbstractPage {

    @FindBy(id = "ooui-php-1")
    private ExtendedWebElement username;

    @FindBy(css = "#mw-input-group > div > span")
    private ExtendedWebElement group;

    @FindBy(id = "ooui-php-3")
    private ExtendedWebElement cb1;

    @FindBy(id = "ooui-php-4")
    private ExtendedWebElement cb2;

    @FindBy(id = "ooui-php-5")
    private ExtendedWebElement cb3;

    @FindBy(id = "ooui-php-6")
    private ExtendedWebElement cb4;

    @FindBy(css = "#mw-input-wpsubmit > button > span.oo-ui-labelElement-label")
    private ExtendedWebElement showUsers;

    @FindBy(css = "#mw-content-text > ul > li > a.mw-userlink > bdi")
    private ExtendedWebElement response;

    public RimworldUserListPage(WebDriver driver) {
        super(driver);
    }

    public void toggleCheckboxes() {
        if (cb1.isChecked()) {
            cb1.click();
        }
        if (!cb2.isChecked()) {
            cb2.click();
        }
        if (cb3.isChecked()) {
            cb1.click();
        }
        if (!cb4.isChecked()) {
            cb2.click();
        }
    }

    public boolean isCheckCb1Checked() {
        return cb1.isChecked();
    }

    public boolean isCheckCb2Checked() {
        return cb2.isChecked();
    }

    public boolean isCheckCb3Checked() {
        return cb3.isChecked();
    }

    public boolean isCheckCb4Checked() {
        return cb4.isChecked();
    }

    public void clickUsername(String user){
        username.click();
        username.type(user);
    }

    public void selectGroup(){
        group.click();
        group.select(1);
    }

    public void checkBox1(){
        cb1.click();
    }

    public void checkBox2(){
        cb2.click();
    }

    public void checkBox3(){
        cb3.click();
    }

    public void checkBox4(){
        cb4.click();
    }

    public void showAll(){
        showUsers.click();
    }

    public String showResponse(){
        return response.getText();
    }
}