package samples;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ZooponApp {
	@Test
	public void moto_loginUser() throws WebDriverException, IOException, InterruptedException {
		AndroidDriver<AndroidElement> driver = null;
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("deviceName", "ZY223G7T3B");
		//capability.setCapability("deviceName", "9DCY9DMVCES8RSEY");
		
		
		capability.setCapability("platformName", "Android");
		capability.setCapability("fastReset", "True");
		capability.setCapability("appPackage", "com.smacar.zooponandroid");
		capability.setCapability("appActivity", "com.smacar.zooponandroid.activities.SplashScreen_Activity");

		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Enter Email ID
		//driver.findElementById("com.smacar.zooponandroid:id/email_ph_edittext").sendKeys("anvarka06@gmail.com");
		driver.findElementById("com.smacar.zooponandroid:id/email_ph_edittext").sendKeys("8838049672");
		driver.pressKeyCode(61);
		//Enter Password
		driver.findElementById("com.smacar.zooponandroid:id/password_edittext").sendKeys("12345678");
		/*
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
*/
		// Click Login button
		driver.findElementById("com.smacar.zooponandroid:id/login_button").click();
		Thread.sleep(2000);
		driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
		Thread.sleep(8000);
		
		//To verify settings screen and it features
		
		driver.findElementById("com.smacar.zooponandroid:id/sett").click();
		Thread.sleep(2000);
		//To verify Edit Profile
		driver.findElementById("com.smacar.zooponandroid:id/edit_profile").click();
		Thread.sleep(2000);		
		//Tap Profile Update button
		driver.findElementById("com.smacar.zooponandroid:id/update_useraccount_button").click();
		Thread.sleep(2000);
		
		//To verify Change Password
		driver.findElementById("com.smacar.zooponandroid:id/change_password").click();
		Thread.sleep(2000);
		//Enter Current password
		driver.findElementById("com.smacar.zooponandroid:id/current_password").sendKeys("12345678");
		Thread.sleep(2000);		
		//Enter New Password
		driver.findElementById("com.smacar.zooponandroid:id/new_password").sendKeys("12345678");
		Thread.sleep(2000);
		//Confirm Password
		driver.findElementById("com.smacar.zooponandroid:id/confirm_password").sendKeys("12345678");
		Thread.sleep(2000);
		//Press Enter Key
		driver.pressKeyCode(66);
		//Tap Password Update button
		driver.findElementById("com.smacar.zooponandroid:id/update_useraccount_button").click();
		Thread.sleep(2000);
		
		//To verify Terms & Conditions	
		driver.findElementById("com.smacar.zooponandroid:id/terms_condition").click();
		Thread.sleep(2000);		
		driver.findElementByXPath("//android.widget.ImageButton[contains(@content-desc,'Navigate up')]").click();
		Thread.sleep(1000);
		//Click Logout button
		driver.findElementById("com.smacar.zooponandroid:id/logout").click();
		//Click Cancel button
		driver.findElementById("com.smacar.zooponandroid:id/dialogButtonCancel").click();
		//Click Logout button
		driver.findElementById("com.smacar.zooponandroid:id/logout").click();
		//Click OK button
		driver.findElementById("com.smacar.zooponandroid:id/dialogButtonOK").click();
		
		//driver.pressKeyCode(66);
		Thread.sleep(1000);
		driver.quit();
	}
}
