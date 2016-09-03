import common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by admin on 8/29/2016.
 */
public class HomeLogin extends Base {

    @Test(priority = 1)
    public void Search() throws InterruptedException {

        typeByCssNEnter("#search-input", "Donkey Kong");
        sleepFor(3);

    }

    @Test(priority = 2)
    public void ClickShows() throws InterruptedException {
        clickByXpath(".//*[@id='ign-shows']/a");
        sleepFor(3);

    }
    @Test(priority =  3)
public void HoverBrowse() throws InterruptedException {
    mouseHoverByXpath(".//*[@id='browse-button']");
    sleepFor(3);
    mouseHoverByXpath(".//*[@id='ign-shows']/a");
    sleepFor(3);
}


    @Test(priority = 4)
    public void ClickReviews() throws InterruptedException {
        clickByXpath(".//*[@id='header-nav']/div[2]/li[3]/a");
        sleepFor(3);
    }

    @Test(priority = 5)

    public void ClickPs4() throws InterruptedException {
        clickByXpath(".//*[@id='header-nav']/div[2]/li[4]/a");
        sleepFor(3);

    }

    @Test(priority = 6)

    public void ClickXbone() throws InterruptedException {
        clickByXpath(".//*[@id='header-nav']/div[2]/li[5]/a");
        sleepFor(3);
    }

    @Test(priority = 7)

    public void ClickPc() throws InterruptedException {
        clickByXpath(".//*[@id='header-nav']/div[2]/li[6]/a");
        sleepFor(3);
    }

    @Test(priority = 8)

    public void ClickWiiU() throws InterruptedException {
        clickByXpath(".//*[@id='header-nav']/div[2]/li[7]/a");
        sleepFor(3);
    }

    @Test(priority = 9)

    public void ClickMovies() throws InterruptedException {
        clickByXpath(".//*[@id='header-nav']/div[2]/li[8]/a");
        sleepFor(3);
    }

    @Test(priority = 10)

    public void ClickTv() throws InterruptedException {
        clickByXpath(".//*[@id='header-nav']/div[2]/li[9]/a");
        sleepFor(3);
    }

    @Test(priority = 11)

    public void scrollToLoadMore() throws InterruptedException {
        scrollToElementById("loadMore");
        sleepFor(4);
        clickById("loadMore");
        sleepFor(4);
        clickById("loadMore");
        sleepFor(3);
    }

    @Test(priority = 12)

    public void contentTeam () throws InterruptedException {

        clickByXpath(".//*[@id='ignFooter-container']/footer/div[1]/div[1]/div[1]/ul[1]/li[2]/a");
        sleepFor(3);
    }
    @Test(priority = 13)

    public void scrollFiveTimes() throws InterruptedException {

        int x = 5;

        for (x = 1; x <= 5; x++) {
            scrollToElementById("loadMore");
            sleepFor(5);
            clickById("loadMore");
            sleepFor(5);
            x++;

        }
    }
    @Test(priority = 14)

    public void changeRegion() throws InterruptedException {

        clickByXpath("html/body/header/div/div/div[2]");
        sleepFor(3);
        clickByClass("local-region.United Kingdom");
        sleepFor(3);
    }

    @Test(priority = 15)

    public void standardsAndPractices() throws InterruptedException {

        clickByLink("Standards and Practices");
        sleepFor(3);
    }

    @Test(priority = 16)

    public void sendUsNews() throws InterruptedException {

        clickByLink("Send Us News");
        sleepFor(3);
    }

    @Test(priority = 17)

    public void siteMap () throws InterruptedException {

        clickByLink("Site Map");
        sleepFor(3);
    }

    @Test(priority = 18)

    public void IgnWorldMap() throws InterruptedException {

        clickByLink("IGN World Map");
        sleepFor(3);
    }

    @Test(priority = 19)

    public void Adria() throws InterruptedException{

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[4cd]/a");
        sleepFor(3);
    }

    @Test(priority = 20)

    public void Africa() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[5]/a");
        sleepFor(3);
    }

    @Test(priority = 21)

    public void Australia() throws InterruptedException {


        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[6]/a");
        sleepFor(3);

    }

    @Test(priority = 22)

    public void Brazil() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[7]/a");
        sleepFor(3);
    }

    @Test(priority = 23)

    public void Benelux() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[8]/a");
        sleepFor(3);
    }

    @Test(priority = 24)

    public void Canada() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[9]/a");
        sleepFor(3);
    }

    @Test(priority = 25)

    public void Denmark() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[10]/a");
        sleepFor(3);
    }

    @Test(priority = 26)

    public void Finland() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[11]/a");
        sleepFor(3);
    }

    @Test(priority = 27)

    public void France() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[12]/a");
        sleepFor(3);
    }

    @Test(priority = 28)

    public void Germany() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[13]/a");
        sleepFor(3);
    }

    @Test(priority = 29)

    public void Greece() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[14]/a");
        sleepFor(3);
    }

    @Test(priority = 30)

    public void Hungary() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[15]/a");
        sleepFor(3);
    }

    @Test(priority = 31)

    public void India() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[16]/a");
        sleepFor(3);
    }

    @Test(priority = 32)

    public void Ireland() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[17]/a");
        sleepFor(3);
    }

    @Test(priority = 33)

    public void Israel() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[18]/a");
        sleepFor(3);
    }

    @Test(priority = 34)

    public void Italy() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[19]/a");
        sleepFor(3);
    }

    @Test(priority = 35)

    public void Japan() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[20]/a");
        sleepFor(3);
    }

    @Test(priority = 36)

    public void LatinAmerica() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[21]/a");
        sleepFor(3);
    }

    @Test(priority = 37)

    public void MiddleEast() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[22]/a");
        sleepFor(3);
    }

    @Test(priority = 38)

    public void Norway() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[23]/a");
        sleepFor(3);
    }

    @Test(priority = 39)

    public void Pakistan() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[24]/a");
        sleepFor(3);
    }

    @Test(priority = 40)

    public void Poland() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[25]/a");
        sleepFor(3);
    }

    @Test(priority = 41)

    public void Portugal() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[26]/a");
        sleepFor(3);
    }

    @Test(priority = 42)

    public void Romania() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[27]/a");
        sleepFor(3);
    }

    @Test(priority = 43)

    public void Russia() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[28]/a");
        sleepFor(3);
    }

    @Test(priority = 44)

    public void SouthEastAsia() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[29]/a");
        sleepFor(3);
    }

    @Test(priority = 45)

    public void Spain() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[30]/a");
        sleepFor(3);
    }

    @Test(priority = 46)

    public void Sweden() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[31]/a");
        sleepFor(3);
    }

    @Test(priority = 47)

    public void Turkey() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[32]/a");
        sleepFor(3);
    }

    @Test(priority = 48)

    public void UnitedKingdom() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[33]/a");
        sleepFor(3);
    }

    @Test(priority = 49)

    public void UnitedStates() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[34]/a");
        sleepFor(3);
    }

    @Test(priority = 50)

    public void Newsletter() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[2]/a");
        sleepFor(3);
    }



















}
