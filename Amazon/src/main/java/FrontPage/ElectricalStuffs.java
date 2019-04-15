package FrontPage;
import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ElectricalStuffs extends CommonAPI {
    @FindBy(how = How.XPATH, using = "//img[@title='Save $10 on the Echo Voice Remote']")
    public static WebElement VoiceRemote;
    @FindBy(how = How.XPATH, using = "//img[@title='PS4 Controller Charger, Y Team Playstation 4 / PS4 / PS4 Pro / PS4 Slim Controller Charger Charging Docking Station Stand.Dual USB Fast Charging Station & LED Indicator for Sony PS4 Controller--Black']")
    public static WebElement controllerCharger;
    @FindBy(how = How.XPATH, using = "//img[@title='Amazon 9W USB Charger 25% Off']")
    public static WebElement USBCharger;
    @FindBy(how = How.XPATH, using = "//img[@alt='Affordable apparel']")
    public static WebElement Apparel;
    @FindBy(how = How.XPATH, using = "//img[@alt='Get moving with fitness tech']")
    public static WebElement FitnessTech;
    @FindBy(how = How.XPATH, using = "//div[@class='amznlv-react-player-control-activate videojs-control-activate']")
    public static WebElement Video;
    public void hitOnVoiceREmote () {
        VoiceRemote.click(); }
    public void clickOnControllerCharger () {
        controllerCharger.click(); }
    public void clickOnUSBCharger () {
        USBCharger.click(); }
    public void hitOnApparel () {
        Apparel.click(); }
    public void hitOnFitnessTech () {
        FitnessTech.click(); }
    public void clickOnVideo () {
        Video.click(); }
}
