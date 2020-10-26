package ForumCinema.pages;

import ForumCinema.Common;
import org.openqa.selenium.By;

public class ProfilePage extends Common {
    private By myProfile = By.xpath("//button[@class='btn btn-success']");
    public void setMyProfile () {
        driver.findElement(myProfile).click();
    }
}
