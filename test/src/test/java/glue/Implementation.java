package glue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;

public class Implementation {
	@And("^test$")
	public void test() throws Throwable{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
	}
}
