package basictestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageOBJECTS.LoginPOM;
import pageOBJECTS.frontofficePOM;

public class Medicalinformation {

	WebDriver driver;

	
	@Test
	public void browse () {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujith surya\\workspace\\basictestNG\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://triotend.com/tts/site/login");
		
PageFactory.initElements(driver, LoginPOM.class);

LoginPOM.username.sendKeys("triotend@gmail.com");
LoginPOM.password.sendKeys("triotend");
LoginPOM.siginbutton.click();

PageFactory.initElements(driver,frontofficePOM.class);

frontofficePOM.frontoffice.click();
frontofficePOM.addapointment.click();
frontofficePOM.patientid.sendKeys("12345");
frontofficePOM.patientname.sendKeys("sujithkrishna S");
frontofficePOM.Gender.sendKeys("Male");
frontofficePOM.email.sendKeys("sujithkrishna05@gmail.com");
frontofficePOM.phone.sendKeys("8667830270");
frontofficePOM.doctor.sendKeys("Sivakumar");
frontofficePOM.message.sendKeys("iam tester");
frontofficePOM.status.sendKeys("Approved");



driver.quit();

	}


	
	


	//WebElement USERNAME= driver.findElement(By.xpath("//*[@id='email']"));
	//USERNAME.sendKeys("triotend@gmail.com");

	//	WebElement PASSWRD= driver.findElement(By.xpath("//*[@id='password']"));
	//PASSWRD.sendKeys("triotend");

	//WebElement LOGIN= driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/form/button"));
	//	LOGIN.click();

	//WebElement button = driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a/img"));
	//	button.click();


	//WebElement emailaddress = driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a/img"));
	//emailaddress.sendKeys("sujith");



	//WebElement PHARMACY= driver.findElement(By.xpath("//*[@id='sibe-box']/ul[2]/li[4]/a/span"));
	//PHARMACY.click();

	//WebElement bill= driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/div/div/div[1]/div/a[1]"));
	//	bill.click();

	//WebElement billno = driver.findElement(By.id("billno"));
	//billno.sendKeys("5");

	//	WebElement PatientType = driver.findElement(By.xpath("//*[@id='customer_type']"));
	//PatientType.sendKeys("OPD");	


}
