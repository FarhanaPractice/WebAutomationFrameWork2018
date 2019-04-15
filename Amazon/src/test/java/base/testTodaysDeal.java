package base;
import FrontPage.TodaysDeal;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testTodaysDeal extends TodaysDeal {
    TodaysDeal todaysDeal= PageFactory.initElements(driver,TodaysDeal.class);
    @Test
    public void todaysDeal(){
        TodaysDeal todaysDeal = PageFactory.initElements(driver,TodaysDeal.class);
        todaysDeal.clickOnTodaysDeal();
    }
    @Test
    public void clickOnScott(){
    TodaysDeal todaysDeal = PageFactory.initElements(driver,TodaysDeal.class);
     todaysDeal.clickOnScott();
    }
    @Test
    public void checkTheName(){
     String actual = todaysDeal.CheckTodaysDealName();
     String expect ="Today's Deals";
        Assert.assertEquals(actual,expect);
    }
    @Test
    public void shopNow(){
    TodaysDeal todaysDeal = PageFactory.initElements(driver,TodaysDeal.class);
    todaysDeal.hitOnShopNow();}
    @Test
    public void medicineSection(){
        TodaysDeal todaysDeal = PageFactory.initElements(driver,TodaysDeal.class);
        todaysDeal.clickOnMedicineSection();
    }
    @Test
    public void cupons(){
        TodaysDeal todaysDeal = PageFactory.initElements(driver,TodaysDeal.class);
        todaysDeal.clickOnCupon();
    }
    @Test
    public void coupons(){
        TodaysDeal todaysDeal = PageFactory.initElements(driver,TodaysDeal.class);
        todaysDeal.clickOnCupon();
    }
    @Test
    public void cart() throws InterruptedException {
        //todaysDeal.clickOnCart();
        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.com/gp/goldbox?ref");
    }


}


