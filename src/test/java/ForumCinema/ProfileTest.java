package ForumCinema;

import ForumCinema.pages.HomePage;
import ForumCinema.pages.LoginPage;
import ForumCinema.pages.ProfilePage;

public class ProfileTest {
    public static void main(String[] args) {
        HomePage page = new HomePage();
        LoginPage login = new LoginPage();
        ProfilePage profile = new ProfilePage();
        page.startPage("https://www.forumcinemas.lv/");
        page.setClickLogin();
        login.setEnterUsername("TestUserJGTutorial@hotmail.com");
        login.setEnterPassword("parolj9090");
        login.setEnterProfilePage();
        profile.setMyProfile();
    }
}
