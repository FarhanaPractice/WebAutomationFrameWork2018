package FrontPage;
import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Accessories extends CommonAPI {
    @FindBy(how = How.CSS, using = "//img[@title='Wander Agio Women's Fashion Long Shawl Big Grid Winter Warm Lattice Large Scarf']")
    public static WebElement womensLongSwal;
    @FindBy(how = How.XPATH, using = "//img[@title='Genteele Memory Foam Bath Mat Non Slip Absorbent Super Cozy Velvet Bathroom Rug Carpet']")
    public static WebElement BathroomRug;
    @FindBy(how = How.XPATH, using = "//div[@id='desktop-2']//ul[@class='a-unordered-list a-nostyle a-horizontal feed-carousel-shelf']//li[1]//span[1]//a[1]//img[1]")
    public static WebElement EnergyDrink;
    @FindBy(how = How.XPATH, using = "//div[@id='desktop-2']//ul[@class='a-unordered-list a-nostyle a-horizontal feed-carousel-shelf']//li[2]//span[1]//a[1]//img[1]")
    public static WebElement BeefSnack;
    @FindBy(how = How.XPATH, using = "//div[@id='desktop-2']//ul[@class='a-unordered-list a-nostyle a-horizontal feed-carousel-shelf']//li[3]//span[1]//a[1]//img[1]")
    public static WebElement Bottles;
    @FindBy(how = How.XPATH, using = "//input[@id='add-to-cart-button']")
    public static WebElement AddToCart;
    @FindBy(how = How.XPATH, using = "//img[@alt='LoafNest: Incredibly Easy Artisan Bread Kit. Cast Iron Dutch Oven and Non-Stick Perforated Silicone Liner [Blue Gradient].']")
    public static WebElement BreadKit;
    @FindBy(how = How.XPATH, using = "//div[@id='desktop-2']//ul[@class='a-unordered-list a-nostyle a-horizontal feed-carousel-shelf']//li[5]//span[1]//a[1]//img[1]")
    public static WebElement KidsCamera;
    public void clickOnWomenLongSwal () {
        womensLongSwal.click(); }
    public void clickOnBathroomRug () {
        BathroomRug.click(); }
    public void clickOnEnergyDink () {
        EnergyDrink.click(); }
    public void clickOnBeefSnack () {
        BeefSnack.click(); }
    public void ClickOnAddToCart () {
        Bottles.click();
        AddToCart.click(); }
    public void ClickOnBreadKit () {
        BreadKit.click(); }
    public void hitOnKidsCamera () {
        KidsCamera.click(); }
}
