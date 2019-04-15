package FrontPage;

import Base.CommonAPI;
import excelReader.ExcelReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

public class ExcelReaderPage extends CommonAPI {
    public ExcelReaderPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath= "//*[@id=\"twotabsearchtextbox\"]")
    WebElement searchBox;
    public void searchFromExcel() throws InterruptedException {
        ExcelReader excelReader = new ExcelReader("C:\\Users\\farha\\Desktop\\WebAutomationFrameWork2018\\Amazon\\src\\main\\java\\excelReader\\ExcelData.xlsx");
        int rowcount = excelReader.getRowCount(0);
        // searchButton.click();
        searchBox.click();
        for (int i = 0; i < rowcount; i++) {
            String searchItems = excelReader.getData(0, i, 0);
            searchBox.sendKeys(searchItems, Keys.ENTER);
            Thread.sleep(500);
            searchBox.clear();


        }
    }
}