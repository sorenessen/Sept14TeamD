package maintenance;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.server.Session;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import sun.security.util.ByteArrayTagOrder;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by soren on 8/29/2016.
 */
public class Repair extends Base {

    @Test
    //Test1---login: teampnt2016@gmail.com ---- password: automation
    public void AccountLogin() throws InterruptedException {


        clickByXpath(".//*[@id='home-page-top']/div/div[1]/a[2]");
        byLinks("Log In");
        typeByCss("#email", "demobooby@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#password", "password");
        sleepFor(3);
////            clickByCss("#loginBtn");
////            sleepFor(3);


    }

    @Test
    //test2
    public void SearchTools() throws InterruptedException {
        typeByCss("#searchForm", "iphone");
        sleepFor(1);
    }

    @Test
    //test3
    public void TestToolkit() throws InterruptedException {
        clickByXpath(".//*[@id='featuredToolsSection']/div[1]/div/a[1]/h6");
        sleepFor(1);
    }

    @Test
    //test4
    public void TestDriverKit() throws InterruptedException {
        clickByXpath(".//*[@id='featuredToolsSection']/div[2]/div/a[1]/h6");
        sleepFor(1);
        //driver.findElements(By.className(".div.tool-feature"));
    }

    @Test
    public void TestGoPro() throws InterruptedException {
        clickByXpath(".//*[@id='featuredPartsSection']/div[1]/a[1]/h6");
        sleepFor(1);


    }

    @Test
    public void TestKindleFire() throws InterruptedException {
        clickByXpath(".//*[@id='featuredPartsSection']/div[2]/a[1]/h6");
        sleepFor(1);
    }

    @Test
    public void TestIPhoneBattery() throws InterruptedException {
        clickByXpath(".//*[@id='featuredPartsSection']/div[3]/a[1]/h6");
        sleepFor(1);
    }

    @Test
    public void TestIPadDigitizer() throws InterruptedException {
        clickByXpath(".//*[@id='featuredPartsSection']/div[4]/a[1]/h6");
        sleepFor(1);
    }

    @Test
    public void TestIMacHardDriveKit() throws InterruptedException {
        clickByXpath(".//*[@id='featuredPartsSection']/div[5]/a[1]/h6");
        sleepFor(1);
    }

    @Test
    public void TestHeadphoneJack() throws InterruptedException {
        clickByXpath(".//*[@id='featuredPartsSection']/div[6]/a[1]/h6");
        sleepFor(1);
    }

    @Test
    public void TestFeaturedRepair() throws InterruptedException {
        clickByCss(".view-guide-link.visible-desktop");
        sleepFor(2);
    }

    @Test
    public void TestPartsStore() throws InterruptedException {
        clickByCss("#homepageStoreLink");
        sleepFor(2);
    }

    @Test
    public void TestRepairGuides() throws InterruptedException {
        clickByXpath(".//*[@id='home-page-top']/nav/a[1]");
        sleepFor(2);
    }

    @Test
    public void TestForum() throws InterruptedException {
        clickByXpath(".//*[@id='home-page-top']/nav/a[2]");
        sleepFor(2);
    }

    @Test
    public void TestTearDown() throws InterruptedException {
        clickByXpath(".//*[@id='home-page-top']/nav/a[4]");
        sleepFor(2);
    }

    @Test
    public void TestTranslate() throws InterruptedException {
        clickByXpath(".//*[@id='home-page-top']/nav/a[5]");
        sleepFor(2);
    }

    @Test(priority = 1)//User can post a question on the forum
    public void TestForumPost() throws InterruptedException {
        byLinks("Log In");
        typeByCss("#email", "demobooby@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#password", "automation");
        sleepFor(3);
        clickByCss("#ifixit-logo");
        sleepFor(3);
        clickByXpath(".//*[@id='home-page-top']/nav/a[2]");
        sleepFor(3);
        byLinks("Ask a Question");
        sleepFor(3);
        typeByCss("#qaDevice", "Lenovo Edge2 1580");
        typeByCss("#qaTitle", "Battery replacement procedure for current lenovo modelsaa");
        sleepFor(3);
        clickByCss(".fa.fa-header");
        typeByCss("#qaText", "HELP MYs COMPUTERs BATTERY IS DYING");
        typeByCss("#qaTags", "Lenovo, battery, replacement, power issues");
        sleepFor(3);
        clickByCss("#previewQuestion");
        sleepFor(2);
        clickByCss("#submitQuestion");
        sleepFor(4);
    }


