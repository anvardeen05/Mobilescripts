package samples;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class AppiumTest {
	
	AndroidDriver<WebElement> driver;
	String password = "Leaf@123";
	String phone = "9840098400";
	
//	ExtentReports report;
//	ExtentTest logger;
	
	@BeforeTest
	public void setup() throws MalformedURLException
	{
		
		DesiredCapabilities capability = new DesiredCapabilities();
		//capability.setCapability("deviceName", "FA68B0303679");
		capability.setCapability("deviceName", "9DCY9DMVCES8RSEY");
		//capability.setCapability("deviceName", "ZY223G7T3B");
		capability.setCapability("platformName", "Android");
		capability.setCapability("appPackage", "com.testleaf.leaforg");
		capability.setCapability("appActivity", "com.testleaf.leaforg.MainActivity");
		
		//To run in Amazon web farm
		//driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		report = new ExtentReports("./reports/result.html", true);
//		report.loadConfig(new File("./extent-config.xml"));
//		logger = report.startTest("AppiumTest");
	}
	
	@Test(priority = 1)
	public void Login() throws InterruptedException, IOException  
	{				
//		String username = DataDrive.readXLFile();
//		System.out.println(username);
		
		Thread.sleep(5000);
		Set<String> contextNames = driver.getContextHandles();
		
		for(String contextName : contextNames)
		{
			if(contextName.contains("WEBVIEW"))
				driver.context(contextName);
		}
		
		Thread.sleep(5000);
		WebDriverWait wait= new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Create an Account')]")));
		driver.findElementByXPath("(//input[@formcontrolname='email'])").sendKeys("sakthivel@testleaf.com");
		driver.findElementByXPath("(//input[@formcontrolname='password'])").sendKeys(password);
		driver.findElementByXPath("//span[contains(text(), 'Login')]").click();
		Thread.sleep(10000);
//		logger.log(LogStatus.PASS, "Login Test case is Pass");

	}
	
//	@Test(priority = 1)
//	public void Login() throws InterruptedException, IOException  
//	{	
//		String username = DataDrive.readXLFile();
//		driver.findElementById("com.imaginea.fontli:id/btn_skip").click();
//		driver.findElementByXPath("//android.widget.TextView[@text = 'Connect with Mail']").click();
//		driver.findElementById("com.imaginea.fontli:id/login_check_box").click();
//		driver.findElementById("com.imaginea.fontli:id/username_editText").sendKeys(username);
//		driver.findElementById("com.imaginea.fontli:id/password_editText").sendKeys("maruthi");
//		driver.findElementById("com.imaginea.fontli:id/email_sign_in_button").click();
//		Thread.sleep(5000);
//	}
	
//	@Test(priority = 2)
//	public void AddProfile() throws InterruptedException  
//	{
//		Thread.sleep(5000);
//		WebDriverWait wait= new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Create an Account')]")));
//		driver.findElementByXPath("(//input[@formcontrolname='email'])").sendKeys(username);
//		driver.findElementByXPath("(//input[@formcontrolname='password'])").sendKeys(password);
//		driver.findElementByXPath("//span[contains(text(), 'Login')]").click();
//		Thread.sleep(5000);
//	}
	
//	@AfterMethod
//	public void getResult(ITestResult result)
//	{
//		if(result.getStatus() == ITestResult.FAILURE)
//		{
//			logger.log(LogStatus.FAIL, "Test case is failed:"+result.getName());
//			logger.log(LogStatus.FAIL, "Test case is failed:"+result.getThrowable());
//		}
//
//	}
//	
		
	@AfterTest
	public void teardown()
	{
		driver.quit();
//		report.flush();
//		report.endTest(logger);
		
	}


}