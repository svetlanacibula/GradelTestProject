package ForumCinema.pages;


import ForumCinema.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TicketPage extends Common {

    private By enterUsername = By.xpath("//input[@class='form-control']");
    private By enterPassword = By.xpath("//input[@name='password']");
    private By enterProfilePage = By.xpath("//button[@class='btn btn-primary btn-lg']");
   // private By allMovies = By.xpath("//*[@id='main-header']/div/div[3]/ul/li[1]");
    private By buyTicket = By.linkText("Pirkt biļeti");
    private By ticketAmount = By.xpath("//*[@id='ShowPrices0Amount']");
    private By chooseSeat = By.xpath("//button[@class='btn btn-primary btn-buy']");

    public void setEnterUsername(String username) {
        driver.findElement(enterUsername).sendKeys(username);
    }

    public void setEnterPassword(String password) {
        driver.findElement(enterPassword).clear();
        driver.findElement(enterPassword).sendKeys(password);

    }

    public void setEnterProfilePage() {
        driver.findElement(enterProfilePage).click();

    }

   // public void setAllMovies() {
   //     driver.findElement(allMovies).click();
   // }

    public void selectBuyTicket() {
        driver.findElement(buyTicket).click();
    }

    public void selectTicketAmount(String ticket) {
        Select selectTicketAmount = new Select(driver.findElement(ticketAmount));
        selectTicketAmount.selectByValue(ticket);
    }

    public void selectChooseSeat() {
        driver.findElement(chooseSeat).click();
    }

}
