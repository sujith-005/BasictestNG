package pageOBJECTS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class frontofficePOM {

	@FindBy(xpath="//*[@id='sibe-box']/ul[2]/li[1]/a/span")
	public static WebElement frontoffice;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/section/div/div/div/div[1]/div/a[1]")
	public static WebElement addapointment;
	
	@FindBy(xpath="//*[@id='date']")
	public static WebElement date;
	
	@FindBy(xpath="//*[@id='patient_id']")
	public static WebElement patientid;
	
	@FindBy(xpath="//*[@id='patient_name']")
	public static WebElement patientname;
	
	@FindBy(xpath="//*[@id='gender']")
	public static WebElement Gender;
	
	@FindBy(xpath="//*[@id='email']")
	public static WebElement email;
	
	@FindBy(xpath="//*[@id='phone']")
	public static WebElement phone;
	
	@FindBy(xpath="//*[@id='select2-doctor-ag-container']")
	public static WebElement doctor;
	
	@FindBy(xpath="//*[@id='formadd']/div/div[8]/div/textarea")
	public static WebElement message;
	
	@FindBy(xpath="//*[@id='formadd']/div/div[9]/div/select")
	public static WebElement status;
	
}
