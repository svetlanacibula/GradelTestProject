package ForumCinema.pages;

import ForumCinema.Common;
import org.openqa.selenium.By;

public class LoginPage extends Common {
    private By enterUsername = By.xpath("//input[@class='form-control']");
    private By enterPassword = By.xpath("//input[@name='password']");
    private By enterProfilePage = By.xpath("//button[@class='btn btn-primary btn-lg']");

    public void setEnterUsername(String username) {
        driver.findElement(enterUsername).sendKeys(username);
    }

    public void setEnterPassword(String password) {
        driver.findElement(enterPassword).clear();
        driver.findElement(enterPassword).sendKeys(password);

    }

    public void setEnterProfilePage() {
        driver.findElement(enterProfilePage).click();

    }
}
