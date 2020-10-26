package Lesson10;

import Lesson10.pages.ForumCinemaRegistration;

public class ForumCinemaLoginTest {
    public static void main(String[] args) {
        ForumCinemaRegistration registration = new ForumCinemaRegistration();
        registration.startPage("https://www.forumcinemas.lv/");
        registration.setClickLogin();
        registration.setEnterUsername("TestUserJGTutorial@hotmail.com");
        registration.setEnterPassword("parolj9090");
        registration.setEnterProfilePage();
        registration.StopDriver();
    }
}
