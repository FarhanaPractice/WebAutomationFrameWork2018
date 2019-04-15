package base;
import Base.CommonAPI;
import com.relevantcodes.extentreports.ExtentReports;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import FrontPage.ExcelReaderPage;
import reporting.ExtentManager;

public class TestExcelReaderPage extends CommonAPI {
    ExcelReaderPage excelReaderPage;
    ExtentReports reports;
    @BeforeMethod
    public void setUp() {
        this.excelReaderPage = new ExcelReaderPage();
        reports = ExtentManager.getInstance();
        //setUrl("https://www.amazon.com/");

    }
    @Test(priority = 1)
    public void itemsSearchFromExcelData() throws InterruptedException {
        excelReaderPage.searchFromExcel();
    }
}
