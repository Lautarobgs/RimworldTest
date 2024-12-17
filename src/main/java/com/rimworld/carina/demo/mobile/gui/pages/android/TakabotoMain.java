package com.rimworld.carina.demo.mobile.gui.pages.android;

import com.zebrunner.carina.utils.android.IAndroidUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.mobile.devices.MobileAbstractPage;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TakabotoMain extends MobileAbstractPage implements IAndroidUtils {

    @FindBy(id = "jp.takoboto:id/editText1")
    private ExtendedWebElement searchBar;
    @FindBy(id = "jp.takoboto:id/textViewFoundRowLine3")
    private List<ExtendedWebElement> textViews;
    @FindBy (id = "jp.takoboto:id/MainMenuFavoritesAction")
    private ExtendedWebElement favPag;
    @FindBy(id = "jp.takoboto:id/MainMenuListsAction")
    private ExtendedWebElement categoryLists;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc='More options']")
    private ExtendedWebElement options;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"jp.takoboto:id/title\" and @text=\"Add a new word\"]")
    private ExtendedWebElement titleText;

    private ExtendedWebElement titleTextView;

    @FindBy(id = "jp.takoboto:id/MainMenuGameAction")
    private ExtendedWebElement studyGame;


    public TakabotoMain(WebDriver driver) {
        super(driver);
    }

    public void enterWordinSearchbar(String word){
        searchBar.click();
        searchBar.type(word);

    }
    public boolean containsText(String text) {
        for (ExtendedWebElement textView : textViews) {
            if (textView.getText().contains(text)) {
                return true;  // Si el texto parcial coincide, retornamos true
            }
        }
        return false;  // Si no se encuentra el texto parcial en ninguno de los TextViews
    }
    public TakabotoFavPage goToFavPage(){
        favPag.click();
        return new TakabotoFavPage(driver);
    }
    public TakabotoWordPage goToWordPage(){
        textViews.get(1).click();
        return new TakabotoWordPage(driver);
    }
    public TakabotoCategoryPage goToCatPage(){
        categoryLists.click();
        return new TakabotoCategoryPage(driver);
    }
    public TakabotoAddWordPage goToAddWordPage(){
        options.click();
        titleTextView.click();
        return new TakabotoAddWordPage(driver);
    }

    public TakabotoStudyGamePage goToStudyGamePage() {
        studyGame.click();

        return new TakabotoStudyGamePage(driver);
    }

    @Override
    public boolean isOpened() {
        return false;
    }
}
