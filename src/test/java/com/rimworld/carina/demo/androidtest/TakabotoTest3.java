package com.rimworld.carina.demo.androidtest;

import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoCategoryPage;
import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoHiraganaPage;
import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoMain;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.R;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TakabotoTest3 implements IAbstractTest {
    @Test
    public void checkIfCategoryisLoaded(){
        R.CONFIG.put("capabilities.app", "C:\\Users\\lauta\\Desktop\\Prog\\takoboto.apk",true);
        TakabotoMain homepage = new TakabotoMain(getDriver());
        TakabotoCategoryPage takabotoCategoryPage = homepage.goToCatPage();
        TakabotoHiraganaPage takabotoHiraganaPage = takabotoCategoryPage.gotoHiraganaCat();

        assertTrue("Hiragana categories are not loaded.", takabotoHiraganaPage.areLettersLoaded());



    }
}
