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

import java.io.IOException;

/**
 * Created by Polok on 8/29/2016.
 */

public class functionality extends Base {
      @Test(priority = 1)
       public void testlinkEnglish() throws InterruptedException {
           clickByCss("#js-link-box-en>strong");
           sleepFor(3);
       }
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
       public void testClickSearchButton() throws InterruptedException {
           clickByCss(".pure-button.pure-button-primary-progressive");
           sleepFor(3);
       }

       @Test(priority = 12)
       public void testClickSearchButtonThenSearch () throws InterruptedException {
           clickByCss(".pure-button.pure-button-primary-progressive");
           sleepFor(3);
           typeByCssNEnter(".oo-ui-inputWidget-input","Car");
           sleepFor(2);

       }

       @Test(priority = 13)
       public void testSearchLanguageDropDown() throws InterruptedException {
           for (int i = 0; i<58; i++) {
          selectByIndex("searchLanguage", i);}
       }

       @Test(priority = 14)
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
       }
       @Test (priority = 15)
       public void clickAllLinksUnderLanguageButton () throws InterruptedException {
           sleepFor(1);
           scrollToElementById("js-lang-list-button");
           sleepFor(1);
           clickById("js-lang-list-button");
           sleepFor(4);
           clickLinksThatAllHaveSimilarCss(".langlist.hlist>ul>li>a");
       }
       @Test(priority = 16)
       public void testBottomLinks () throws InterruptedException {
       sleepFor(1);
       scrollToElementByCss(".footer-description-text>a");
       sleepFor(1);
       clickByCss(".footer-description-text>a");
       sleepFor(1);
       }
       @Test(priority = 17)
       public void testBottomLinks2 () throws InterruptedException {
           sleepFor(1);
           scrollToElementByCss(".footer-description-text>a");
           sleepFor(1);
           clickLinksThatAllHaveSimilarCss(".privacy-policy-links>a");
       }
       @Test(priority = 18)
       public void testBottomLinks3 () throws InterruptedException {

           sleepFor(1);
           clickLinksThatAllHaveSimilarCss(".other-project-link");
       }
       @Test(priority = 19)
       public void testBottomLinks4 () throws InterruptedException {

           sleepFor(1);
           clickLinksThatAllHaveSimilarCss(".site-license>small>a");
       }

      @Test(priority = 20)
      public void getFrontPageLinks  () throws InterruptedException, IOException {
          sleepFor(1);
          GetLinksOnPage();
      }

       @Test(priority = 21)
       public void searchCarGetLinks () throws InterruptedException, IOException {
           typeByCssNEnter("#searchInput","Car");
           sleepFor(1);
           GetLinksOnPage();

       }

       @Test(priority =22)
       public void loginToWiki () throws InterruptedException {
           typeByCssNEnter("#searchInput","Car");
           sleepFor(1);
           clickByCss("#pt-login>a");
           typeByCss("#wpName1","teamDPNT");
           typeByCssNEnter("#wpPassword1","teamd123");
           sleepFor(3);
       }
       @Test(priority = 23)
       public void testViewSourceLink () throws InterruptedException {
       typeByCssNEnter("#searchInput","Car");
       sleepFor(1);
       clickByCss("#ca-viewsource>span>a");
       sleepFor(1);
   }

       @Test(priority = 24)
       public void testHistoryLink () throws InterruptedException {
       typeByCssNEnter("#searchInput","Car");
       sleepFor(1);
       clickByCss("#ca-history>span>a");
       sleepFor(1);
   }
       @Test(priority = 25)
       public void wikiFrontPageText () {
           getVisibleTextfromPage();
       }

       @Test(priority = 26)
       public void CarPageText () throws InterruptedException {
           typeByCssNEnter("#searchInput","Car");
           sleepFor(1);
           getVisibleTextfromPage();
       }

        @Test(priority = 27)
        public void testTableOfContentsLinks() throws InterruptedException {
        typeByCssNEnter("#searchInput", "Car");
        sleepFor(1);
        clickLinksThatAllHaveSimilarCss2("#toc>ul>li>a");
        sleepFor(1);
        clickLinksThatAllHaveSimilarCss2("#toc>ul>li>ul>li>a");
        sleepFor(1);
    }
    @Test(priority = 28)
    public void testHideTOCButton() throws InterruptedException, IOException {
        typeByCssNEnter("#searchInput","Car");
        sleepFor(1);
        scrollToElementByCss("#togglelink");
        sleepFor(1);
        clickByCss("#togglelink");
        sleepFor(1);
        clickByCss("#togglelink");
        sleepFor(1);
        clickByCss("#togglelink");
        sleepFor(1);
        clickByCss("#togglelink");
    }

    @Test (priority = 29)
    public void testLeftsideLinks () throws InterruptedException {
        typeByCssNEnter("#searchInput","Car");
        sleepFor(1);
        clickLinksThatAllHaveSimilarCss(".body>ul>li>a");
    }

    @Test (priority = 30)
    public void testLeftSideLangSettingsButton () throws InterruptedException {
        typeByCssNEnter("#searchInput", "Car");
        sleepFor(1);
        scrollToElementByCss(".uls-settings-trigger");
        clickByCss(".uls-settings-trigger");
        sleepFor(1);
        clickByCss(".uls-settings-trigger");
        sleepFor(1);
        clickByCss(".uls-settings-trigger");
        sleepFor(1);
    }
    @Test (priority = 31)
    public void testLangSetButDisplayAndInputTabs () throws InterruptedException {
        typeByCssNEnter("#searchInput", "Car");
        sleepFor(1);
        scrollToElementByCss(".uls-settings-trigger");
        sleepFor(1);
        clickByCss(".uls-settings-trigger");
        sleepFor(1);
        clickById("input-panel-trigger");
        sleepFor(1);
        clickById("display-panel-trigger");
        sleepFor(1);
        clickById("input-panel-trigger");
        sleepFor(1);
        clickById("display-panel-trigger");
        sleepFor(1);
    }
    @Test (priority = 32)
    public void testLangSetButDisplayTabOptions () throws InterruptedException {
        typeByCssNEnter("#searchInput", "Car");
        sleepFor(1);
        scrollToElementByCss(".uls-settings-trigger");
        sleepFor(1);
        clickByCss(".uls-settings-trigger");
        sleepFor(1);
        clickByCss("#uls-display-settings-fonts-tab");
        sleepFor(1);
        clickByCss("#uls-display-settings-language-tab");
        sleepFor(1);
        clickByCss("#uls-display-settings-fonts-tab");
        sleepFor(1);
        clickByCss("#uls-display-settings-language-tab");
        sleepFor(1);
    }
    @Test (priority = 33)
    public void testDisplayTabDisplayLang () throws InterruptedException {
        typeByCssNEnter("#searchInput", "Car");
        sleepFor(1);
        scrollToElementByCss(".uls-settings-trigger");
        sleepFor(1);
        clickByCss(".uls-settings-trigger");
        sleepFor(1);
        clickByCss("#uls-display-settings-anon-log-in-cta > p > a");
        sleepFor(1);
        typeByCss("#wpName1", "teamDPNT");
        typeByCssNEnter("#wpPassword1", "teamd123");
        sleepFor(1);
        scrollToElementByCss(".uls-settings-trigger");
        sleepFor(1);
        clickByCss(".uls-settings-trigger");
        sleepFor(1);
        clickByXpath(".//*[@id='languagesettings-settings-panel']/div/div[2]/div[2]/div/button[2]");
        sleepFor(1);
        clickByXpath(".//*[@id='languagesettings-settings-panel']/div/div[2]/div[2]/div/button[3]");
        sleepFor(1);
        clickByXpath(".//*[@id='languagesettings-settings-panel']/div/div[2]/div[2]/div/button[1]");
        sleepFor(1);
        clickByXpath(".//*[@id='languagesettings-settings-panel']/div/div[2]/div[2]/div/button[4]");
        sleepFor(1);
        clickByCss(".uls-icon-back");
        sleepFor(1);
    }
    @Test (priority = 34)
    public void testDisplayTabInputOptions () throws InterruptedException {
        typeByCssNEnter("#searchInput", "Car");
        sleepFor(1);
        scrollToElementByCss(".uls-settings-trigger");
        sleepFor(1);
        clickByCss(".uls-settings-trigger");
        sleepFor(1);
        clickByCss("#input-panel-trigger");
        sleepFor(1);
        clickByCss(".active.mw-ui-constructive.mw-ui-button.uls-input-toggle-button");
        sleepFor(1);
        clickByCss(".active.mw-ui-constructive.mw-ui-button.uls-input-toggle-button");
        sleepFor(1);
    }
    @Test (priority = 35)
    public void testAllImageLinks () throws InterruptedException {
        typeByCssNEnter("#searchInput", "Car");
        sleepFor(1);
        clickLinksThatAllHaveSimilarCss(".image");
    }
    @Test(priority = 36)
    public void testAllCitationlinks () throws InterruptedException {
        typeByCssNEnter("#searchInput", "Car");
        sleepFor(1);
       try{
        clickLinksThatAllHaveSimilarCss2("#mw-content-text>p>sup.reference>a");}
        catch(Exception ex) {
            System.out.println("reference not found");
        }
    }
    @Test(priority = 37)
    public void testHideShowButton() throws InterruptedException {
        typeByCssNEnter("#searchInput", "Car");
        sleepFor(1);
        scrollToElementByCss("#collapseButton0");
        for (int i = 0; i < 6; i++) {
            sleepFor(1);
            clickByCss("#collapseButton"+ i);
            sleepFor(1);
        }
    }
    @Test(priority = 38)
    public void testTalkLink () throws InterruptedException {
        typeByCssNEnter("#searchInput", "Car");
        sleepFor(1);
        clickByCss("#ca-talk>span>a");
        sleepFor(1);
    }
    @Test(priority = 39)
    public void testContribuionsLink() throws InterruptedException {
        typeByCssNEnter("#searchInput", "Car");
        sleepFor(1);
        clickByCss("#pt-anoncontribs>a");
        sleepFor(1);
    }
    @Test(priority = 40)
    public void testAcountSignUpFields() throws InterruptedException {
        typeByCssNEnter("#searchInput", "Car");
        sleepFor(1);
        clickByCss("#pt-createaccount>a");
        sleepFor(1);
        typeByCss("#wpName2", "USERNAME");
        typeByCss("#wpPassword2" ,"PassWord");
        typeByCss("#wpRetype" ,"PassWord");
        typeByCss("#wpEmail", "email");
        sleepFor(3);

    }
    @Test(priority = 41)
    public void testSeeAlsoLinks() throws InterruptedException {
        typeByCssNEnter("#searchInput", "Car");
        sleepFor(1);
        scrollToElementByCss("#See_also");
        sleepFor(1);
        clickLinksThatAllHaveSimilarCss(".div-col.columns.column-width>ul>li>a");
    }
    @Test(priority = 42)
    public void testNotices() throws InterruptedException {
        typeByCssNEnter("#searchInput", "Login");
        sleepFor(1);
        clickByCss("#pt-login>a");
        typeByCss("#wpName1","teamDPNT");
        typeByCssNEnter("#wpPassword1","teamd123");
        sleepFor(1);
        clickByCss(".mw-echo-notifications-badge.mw-echo-notification-badge-nojs");
        sleepFor(3);
    }
    @Test(priority = 43)
    public void testNoticesSeeAll() throws InterruptedException {
        typeByCssNEnter("#searchInput", "Login");
        sleepFor(1);
        clickByCss("#pt-login>a");
        typeByCss("#wpName1", "teamDPNT");
        typeByCssNEnter("#wpPassword1", "teamd123");
        sleepFor(1);
        clickByCss(".mw-echo-notifications-badge.mw-echo-notification-badge-nojs");
        sleepFor(2);
        clickByXpath(".//*[@id='pt-notifications-alert']/div/div[1]/div[3]/div/div[2]/div[1]/a/span[2]");
        sleepFor(1);
        clickByXpath(".//*[@id='mw-content-text']/div/div/div[2]/div[1]/div/div[1]/div/div[2]/a");
        sleepFor(1);
        clickByXpath(".//*[@id='mw-content-text']/div/div/div[2]/div[1]/div/div[1]/div/div[3]/a");
        sleepFor(1);
        clickByXpath(".//*[@id='mw-content-text']/div/div/div[2]/div[1]/div/div[1]/div/div[1]/a");
        sleepFor(1);
        clickByXpath(".//*[@id='mw-content-text']/div/div/div[2]/div[1]/div/div[4]/div/a");
        sleepFor(1);
        clickByXpath(".//*[@id='mw-content-text']/div/div/div[2]/div[1]/div/div[4]/div/div/div[1]/div/div/div[2]");
        sleepFor(1);
        navigateBack();
        sleepFor(1);
        clickByXpath(".//*[@id='mw-content-text']/div/div/div[2]/div[1]/div/div[4]/div/a");
        sleepFor(1);
        clickByXpath(".//*[@id='mw-content-text']/div/div/div[2]/div[1]/div/div[4]/div/div/div[1]/div/div/div[3]");
        navigateBack();
        sleepFor(1);
        clickByXpath(".//*[@id='mw-content-text']/div/div/div[2]/div[2]/div/div/div[2]/div");
        navigateBack();
        sleepFor(1);
    }
    @Test(priority = 44)
    public void testLoginLinks() throws InterruptedException {
        typeByCssNEnter("#searchInput", "Login");
        sleepFor(1);
        clickByCss("#pt-login>a");
        typeByCss("#wpName1", "teamDPNT");
        typeByCssNEnter("#wpPassword1", "teamd123");
        clickLinksThatAllHaveSimilarCss("#p-personal>ul>li>a");
    }

    @Test(priority = 45)
    public void testLoginLinks2() throws InterruptedException {
        typeByCssNEnter("#searchInput", "Login");
        sleepFor(1);
        clickByCss("#pt-login>a");
        typeByCss("#wpName1", "teamDPNT");
        typeByCssNEnter("#wpPassword1", "teamd123");
        sleepFor(1);
        clickLinksThatAllHaveSimilarCss("#mw-normal-catlinks>ul>li>a");
        sleepFor(1);
        clickByCss("#mw-normal-catlinks>a");
        sleepFor(1);
    }
    @Test(priority = 46)
    public void testLoginBottomLinks() throws InterruptedException {
        typeByCssNEnter("#searchInput", "Login");
        sleepFor(1);
        clickByCss("#pt-login>a");
        typeByCss("#wpName1", "teamDPNT");
        typeByCssNEnter("#wpPassword1", "teamd123");
        sleepFor(1);
        clickLinksThatAllHaveSimilarCss("#footer>ul>li>a");
    }
    @Test(priority = 47)
    public void testContributionsPage() throws InterruptedException {
        typeByCssNEnter("#searchInput", "Login");
        sleepFor(1);
        clickByCss("#pt-anoncontribs>a");
        for (int i=0; i<34; i++){
        selectByIndex("namespace",i);}
        sleepFor(1);
        typeByCss("#year", "2016");
        sleepFor(1);
        clickByCss("#newbie");
        sleepFor(1);
        clickByCss("#nsInvert");
        sleepFor(1);
        clickByCss("#associated");
        sleepFor(1);
        typeByCss("#tagfilter","no tag");
        sleepFor(1);
        clickByCss("#mw-show-top-only");
        sleepFor(1);
        clickByCss("#mw-show-new-only");
        sleepFor(1);
        clickByCss("#mw-hide-minor-edits");
        sleepFor(1);
        for(int i = 0; i<13;i++){
        selectByIndex("month", i);}
        sleepFor(1);
    }

    @Test(priority = 48)
    public void testTalkPage() throws InterruptedException {
        typeByCssNEnter("#searchInput", "Login");
        sleepFor(1);
        clickByCss("#pt-login>a");
        typeByCss("#wpName1", "teamDPNT");
        typeByCssNEnter("#wpPassword1", "teamd123");
        sleepFor(1);
        clickByXpath(".//*[@id='pt-mytalk']/a");
        sleepFor(1);
        clickByXpath(".//*[@id='ca-edit']/span/a");
        sleepFor(1);
        typeByXpath(".//*[@id='wpTextbox1']","This is a test");
        sleepFor(1);
        clickByXpath(".//*[@id='wpSave']");
    }
    @Test(priority = 49)
    public void testTalkPageDeletion() throws InterruptedException {
        typeByCssNEnter("#searchInput", "Login");
        sleepFor(1);
        clickByCss("#pt-login>a");
        typeByCss("#wpName1", "teamDPNT");
        typeByCssNEnter("#wpPassword1", "teamd123");
        sleepFor(1);
        clickByXpath(".//*[@id='pt-mytalk']/a");
        sleepFor(1);
        clickByXpath(".//*[@id='ca-edit']/span/a");
        sleepFor(1);
        clearInputField(".//*[@id='wpTextbox1']");
        clickByXpath(".//*[@id='wpSave']");
    }
    @Test(priority = 50)
    public void testTalkPageButtons() throws InterruptedException {
        typeByCssNEnter("#searchInput", "Login");
        sleepFor(1);
        clickByCss("#pt-login>a");
        typeByCss("#wpName1", "teamDPNT");
        typeByCssNEnter("#wpPassword1", "teamd123");
        sleepFor(1);
        clickByXpath(".//*[@id='pt-mytalk']/a");
        sleepFor(1);
        clickByXpath(".//*[@id='ca-edit']/span/a");
        sleepFor(1);
        clickByXpath(".//*[@id='wikiEditor-section-main']/div[1]/a[1]");
        sleepFor(1);
        clickByXpath(".//*[@id='wikiEditor-section-main']/div[1]/a[2]");
        sleepFor(1);
        clickByXpath(".//*[@id='wikiEditor-section-main']/div[2]/a[1]");
        sleepFor(1);
        clickByCss(".tab.tab-advanced>a");
        sleepFor(1);
        clickByCss(".tab.tab-characters>a");
        sleepFor(1);
        clickByCss(".tab.tab-help>a");
        sleepFor(1);
        clickByCss(".tab.tab-cites>a");
        sleepFor(1);
        clearInputField(".//*[@id='wpTextbox1']");
        sleepFor(1);
        clickByXpath(".//*[@id='wpSave']");
        sleepFor(1);
    }
}

