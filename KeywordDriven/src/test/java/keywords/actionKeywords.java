package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utilities.Excelutilities;
import Utilities.Locators;
import io.github.bonigarcia.wdm.WebDriverManager;


public class actionKeywords {
	static  WebDriver driver;
	
	
	public static void OpenBrowser() {
		
		if(Excelutilities.datavalue.equalsIgnoreCase("Chrome")) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		}
		else if(Excelutilities.datavalue.equalsIgnoreCase("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
	}

	public static void enterUsername() {
		WebElement UserID=driver.findElement(Locators.execeldrivenkeyword());
		UserID.sendKeys("INNARMAN");
		
	}
	
	public static void enterPassword() {
		WebElement Password=driver.findElement(Locators.execeldrivenkeyword());
		Password.sendKeys("Naren@123");
		
	}
	
	public static void goToURL() {
		driver.get("http://lmstest.pilship.com/");
		
	}
	
	public static void clickLogin() {
		  WebElement Login=driver.findElement(Locators.execeldrivenkeyword());
		  Login.click();
		
	}
	

}
