package base;
import FrontPage.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class testSearchPage extends SearchPage {
     SearchPage searchPage= PageFactory.initElements(driver,SearchPage.class);

    @Test
    public void clickOnLogo() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnLogo();

    }
    @Test
    public void clickOnSearch() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnSearch();
        driver.navigate().to("https://www.amazon.com/");
    }
    @Test
    public void clickOnOrders() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnOrders();
    }
    @Test
    public void clickOnTryPrime() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnTeyPrime();
    }
    @Test
    public void clickOnGiftCards() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnGiftCards();
    }
    @Test
    public void AmazonStoreFront() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnAmazonStoreFront();
    }
    @Test
    public void echoDotPic() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.hitOnEchoDotPic();
    }
    @Test
    public void todaysDeal() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnTodausDealUnder$25();
    }
}
