package com.rimworld.carina.demo.androidtest;

import com.zebrunner.carina.core.IAbstractTest;
import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoFavPage;
import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoMain;
import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoWordPage;
import com.zebrunner.carina.utils.R;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TabakotoTest6 implements IAbstractTest {

    @Test
    public void testAddFavoriteWord() {
        R.CONFIG.put("capabilities.app", "C:\\Users\\lauta\\Desktop\\Prog\\takoboto.apk", true);
        TakabotoMain homePage = new TakabotoMain(getDriver());

        TakabotoWordPage wordPage = homePage.goToWordPage();

        homePage = wordPage.clickFav();

        TakabotoFavPage favPage = homePage.goToFavPage();
        assertTrue("A palavra não foi adicionada aos favoritos.", favPage.isFavWordsPresent());
    }

}
