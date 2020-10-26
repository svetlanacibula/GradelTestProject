package Lesson10.pages;

import Lesson10.Common;
import org.openqa.selenium.By;


public class DogsPage extends Common {

    private By dogsAge = By.id("f_o_1276_min");

    public void setDogsAge(String age) {
        driver.findElement(dogsAge).sendKeys(age);
    }
    private By clickSearch = By.xpath("//input[@class='b s12']");
    public void setClickSearch () {
        driver.findElement(clickSearch).click();
    }


}
