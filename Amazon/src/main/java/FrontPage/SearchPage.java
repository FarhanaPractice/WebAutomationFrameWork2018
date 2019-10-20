package FrontPage;
import Base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage extends CommonAPI {
    @FindBy(how = How.XPATH, using = "//input[@id='twotabsearchtextbox']")
    public static WebElement search;
    @FindBy(how = How.CSS, using = "span[class='nav-sprite nav-logo-base']")
    public static WebElement logo;
    @FindBy(how = How.XPATH, using = "//a[@class='nav-a nav-a-2 nav-single-row-link' and @id='nav-orders']//span[@class='nav-line-2']")
    public static WebElement orders;
    @FindBy(how = How.XPATH, using = "//a[@class='nav-a nav-a-2 nav-single-row-link'and@id='nav-link-prime']//span[@class='nav-line-2']")
    public static WebElement tryPrime;
    @FindBy(how = How.XPATH, using = "//a[@class='nav-a' and @tabindex='49']")
    public static WebElement giftCards;
    @FindBy(how = How.XPATH, using = "//img[@alt='New Year, New You Store']")
    public static WebElement AmazonStoreFront;
    @FindBy(how = How.XPATH, using = "//img[@alt='Image of an Echo Dot.']")
    public static WebElement EchoDotPic;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),\"Today's deals under $25\")]")
    public static WebElement todaysDeal;

    public void clickOnSearch() {
        search.click();
        search.sendKeys("book", Keys.ENTER); }
    public void clickOnLogo() {
        logo.click(); }
    public void clickOnOrders() {
        orders.click(); }
    public void clickOnTeyPrime() {
        tryPrime.click();
    }
    public void clickOnGiftCards() {
        giftCards.click(); }
    public void clickOnAmazonStoreFront () {
        AmazonStoreFront.click(); }
    public void hitOnEchoDotPic () {
        EchoDotPic.click(); }
    public void clickOnTodausDealUnder$25 () {
        todaysDeal.click(); }



}
