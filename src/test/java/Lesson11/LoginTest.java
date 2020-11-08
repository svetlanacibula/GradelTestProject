package Lesson11;

import Lesson11.models.UserModel;
import Lesson11.pages.HomePage;
import Lesson11.pages.LoginPage;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginTest {

    @Test
    public void positiveLoginTest() {
        Common common = new Common();
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        UserModel userModel = new UserModel();
        common.startPage("https://www.janisroze.lv/");

        homePage.openLoginPage();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        loginPage.loginToProfile(userModel.getUsername(), userModel.getPassword());
        loginPage.loginButton();

        loginPage.setUrl("https://www.janisroze.lv/lv/customer/account/");


    }


}

