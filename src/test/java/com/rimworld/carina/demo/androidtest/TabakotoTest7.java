package com.rimworld.carina.demo.androidtest;

import com.zebrunner.carina.core.IAbstractTest;
import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoCategoryPage;
import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoMain;
import com.rimworld.carina.demo.mobile.gui.pages.android.TakabotoHiraganaPage;
import com.zebrunner.carina.utils.R;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;

public class TabakotoTest7 implements IAbstractTest {

    @Test
    public void testCategoryNavigation() {
        R.CONFIG.put("capabilities.app", "C:\\Users\\lauta\\Desktop\\Prog\\takoboto.apk", true);
        TakabotoMain homePage = new TakabotoMain(getDriver());

        // Navegar para a página de categorias
        TakabotoCategoryPage categoryPage = homePage.goToCatPage();

        // Verificar se a categoria Hiragana está presente
        assertTrue("A categoria Hiragana não foi encontrada.", categoryPage.getHiraganaCategoryText().contains("Hiragana"));

        // Clicar na categoria Hiragana e garantir que a página de Hiragana foi aberta
        TakabotoHiraganaPage hiraganaPage = categoryPage.gotoHiraganaCat();
        assertTrue("A página Hiragana não foi carregada corretamente.", hiraganaPage.areLettersLoaded());
    }

}
