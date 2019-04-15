package base;
import FrontPage.LinkPage;
import FrontPage.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLinKPage extends LinkPage {
    LinkPage linkPage= PageFactory.initElements(driver,LinkPage.class);

    public void hitOnTakeALook() {
        //linkPage.hitOnTakeALook();
        linkPage.hitOnSingButton();
        linkPage.hitOnPassword();
        linkPage.hitOnEnterButton();
    }
    @Test
    public void hitOnGlassOption() {
        linkPage.hitOnGlassOption();
    }
    @Test
    public void clickOnRainbow() {
        linkPage.cliclOnRainbow();
    }
    @Test
    public void clickOnAccountOption() {
        linkPage.clickOnAccountAndList();
    }
    @Test
    public void hitOnZacEfronPic() {
        linkPage.hitOnZacEfronPic();
    }
}
