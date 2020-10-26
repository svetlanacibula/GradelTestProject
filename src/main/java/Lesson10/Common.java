package Lesson10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {
    public static WebDriver driver;

    public void startPage(String url) {
        String driverPath = "C:\\Users\\Waltion\\IdeaProjects\\Gradel TestProject\\src\\test\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

    }
    public void StopDriver() {
        driver.quit();
    }


}

