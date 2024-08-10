package extendsReports;

import java.sql.Time;
import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReports {
	String time=LocalDateTime.now().toString().replace(":","-");
	@Test
	public void createReport() {
		//step1===create object for extentsparkReports
		ExtentSparkReporter spark= new ExtentSparkReporter("./HTML_report/"+time+"extendsReport.html");
		
		
		//step2===create object for extentReports
		ExtentReports exeReport=new ExtentReports();
		
		
		//step 3 == Attach extentsparkReport to extentsREport
		exeReport.attachReporter(spark);
		
		
		//step 4===create extentTest object
		ExtentTest test = exeReport.createTest("createReport");
		
		
		//step5==call log()and provide ststus and message
		test.log(Status.PASS, "Sucessfull create extent report");
		test.log(Status.INFO, "Open browser and navigate to url");
		test.log(Status.SKIP , "Enter valid credentail");
		test.log(Status.WARNING, "Click on login button");
		test.log(Status.FAIL, "Home page is display");
		
		//step 6 ==call flush		
		exeReport.flush();
		
	}

}
