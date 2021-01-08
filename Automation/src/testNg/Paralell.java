package testNg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Paralell {

	
	@Test
	void google(){
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sujith surya\\workspace\\Automation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com.in/");
	}
	@Test
	void amazon(){
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sujith surya\\workspace\\Automation\\driver\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.get("http://www.amazon.in/");
	}
	
}
