package com.rimworld.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RimworldTalkMaterialsPage extends AbstractPage {
    protected RimworldTalkMaterialsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "input[placeholder='Start a new topic']")
    private ExtendedWebElement startNewTopicInput;

    @FindBy(css = "textarea[placeholder='Post a new message to \"Talk:Materials\"']")
    private ExtendedWebElement postNewMessageTextarea;
    public void writeDiscussion(String text1, String text2){
        startNewTopicInput.click();
        startNewTopicInput.type(text1);
        postNewMessageTextarea.click();
        postNewMessageTextarea.type(text2);

    }
    public boolean areFieldsFilled() {
        // Check if the input field contains any text
        boolean isInputFilled = !startNewTopicInput.getAttribute("value").trim().isEmpty();

        // Check if the textarea contains any text
        boolean isTextareaFilled = !postNewMessageTextarea.getAttribute("value").trim().isEmpty();

        // Return true only if both fields are filled
        return isInputFilled && isTextareaFilled;
    }
}
