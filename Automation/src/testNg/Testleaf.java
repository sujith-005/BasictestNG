package testNg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testleaf {

	WebDriver driver ;
	long start;
	long end;

	@BeforeSuite
	void browser(){
		start =System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sujith surya\\workspace\\Automation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}


	@Test(priority=0)
	void opentestleaf(){

		driver.get("http://www.leafground.com/");
	}

	@Test(priority=1)
	void openbutton(){

		WebElement button  =  driver.findElement(
				By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a/img"));
		button.click();
	}
	@Test(priority=2)
	void defaulttextentered(){

		WebElement defaulttext = driver.findElement
				(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input"));
		defaulttext.isDisplayed();
	}	
	@AfterSuite
	void finish(){
		driver.close();
		end =System.currentTimeMillis();
		long totaltime = start-end;
		System.out.println("the total time taken:"+totaltime);
	}

}


