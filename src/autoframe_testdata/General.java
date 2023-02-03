package autoframe_testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import autoUtility.Log;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;


public class General extends Global{
	
	
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get(url);
		System.out.println("open the application succefully");
		Log.info("open the application succesfully");
	}
	public void loginApplication() {
		driver.findElement(By.name(unm)).sendKeys(usename);
		
		driver.findElement(By.name(pwd)).sendKeys(password);
		driver.findElement(By.name(logbtn)).click();
		System.out.println("login completed");
	}
	public void logoutApplication()throws Exception {
		driver.findElement(By.linkText(logoutbtn)).click();
		Thread.sleep(3000);
		System.out.println("logout completed");
	}
	public void closeApplication() {
		driver.quit();
		System.out.println("close application");
		Log.info("close application");
	}
	public void amazonopen() throws Exception{
		driver.navigate().to(amurl);
		Thread.sleep(3000);
		System.out.println("amazon application opened");
		Log.info("amazon apllication opened");
	}
	public void flipkartOpen() {
	System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Drivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	driver =new  FirefoxDriver();
	driver.navigate().to(flipuse);
	Log.info("flipkart appliction opened");
	}
	public void CaptureScrren() throws IOException {
		try {
			driver.findElement(By.name(usename)).sendKeys("nareshit");
			driver.findElement(By.name(password)).sendKeys("nareshit");
			driver.findElement(By.name(usename)).click();
			
		}catch(Exception e) {
			File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1,new File("E:\\surya\\screen\\g1.png"));
		}
		Log.info("succesfully takes screen shots");
	}
	public void Dragrop() {
	
		assertEquals(driver.getTitle(),"Droppable | jQuery UI");
		System.out.println("title matched");
		Actions act=new Actions(driver);
		act.dragAndDrop(driver.findElement(By.id(drag)), driver.findElement(By.id(dro)));
		act.perform();
		
		System.out.println("succesfully completered drag and dropes activity");
		Log.info("sucessfully completed drag and dropes activites");
		
	}
	public void Enterfram() {
		driver.switchTo().frame(0);
		System.out.println("succesfully entrer the frame");
		Log.info("succesfully entered the frames");
	} 
	public void ExitFrame() {
		driver.switchTo().defaultContent();
		System.out.println(" succesfully exit frame");
		Log.info("succesfully exit the frame");
	}
	public void droagOpen() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get(url2);
		 System.out.println("open drag and drop url");
		 Log.info("open drag and drop url");
		
	}
	
		
		
	}
	
	

