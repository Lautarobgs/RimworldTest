package com.rimworld.carina.demo.androidtest;

import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoMain;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.R;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;

public class TabakotoTest8 implements IAbstractTest{

    @Test
    public void testSearchFunctionality() {
        R.CONFIG.put("capabilities.app", "C:\\Users\\lauta\\Desktop\\Prog\\takoboto.apk", true);
        TakabotoMain homePage = new TakabotoMain(getDriver());

        // Realizar a busca
        homePage.enterWordinSearchbar("こんにちは");

        // Verificar se o texto de pesquisa foi encontrado na tela
        assertTrue("A palavra não foi encontrada na lista de resultados.", homePage.containsText("こんにちは"));
    }

}
