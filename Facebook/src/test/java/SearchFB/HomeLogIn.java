package SearchFB;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by admin on 8/29/2016.
 */
public class HomeLogIn extends Base {


//    //1.users are able to click on on the email field
         @Test(priority=1)
        public void ClickEmailBox() throws InterruptedException {
        sleepFor(3);
        clickByCss("#email");
        sleepFor(3);

}

//    // 2.users are able to click and input an email in the email field
    @Test(priority=2)
    public void clickAndEnterEmailBox() throws InterruptedException {
        sleepFor(1);
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);


    }

//    // 3.user are able to click on the password field
    @Test(priority=3)
    public void ClickPassBox() throws InterruptedException {
        sleepFor(1);
        clickByCss("#pass");
        sleepFor(1);

    }

    //    4.users are able to click and input password password field
    @Test(priority=4)
    public void ClickAndInputPass() throws InterruptedException {
        sleepFor(1);
        typeByCss("#pass", "teamd123");
        sleepFor(1);

    }


//    users are able to click on the logIn button
    @Test(priority=5)
    public  void clickLoging()throws InterruptedException{
        clickByCss("#u_0_n");
        sleepFor(1);
    }

    //users are able to click on the first name field
    @Test(priority=6)
    public  void ClickFirstName()throws InterruptedException{
        clickByCss("#u_0_3");
        sleepFor(2);

    }
        //user are able to input their first name in the first name field
    @Test(priority=7)
    public  void FirstName()throws InterruptedException{
          typeByCss("#u_0_3","teamd");
        sleepFor(1);

    }
//users are able to click on the last name field
@Test(priority=8)
public  void clickFirtName()throws InterruptedException {
    clickByCss("#u_0_5");
    sleepFor(1);}

    //users able to enter last name
    @Test(priority=9)
    public  void EnterLastName()throws InterruptedException {
        typeByCss("#u_0_5","automation");
        sleepFor(1);}

    //users are able to  click on the emil field in the sign up form
    @Test(priority=10)
    public  void ClickOnEmail()throws InterruptedException {
        clickByCss("#u_0_7");
        sleepFor(1);
    }
    //users are able to enter an email in the email field in the sign up form
    @Test(priority=11)
    public  void enterAnEmail()throws InterruptedException {
        typeByCss("#u_0_7","teamdautomation@gmail.com");
        sleepFor(5);
    }
    //users are able to click and enter an email in the confirm email field
    @Test(priority = 12)
    public void confirlEmail()throws InterruptedException{
        typeByCss("#u_0_a","teamdautomation@gmail.com");
        sleepFor(1);
    }
    //users are able to enter a password on the password field in the sign up form
    @Test(priority = 13)
    public void enterPassword()throws InterruptedException{
        typeByCss("#u_0_c","teamd123");
        sleepFor(1);
    }

    //users are able to pick any month of the year on the month field
    @Test(priority =14)
    public void enterAMonth()throws InterruptedException{
        for (int i = 0; i<13; i++){
            selectByIndex("month" ,i);}
    }


    //users are able to  pick any day of the month in the day field
    @Test(priority = 15)
    public void day()throws InterruptedException{
        for(int i=0;i<31;i++){
            selectByIndex("day",i);}
        sleepFor(1);
    }
    //users are able pick a year
    @Test(priority = 15)
    public void yea()throws InterruptedException {
        for (int i = 0; i < 113; i++) {
            selectByIndex("year", i);
            sleepFor(1);
        }
    }
    @Test(priority = 16)
    //users are able to select female in the gender radio buttons
    public void Female()throws InterruptedException{
        clickById("u_0_d");
        sleepFor(1);

    }
    @Test(priority =17 )
    //users are able to select male in the gender radio buttons
    public void male()throws InterruptedException{
        clickByCss("#u_0_e");
        sleepFor(1);


    }

    //users are able to click the 'Create Account' button
    @Test(priority = 18)
    public void CreatAcountButtom()throws InterruptedException{
        clickById("u_0_i");
        sleepFor(1);

    }

    //      users are able to create a new account
    @Test (priority = 18)
    public  void createANewAccount()throws InterruptedException {
        //enter first name
        typeByCss("#u_0_3","teamd");
        //enter last name
        typeByCss("#u_0_5","automation");
        //enter an email
        typeByCss("#u_0_7","teamdautomation@gmail.com");
        //confirm email
        typeByCss("#u_0_a","teamdautomation@gmail.com");
        //enter a password
        typeByCss("#u_0_c","teamd123");
        // pick a month
        selectByIndex("month" ,1);
        //pick a day
        selectByIndex("day",2);
        //pick a year
        selectByIndex("year",28);
        //pick a gender
        clickById("u_0_d");
        sleepFor(1);
        //submit the form
        clickById("u_0_i");

    }

    ////    Users are able to log in with userName and password
    @Test(priority = 20)
    public void UserIDAndPass() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(2);

    }

    // users are able to click on the 'whats on your mind' status box
    @Test(priority = 21)
    public void ClickOnTheStatusBox() throws InterruptedException {
        sleepFor(1);
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        //status update
        clickByXpath("//textarea[@class='uiTextareaAutogrow _3en1']");
        sleepFor(1);
    }

    ////    users are able to click and input a value on the 'whats on your mind' status box
    @Test(priority = 22)
    public void ClickAndInputAValue() throws InterruptedException {
        sleepFor(2);
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        //status update
        typeByXpath("//textarea[@class='uiTextareaAutogrow _3en1']", "Automation update");
        sleepFor(1);
    }

    ////    users able to click on the post button
    @Test(priority = 23)
    public void ClickOnThePostButton() throws InterruptedException {
        sleepFor(2);
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        clickByCss("._1mf7._4jy0._4jy3._4jy1._51sy.selected._42ft");
        sleepFor(1);
    }

