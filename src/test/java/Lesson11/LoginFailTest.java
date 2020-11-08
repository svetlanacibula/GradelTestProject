package Lesson11;

import Lesson11.models.UserModel;
import Lesson11.pages.HomePage;
import Lesson11.pages.LoginPage;
import org.junit.Test;

public class LoginFailTest {
    @Test
    public void positiveLoginTest() {
        Common common = new Common();
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        common.startPage("https://www.janisroze.lv/");
        UserModel userModel = new UserModel();

        homePage.openLoginPage();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        loginPage.loginToProfile(userModel.getUsernameWrong(), userModel.getPassword());
        loginPage.loginButton();

        loginPage.validateErrorMessage("Norādiet pareizu e-pasta adresi. Piemēram epasts@epasts.lv.");


    }
}
