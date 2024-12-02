package com.rimworld.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RimworldSourcePage extends AbstractPage {
    public RimworldSourcePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "wpTextbox1")
    private ExtendedWebElement textBox;
    public boolean isTextAreaNotEmpty() {
        String text = textBox.getAttribute("value");
        return text != null && !text.isEmpty();
    }
    public String checkText(){
        return textBox.getAttribute("value");
    }
}
