package Lesson9;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aliexpress {
    @Test
    public void firstSelenium () {
        String driverPath = "C:\\Users\\Waltion\\IdeaProjects\\Gradel TestProject\\src\\test\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://aliexpress.com");
        driver.switchTo().frame(0);
        driver.findElements(By.xpath("//img[@class='rax-image ']")).get(1).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.id("search-key")).sendKeys("Tattoo");
        driver.findElement(By.xpath("//input[@class='search-button']")).click();
        driver.findElement(By.xpath("//a[@class='next-dialog-close']")).click();
        driver.findElement(By.xpath("//input[@placeholder='min']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@placeholder='max']")).sendKeys("20");
        driver.findElement(By.xpath("//a[@class='ui-button narrow-go']")). click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}

