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
        profile.setMyName("PashaQ");
        profile.setMyLastname("TechnikQ");
        profile.selectBirthDay("13");
        profile.selectBirthMonth("5");
        profile.selectBirthYear("1988");
        profile.setPhoneNumber("29123355");
        profile.ScrollPage();
        profile.setHomeCity("GothamQ");
        profile.selectUserGender();
        profile.selectUserLanguage("1000");
        profile.setSubmitChanges();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        profile.setValidateChanges("Paldies, izmaiņas Jūsu reģistrācijas formā ir saglabātas.");

    }
}
