package base;
import FrontPage.Accessories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAccessories extends Accessories {
    Accessories accessories= PageFactory.initElements(driver,Accessories.class);
    @Test
    public void womensLongSwal() {
    accessories.clickOnWomenLongSwal();
}
    @Test
    public void clickOnBathroomRug() {
        accessories.clickOnBathroomRug();
    }
    @Test
    public void clickOnEnergyDrink() {
        accessories.clickOnEnergyDink();
    }
    @Test
    public void clickOnBeefSnack() {
        accessories.clickOnBeefSnack();
    }
    @Test
    public void clickOnBottles() {
       // accessories.clickOnBottles();
    }
    @Test
    public void clickOnAddtoCart() {
        accessories.ClickOnAddToCart();
    }
    @Test
    public void clickOnBreadKit(){
        accessories.ClickOnBreadKit();
    }
    @Test
    public void clickOnKidsCamera(){
        accessories.hitOnKidsCamera();
    }
}
