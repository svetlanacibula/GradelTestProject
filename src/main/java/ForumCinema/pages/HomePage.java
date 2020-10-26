package ForumCinema.pages;


import ForumCinema.Common;
import org.openqa.selenium.By;

public class HomePage extends Common {
    private By clickLogin = By.xpath("//div[@class='btn-login btn btn-default popover-link hidden-xs hidden-sm']");
    public void setClickLogin () {
        driver.findElement(clickLogin).click();
    }
}
