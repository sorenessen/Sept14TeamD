package FrontPage;

import common.Base;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Created by Polok on 8/29/2016.
 */

public class functionality extends Base {
   @Test(priority = 1)
    public void testlinkEnglish() throws InterruptedException {
        clickByCss("#js-link-box-en>strong");
        sleepFor(3);
    }/*
    @Test(priority = 2)
    public void testlinkNihongo() throws InterruptedException {
        clickByCss("#js-link-box-ja>strong");
        sleepFor(3);
    }
    @Test(priority = 3)
    public void testlinkDeutsch() throws InterruptedException {
        clickByCss("#js-link-box-de>strong");
        sleepFor(3);
    }
    @Test(priority = 4)
    public void testlinkItaliano() throws InterruptedException {
        clickByCss("#js-link-box-it>strong");
        sleepFor(3);
    }
    @Test(priority = 5)
    public void testlinkZhongwen() throws InterruptedException {
        clickByCss("#js-link-box-zh>strong");
        sleepFor(3);
    }
    @Test(priority = 6)
    public void testlinkRusskiy() throws InterruptedException {
        clickByCss("#js-link-box-ru>strong");
        sleepFor(3);
    }
    @Test(priority = 7)
    public void testlinkEspanol() throws InterruptedException {
        clickByCss("#js-link-box-es>strong");
        sleepFor(3);
    }
    @Test(priority = 8)
    public void testlinkFrancais() throws InterruptedException {
        clickByCss("#js-link-box-fr>strong");
        sleepFor(3);
    }
    @Test(priority = 9)
    public void testlinkPortugues() throws InterruptedException {
        clickByCss("#js-link-box-pt>strong");
        sleepFor(3);
    }
    @Test(priority = 10)
    public void testlinkPolski() throws InterruptedException {
        clickByCss("#js-link-box-pl>strong");
        sleepFor(3);
    }
    @Test(priority = 11)
    public void testSearchButton() throws InterruptedException {
        clickByCss(".pure-button.pure-button-primary-progressive");
        sleepFor(3);
    }
   @Test(priority = 12)
    public void testSearchLanguageDropDown() throws InterruptedException {
       selectByValue("searchLanguage", "ar");
       selectByValue("searchLanguage", "az");
       selectByValue("searchLanguage", "bg");
       selectByValue("searchLanguage", "nan");
       selectByValue("searchLanguage", "be");
       selectByValue("searchLanguage", "ca");
       selectByValue("searchLanguage", "cs");
       selectByValue("searchLanguage", "da");
       selectByValue("searchLanguage", "de");
       selectByValue("searchLanguage", "et");
       selectByValue("searchLanguage", "el");
       selectByValue("searchLanguage", "en");
       selectByValue("searchLanguage", "es");
       selectByValue("searchLanguage", "eo");
       selectByValue("searchLanguage", "eu");
       selectByValue("searchLanguage", "fa");
       selectByValue("searchLanguage", "fr");
       selectByValue("searchLanguage", "gl");
       selectByValue("searchLanguage", "ko");
       selectByValue("searchLanguage", "hy");
       selectByValue("searchLanguage", "hr");
       selectByValue("searchLanguage", "hi");
       selectByValue("searchLanguage", "id");
       selectByValue("searchLanguage", "it");
       selectByValue("searchLanguage", "he");
       selectByValue("searchLanguage", "ka");
       selectByValue("searchLanguage", "la");
       selectByValue("searchLanguage", "lt");
       selectByValue("searchLanguage", "hu");
       selectByValue("searchLanguage", "ms");
       selectByValue("searchLanguage", "min");
       selectByValue("searchLanguage", "nl");
       selectByValue("searchLanguage", "ja");
       selectByValue("searchLanguage", "no");
       selectByValue("searchLanguage", "nn");
       selectByValue("searchLanguage", "ce");
       selectByValue("searchLanguage", "uz");
       selectByValue("searchLanguage", "pl");
       selectByValue("searchLanguage", "pt");
       selectByValue("searchLanguage", "kk");
       selectByValue("searchLanguage", "ro");
       selectByValue("searchLanguage", "ru");
       selectByValue("searchLanguage", "simple");
       selectByValue("searchLanguage", "ceb");
       selectByValue("searchLanguage", "sk");
       selectByValue("searchLanguage", "sl");
       selectByValue("searchLanguage", "sr");
       selectByValue("searchLanguage", "sh");
       selectByValue("searchLanguage", "fi");
       selectByValue("searchLanguage", "sv");
       selectByValue("searchLanguage", "th");
       selectByValue("searchLanguage", "tr");
       selectByValue("searchLanguage", "uk");
       selectByValue("searchLanguage", "ur");
       selectByValue("searchLanguage", "vi");
       selectByValue("searchLanguage", "vo");
       selectByValue("searchLanguage", "war");
       selectByValue("searchLanguage", "zh");

    }

@Test(priority = 13)
public void testReadInYourLanguageButton () throws InterruptedException {
    sleepFor(3);
    scrollToElementById("js-lang-list-button");
    sleepFor(4);
    clickById("js-lang-list-button");
    sleepFor(1);
    clickById("js-lang-list-button");
    sleepFor(1);
    clickById("js-lang-list-button");
    sleepFor(1);
    clickById("js-lang-list-button");
    sleepFor(1);

}*/
 /* @Test
    public void testReadinYourLanguageButtonLinks () throws InterruptedException {
      sleepFor(3);
      scrollToElementById("js-lang-list-button");
      sleepFor(4);
      clickById("js-lang-list-button");
      sleepFor(2);
      clickByCss(".langlist.langlist-large.hlist>ul>li>a");
      sleepFor(2);
  }


 @Test (priority = 14)
    public void clickAllLinks () throws InterruptedException {
     sleepFor(1);
     scrollToElementById("js-lang-list-button");
     sleepFor(1);
     clickById("js-lang-list-button");
     sleepFor(4);
     clickLinksThatAllHaveSimilarCss(".langlist.langlist-large.hlist>ul>li>a");
 }*/
}


