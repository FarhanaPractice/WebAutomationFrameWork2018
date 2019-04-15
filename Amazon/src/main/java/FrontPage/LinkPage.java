package FrontPage;
import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LinkPage extends CommonAPI {
    @FindBy(how = How.CSS, using = "")
    public static WebElement TakeALook;
    @FindBy(how = How.ID, using = "ap_email")
    public static WebElement SingOnOption;
    @FindBy(how = How.ID, using = "ap_password")
    public static WebElement setPassword;
    @FindBy(how = How.CLASS_NAME, using = "a-button-input")
    public static WebElement clickOnSingOn;
    @FindBy(how = How.XPATH, using = "//a[@class='nav-a' and @tabindex='5']")
    public static WebElement GlassOption;
    @FindBy(how = How.XPATH, using = "//a[@class='nav-a' and @ tabindex='5']")
    public static WebElement RainbowPic;
    @FindBy(how = How.CLASS_NAME, using = "//a[@id='nav-link-accountList']//span[@class='nav-line-2']")
    public static WebElement AccountList;
    @FindBy(how = How.XPATH, using = "//img[@alt='Zac Efron Store']")
    public static WebElement ZacEfronPic;
    public void hitOnTakeALook() {
        TakeALook.click();}
    public void hitOnSingButton(){
        SingOnOption.sendKeys("username");}
    public void hitOnPassword(){
        setPassword.sendKeys("password");}
    public void hitOnEnterButton(){
        clickOnSingOn.click();}
    public void hitOnGlassOption() {
        GlassOption.click();}
    public void cliclOnRainbow (){
        RainbowPic.click();}
    public void clickOnAccountAndList () {
        AccountList.click(); }
    public void hitOnZacEfronPic () {
        ZacEfronPic.click(); }
}
