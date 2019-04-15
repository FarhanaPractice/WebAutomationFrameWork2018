package FrontPage;
import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Address extends CommonAPI {
    @FindBy(how = How.XPATH, using = "//a[@class='nav-a' and @tabindex='48']")
    public static WebElement TodaysDeal;
    public void hitOnTodaysDeal() {
        TodaysDeal.click();
    }
    @FindBy(how = How.ID, using = "nav-cart")
    public static WebElement Cart;
    public void hitOnCart() {
        Cart.click();
    }
    @FindBy(how = How.ID, using = "glow-ingress-line2")
    public static WebElement deliverAddress;
    public void hitOnDeliverAddress() {
        deliverAddress.click();
    }
    @FindBy(how = How.CLASS_NAME, using = "a-link-normal aok-inline-block")
    public static WebElement Picture;
    public void clickOnPicture() {
        Picture.click(); }
}
