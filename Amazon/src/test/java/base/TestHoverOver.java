package base;
import FrontPage.HoverOver;
import FrontPage.PicturePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHoverOver extends HoverOver {
    HoverOver hoverOver= PageFactory.initElements(driver, HoverOver.class);
    @Test
    public void check_Hover_Over() throws InterruptedException {
        hoverOver.checkTryPrime();
    }
    @Test
    public void check_AccountList() throws InterruptedException {
        hoverOver.checkAccountList();
    }
}