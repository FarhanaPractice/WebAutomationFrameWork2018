package base;
import FrontPage.PicturePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPicturePage extends PicturePage {
    PicturePage picturePage= PageFactory.initElements(driver,PicturePage.class);

    @Test
    public void checkFitnessName(){
      String actual = picturePage.checkFitness();
      String expect ="Fitness";
        Assert.assertEquals(actual,expect);
    }
    @Test
    public void CoolTechGifts(){
       String actual = picturePage.checkCoolTech();
       String expect = "Cool tech gifts";
       Assert.assertEquals(actual,expect);
    }
    @Test
    public void tryPrime(){
       String actual = picturePage.checkTryPrime();
       String expect = "https://www.amazon.com/amazonprime?_encoding=UTF8&ref=nav_prime_try_btn";
       Assert.assertEquals(actual,expect);
    }
    @Test
    public void livePlants(){
        String actual = picturePage.checkLivePlants();
        String expect = "Explore live plants";
       Assert.assertEquals(actual,expect);
    }
    @Test
    public void ckeckOrder(){
        String actual = picturePage.checkOrderLink();
        String expect = "https://www.amazon.com/ap/signin?_encoding=UTF8&accountStatusPolicy";
        Assert.assertEquals(actual,expect);
    }

}
