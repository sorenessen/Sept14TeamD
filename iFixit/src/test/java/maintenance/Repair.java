package maintenance;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by soren on 8/29/2016.
 */
public class Repair extends Base {
    @Test//User can edit their question
    public void TestPostForum() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#newyorkModalBox > i"));
        driver.findElement(By.cssSelector("#newyorkModalBox > i")).click();
        byLinks("Log In");
        typeByCss("#email", "teampnt20161@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#password", "automation");
        sleepFor(3);
        clickByCss("#ifixit-logo");
        sleepFor(3);
        clickByXpath(".//*[@id='home-page-top']/nav/a[2]");
        sleepFor(3);
        clickByCss("#subscribedTab");
        sleepFor(3);
        byLinks("Battery replacement procedure for current lenovo models");
        sleepFor(3);

        /*mouseHoverByXpath("/*//*[@id='answer334097']/div[3]/div[1]/div/span");
        sleepFor(3);
        clickByXpath("/*//*[@id='answer334097']/div[3]/div[1]/div/ul/li[3]/a");
*/
 mouseHoverByCSS(".post-metadata-actions>span");
        sleepFor(10);
    }
}