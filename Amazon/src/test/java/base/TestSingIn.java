package base;
import FrontPage.SingIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSingIn extends SingIn {
    SingIn singIn= PageFactory.initElements(driver, SingIn.class);
//    @BeforeMethod
//    public void initialization(){
//        singIn= PageFactory.initElements(driver, SingIn.class);
//        setUrl("https://www.amazon.com/");}
    @Test
    public void clickOnLink() throws InterruptedException {
        singIn.SingOn();
        Thread.sleep(2000);
    }
}
