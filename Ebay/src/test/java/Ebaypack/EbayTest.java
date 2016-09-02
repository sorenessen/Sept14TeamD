package Ebaypack;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


/**
 * Created by Faheem on 8/30/2016.
 */
public class EbayTest extends Base {

        @Test(priority = 1)
    public void stuff() throws InterruptedException {

        sleepFor(4);
        waitUntilClickAble(By.linkText("Electronics"));
        mouseHoverBylink("Electronics");
        sleepFor(5);
        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/div[2]/div[1]/ul[1]/li[3]/a");
        sleepFor(5);
    }

    @Test(priority = 2)

    public void searchEbay() throws InterruptedException {
        sleepFor(5);
        typeByXpath(".//*[@id='gh-ac']", "Salt");
        clickByXpath(".//*[@id='gh-btn']");
        sleepFor(5);
    }

    @Test(priority = 3)

    public void find() throws InterruptedException {
        sleepFor(5);

        scrollToElementByxpath(".//*[@id='featuredCollectionsFragment']/div/div[2]/div[11]/div[3]/div[1]/h3/a");
        sleepFor(10);
    }

    @Test(priority = 4)
    public void scroll() throws InterruptedException {
        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[7]/a");
        scrollPageDown200();
        sleepFor(3);
        scrollPageup400();
        sleepFor(3);
        scrollPageDown200();
        sleepFor(3);
        scrollPageup400();
    }

    @Test(priority = 5)
    public void Business() throws InterruptedException {
        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[11]/a");
    }

    @Test(priority = 6)
    public void Music() throws InterruptedException {
        clickByXpath(" .//*[@id='navigationFragment']/div/table/tbody/tr/td[12]/a");
    }

    @Test(priority = 7)
    public void Deals() throws InterruptedException {
        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[13]/a");

    }

    @Test(priority = 8)
    public void Sporting() throws InterruptedException {
        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[9]/a");


    }

    @Test(priority = 9)
    public void Fashion() throws InterruptedException {
        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[5]/a");


    }

    @Test(priority = 10)
    public void Motors() throws InterruptedException {
        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[4]/a");
    }

//    @Test(priority = 11)
//    public void Following() throws InterruptedException {
//
//        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[1]/a");
//        sleepFor(4);
//        driver.findElement(By.className("102095403")).sendKeys("wrongemail@gmail.com");
//        //driver.findElement(By.xpath(".//*[@id='2051267095']")).sendKeys("WrongEmail@gmail.com");
//        //typeByid("1969890655", "WrongEmail@gmail.com");
//        sleepFor(2);
//        typeByidenter("648786969", "Greenday");
//
//        sleepFor(10);
//    }



    @Test(priority = 13)
    public void Daily() throws InterruptedException {
        clickByXpath(".//*[@id='gh-p-1']/a");
    }

    @Test(priority = 14)
    public void Gift() throws InterruptedException {
        clickByXpath(".//*[@id='gh-p-4']/a");
    }

