import common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Polok on 9/1/2016.
 */
public class ebay extends Base{

    @Test
    public void Ebaylogin () throws InterruptedException {
        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[1]/a");
        sleepFor(1);
        typeByXpath(".//*[@id='1848989506']","hello");
        sleepFor(1);
    }
}