//

   // users are able to update a status
      @Test(priority = 24)
    public void StatusUpdate() throws InterruptedException {
        sleepFor(2);
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        //status update
        typeByXpath("//textarea[@class='uiTextareaAutogrow _3en1']", "Automation update");
        sleepFor(1);
        clickByCss("._1mf7._4jy0._4jy3._4jy1._51sy.selected._42ft");
      sleepFor(1);
    }

   // users are able to click on the drop down menu for status privacy
        @Test(priority = 25)
    public void DropDownPrivacyMenu() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        clickByCss("._55pe");
        sleepFor(1);
}

    //users are able to click on public on the privacy drop down menu
        @Test(priority =26 )
    public void ClickONPublic() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        clickByCss("._55pe");
        sleepFor(1);
        clickByCss("._54nh._4chm._48u0");
        sleepFor(1);
}

   // users are able to click on only for friends on the drop down menu for privacy of a post
            @Test(priority = 27)
    public void ClickOnJustForFriends() throws InterruptedException {
    typeByCss("#email", "teamdautomation@gmail.com");
    sleepFor(1);
    typeByCssNEnter("#pass", "teamd123");
    sleepFor(1);
//  clickByCss("._42ft._4jy0._ej1._4jy3._4jy1.selected._51sy");
//  sleepFor(5);
    clickByCss("._55pe");
    sleepFor(1);
    clickByCss(".mrs.img.sp_btuBr4BxNJk.sx_f17616");
    sleepFor(1);
}

    //user are ble to click on the only for me option on the drop down privacy box
        @Test(priority = 28)
    public void ClickOnlyForMeStatus() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        clickByCss("._55pe");
        sleepFor(1);
        clickByCss(".mrs.img.sp_btuBr4BxNJk.sx_f55148");
        sleepFor(1);
    }

     // users are able to change the privacy of a status to public
    @Test(priority = 29)
    public void PublicStatus() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
//       clickByCss("._42ft._4jy0._ej1._4jy3._4jy1.selected._51sy");
//        sleepFor(5);
        typeByXpath("//textarea[@class='uiTextareaAutogrow _3en1']", "Using Automation to update a public status");
        sleepFor(1);
        clickByCss("._55pe");
        sleepFor(1);
        clickByCss("._54nh._4chm._48u0");
        sleepFor(1);
        clickByCss("._1mf7._4jy0._4jy3._4jy1._51sy.selected._42ft");
        sleepFor(1);
}

//    users are able to change the privacy of the status to friends only
        @Test(priority = 30)
        public void StatusJustForFriends() throws InterruptedException {
    typeByCss("#email", "teamdautomation@gmail.com");
    sleepFor(1);
    typeByCssNEnter("#pass", "teamd123");
    sleepFor(1);
//       clickByCss("._42ft._4jy0._ej1._4jy3._4jy1.selected._51sy");
//        sleepFor(5);
    typeByXpath("//textarea[@class='uiTextareaAutogrow _3en1']", "Using Automation to update a status just for my friends");
    sleepFor(1);
    clickByCss("._55pe");
      sleepFor(1);
    clickByCss(".mrs.img.sp_btuBr4BxNJk.sx_f17616");
            sleepFor(1);
    clickByCss("._1mf7._4jy0._4jy3._4jy1._51sy.selected._42ft");
    sleepFor(1);
}