    @Test(priority = 15)
    public void HMusic() throws InterruptedException {

        sleepFor(3);
        waitUntilClickAble(By.linkText("Music"));
        mouseHoverBylink("Music");
        sleepFor(5);
        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[12]/div[2]/div[1]/ul[2]/li[1]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='w2']/div[2]/ul/li[2]/a/p");
        sleepFor(5);
    }

    @Test(priority = 16)
    public void HoverDeals() throws InterruptedException {

        sleepFor(3);
        waitUntilClickAble(By.linkText("Deals"));
        mouseHoverBylink("Deals");
        sleepFor(5);
        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[13]/div[2]/div[1]/ul[2]/li[3]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='pagination-infinite-container']/div[1]/div[3]/div/div[2]/h3/a/span");
        sleepFor(5);
    }

    @Test(priority = 17)
    public void Contact() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='gh-p-3']/a");
        sleepFor(5);
        clickByXpath(".//*[@id='body']/div[2]/div[4]/div[2]/ul/li[1]/a");
        sleepFor(5);
    }

    @Test(priority = 18)
    public void BusinessG() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[11]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[1]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 19)
    public void Industrial() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[11]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[2]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 20)
    public void Ind() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[11]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[3]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 21)
    public void IndCat() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[11]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[4]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 22)
    public void IndA() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[11]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[5]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 23)
    public void IndB() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[11]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[6]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 24)
    public void IndC() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[11]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[1]/a");
        sleepFor(5);
    }

    @Test(priority = 25)
    public void IndustD() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[11]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[2]/a");
        sleepFor(5);
    }

    @Test(priority = 26)
    public void IndE() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[11]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[3]/a");
        sleepFor(5);
    }

    @Test(priority = 27)
    public void IndF() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[11]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[3]/a");
        sleepFor(5);
    }

    @Test(priority = 28)
    public void IndG() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[11]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[4]/a");
        sleepFor(5);
    }

    @Test(priority = 29)
    public void ToysA() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[10]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[1]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 30)
    public void ToysB() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[10]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[2]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 31)
    public void ToysC() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[10]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[3]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 32)
    public void ToysD() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[10]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[4]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 33)
    public void ToysE() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[10]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[5]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 34)
    public void ToysF() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[10]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[6]/a");
        sleepFor(5);
    }

    @Test(priority = 35)
    public void ToysG() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[10]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[7]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 36)
    public void ToysH() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[10]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[8]/a");
        sleepFor(5);
    }

    @Test(priority = 37)
    public void ToysI() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[10]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[9]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 38)
    public void ToysJ() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[10]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[10]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 39)
    public void ToysK() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[10]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[11]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 40)
    public void ToysL() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[10]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[12]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 41)
    public void ToysM() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[10]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[13]/a");
        sleepFor(5);
    }

    @Test(priority = 42)
    public void ToysN() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[10]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[14]/a");
        sleepFor(5);
    }

    @Test(priority = 43)
    public void ToysO() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[10]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[1]/a");
        sleepFor(5);
    }

    @Test(priority = 44)
    public void StyleA() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[5]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[1]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 44)
    public void StyleB() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[5]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[2]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 45)
    public void StyleC() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[5]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[3]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 46)
    public void StyleD() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[5]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[4]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 47)
    public void StyleE() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[5]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[5]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 48)
    public void StyleF() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[5]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[6]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 49)
    public void StyleG() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[5]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[7]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 50)
    public void StyleH() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[5]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[8]/a/span[2]");
        sleepFor(5);
    }
    @Test(priority = 51)
    public void StyleI() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[5]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[9]/a/span[2]");
        sleepFor(5);
    }
    @Test(priority = 52)
    public void StyleJ() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[5]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[1]/a/span[2]");
        sleepFor(5);
    }
    @Test(priority = 53)
    public void StyleK() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[1]/a");
        sleepFor(5);
    }
    @Test(priority = 54)
    public void StyleL() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[2]/a");
        sleepFor(5);
    }
    @Test(priority = 54)
    public void StyleM() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[3]/a");
        sleepFor(5);
    }
    @Test(priority = 56)
    public void StyleN() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[4]/a");
        sleepFor(5);
    }
    @Test(priority = 57)
    public void StyleP() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[5]/a");
        sleepFor(5);
    }
    @Test(priority = 58)
    public void StyleQ() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[5]/a");
        sleepFor(5);
    }
    @Test(priority = 59)
    public void StyleR() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[6]/a");
        sleepFor(5);
    }
    @Test(priority = 60)
    public void StyleS() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[7]/a");
        sleepFor(5);
    }
    @Test(priority = 61)
    public void StyleT() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[1]/a");
        sleepFor(5);
    }
    @Test(priority = 62)
    public void StyleU() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[2]/a");
        sleepFor(5);
    }

    @Test(priority = 67)
    public void ElectronicA() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[3]/a");
        sleepFor(5);
    }

    @Test(priority = 68)
    public void ElectronicB() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[4]/a");
        sleepFor(5);
    }

    @Test(priority = 69)
    public void ElectronicC() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[5]/a");
        sleepFor(5);
    }

    @Test(priority = 70)
    public void ElectronicD() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[6]/a");
        sleepFor(5);
    }

    @Test(priority = 71)
    public void ElectronicE() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[7]/a");
        sleepFor(5);
    }

    @Test(priority = 72)
    public void ElectronicF() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[8]/a");
        sleepFor(5);
    }

    @Test(priority = 73)
    public void ElectronicG() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[9]/a");
        sleepFor(5);
    }

    @Test(priority = 74)
    public void ElectronicH() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[10]/a");
        sleepFor(5);
    }

    @Test(priority = 75)
    public void ElectronicI() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[11]/a");
        sleepFor(5);
    }

    @Test(priority = 76)
    public void ElectronicJ() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[3]/ul/li[1]/a");
        sleepFor(5);
    }

    @Test(priority = 77)
    public void ElectronicK() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[3]/ul/li[2]/a");
        sleepFor(5);
    }

    @Test(priority = 78)
    public void ElectronicL() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[3]/ul/li[3]/a");
        sleepFor(5);
    }

    @Test(priority = 79)
    public void ElectronicM() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[3]/ul/li[4]/a");
        sleepFor(5);
    }

    @Test(priority = 80)
    public void ElectronicN() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[3]/ul/li[5]/a");
        sleepFor(5);
    }

    @Test(priority = 81)
    public void ElectronicO() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[3]/ul/li[6]/a");
        sleepFor(5);
    }

    @Test(priority = 82)
    public void ElectronicP() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[3]/ul/li[9]/a");
        sleepFor(5);
    }

    @Test(priority = 83)
    public void ElectronicQ() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[4]/ul/li[1]/a");
        sleepFor(5);
    }

    @Test(priority = 84)
    public void ElectronicR() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[4]/ul/li[1]/a");
        sleepFor(5);
    }

    @Test(priority = 84)
    public void ArtA() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[7]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[1]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 85)
    public void ArtB() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[7]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[2]/a");
        sleepFor(5);
    }

    @Test(priority = 86)
    public void ArtC() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[7]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[3]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 87)
    public void ArtD() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[7]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[4]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 88)
    public void ArtE() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[7]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[5]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 89)
    public void ArtF() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[7]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[6]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 90)
    public void ArtG() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[7]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[7]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 91)
    public void ArtH() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[7]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[8]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 92)
    public void ArtI() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[7]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[9]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 93)
    public void ArtJ() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[7]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[1]/ul/li[10]/a/span[2]");
        sleepFor(5);
    }

    @Test(priority = 94)
    public void ArtK() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[7]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[1]/a");
        sleepFor(5);
    }

    @Test(priority = 95)
    public void ArtL() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[7]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[2]/a");
        sleepFor(5);
    }

    @Test(priority = 96)
    public void ArtM() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[7]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[3]/a");
        sleepFor(5);
    }

    @Test(priority = 97)
    public void ArtN() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[7]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[3]/ul/li[2]/ul/li[4]/a");
        sleepFor(5);
    }

    @Test(priority = 98)
    public void ArtO() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[7]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='mainContent']/div[4]/div[4]/div/div/div[1]/div/a/h3");
        sleepFor(5);
    }

    @Test(priority = 99)
    public void motorA() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[4]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='accessible-megamenu-1472819823271-1']");
        sleepFor(5);
    }

    @Test(priority = 100)
    public void motorB() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[4]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='accessible-megamenu-1472819941301-3']");
        sleepFor(5);
    }

    @Test(priority = 101)
    public void motorC() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[4]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='accessible-megamenu-1472819990181-3']");
        sleepFor(5);
    }

    @Test(priority = 102)
    public void motorD() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[4]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='accessible-megamenu-1472820029071-5']");
        sleepFor(5);
    }

    @Test(priority = 103)
    public void motorE() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[4]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='accessible-megamenu-1472820066344-7']");
        sleepFor(5);
    }

    @Test(priority = 104)
    public void motorF() throws InterruptedException {

        sleepFor(3);

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[4]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='accessible-megamenu-1472820108174-9']");
        sleepFor(5);
    }
}






































