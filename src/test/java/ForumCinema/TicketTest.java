package ForumCinema;

import ForumCinema.pages.HomePage;
import ForumCinema.pages.LoginPage;
import ForumCinema.pages.TicketPage;

public class TicketTest {
    public static void main(String[] args) {
        HomePage page = new HomePage();
        LoginPage login = new LoginPage();
        TicketPage ticket= new TicketPage();
        page.startPage("https://www.forumcinemas.lv/");
        page.setClickLogin();
        login.setEnterUsername("TestUserJGTutorial@hotmail.com");
        login.setEnterPassword("parolj9090");
        login.setEnterProfilePage();
       // ticket.setAllMovies();
        ticket.selectBuyTicket();
        ticket.selectTicketAmount("2");
        ticket.selectChooseSeat();
        // login.StopDriver();
    }
}
