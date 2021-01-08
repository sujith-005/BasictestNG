package basictestNG;

import java.beans.ExceptionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;

import org.omg.CORBA.ExceptionList;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Samplexam {

	
	WebDriver driver;
@BeforeSuite
void driver(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujith surya\\workspace\\Automation\\driver\\chromedriver.exe");
	driver = new ChromeDriver();	
	driver.get("http://triotend.com/tts/site/login");
	
}
@Test	
void website(){
	WebElement USERNAME= driver.findElement(By.xpath("//*[@id='email']"));
	USERNAME.sendKeys("triotend@gmail.com");
	
	WebElement PASSWRD= driver.findElement(By.xpath("//*[@id='password']"));
	PASSWRD.sendKeys("triotend");
	
	WebElement LOGIN= driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/form/button"));
	LOGIN.click();
	
	WebElement PHARMACY= driver.findElement(By.xpath("//*[@id='sibe-box']/ul[2]/li[4]/a/span"));
	PHARMACY.click();
	
	WebElement bill= driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/div/div/div[1]/div/a[1]"));
	bill.click();
	
	WebElement billno = driver.findElement(By.id("billno"));
	billno.sendKeys("5");
	
	WebElement PatientType = driver.findElement(By.xpath("//*[@id='customer_type']"));
	PatientType.sendKeys("OPD");
	
	
}
	

}
