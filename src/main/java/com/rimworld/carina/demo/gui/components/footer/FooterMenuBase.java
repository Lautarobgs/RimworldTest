package com.rimworld.carina.demo.gui.components.footer;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import com.rimworld.carina.demo.gui.pages.common.HomePageBase;
import com.rimworld.carina.demo.gui.pages.common.NewsPageBase;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;

public abstract class FooterMenuBase extends AbstractUIObject {

    public FooterMenuBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract NewsPageBase openNewsPage();

    public abstract HomePageBase openHomePage();
}
