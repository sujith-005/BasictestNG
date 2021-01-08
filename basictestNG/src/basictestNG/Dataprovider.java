package basictestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	String [][] data = {
			{"triotend@gmail.com","triotendd"},
			{"triotend@gmail.co","triotend"},
			{"triotend@","trio"},
			{"triotend@gmail.com","triotend"}  

	};


	@DataProvider(name="logindata")
	String [] []  dataforlogin(){
		return data;
	}

	@Test(dataProvider= "logindata" )
	public void dataprovider(String uname, String psswrd){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujith surya\\workspace\\Automation\\driver\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();	
		driver.get("http://triotend.com/tts/site/login");
		WebElement username = driver.findElement(By.xpath("//*[@id='email']"));
		username.sendKeys(uname);

		WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
		password.sendKeys(psswrd);

		WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/form/button"));
		login.click();
	}

}
