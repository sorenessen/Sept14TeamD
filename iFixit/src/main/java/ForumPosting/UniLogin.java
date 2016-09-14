package ForumPosting;

import common.Base;

/**
 * Created by soren on 9/10/2016.
 */
public class UniLogin extends Base {

    public void ifixitLogin() throws InterruptedException {
        byLinks("Log In");
       // typeByCss("#email", "jamespnt123@yahoo.com");
        typeByCss("#email", "jamespnt124@gmail.com");
//        typeByCss("#email", "jamespnt125@yahoo.com");
        typeByCssNEnter("#password", "automation");
        sleepFor(2);
        clickByCss("#ifixit-logo");
        sleepFor(2);
    }
    public void navigateToForum() throws InterruptedException {
        clickByXpath(".//*[@id='home-page-top']/nav/a[2]");
        sleepFor(2);

    }

    public void postQuestion() throws InterruptedException{
        byLinks("Ask a Question");
        sleepFor(2);
        typeByCss("#qaDevice", "apple iphone 6");
        typeByCss("#qaTitle", "Report the sound my remote control makes");
        sleepFor(2);
        clickByCss(".fa.fa-header");
        typeByCss("#qaText", "The twitch that silences my controllers externals sounds and alerts is broken. Can it be replaced?");
        //typeByCss("#qaTags", "iphone 6, sound");
        sleepFor(2);
        clickByCss("#previewQuestion");
        sleepFor(2);
        clickByCss("#submitQuestion");
        sleepFor(3);
    }

    public void goToUserQuestion() throws InterruptedException{
        typeByCss("#answersSearch", "Report the sound my remote control makes");
        clickByCss("#searchIcon");
        sleepFor(2);
        //clickByXpath(".//*[@id='post337130']/div[2]/h3");
        byLinks("Report the sound my remote control makes");
        sleepFor(4);
    }
    public void editUserQuestion() throws InterruptedException{
        mouseHoverByCSS(".post-metadata-actions>span");
        clickByCss(" .post-action.post-action-edit");
        //clickByCss(" .post-action.post-action-edit>a");
        sleepFor(3);
        typeByCss("#qaText", "this is an appendage");
        sleepFor(2);
        clickByCss("#previewQuestion");
        sleepFor(2);
        clickByCss("#submitQuestion");
        sleepFor(3);

    }
    public void answerUserQuestion() throws InterruptedException{
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
    }
    public void deleteUserQuestion() throws InterruptedException{
        clickByCss(".post-metadata-actions>span");
        clickByCss(" .post-action.post-action-delete.js-action-delete");
        sleepFor(3);
        clickByXpath(".//html/body/div[26]/div[1]/div/form/div/input[@value='Delete it!']");
    }

}