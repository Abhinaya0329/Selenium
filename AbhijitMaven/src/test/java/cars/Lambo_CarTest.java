package cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lambo_CarTest {
	public  WebDriver driver;
	@Parameters("browserName")
@Test(groups = "System")
	public  void isTest(String browserName) {
	if(browserName.equals("chrome")) {
		 driver = new ChromeDriver();
	}else if(browserName.equals("edge"))
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.lamborghini.com/en-en");
		Reporter.log("MY lambo car is lounch",true);
	}
}
