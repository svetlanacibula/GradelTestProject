package Lesson10.pages;

import Lesson10.Common;
import org.openqa.selenium.By;

public class HomePage extends Common {
    private By carsTitle = By.id("mtd_97");
    private By dogsTitle = By.id("mtd_300");

    public void chooseCarType(){
        driver.findElement(carsTitle).click();
    }

    public void chooseDogsType(){
        driver.findElement(dogsTitle).click();
    }

}
