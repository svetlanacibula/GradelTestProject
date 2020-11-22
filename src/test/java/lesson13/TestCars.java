package lesson13;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class TestCars {

    @Test

    public void FindBestCar () {
        Configuration.baseUrl = "https://www.ss.com";
        Configuration.holdBrowserOpen = true;
        Configuration.startMaximized = true;

        open("/lv/transport/cars/");
        refresh();
        $(By.id("f_o_8_min")).sendKeys("6000");
        $(By.id("f_o_8_max")).sendKeys("10000");
        $(By.id("f_o_18_min")).selectOption("2005");
        $(By.id("f_o_15_max")).selectOption("3.0");
        $(By.id("f_o_17")).selectOption("Balta");
        $(By.xpath("//input[@class='b s12']")).click();


    }
}
