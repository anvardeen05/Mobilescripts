package samples;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ZooponAppQA {
	@Test
	public void moto_loginUser() throws WebDriverException, IOException, InterruptedException {
		AndroidDriver<AndroidElement> driver = null;
		DesiredCapabilities capability = new DesiredCapabilities();
		//capability.setCapability("deviceName", "ZY223G7T3B");
		//capability.setCapability("deviceName", "9DCY9DMVCES8RSEY");
		capability.setCapability("deviceName", "FA68B0303679");		
		capability.setCapability("platformName", "Android");
		capability.setCapability("fastReset", "True");
		capability.setCapability("appPackage", "com.smacar.zooponandroid");
		capability.setCapability("appActivity", "com.smacar.zooponandroid.activities.SplashScreen_Activity");

		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Enter Email ID/Phone number
		//driver.findElementById("com.smacar.zooponandroid:id/email_ph_edittext").sendKeys("anvarka06@gmail.com");
		//driver.findElementById("com.smacar.zooponandroid:id/email_ph_edittext").sendKeys("8838049672");
		//driver.pressKeyCode(61);
		//Enter Password
		//driver.findElementById("com.smacar.zooponandroid:id/password_edittext").sendKeys("12345678");
		
		// Enter Phone number 88 38 04 96 72
		Thread.sleep(4000);
		driver.pressKeyCode(15);
		Thread.sleep(5000);
		driver.pressKeyCode(15);
		Thread.sleep(5000);
		driver.pressKeyCode(10);
		Thread.sleep(5000);
		driver.pressKeyCode(15);
		Thread.sleep(5000);
		driver.pressKeyCode(7);
		Thread.sleep(5000);
		driver.pressKeyCode(11);
		Thread.sleep(5000);
		driver.pressKeyCode(16);
		Thread.sleep(5000);
		driver.pressKeyCode(13);
		Thread.sleep(5000);
		driver.pressKeyCode(14);
		Thread.sleep(5000);
		driver.pressKeyCode(9);
		Thread.sleep(5000);
		driver.pressKeyCode(66);
		
		// Enter Password: 12345678
		Thread.sleep(500);
		driver.pressKeyCode(8);
		Thread.sleep(500);
		driver.pressKeyCode(9);
		Thread.sleep(500);
		driver.pressKeyCode(10);
		Thread.sleep(500);
		driver.pressKeyCode(11);
		Thread.sleep(500);
		driver.pressKeyCode(12);
		Thread.sleep(500);
		driver.pressKeyCode(13);
		Thread.sleep(500);
		driver.pressKeyCode(14);
		Thread.sleep(500);
		driver.pressKeyCode(15);
		Thread.sleep(500);
		driver.pressKeyCode(66);

		// Click Login button
		driver.findElementById("com.smacar.zooponandroid:id/login_button").click();
		Thread.sleep(2000);
		driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
		Thread.sleep(8000);
		//Tap Saved Coupon
		driver.findElementById("com.smacar.zooponandroid:id/saved_button").click();
		Thread.sleep(4000);
		//Tap Surprise box
		driver.findElementById("com.smacar.zooponandroid:id/surprise_button").click();
		Thread.sleep(4000);
		//Tap Favorites
		driver.findElementById("com.smacar.zooponandroid:id/favorite_button").click();
		Thread.sleep(4000);
		//Tap Settings
		driver.findElementById("com.smacar.zooponandroid:id/setting_button").click();
		Thread.sleep(4000);
		
		
		/*
		//navi open
		driver.findElementByXPath("//android.widget.ImageButton[contains(@content-desc,'Navigation View Closed')]").click();
		Thread.sleep(2000);
				
		driver.findElementById("com.smacar.zooponandroid:id/design_navigation_view").click();
		
		//driver.findElementByXPath("//android.widget.CheckedTextView[contains(text(),'Favorite Spots')]").click();
		//Thread.sleep(2000);
		//driver.findElementById("com.smacar.zooponandroid:id/action_bar").click();
		
		WebElement back=driver.findElement(By.xpath("//android.widget.ImageButton[contains(@content-desc,'Navigate up')]"));
		TouchActions action = new TouchActions(driver);
		action.singleTap(back);
		action.perform();
		*/
		
		
		
		
		
		
		//Tap Back icon from favorites
		//driver.findElementByClassName("android.widget.ImageButton").click();
		//Thread.sleep(2000);
		/*//Navi open
		driver.findElementByXPath("//android.widget.ImageButton[contains(@content-desc,'Navigation View Closed')]").click();
		Thread.sleep(2000);
		//Tap Coupon
		driver.findElementByXPath("//android.widget.CheckedTextView[contains(@content-desc,'Coupons')]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.ImageButton[contains(@content-desc,'Navigate up')]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.ImageButton[contains(@content-desc,'Navigation View Closed')]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.CheckedTextView[contains(@content-desc,'Surprise Box')]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.ImageButton[contains(@content-desc,'Navigate up')]").click();
		
		Thread.sleep(2000);
		driver.findElementByXPath("//android.view.View[contains(@index,'224')]").click();
		Thread.sleep(2000);
		*/
		//Click Logout button
		driver.findElementById("com.smacar.zooponandroid:id/logout").click();
		driver.findElementById("com.smacar.zooponandroid:id/dialogButtonOK").click();
		
		//driver.pressKeyCode(66);
		Thread.sleep(1000);
		driver.quit();
	}
}
