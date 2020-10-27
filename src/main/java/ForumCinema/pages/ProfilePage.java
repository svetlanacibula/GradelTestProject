package ForumCinema.pages;

import ForumCinema.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ProfilePage extends Common {
    private By myProfile = By.xpath("//button[@class='btn btn-success']");

    public void setMyProfile() {
        driver.findElement(myProfile).click();
    }

    private By myName = By.xpath("//input[@id='inputFirstName']");
    public void setMyName(String name) {
        driver.findElement(myName).clear();
        driver.findElement(myName).sendKeys(name);
    }

    private By myLastname = By.xpath("//input[@id='inputLastName']");
    public void setMyLastname(String lastname) {
        driver.findElement(myLastname).clear();
        driver.findElement(myLastname).sendKeys(lastname);
    }
    private By birthDay = By.id("bdDay");
    public void selectBirthDay (String day) {
        Select selectBirthDay = new Select(driver.findElement(birthDay));
        selectBirthDay.selectByValue(day);
    }

    private By birthMonth = By.id("bdMonth");
    public void selectBirthMonth (String month) {
        Select selectBirthMonth = new Select (driver.findElement(birthMonth));
        selectBirthMonth.selectByValue(month);
    }
    private By birthYear = By.id("bdYear");
    public void selectBirthYear (String year) {
        Select selectBirthYear = new Select (driver.findElement(birthYear));
        selectBirthYear.selectByValue(year);
    }
    private By phoneNumber = By.id("inputMobile");
    public void setPhoneNumber(String phone){
        driver.findElement(phoneNumber).clear();
        driver.findElement(phoneNumber).sendKeys(phone);
    }
    private By homeCity = By.id("inputCity");
    public void setHomeCity(String city) {
        driver.findElement(homeCity).clear();
        driver.findElement(homeCity).sendKeys(city);
    }

    private By userGender = By.xpath("//div[@id='layout-left']/div[1]/div[1]/div[1]/form[1]/div[9]/div[1]/label[2]");
    public void selectUserGender () {
        driver.findElement(userGender).click();
    }

    private By userLanguage = By.id("preferredLanguage");
    public void selectUserLanguage (String language) {
        Select selectUserLanguage = new Select(driver.findElement(userLanguage));
        selectUserLanguage.selectByValue(language);
    }
    private By submitChanges = By.xpath("//button[@class='btn btn-primary']");
    public void setSubmitChanges () {
        driver.findElement(submitChanges).click();
    }

}
