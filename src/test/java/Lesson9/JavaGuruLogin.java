package Lesson9;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaGuruLogin {
    @Test
    public void firstSelenium () {
        String driverPath = "C:\\Users\\Waltion\\IdeaProjects\\Gradel TestProject\\src\\test\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(" https://javaguru.lv/moodle/login/index.php");
        driver.findElement(By.id("username")).sendKeys("TestUser");
        driver.findElement(By.id("password")).sendKeys("SomePSW");
        driver.findElements(By.xpath("//input[@type='submit']")).get(1).click();
        driver.findElement(By.linkText("Quality Assurance 2")).click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