//    users are able to click and post a status with the privacy setting only for me
    @Test(priority = 31)
    public void OnlyForMeStatus() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
//       clickByCss("._42ft._4jy0._ej1._4jy3._4jy1.selected._51sy");
//        sleepFor(5);
        typeByXpath("//textarea[@class='uiTextareaAutogrow _3en1']", "Using Automation to update a status only for me");
        sleepFor(1);
        clickByCss("._55pe");
        sleepFor(1);
        clickByCss(".mrs.img.sp_btuBr4BxNJk.sx_f55148");
        sleepFor(1);
        clickByCss("._1mf7._4jy0._4jy3._4jy1._51sy.selected._42ft");
        sleepFor(1);
    }



       // users are able to click on their profile
    @Test(priority = 32)
    public void ClickProfile()throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        clickByCss("._2s25");
        sleepFor(1);
    }

  //  users are able to click on home button
        @Test(priority = 33)
    public void ClickHome()throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        clickByCss("#u_0_3");
        sleepFor(1);
    }
// //   users are able to click on find friends button
//    @Test(priority = 34)
//    public void ClickFindFriends()throws InterruptedException{
//        typeByCss("#email", "teamdautomation@gmail.com");
//        sleepFor(5);
//        typeByCssNEnter("#pass", "teamd123");
//        sleepFor(10);
//        clickByCss("#findFriendsNav");
//        sleepFor(10);
//        clickById("findFriendsNav");
//        sleepFor(10);
//    }
//
 //       users are able to click on news feed
//    @Test(priority = 35)
//    public void ClickNewsFeed1()throws InterruptedException{
//        typeByCss("#email", "teamdautomation@gmail.com");
//        typeByCssNEnter("#pass", "teamd123");
//        sleepFor(5);
////        //clickByCss("._5afe");
//       //// clickByCss(".linkWrap.noCount>span");
//        clickByCss("#navItem_4748854339");
//        sleepFor(10);
//    }
    @Test(priority = 36)
    ////users are able to click on family on the left hand side
    public void family()throws InterruptedException{
        typeByCss("#email", "teamdautomation@gmail.com");
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        clickByCss("#navItem_133305800454079 ");

    }

    @Test(priority = 37)
    ////users are able to click on Acquaintances on the left hand side
    public void Acquaintances()throws InterruptedException{
        typeByCss("#email", "teamdautomation@gmail.com");
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        clickByCss("#navItem_133305797120746");

    }

    @Test(priority = 38)
    ////users are able to click on Close Friends on the left hand side
    public void CloseFriends()throws InterruptedException{
        typeByCss("#email", "teamdautomation@gmail.com");
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        clickByCss("#navItem_133305787120747");}


  //  users are able to click on the messages on the left hand side
    @Test(priority = 39)
     public void ClickMessage()throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
          clickByCss("#navItem_217974574879787");
        sleepFor(1);

    }
 //   users are able check their friend requests
    @Test(priority = 40)
    public void CheckFriendRequest()throws InterruptedException{
        typeByCss("#email","teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass","teamd123");
        sleepFor(1);
        clickByCss("._2n_9");
        sleepFor(1);
    }

  //  users are ablet to click on the message box from the top right hand side
    @Test(priority = 41)
    public void CheckMessagesFromTheTopRightCorner()throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        clickByXpath("//*[@id='u_0_f']/I");
        sleepFor(1);
    }

  //  users are able to click on search for friends
        @Test(priority = 42)
    public void ClickOnSearchForFriendBox() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        clickByCss("._1frb");
      sleepFor(1);
}

 //   users are able to input a friends name on the search box
   @Test(priority = 43)
    public void ClickAndEnterAFriendsName() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        typeByCss("._1frb", "sohan mahmud");
        sleepFor(1);
    }

    //  6.users are able to search for friends on facebook
    @Test(priority = 44)
    public void SearchFriends() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        typeByCssNEnter("._1frb", "sohan mahmud");
        sleepFor(1);
    }
     //  6.users are able to search for different friends on facebook
    @Test(priority = 45)
    public void SearchDifferentFriends() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        typeByCssNEnter("._1frb", "sohan mahmud");
        typeByCssNEnter("._1frb", "shamima akthar kaya");
        typeByCssNEnter("._1frb", "soren essen");
        typeByCssNEnter("._1frb", "rauben");
        typeByCssNEnter("._1frb", "imran khan");
        sleepFor(1);
    }


  //  users are able to send friend requests
    @Test(priority = 45)
    public void SendFriendRequest() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        typeByCssNEnter("._1frb", "sohan mahmud");
        sleepFor(1);
        clickByCss("._42ft._4jy0.FriendRequestAdd.addButton._4jy3._517h._51sy");
    }

