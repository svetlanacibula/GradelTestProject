package Lesson11;

import Lesson11.models.ShopperModel;
import Lesson11.pages.ShopperPage;
import org.junit.Test;

public class BuyStuffTest {
    @Test
    public void buyThing() {
        Common common = new Common();
        ShopperPage shopperPage = new ShopperPage();
        ShopperModel shopperModel = new ShopperModel();
        common.startPage("https://www.janisroze.lv/");

        shopperPage.setSearchFor("superman");
        shopperPage.setSubmitSearch();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        shopperPage.setChooseProduct();
        shopperPage.setValidateTitle();
        shopperPage.setAddToBasket();
        shopperPage.setGoToBasket();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        shopperPage.fillInShopperData(shopperModel.getFirstname(), shopperModel.getLastname(), shopperModel.getEmail(), shopperModel.getPhone(), shopperModel.getAddress(), shopperModel.getPostcode());

        shopperPage.selectChoosePakomat("scandipost24_9934");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        shopperPage.setPaymentMethod();
        shopperPage.setAddCoupon("WHY NOT?");
    }

}
