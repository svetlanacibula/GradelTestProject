package Lesson11.pages;

import Lesson11.Common;
import org.openqa.selenium.By;

public class HomePage extends Common {
    private By accountOption = By.xpath("//ul[@class='account-dropdown long']");

    public void openLoginPage() {
        driver.findElement(accountOption).click();
    }
}
