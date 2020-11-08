package Lesson11.pages;

import Lesson11.Common;
import com.google.common.primitives.Bytes;
import org.assertj.core.api.Assert;
import org.openqa.selenium.By;


import static org.assertj.core.api.Assertions.assertThat;

public class LoginPage extends Common {

    private By usernameElement = By.id("email");
    private By passwordElement = By.id("pass");
    private By clickLogin = By.xpath("//button[@id='send2']");
    private By errorMsg = By.id("advice-validate-email-email");
    private By url = By.linkText("https://www.janisroze.lv/lv/customer/account/");

    public void loginToProfile(String username, String password) {
        driver.findElement(usernameElement).sendKeys(username);
        driver.findElement(passwordElement).sendKeys(password);
    }

    public void loginButton() {
        driver.findElement(clickLogin).click();
    }

    public void validateErrorMessage(String message) {
        String messageText = driver.findElement(errorMsg).getText();
        assertThat(messageText).isEqualTo(message);
        //assertThat(messageText).isNotEqualTo(message);
    }

    public void setUrl(String currentUrl) {
        String URL = driver.getCurrentUrl();
        assertThat("https://www.janisroze.lv/lv/customer/account/").isEqualTo("https://www.janisroze.lv/lv/customer/account/");
    }

}
