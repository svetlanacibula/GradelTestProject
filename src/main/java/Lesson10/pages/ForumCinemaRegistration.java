package Lesson10.pages;

import Lesson10.Common;
import org.openqa.selenium.By;

public class ForumCinemaRegistration extends Common {
 private By clickLogin = By.xpath("//div[@class='btn-login btn btn-default popover-link hidden-xs hidden-sm']");
 public void setClickLogin () {
     driver.findElement(clickLogin).click();
 }

 private By enterUsername = By.xpath("//input[@class='form-control']");
    public void setEnterUsername (String username) {
        driver.findElement(enterUsername).sendKeys(username);
    }

    private By enterPassword = By.xpath("//input[@name='password']");
    public void setEnterPassword (String password) {
        driver.findElement(enterPassword).sendKeys(password);
    }
    private  By enterProfilePage = By.xpath("//button[@class='btn btn-primary btn-lg']");
    public void setEnterProfilePage () {
        driver.findElement(enterProfilePage).click();

    }
}
