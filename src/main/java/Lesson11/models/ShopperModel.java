package Lesson11.models;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ShopperModel {

    private String firstname = "Svetlana";
    private String lastname = "NeesmuRobots";
    private String email = "gaisma.sipola@gmail.com";
    private String phone = "29587766";
    private String address = "Ugales 22-11";
    private String postcode = "LV-1044";


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getPostcode() {
        return postcode;
    }
}


