package base;
import FrontPage.Address;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAddress extends Address {
    Address address;
    @Test
    public void hitOnTodaysDeal() {
        address.hitOnTodaysDeal();
    }
    @Test
    public void hitOnCart() {
        address.hitOnCart();
    }
    @Test
    public void clickOnDeliverAddress() {
        address.hitOnDeliverAddress();
    }
    @Test
    public void clickOnPicture() {
        address.clickOnPicture();
    }
}
