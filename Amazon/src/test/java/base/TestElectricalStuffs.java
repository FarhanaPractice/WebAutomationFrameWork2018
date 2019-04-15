package base;
import FrontPage.ElectricalStuffs;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestElectricalStuffs extends ElectricalStuffs {
    ElectricalStuffs electricalStuffs= PageFactory.initElements(driver,ElectricalStuffs.class);
    @Test
    public void VoiceRemote() {
        electricalStuffs.hitOnVoiceREmote();
    }
    @Test
    public void ControllerCharger() {
        electricalStuffs.clickOnControllerCharger();
    }
    @Test
    public void USBCharger() {
        electricalStuffs.clickOnUSBCharger();
    }
    @Test
    public void clickOnApparel(){
        electricalStuffs.hitOnApparel();
    }
    @Test
    public void clickFitnessTech(){
        electricalStuffs.hitOnFitnessTech();
    }
    @Test
    public void clickOnVideo(){
        electricalStuffs.clickOnVideo();
    }
}
