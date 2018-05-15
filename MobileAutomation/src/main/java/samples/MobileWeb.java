package samples;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class MobileWeb {
	RemoteWebDriver driver;
	@BeforeMethod
	public void setUP() throws MalformedURLException{
		
	DesiredCapabilities capabilities = new DesiredCapabilities();
	//capabilities.setCapability("deviceName", "9DCY9DMVCES8RSEY");
	//Lenovo vijay mobile
	capabilities.setCapability("deviceName", "HKL3G4M7");
	//sharbu moto e
	//capabilities.setCapability("deviceName", "HNB0SX7Y");
	//pixel
	//capabilities.setCapability("deviceName", "FA68B0303679");
	
	capabilities.setCapability("browserName", "chrome");
	capabilities.setCapability("platformName", "Android");
	//capabilities.setCapability("platformVersion", "7.1.1");
	//capabilities.setCapability("platformName", "Android");
	

	driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	driver.get("https://www.ford.com/");
	}
	@Test
	public void mobileWebView() 
	{
		//WebDriverWait wait=new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("")));
		//driver.findElement(By.className("hamburger-icon navbar-toggle")).click();
		driver.findElement(By.xpath("//a[@class='hamburger-icon navbar-toggle']")).click();
		driver.findElement(By.xpath("//span[text()='Vehicles']")).click();
		
	}
}
