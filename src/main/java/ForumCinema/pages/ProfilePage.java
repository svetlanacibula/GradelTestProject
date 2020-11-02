package ForumCinema.pages;

import ForumCinema.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.assertj.core.api.Assertions.assertThat;

public class ProfilePage extends Common {

    private By myProfile = By.xpath("//button[@class='btn btn-success']");
    private By myName = By.xpath("//input[@id='inputFirstName']");
    private By myLastname = By.xpath("//input[@id='inputLastName']");
    private By birthDay = By.id("bdDay");
    private By birthMonth = By.id("bdMonth");
    private By birthYear = By.id("bdYear");
    private By phoneNumber = By.id("inputMobile");
    private By homeCity = By.id("inputCity");
    private By userGender = By.xpath("//div[@id='layout-left']/div[1]/div[1]/div[1]/form[1]/div[9]/div[1]/label[2]");
    private By userLanguage = By.id("preferredLanguage");
    private By submitChanges = By.xpath("//button[@class='btn btn-primary']");
    private By validateChanges = By.xpath("//*[@id='layout-left']/div/div/div/div[3]/p[1]");
    //private By validateChanges = By.linkText("Paldies, izmaiņas Jūsu reģistrācijas formā ir saglabātas.");

    public void setMyProfile() {
        driver.findElement(myProfile).click();
    }

    public void setMyName(String name) {
        driver.findElement(myName).clear();
        driver.findElement(myName).sendKeys(name);
    }

    public void setMyLastname(String lastname) {
        driver.findElement(myLastname).clear();
        driver.findElement(myLastname).sendKeys(lastname);
    }

    public void selectBirthDay(String day) {
        Select selectBirthDay = new Select(driver.findElement(birthDay));
        selectBirthDay.selectByValue(day);
    }

    public void selectBirthMonth(String month) {
        Select selectBirthMonth = new Select(driver.findElement(birthMonth));
        selectBirthMonth.selectByValue(month);
    }

    public void selectBirthYear(String year) {
        Select selectBirthYear = new Select(driver.findElement(birthYear));
        selectBirthYear.selectByValue(year);
    }

    public void setPhoneNumber(String phone) {
        driver.findElement(phoneNumber).clear();
        driver.findElement(phoneNumber).sendKeys(phone);
    }

    public void setHomeCity(String city) {
        driver.findElement(homeCity).clear();
        driver.findElement(homeCity).sendKeys(city);
    }

    public void selectUserGender() {
        driver.findElement(userGender).click();
    }


    public void selectUserLanguage(String language) {
        Select selectUserLanguage = new Select(driver.findElement(userLanguage));
        selectUserLanguage.selectByValue(language);
    }

    public void setSubmitChanges() {
        driver.findElement(submitChanges).click();
    }

    public void setValidateChanges (String message) {
        String messageText = driver.findElement(validateChanges).getText();
        assertThat(messageText).isEqualTo(message);
    }

}
