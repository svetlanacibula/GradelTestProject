package Lesson9;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CarTyres {
    @Test
    public void summerTyres() {
        String driverPath = "C:\\Users\\Waltion\\IdeaProjects\\Gradel TestProject\\src\\test\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://220.lv/lv/");
        driver.findElement(By.xpath("//li[@id='department-4579']")).click();
        driver.findElements(By.xpath("//div[@class='image-wrap']")).get(1).click();
        if (driver.getTitle().contains("PLAŠĀKAIS AUTO PREČU KLĀSTS ! IENĀC INTERNETA VEIKALĀ 220.LV ! | 220.lv"))
            //Pass
            System.out.println("Page title contains \"PLAŠĀKAIS AUTO PREČU KLĀSTS ! IENĀC INTERNETA VEIKALĀ 220.LV ! | 220.lv\" ");
        else
            //Fail
            System.out.println("Page title doesn't contains \"PLAŠĀKAIS AUTO PREČU KLĀSTS ! ...\" ");
        driver.findElements(By.xpath("//div[@class='image-wrap']")).get(0).click();
        driver.findElements(By.xpath("//div[@class='menu filters-block-list']")).get(1).click();
        driver.findElement(By.xpath("//li[@data-value='7130554']")).click();
        driver.findElements(By.xpath("//div[@class='menu filters-block-list']")).get(2).click();
        driver.findElement(By.xpath("//li[@data-value='7130455']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1100)");
        driver.findElement(By.xpath("//input[@name='filter_search']")).sendKeys("Bridgestone");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//ul[@class='menu filters-group']/li[6]/ul[1]/li[23]")).click();
        driver.findElement(By.xpath("//div[@class='site-center']/section[3]/div[1]/div[1]/div[2]/section[1]/div[7]/div[1]/div[11]")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//div[@class='site-center']/section[3]/div[1]/div[1]/div[2]/section[1]/div[7]/div[1]/div[11]/div[1]/div[1]/a[3]")).click();
    }
}
