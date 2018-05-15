package samples;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Reset {
	AndroidDriver<WebElement> driver;
	@BeforeTest
	public void pixel_addContact() throws WebDriverException, IOException, InterruptedException{
		
		File targetApp = new File("C:\\Users\\gopek\\Downloads\\base.apk");
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("deviceName", "FA68B0303679");
		capability.setCapability("platformName", "Android");
		capability.setCapability("app", targetApp.getAbsolutePath());
//		capabilities.setCapability("fastReset", "true");
		capability.setCapability("fullReset", "true");
//		capabilities.setCapability("noReset", "true");
		capability.setCapability("appPackage", "com.imaginea.fontli");
		capability.setCapability("appActivity", "com.imaginea.fontli.screens.HolderActivity");
		
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test(priority = 1)
	public void login() throws InterruptedException
	{
//		driver.findElementById("com.imaginea.fontli:id/btn_skip").click();
		driver.findElementByXPath("//android.widget.Button[contains(@resource-id,'com.imaginea.fontli:id/btn_skip')]").click();
//		driver.findElementByXPath("//android.widget.Button[@text = 'SKIP']").click();
		driver.findElementByXPath("//android.widget.TextView[@text = 'Connect with Mail']").click();
		driver.findElementById("com.imaginea.fontli:id/login_check_box").click();
		driver.findElementById("com.imaginea.fontli:id/username_editText").sendKeys("gopekanna@gmail.com");
		driver.findElementById("com.imaginea.fontli:id/password_editText").sendKeys("maruthi");
		driver.findElementById("com.imaginea.fontli:id/email_sign_in_button").click();
		
		Thread.sleep(10000);
		TouchAction finger = new TouchAction(driver);
		finger.tap(166,1088).perform();
		Thread.sleep(10000);
		driver.pressKeyCode(4);
		Thread.sleep(15000);
		
	}
	
	@Test(priority = 2)
	public void homeScreen() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElementByXPath("//android.widget.ImageView[@content-desc='More options']").click();
		Thread.sleep(10000);
	}
	
	@AfterTest
	public void logout()
	{
		driver.quit();
	}

}
