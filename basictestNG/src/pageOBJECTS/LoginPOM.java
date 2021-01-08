package pageOBJECTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPOM {

@FindBy(xpath="//*[@id='email']")	
public static WebElement username;

@FindBy(xpath="//*[@id='password']")
public static WebElement password;

@FindBy(xpath="/html/body/div[1]/div/div/div/div/div/div[2]/form/button")
public static WebElement siginbutton;
	

}

	

	

	
//public static WebElement editbutton(WebDriver driver){
//return driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a/img"));
//}

//public static WebElement  emailaddress(WebDriver driver){
//	return driver.findElement(By.xpath("//*[@id='email']"));
//}

//public static WebElement  appendtext(WebDriver driver){
//	return driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
//}

//public static WebElement  defaulttext(WebDriver driver){
//	return driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input"));
//}

//public static WebElement  cleartext(WebDriver driver){
	//return driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
//}

//public static WebElement  confirmdisable(WebDriver driver){
	//return driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
//}



