package FrontPage;
import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SingIn extends CommonAPI {
    @FindBy(how = How.ID, using = "nav-your-amazon")
    public static WebElement Link;
    @FindBy(how = How.ID, using = "ap_email")
    public static WebElement email;
    @FindBy(how = How.ID, using = "ap_password")
    public static WebElement password;
    @FindBy(how = How.ID, using = "signInSubmit")
    public static WebElement hitOnSingIn;
    public void SingOn() {
        Link.click();
        email.sendKeys("farhanahaque1024@gmail.com");
        password.sendKeys("farhanamoni92");
        hitOnSingIn.click(); }
}
