package Lesson10;

import Lesson10.pages.CarsPage;
import Lesson10.pages.DogsPage;
import Lesson10.pages.HomePage;

public class MyFirstTest {
    public static void main (String[] args) {
        HomePage page = new HomePage();
        CarsPage cars = new CarsPage();
        page.startPage("https://www.ss.com");
        page.chooseCarType();
        cars.setMinimalPrice("6000");
        cars.setMaximalPrice("10000");
        cars.selectMinYear("2005");
        cars.selectMaxEngine("3.0");
        cars.selectColor("6318");
        cars.setClickSearch();
        page.StopDriver();

    }
}