//    users are able to click on friend's names
        @Test(priority = 44)
    public void ClickOnFriends() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        typeByCssNEnter("._1frb", "sohan mahmud");
        sleepFor(1);
        clickByCss("._5d-5");
        sleepFor(1);

}
 //   users are able to search and click on friends names
    @Test(priority = 45)
        public void SearchAndClickOnFriends() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        sleepFor(1);
        typeByCssNEnter("._1frb", "soren essen");
        sleepFor(1);
        clickByCss("._5d-5");
        sleepFor(1);
    }

 //   users are able to post on friend's wall
    @Test(priority = 46)
    public void postOnFriendsWall() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        sleepFor(1);
        typeByCssNEnter("._1frb", "Shamima Akthar Kaya");
        sleepFor(1);
        clickByCss("._5d-5");
        sleepFor(1);
        typeByCss("._4h98", "using automation to post on your wall-kaya");
        sleepFor(1);
        clickByCss("._1mf7._4jy0._4jy3._4jy1._51sy.selected._42ft");
        sleepFor(1);
    }

 //   users are able to like a post in their news feed
    @Test(priority = 47)
    public void LikeAPostOnNewsFeed() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        clickByCss(".UFILikeLink._4x9-._4x9_._48-k");
   }

   // users are able to like a post on friends wall
      @Test(priority = 48)
    public void LikeAPostOnFriendsWall()throws InterruptedException {
          sleepFor(2);
          typeByCss("#email", "teamdautomation@gmail.com");
          sleepFor(1);
          typeByCssNEnter("#pass", "teamd123");
          sleepFor(1);
          sleepFor(1);
          typeByCssNEnter("._1frb", "Shamima Akthar Kaya");
          sleepFor(1);
          clickByCss("._5d-5");
          sleepFor(1);
          scrollPageDown400();
          sleepFor(1);
          clickByCss(".UFILikeLink._4x9-._4x9_._48-k");
          sleepFor(1);
   }

  //  users are able to comment on a post on the news feed
    @Test(priority = 49)
    public void CommentOnAPostOnNewsFeed() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        scrollPageDown400();
        sleepFor(1);
        clickByCss(".comment_link._5yxe");
        sleepFor(1);
        typeByCssNEnter("._1p1v","usuing automation to comment on your own pic-kaya");
        sleepFor(1);
    }


  //  users are able to comment on a friend's post
    @Test(priority = 50)
    public void CommentOnAPostOnFriendsWall() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        typeByCssNEnter("._1frb", "Shamima Akthar Kaya");
        sleepFor(1);
        clickByCss("._5d-5");
        sleepFor(1);
        scrollPageDown400();
        sleepFor(1);
        clickByCss(".comment_link._5yxe");
        sleepFor(1);
        typeByCssNEnter("._1p1v","usuing automation to comment on your own pic-kaya");
        sleepFor(1);
}

    //users are able to open the chat box on the bottom right hand side
        @Test(priority = 51)
    public void OpenChatBox() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
        clickByCss("#fbDockChatBuddylistNub");
            sleepFor(1);
}



  //  users are able to open chat with a friend
        @Test(priority = 52)
    public void MessageFriends()throws InterruptedException{
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(1);
       clickByXpath("//*[@id='u_0_f']/I");
    sleepFor(1);
    clickByXpath("//*[@id='u_0_g']/div/div[3]/div/div[1]/div/div/ul/li[2]/a/div/div[2]/div/div[2]/div/div[1]/strong/span");
}


    //users are able to open the chat box and send texts
    @Test(priority = 53)
    public void ChatWithfriends()throws InterruptedException{
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(2);
        clickByXpath("//*[@id='u_0_f']/I");
        sleepFor(1);
        clickByXpath("//*[@id='u_0_g']/div/div[3]/div/div[1]/div/div/ul/li[2]/a/div/div[2]/div/div[2]/div/div[1]/strong/span");
        typeByCssNEnter("._1p1v","heyyyy");
    }

    //users are able to send messages(this does not work yet)
        @Test(priority = 54)
     public void SendMessages()throws InterruptedException{
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(1);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(2);
//       clickByCss(".img.sp_szkJYLAG68n.sx_0faec1");
//    sleepFor(10);
            sleepFor(2);
      clickByCss("#navItem_217974574879787");
            sleepFor(1);

     typeByCssNEnter(".uiTextareaNoResize.uiTextareaAutogrow._1rv","hey");

    }


}




