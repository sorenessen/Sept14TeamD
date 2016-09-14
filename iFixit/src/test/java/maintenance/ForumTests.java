package maintenance;

import ForumPosting.UniLogin;
import org.testng.annotations.Test;

/**
 * Created by soren on 9/10/2016.
 */
public class ForumTests extends UniLogin {
    @Test(priority = 1)//User can post a question on the forum
    public void TestForumPost() throws InterruptedException {
        ifixitLogin();
        navigateToForum();
        postQuestion();
    }

    @Test(priority = 2)//User can edit their question
    public void TestForumEdit() throws InterruptedException {
        ifixitLogin();
        navigateToForum();
        goToUserQuestion();
        editUserQuestion();
    }

    @Test(priority = 3)//User can answer their question
    public void TestPostForum() throws InterruptedException {
        ifixitLogin();
        navigateToForum();
        goToUserQuestion();
        answerUserQuestion();
    }

    @Test(priority = 4)//User delete their question
    public void TestDeletePost() throws InterruptedException {
        ifixitLogin();
        navigateToForum();
        goToUserQuestion();
        deleteUserQuestion();


 }
}