    @Test(priority = 2)//User can edit their question
    public void TestForumEdit() throws InterruptedException {
        byLinks("Log In");
        typeByCss("#email", "demobooby@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#password", "automation");
        sleepFor(3);
        clickByCss("#ifixit-logo");
        sleepFor(3);
        clickByXpath(".//*[@id='home-page-top']/nav/a[2]");
        sleepFor(3);
        //clickByCss("#subscribedTab");
        typeByCss("#answersSearch", "Battery replacement procedure for current lenovo modelsaa");
        clickByCss("#searchIcon");
        sleepFor(3);
        byLinks("Battery replacement procedure for current lenovo modelsaa");
        clickByCss(".post-metadata-actions>span");
        clickByCss(" .post-action.post-action-edit>a");
        sleepFor(1);
        typeByCss("#qaText", "this is an appendage");
        sleepFor(3);
        clickByCss("#previewQuestion");
        sleepFor(2);
        clickByCss("#submitQuestion");
        sleepFor(5);

    }

    @Test(priority = 3)//User can answer their question
    public void TestPostForum() throws InterruptedException {
        byLinks("Log In");
        typeByCss("#email", "demobooby@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#password", "automation");
        sleepFor(3);
        clickByCss("#ifixit-logo");
        sleepFor(3);
        clickByXpath(".//*[@id='home-page-top']/nav/a[2]");
        sleepFor(3);
        typeByCss("#answersSearch", "Battery replacement procedure for current lenovo modelsaa");
        clickByCss("#searchIcon");
        sleepFor(3);
        byLinks("Battery replacement procedure for current lenovo modelsaa");
        clickByCss(".button.button-action-solid.js-answer-question");
        sleepFor(1);
        typeByCss("#answerText", "Open it up, ya dummy!");
        sleepFor(3);
        clickByCss(".button.js-preview-answer");
        sleepFor(2);
        clickByCss("#postAnswer");
        sleepFor(3);
        clickByCss("#buttonAnsweranyway");
        sleepFor(3);
        //clickByCss(".button.button-action.button-accept-answer");
        //sleepFor(3);
    }

    @Test(priority = 4)//User delete their question
    public void TestDeletePost() throws InterruptedException {
        byLinks("Log In");
        typeByCss("#email", "demobooby@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#password", "automation");
        sleepFor(3);
        clickByCss("#ifixit-logo");
        sleepFor(3);
        clickByXpath(".//*[@id='home-page-top']/nav/a[2]");
        sleepFor(3);
        //clickByCss("#subscribedTab");
        typeByCss("#answersSearch", "Battery replacement procedure for current lenovo modelsaa");
        clickByCss("#searchIcon");
        sleepFor(2);
        byLinks("Battery replacement procedure for current lenovo modelsaa");
        clickByCss(".post-metadata-actions>span");
        clickByCss(" .post-action.post-action-delete.js-action-delete");
        sleepFor(3);
        clickByCss("#deleteDoctype-334737");
        sleepFor(3);


    }

    @Test
    public void LanguageOptions() throws InterruptedException {
        clickByCss(".js-trigger-language-modal.sprite-flag.sprite-flag-us");
        sleepFor(2);
    }

