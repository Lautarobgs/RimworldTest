package com.rimworld.carina.demo.androidtest;

import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoAddWordPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoMain;
import com.zebrunner.carina.utils.R;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TabakotoTest5 implements IAbstractTest {

    @Test
    public void testAddNewWordFlow() {
        R.CONFIG.put("capabilities.app", "C:\\Users\\lauta\\Desktop\\Prog\\takoboto.apk", true);
        TakabotoMain homePage = new TakabotoMain(getDriver());

        // Navegar para a página de adicionar palavra
        TakabotoAddWordPage addWordPage = homePage.goToAddWordPage();

        // Preencher os campos para adicionar a nova palavra
        addWordPage.writeJapWord("こんにちは");
        addWordPage.writeRomWord("konnichiwa");
        addWordPage.writeTranslation("hello");

        // Verificar se todos os campos foram preenchidos
        assertTrue("Os campos de adicionar palavra não foram preenchidos corretamente.", addWordPage.areFieldsFilled());
    }

}
