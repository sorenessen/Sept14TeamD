package maintenance;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.Session;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import sun.security.util.ByteArrayTagOrder;

/**
 * Created by soren on 8/29/2016.
 */
public class Repair extends Base {

    @Test
    //Test1---login: teampnt2016@gmail.com ---- password: automation
    public void AccountLogin() throws InterruptedException {


        //clickByXpath(".//*[@id='home-page-top']/div/div[1]/a[2]");
        byLinks("Log In");
        typeByCss("#email", "teampnt2016@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#password", "automation");
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
        typeByCss("#email", "teampnt2016@gmail.com");
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
        typeByCss("#email", "teampnt2016@gmail.com");
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
        typeByCss("#email", "teampnt2016@gmail.com");
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

    @Test(priority = 4)//User can edit their question
    public void TestDeletePost() throws InterruptedException {
        byLinks("Log In");
        typeByCss("#email", "teampnt2016@gmail.com");
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
        clickByCss("#deleteDoctype-334303");
        sleepFor(3);
        typeByCss("#qaText", "this is an appendage");
        sleepFor(3);
        clickByCss("#previewQuestion");
        sleepFor(2);
        clickByCss("#submitQuestion");
        sleepFor(5);

    }


}



