package samples;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LeafOrg {
	AndroidDriver<AndroidElement> driver;
	@BeforeMethod
	public void setUP() throws MalformedURLException{
		
	File targetApp = new File("C:\\Users\\Anvar1022\\Downloads\\LeafOrg.apk");
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("deviceName", "da7e6aee0504");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("fastReset", "True");
	capabilities.setCapability("app", targetApp.getAbsolutePath());
	capabilities.setCapability("appPackage", "com.testleaf.leaforg");
	capabilities.setCapability("appActivity", "com.testleaf.leaforg.MainActivity");

	driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	
	@Test(priority = 1)
	public void touchActPress() throws InterruptedException
	{
	Set<String> contextNames = driver.getContextHandles();
	
	for(String contextName : contextNames)
	{
		if(contextName.contains("WEBVIEW"))
			driver.context(contextName);			
		System.out.println(contextName);
	}
	
	WebDriverWait wait= new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Create an Account')]")));
	driver.findElementByXPath("(//input[@formcontrolname='email'])").sendKeys("test");
	}	
}
