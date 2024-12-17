package com.rimworld.carina.demo.androidtest;

import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoAddWordPage;
import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoMain;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.R;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TakobotoTest4 implements IAbstractTest {
    @Test
    private void addNewWord(){
        R.CONFIG.put("capabilities.app", "D:\\LABA\\Automation\\APK\\takoboto-1.9.8.apk",true);
        TakabotoMain homepage = new TakabotoMain(getDriver());
        TakabotoAddWordPage takabotoAddWordPage = homepage.goToAddWordPage();
        takabotoAddWordPage.writeJapWord("ロレム");
        takabotoAddWordPage.writeRomWord("lorem");
        takabotoAddWordPage.writeTranslation("lorem");
        assertTrue("Fields are not filled.", takabotoAddWordPage.areFieldsFilled());

    }
}
