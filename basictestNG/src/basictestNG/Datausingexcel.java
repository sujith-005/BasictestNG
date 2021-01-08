package basictestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

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


public class Datausingexcel {

	
	String [][] data =null;
	WebDriver driver ;
	
	@DataProvider(name="logindata")
	public String [] []  loginusingexcel() throws BiffException, IOException{
	
		data=getexceldata();
		return data;	
		
	//return getexceldata();
	}

	@Test
	public String [] [] getexceldata() throws BiffException, IOException {
		FileInputStream excel = new FileInputStream("F:\\excelread\\dataforeclips.xls");
		Workbook workbook= Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet(0);
		int rowcount = sheet.getRows();
		int coloumncount = sheet.getColumns();  

		String [] [] mydata = new String[rowcount-1][coloumncount];
		for (int i = 1; i < rowcount; i++) 
			for (int j = 0; j < coloumncount; j++) { 
				mydata [i-1][j]=sheet.getCell(j,i).getContents();
				}
		return mydata;
	}
	
	@BeforeSuite
	public void browser(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujith surya\\workspace\\Automation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("http://triotend.com/tts/site/login");
		
	}
	
	@Test(dataProvider="logindata")
	public void dataprovider(String uname, String psswrd){
		
		WebElement username = driver.findElement(By.xpath("//*[@id='email']"));
		username.sendKeys(uname);

		WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
		password.sendKeys(psswrd);

		WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/form/button"));
		login.click();

	}
@AfterSuite
void quit(){
	
	driver.quit();
	
}


}

