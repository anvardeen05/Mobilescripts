package samples;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class Base2 {

	AndroidDriver<WebElement> driver;
	//String username = "sakthivel@testleaf.com"; // rajkumar@testleaf.com
	//String password = "Leaf@123";
	//String phone = "9840098400";

	@BeforeTest
	public void setup() throws MalformedURLException {
		File targetApp = new File("C:\\Users\\Anvar1022\\Downloads\\zoopon\\zoopon.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "LG_Nexus_5X_free");
		// capability.setCapability("udid", "Samsung_Galaxy_S6_sjc_free");
		capabilities.setCapability("testobjectApiKey", "4AC37AA869C14629B5930AAFD1990103");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "8.0");
		capabilities.setCapability("phoneOnly", "true");
		capabilities.setCapability("tabletOnly ", "false");
		capabilities.setCapability("privateDevicesOnly", "false");
		capabilities.setCapability("app", targetApp.getAbsolutePath());
		// capabilities.setCapability("appiumVersion", "1.7.1");
		capabilities.setCapability("appPackage", "com.smacar.zooponandroid");
		capabilities.setCapability("appActivity", "com.smacar.zooponandroid.activities.SplashScreen_Activity");

		driver = new AndroidDriver<WebElement>(new URL("http://us1.appium.testobject.com/wd/hub"), capabilities);
		// driver = new AndroidDriver<WebElement>(new
		// URL("http://0.0.0.0:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void Login() throws InterruptedException {
		/* Create New Zoopon User MotoZplay run **/

		// Tap User button
		driver.findElementById("com.smacar.zooponandroid:id/user_register_button").click();
		Thread.sleep(2000);
		// Enter First Name
		driver.findElementById("com.smacar.zooponandroid:id/user_fname").sendKeys("Anvar");
		driver.pressKeyCode(66);
		Thread.sleep(1000);
		// Enter First Name
		driver.findElementById("com.smacar.zooponandroid:id/user_lname").sendKeys("KA");
		driver.pressKeyCode(66);
		Thread.sleep(1000);
		// Enter Mobile
		driver.findElementById("com.smacar.zooponandroid:id/mobile").sendKeys("4508638555");
		driver.pressKeyCode(66);
		Thread.sleep(1000);
		// Pick State
		driver.findElementById("com.smacar.zooponandroid:id/business_cate").click();
		Thread.sleep(2000);
		driver.pressKeyCode(61);
		driver.pressKeyCode(61);
		driver.pressKeyCode(66);
		driver.pressKeyCode(4);
		//driver.findElementByXPath("//android.widget.CheckedTextView[text()='Pennsylvania']").click();
		Thread.sleep(2000);
		//Enter Email ID
		driver.findElementById("com.smacar.zooponandroid:id/email").sendKeys("mototest5@gmail.com");
		driver.pressKeyCode(66);
		Thread.sleep(1000);
		//Enter Password
		driver.findElementById("com.smacar.zooponandroid:id/password").sendKeys("12345678");
		driver.pressKeyCode(66);
		Thread.sleep(500);
		//Enter Confirm Password
		driver.findElementById("com.smacar.zooponandroid:id/confirm_password").sendKeys("12345678");
		driver.pressKeyCode(66);
		//driver.pressKeyCode(61);
		Thread.sleep(1000);
		//Tap Create User Account button
		driver.findElementById("com.smacar.zooponandroid:id/create_useraccount_button").click();
		Thread.sleep(5000);
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
