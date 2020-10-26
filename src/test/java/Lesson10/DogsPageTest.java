package Lesson10;

import Lesson10.pages.HomePage;
import Lesson10.pages.DogsPage;

public class DogsPageTest {
    public static void main(String[] args) {
        HomePage page = new HomePage();
        DogsPage dogs = new DogsPage();
        page.startPage("https://www.ss.com");
        page.chooseDogsType();
        dogs.setDogsAge("3");
        dogs.setClickSearch();
        page.StopDriver();
    }
}
