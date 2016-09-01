import common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by admin on 8/29/2016.
 */
public class HomeLogin extends Base {

    @Test
    public void Search() throws InterruptedException {

        typeByCssNEnter("#search-input", "Donkey Kong");
        sleepFor(3);

    }

    @Test
    public void ClickShows() throws InterruptedException {
        clickByXpath(".//*[@id='ign-shows']/a");
        sleepFor(3);

    }
    @Test
public void HoverBrowse() throws InterruptedException {
    mouseHoverByXpath(".//*[@id='browse-button']");
    sleepFor(3);
    mouseHoverByXpath(".//*[@id='ign-shows']/a");
    sleepFor(3);
}


    @Test
    public void ClickReviews() throws InterruptedException {
        clickByXpath(".//*[@id='header-nav']/div[2]/li[3]/a");
        sleepFor(3);
    }

    @Test

    public void ClickPs4() throws InterruptedException {
        clickByXpath(".//*[@id='header-nav']/div[2]/li[4]/a");
        sleepFor(3);

    }

    @Test

    public void ClickXbone() throws InterruptedException {
        clickByXpath(".//*[@id='header-nav']/div[2]/li[5]/a");
        sleepFor(3);
    }

    @Test

    public void ClickPc() throws InterruptedException {
        clickByXpath(".//*[@id='header-nav']/div[2]/li[6]/a");
        sleepFor(3);
    }

    @Test

    public void ClickWiiU() throws InterruptedException {
        clickByXpath(".//*[@id='header-nav']/div[2]/li[7]/a");
        sleepFor(3);
    }

    @Test

    public void ClickMovies() throws InterruptedException {
        clickByXpath(".//*[@id='header-nav']/div[2]/li[8]/a");
        sleepFor(3);
    }

    @Test

    public void ClickTv() throws InterruptedException {
        clickByXpath(".//*[@id='header-nav']/div[2]/li[9]/a");
        sleepFor(3);
    }
//
//    @Test
//    public void login() throws InterruptedException {
//    sleepFor(5);
//      clickByLink("Sign in");
//        sleepFor(5);
//        clickByXpath(".//*[@id='email']");
//      typeByXpath(".//*[@id='email']", "rselpnt");
//        sleepFor(3);
//        typeByXpathEnter(".//*[@id='password']", "trainpnt");
//        sleepFor(4);
//
//
//
//
//    }
//
//    @Test
//
//    public void contentTeam () throws InterruptedException {
//        clickByXpath(".//*[@id='ignFooter-container']/footer/div[1]/div[1]/div[1]/ul[1]/li[2]/a");
//        sleepFor(3);
//
//        clickByXpath("html/body/div[4]/div[2]/div[2]/div[3]/div[6]/span");
//        sleepFor(3);
//        clickByXpath("html/body/div[4]/div[2]/div[2]/div[3]/div[6]/a");
//        sleepFor(3);
//    }


}
