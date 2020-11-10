package Lesson11.pages;

import Lesson11.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import static org.assertj.core.api.Assertions.assertThat;

public class ShopperPage extends Common {
    private By searchFor = By.xpath("//input[@id='search']");
    private By submitSearch = By.xpath("//button[@type='submit']");
    private By chooseProduct = By.id("product-collection-image-70403");
    private By addToBasket = By.xpath("//button[@id='product-addtocart-button']");
    private By goToBasket = By.xpath("//div[@id='mini-cart']");
    private By choosePakomat = By.xpath("//select[@id='s_method_scandipost24_extra_box']");
    private By paymentMethod = By.xpath("//input[@id='p_method_paypal_express']");
    private By addCoupon = By.id("coupon_code");
    private By firstnameElement = By.id("billing:firstname");
    private By lastnameElement = By.id("billing:lastname");
    private By emailElement = By.id("billing:email");
    private By phoneElement = By.id("billing:telephone");
    private By addressElement = By.id("billing:street1");
    private By postcodeElement = By.id("billing:postcode");


    public void fillInShopperData(String firstname, String lastname, String email, String phone, String address, String postcode) {
        driver.findElement(firstnameElement).sendKeys(firstname);
        driver.findElement(lastnameElement).sendKeys(lastname);
        driver.findElement(emailElement).sendKeys(email);
        driver.findElement(phoneElement).sendKeys(phone);
        driver.findElement(addressElement).sendKeys(address);
        driver.findElement(postcodeElement).sendKeys(postcode);
    }

    public void setSearchFor(String search) { driver.findElement(searchFor).sendKeys(search); }

    public void setSubmitSearch() {
        driver.findElement(submitSearch).click();
    }

    public void setChooseProduct() {
        driver.findElement(chooseProduct).click();
    }

    public void setAddToBasket() {
        driver.findElement(addToBasket).click();
    }

    public void setGoToBasket() {
        driver.findElement(goToBasket).click();
    }

    public void selectChoosePakomat(String pakomat) {
        Select selectChoosePakomat = new Select(driver.findElement(choosePakomat));
        selectChoosePakomat.selectByValue(pakomat);
    }

    public void setPaymentMethod() {
        driver.findElement(paymentMethod).click();
    }

    public void setAddCoupon(String coupon) {
        driver.findElement(addCoupon).sendKeys(coupon);
    }

    public void setValidateTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Figūra Strech Superman 25 cm";
        assertThat(actualTitle).isEqualTo(expectedTitle);

    }


}
