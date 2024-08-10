package domo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class MavenParameterTest {
	public void receiveData() {
		String URL =System.getProperty("url");
		Reporter.log(URL,true);
		
		
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		
	}

}
