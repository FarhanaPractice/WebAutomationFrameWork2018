package base;

import FrontPage.Cart;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCart extends Cart {
    Cart cart= PageFactory.initElements(driver,Cart.class);
    @Test
    public void searchItem(){
        cart.ClickOnSearch();}
    @Test
    public void longTunic(){
        cart.clickOnLongTunic();}
    @Test
    public void clickOnSkirt(){
        cart.clickOnSkirt();}
}
