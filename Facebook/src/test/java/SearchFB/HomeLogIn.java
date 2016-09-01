package SearchFB;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by admin on 8/29/2016.
 */
public class HomeLogIn extends Base {

  /*  @Test
    public void UserIDAndPass()throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(3);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(20);}



    @Test
        public void PostStatus()throws InterruptedException {
            typeByCss("#email", "teamdautomation@gmail.com");
            sleepFor(3);
            typeByCssNEnter("#pass", "teamd123");
            sleepFor(20);
            typeByXpath("//textarea[@class='uiTextareaAutogrow _3en1']","Automation is fun - Sohan");
            clickByCss("._42ft._4jy0._ej1._4jy3._4jy1.selected._51sy");
            sleepFor(10);
    }
    */
    @Test

    public void postMessage()throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(3);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10);

        typeByCss("#addComment_950410821748906 > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1)" , "hello");

        sleepFor(20);
    }
}


