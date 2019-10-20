package FrontPage;
import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HoverOver extends CommonAPI {

    @FindBy(how = How.XPATH,using = "//*[@tabindex='7']")
    public static WebElement tryPrime;
    @FindBy(how = How.XPATH,using = "//a[@id='nav-link-accountList']//span[@class='nav-line-2']")
    public static WebElement accountList;
    public void checkAccountList() throws InterruptedException {
        builder.moveToElement(accountList).perform();
        sleepFor(5);
        System.out.println(accountList.getText());
    }
    public void checkTryPrime() throws InterruptedException {
        Actions builder = new Actions(driver);
        builder.moveToElement(tryPrime).perform();
        sleepFor(5);
        System.out.println(tryPrime.getText());

   }
}
