package basictestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Datadrivenparameter {

	@Test
	@Parameters({"username","password"})
	public void loginpage(String uname, String pwrd){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujith surya\\workspace\\Automation\\driver\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();	

		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.xpath("//*[@id='email']"));
		username.sendKeys(uname);
		WebElement password = driver.findElement(By.xpath("//*[@id='pass']"));
		password.sendKeys(pwrd);

		WebElement login  = driver.findElement(By.xpath("//*[@id='u_0_b']"));
		login.click();
		
	
		}



}
