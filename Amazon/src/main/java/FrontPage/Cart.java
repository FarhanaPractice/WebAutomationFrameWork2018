package FrontPage;
import Base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart extends CommonAPI {
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public static WebElement searchItem;
    @FindBy(xpath = "//input[@value='Go']")
    public static WebElement clickOnSearch;
    @FindBy(xpath = "//div[@id='pdagDesktopSparkleAsinContainer1']//div[@class='imageContainer']")
    public static WebElement clickOnPicture;
    @FindBy(xpath = "//span[@class='a-dropdown-prompt']")
    public static WebElement clickOnSize;
    @FindBy(id = "native_dropdown_selected_size_name_3")
    public static WebElement clickOnSizeNumber;
    @FindBy(id = "add-to-cart-button")
    public static WebElement addToCart;
    @FindBy(xpath = "//li[@id='result_0']//img[@class='s-access-image cfMarker']")
    public static WebElement LongTunic;
    @FindBy(xpath = "//img[@data-search-image-source='https://images-na.ssl-images-amazon.com/images/I/51Nzt2bZYML._AC_UL260_SR200,260_.jpg']")
    public static WebElement Skirt;
    public void ClickOnSearch(){
        searchItem.sendKeys("WomensDress", Keys.ENTER);
        clickOnSearch.click();
        clickOnPicture.click();
        clickOnSize.click();
        clickOnSizeNumber.click();
        addToCart.click();}
    public void clickOnLongTunic(){
        LongTunic.click();}
    public void clickOnSkirt(){
        Skirt.click();}
}