    @Test
    public void TestChinese() throws InterruptedException {
        clickByCss(".js-trigger-language-modal.sprite-flag.sprite-flag-us");
        sleepFor(2);
        clickByCss(".sprite-flag-lg.sprite-flag-lg-cn");
        sleepFor(2);
    }
    @Test
    public void TestJapanese() throws InterruptedException {
        clickByCss(".js-trigger-language-modal.sprite-flag.sprite-flag-us");
        sleepFor(2);
        clickByCss(".sprite-flag-lg.sprite-flag-lg-jp");
        sleepFor(2);
    }
    @Test
    public void TestDeutsch() throws InterruptedException {
        clickByCss(".js-trigger-language-modal.sprite-flag.sprite-flag-us");
        sleepFor(2);
        clickByCss(".sprite-flag-lg.sprite-flag-lg-de");
        sleepFor(2);
    }
    @Test
    public void TestEspanol() throws InterruptedException {
        clickByCss(".js-trigger-language-modal.sprite-flag.sprite-flag-us");
        sleepFor(2);
        clickByCss(".sprite-flag-lg.sprite-flag-lg-es");
        sleepFor(2);
    }
    @Test
    public void TestFrench() throws InterruptedException {
        clickByCss(".js-trigger-language-modal.sprite-flag.sprite-flag-us");
        sleepFor(2);
        clickByCss(".sprite-flag-lg.sprite-flag-lg-fr");
        sleepFor(2);
    }
    @Test
    public void TestItalian() throws InterruptedException {
        clickByCss(".js-trigger-language-modal.sprite-flag.sprite-flag-us");
        sleepFor(2);
        clickByCss(".sprite-flag-lg.sprite-flag-lg-it");
        sleepFor(2);
    }
    @Test
    public void TestDutch() throws InterruptedException {
        clickByCss(".js-trigger-language-modal.sprite-flag.sprite-flag-us");
        sleepFor(2);
        clickByCss(".sprite-flag-lg.sprite-flag-lg-nl");
        sleepFor(2);
    }
    @Test
    public void TestPortuguese() throws InterruptedException {
        clickByCss(".js-trigger-language-modal.sprite-flag.sprite-flag-us");
        sleepFor(2);
        clickByCss(".sprite-flag-lg.sprite-flag-lg-br");
        sleepFor(2);
    }
    @Test
    public void TestRussian() throws InterruptedException {
        clickByCss(".js-trigger-language-modal.sprite-flag.sprite-flag-us");
        sleepFor(2);
        clickByCss(".sprite-flag-lg.sprite-flag-lg-ru");
        sleepFor(2);
    }
    @Test
    public void TestTurkish() throws InterruptedException {
        clickByCss(".js-trigger-language-modal.sprite-flag.sprite-flag-us");
        sleepFor(2);
        clickByCss(".sprite-flag-lg.sprite-flag-lg-tr");
        sleepFor(2);
    }
    @Test
    public void BottomLinks() throws InterruptedException {
        clickAllSimilarLinksByCss(".js-slide-drawer.slide-drawer>ul>li>a");
        sleepFor(2);
    }

    private void clickAllSimilarLinksByCss(String s) {
    }


    @Test
    public void TestFBWidget() throws InterruptedException {
        clickByCss(".fa.fa-fb");
        sleepFor(2);
        clickByCss("._42ft._4jy0._4jy5._4jy1.selected._51sy");
        typeByCss("#email","teamdautomation@gmail.com");
        typeByCss("#pass","teamd123");
        clickByCss("#loginbutton");
        //clickByCss(".likeButton._4jy0._4jy4._517h._51sy._42ft");
        sleepFor(3);

        }

    @Test
    public void TestTwitterWidget() throws InterruptedException {
        clickByCss(".fa.fa-twit");
        typeByCss(".text-input.email-input.js-signin-email","teampnt2016@gmail.com");
        typeByXpath(".//*[@id='signin-dropdown']/div[3]/form/div[2]/input","automation");
        clickByCss(".submit.btn.primary-btn.js-submit");
        sleepFor(3);
        clickByCss(".user-actions-follow-button.js-follow-btn.follow-button.btn");
        sleepFor(5);
    }
    @Test
    public void TestYoutubeWidget() throws InterruptedException {
        clickByCss(".fa.fa-youtube-play");
        clickByCss(".yt-uix-button.yt-uix-button-size-default.yt-uix-button-subscribe-branded.yt-uix-button-has-icon.no-icon-markup.yt-uix-subscription-button.yt-can-buffer");
        typeByCss("#Email","teamdautomation");
        clickByCss("#next");
        typeByCss("#Passwd","teamd123");
        clickByCss("#signIn");
        sleepFor(3);
        clickByCss(".yt-uix-button.yt-uix-button-size-default.yt-uix-button-subscribed-branded.yt-uix-button-has-icon.no-icon-markup.yt-uix-subscription-button.yt-can-buffer.hover-enabled");
        sleepFor(2);

    }
    @Test
    public void TestGitHub() throws InterruptedException {
        clickByCss(".fa.fa-github-alt");
        clickByCss(".btn.site-header-actions-btn.mr-2");
        typeByCss("#login_field","teamdautomation");
        typeByCss("#password","teamd123");
        clickByCss(".btn.btn-primary.btn-block");
        sleepFor(3);
    }
    @Test
    public void TestInstagram() throws InterruptedException {
        clickByCss(".fa.fa-instagram");
        clickByXpath(".//*[@id='react-root']/section/nav/div/div/div/div/div[2]/a[2]");
        typeByXpath(".//*[@id='react-root']/div/article/div/div[1]/div/form/div[1]/input","teamdautomation");
        typeByXpath(".//*[@id='react-root']/div/article/div/div[1]/div/form/div[2]/input","teamd123");
        clickByCss("._aj7mu._taytv._ki5uo._o0442");


        sleepFor(3);

    }

