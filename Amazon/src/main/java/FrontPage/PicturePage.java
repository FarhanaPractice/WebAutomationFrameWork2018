package FrontPage;
import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PicturePage extends CommonAPI {
    @FindBy(how = How.XPATH,using = "//a[@aria-label='Fitness' and @class='a-link-normal quadrant-overlay']")
    public static WebElement Fitness;
    @FindBy(how = How.XPATH,using = "//div[@id='E9UwQoBMSiymMelMg1EjHw']//div[@class='a-cardui-header']")
    public static WebElement coolTechGift;
    @FindBy(how = How.XPATH,using = "//h2[contains(text(),'Explore live plants')]")
    public static WebElement livePlants;
    @FindBy(how = How.XPATH,using = "//a[@id='nav-link-prime']//span[@class='nav-line-2']")
    public static WebElement TryPrime;
    @FindBy(how = How.XPATH,using = "//span[@class='nav-line-2'][contains(text(),'Orders')]")
    public static WebElement orders;
    public String checkOrderLink(){
        orders.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String checkTryPrime(){
        TryPrime.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String checkLivePlants(){
        livePlants.click();
        String text = livePlants.getText();
        System.out.println(livePlants.getText());
        return text;
   }
    public String checkCoolTech(){
        coolTechGift.click();
        String message = Fitness.getText();
        System.out.println(Fitness.getText());
        return message;
    }
    public String checkFitness() {
        Fitness.click();
        String message = driver.getCurrentUrl();
        System.out.println(message);
        return message;
    }
    }
