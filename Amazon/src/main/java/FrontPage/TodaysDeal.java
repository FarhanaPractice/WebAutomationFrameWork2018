package FrontPage;
import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TodaysDeal extends CommonAPI {
    @FindBy(how = How.XPATH,using = "//a[@class='nav-a' and @tabindex='48']")
    public static WebElement todaysDeal;
    @FindBy(how = How.ID,using = "staticImage")
    public static WebElement ShopNow;
    @FindBy(how = How.CSS,using = "/html[1]/body[1]/div[1]/div[9]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]/div[2] ")
    public static WebElement MedicineSection;
    @FindBy(how = How.XPATH,using = "//a[@class='nav-a' and @ tabindex='67']")
    public static WebElement Cupons;
    @FindBy(how = How.CLASS_NAME,using = "al-lo-carousel-vertical-left")
    public static WebElement Cart;
    @FindBy(how = How.CLASS_NAME,using = "//div[@class='a-row layer backGround' and @xpath='1']")
    public static WebElement Scott;
    @FindBy(how = How.CLASS_NAME,using = "gbh1-bold")
    public static WebElement TodaysDealName;
    public void clickOnTodaysDeal(){
        todaysDeal.click();}
    public void hitOnShopNow(){
        ShopNow.click();}
    public void clickOnMedicineSection(){
        MedicineSection.click();}
    public void clickOnCupon(){
        Cupons.click();}
    public void clickOnScott(){
        Scott.click();
    }
    public String CheckTodaysDealName(){
        TodaysDealName.click();
        String message = driver.getCurrentUrl();
        System.out.println(message);
        return message;
    }
}