    @Test
    public void TestFeature() throws InterruptedException {
        clickByXpath("html/body/div[4]/div/a");
        sleepFor(2);
    }
    @Test
    public void clickAllAuthors() throws InterruptedException {
        clickByXpath("html/body/div[4]/div/a");
        sleepFor(3);
        clickByXpath("html/body/header/div/nav/ul/li[2]/a");
        sleepFor(3);
        clickAllSimilarLinksByCss(".post-author>a");
        sleepFor(3);
}
    @Test
    public void clickAllThis() throws InterruptedException {
        clickByXpath("html/body/div[4]/div/a");
        clickByXpath("html/body/header/div/nav/ul/li[2]/a");
        sleepFor(3);
    }

    @Test
    public void clickHeaders() throws InterruptedException {
        clickByXpath("html/body/div[4]/div/a");
        clickByCss(".repair-is-freedom.category-nav-item>p");
        sleepFor(3);
    }
    @Test
    public void clickHeaders1() throws InterruptedException {
        clickByXpath("html/body/div[4]/div/a");
        clickByCss(".category-image.jobs>h1");
        sleepFor(3);
    }
    @Test
    public void clickHeaders2() throws InterruptedException {
        clickByXpath("html/body/div[4]/div/a");
        clickByCss(".category-image.sustainable>h1");
        sleepFor(3);

}
    @Test
    public void clickStuff() throws InterruptedException {
    clickByXpath("html/body/div[4]/div/a");

    sleepFor(3);

    }


    @Test
    public void apparel() throws InterruptedException {
        clickByXpath(".//*[@id='home-page-top']/nav/a[1]");
        sleepFor(2);
        clickByXpath(".//*[@id='content']/div[3]/div[4]/div[1]/a/p/span[2]");

    }

    @Test
    public void repairAppliance() throws InterruptedException {
        clickByXpath(".//*[@id='home-page-top']/nav/a[1]");
        sleepFor(2);
        clickByXpath(".//*[@id='content']/div[3]/div[4]/div[2]/a/p/span[2]");
    }

    @Test
    public void repairCamera() throws InterruptedException {
        clickByXpath(".//*[@id='home-page-top']/nav/a[1]");
        sleepFor(2);
        clickByXpath(".//*[@id='content']/div[3]/div[4]/div[3]/a/p/span[2]");
    }

    @Test
    public void repairCarandTruck() throws InterruptedException {
        clickByXpath(".//*[@id='home-page-top']/nav/a[1]");
        sleepFor(2);
        clickByXpath(".//*[@id='content']/div[3]/div[4]/div[4]/a/p/span[2]");

    }

    @Test
    public void repairComputerHardware() throws InterruptedException {
        clickByXpath(".//*[@id='home-page-top']/nav/a[1]");
        sleepFor(2);
        clickByXpath(".//*[@id='content']/div[3]/div[4]/div[5]/a/p/span[2]");
    }

    @Test
    public void repairElectronics() throws InterruptedException {
        clickByXpath(".//*[@id='home-page-top']/nav/a[1]");
        sleepFor(2);
        clickByXpath(".//*[@id='content']/div[3]/div[4]/div[6]/a/p/span[2]");
    }

    @Test
    public void repairGameConsole() throws InterruptedException {
        clickByXpath(".//*[@id='home-page-top']/nav/a[1]");
        sleepFor(2);
        clickByXpath(".//*[@id='content']/div[3]/div[4]/div[1]/a/p/span[2]");


    }

    @Test
    public void repairHousehold() throws InterruptedException {
        clickByXpath(".//*[@id='home-page-top']/nav/a[1]");
        sleepFor(2);
        clickByXpath(".//*[@id='content']/div[3]/div[4]/div[7]/a/p/span[2]");
    }

    @Test
    public void repairIPod() throws InterruptedException {
        clickByXpath(".//*[@id='home-page-top']/nav/a[1]");
        sleepFor(2);
        clickByXpath(".//*[@id='content']/div[3]/div[4]/div[1]/a/p/span[2]");
    }

    @Test
    public void Mac() throws InterruptedException {
        clickByXpath(".//*[@id='home-page-top']/nav/a[8]");
        sleepFor(2);
        clickByXpath(".//*[@id='content']/div[3]/div[4]/div[1]/a/p/span[2]");

    }
    @Test
    public void MediaPlayer() throws InterruptedException {
        clickByXpath(".//*[@id='home-page-top']/nav/a[8]");
        sleepFor(2);
        clickByXpath(".//*[@id='content']/div[3]/div[4]/div[11]/a/p/span[2]");

}}