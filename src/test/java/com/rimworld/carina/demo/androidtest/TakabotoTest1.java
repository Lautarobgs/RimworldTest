package com.rimworld.carina.demo.androidtest;

import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoMain;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TakabotoTest1 implements IAbstractTest {
    @Test
    public void testOpenRimworldHomePage() {
        R.CONFIG.put("capabilities.app", "C:\\Users\\lauta\\Desktop\\Prog\\takoboto.apk",true);
        TakabotoMain homePage = new TakabotoMain(getDriver());
        String textToFind = "hello";  // El texto que estamos buscando
        homePage.enterWordinSearchbar(textToFind);
        // Verificamos si el texto está presente en algún TextView

        boolean isTextFound = homePage.containsText(textToFind);

        // Aseguramos que el texto fue encontrado
        Assert.assertTrue(isTextFound, "El texto no fue encontrado en los TextViews.");

        Assert.assertTrue(true);
    }
}
