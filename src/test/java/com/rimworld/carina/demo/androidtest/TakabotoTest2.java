package com.rimworld.carina.demo.androidtest;

import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoFavPage;
import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoMain;
import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoWordPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.R;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TakabotoTest2 implements IAbstractTest {
    @Test
    public void testFavs(){
        R.CONFIG.put("capabilities.app", "C:\\Users\\lauta\\Desktop\\Prog\\takoboto.apk",true);
        TakabotoMain homePage = new TakabotoMain(getDriver());
        homePage.enterWordinSearchbar("bye");

        TakabotoWordPage takabotoWordPage = homePage.goToWordPage();

        homePage = takabotoWordPage.clickFav();

        TakabotoFavPage takabotoFavPage= homePage.goToFavPage();

        assertTrue("El elemento de favoritos no está presente.", takabotoFavPage.isFavWordsPresent());
    }
}
