package books;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qsp.genricutility.ExcelUtility;
import com.qsp.objectRepository.BaseClass;
import com.qsp.objectRepository.HomePage;

import dev.failsafe.internal.util.Assert;

public class TC_DWS_005_Test extends BaseClass {
	
	@Test
	public void clickOnBooks() throws EncryptedDocumentException, IOException {
		hp=new HomePage(driver);
		hp.getBookLink().click();
		excelLib=new ExcelUtility();
		String actualTitle = driver.getTitle();
		String expectedtitle = excelLib.getStringDataFromExcel("BOOKS",1,0);
		org.testng.Assert.assertEquals(actualTitle, expectedtitle,"BOOK PAGE IS NOT DISPLAY");
		Reporter.log("Books page is display",true);
		
	}

}
