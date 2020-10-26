package ForumCinema;

import ForumCinema.pages.HomePage;
import ForumCinema.pages.LoginPage;

public class LoginTest {
    public static void main(String[] args) {
        HomePage page = new HomePage();
        LoginPage login = new LoginPage();
        page.startPage("https://www.forumcinemas.lv/");
        page.setClickLogin();
        login.setEnterUsername("TestUserJGTutorial@hotmail.com");
        login.setEnterPassword("parolj9090");
        login.setEnterProfilePage();
        login.StopDriver();
    }
}
