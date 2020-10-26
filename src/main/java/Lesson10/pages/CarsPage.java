package Lesson10.pages;

import Lesson10.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CarsPage  extends Common {
    private By minimalPrice = By.id("f_o_8_min");
    public void setMinimalPrice(String minimal) {
        driver.findElement(minimalPrice).sendKeys(minimal);
    }
    private  By maximalPrice = By.id("f_o_8_max");
    public void setMaximalPrice (String maximal) {
        driver.findElement(maximalPrice).sendKeys(maximal);
    }
    private By minYear = By.id("f_o_18_min");
    public void selectMinYear (String year) {
        Select minYearSelector = new Select (driver.findElement(minYear));
        minYearSelector.selectByValue(year);

    }
    private By maxEngine = By.id("f_o_15_max");
    public void selectMaxEngine (String engine) {
        Select maxEnginSelector = new Select (driver.findElement(maxEngine));
        maxEnginSelector.selectByValue(engine);
    }
    private By chooseColor = By.id("f_o_17");
    public void selectColor (String color) {
        Select colorSelector = new Select (driver.findElement(chooseColor));
        colorSelector.selectByValue(color);

    }
    private By clickSearch = By.xpath("//input[@class='b s12']");
    public void setClickSearch () {
        driver.findElement(clickSearch).click();
    }



}
