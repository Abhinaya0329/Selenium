package extendsReports;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToAddScreenshotInReport {
	@Test
	public void addScreenshot() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts =  (TakesScreenshot) driver;
		String screenShort = ts.getScreenshotAs(OutputType.BASE64);
		ExtentSparkReporter spark= new ExtentSparkReporter(",/HTML_report/extentScreenShortReport.html");
		ExtentReports extReport = new ExtentReports();
		extReport.attachReporter(spark);
		ExtentTest test=extReport.createTest("addScreenshort");
		test.log(Status.PASS, "Adding ScreenShot");
		test.addScreenCaptureFromBase64String(screenShort);
		extReport.flush();
		
		
		
		
	}

}
