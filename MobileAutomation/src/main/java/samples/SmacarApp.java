package samples;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SmacarApp {
	AndroidDriver<AndroidElement> driver = null;

	@BeforeTest
	public void scan() throws MalformedURLException, InterruptedException {

		DesiredCapabilities capability = new DesiredCapabilities();
		// capability.setCapability("deviceName", "ZY223G7T3B");
		capability.setCapability("deviceName", "9DCY9DMVCES8RSEY");
		capability.setCapability("platformName", "Android");
		capability.setCapability("fastReset", "True");
		capability.setCapability("appPackage", "com.yakshamobileapps.smacar");
		capability.setCapability("appActivity", "com.unity3d.player.UnityPlayerActivity");

		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
		//Thread.sleep(500);
		driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
		//SThread.sleep(500);
		driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();

	}

	@Test
	public void startUP() throws InterruptedException {
		Thread.sleep(10000);

		// MultiTouchAction multiTouch = new MultiTouchAction(driver);

		// Skip Here
		// multiTouch.add(new
		// TouchAction<>(driver).press(point(662,2075)).waitAction(waitOptions(Duration.ofMillis(2000))).release()).perform();

		// Tap Sign In button
		// multiTouch.add(new
		// TouchAction<>(driver).press(point(399,1942)).waitAction(waitOptions(Duration.ofMillis(2000))).release()).perform();
		// Thread.sleep(2000);

		TouchAction n = new TouchAction(driver);
		// n.press(399,1942);
		n.press(point(399, 1942)).waitAction(waitOptions(Duration.ofMillis(2000))).release().perform();
		n.press(point(181, 910)).waitAction(waitOptions(Duration.ofMillis(2000))).release().perform();
		//Enter Email ID
		driver.findElementByClassName("android.widget.EditText").sendKeys("anvar.deen@smacarsolutions.com");
		Thread.sleep(1000);
		driver.pressKeyCode(66);
		Thread.sleep(1000);
		n.press(point(226, 1043)).waitAction(waitOptions(Duration.ofMillis(2000))).release().perform();
		//Enter Password
		driver.findElementByClassName("android.widget.EditText").sendKeys("Anvardeen@123");
		Thread.sleep(500);
		driver.findElementByClassName("android.widget.Button").click();
		Thread.sleep(1000);
		// Tap Sign In button
		n.press(point(532, 1264)).waitAction(waitOptions(Duration.ofMillis(2000))).release().perform();
		Thread.sleep(2000);
		// Tap Let's Go button
		n.longPress(point(474, 2002)).waitAction(waitOptions(Duration.ofMillis(2000))).release().perform();
		Thread.sleep(10000);

		// Tap SCAN button
		//n.longPress(point(546, 1899)).waitAction(waitOptions(Duration.ofMillis(2000))).release().perform();
		//Thread.sleep(15000);
		//Tap Widget
		n.longPress(point(542, 924)).waitAction(waitOptions(Duration.ofMillis(2000))).release().perform();
		n.longPress(point(542, 824)).waitAction(waitOptions(Duration.ofMillis(2000))).release().perform();
		n.longPress(point(542, 1024)).waitAction(waitOptions(Duration.ofMillis(2000))).release().perform();
		n.longPress(point(542, 724)).waitAction(waitOptions(Duration.ofMillis(2000))).release().perform();
		Thread.sleep(15000);
		
		//Tap Back button
		//driver.pressKeyCode(4);
		//n.longPress(point(542, 924)).waitAction(waitOptions(Duration.ofMillis(2000))).release().perform();
		Thread.sleep(2000);
		// Navi expand
		n.longPress(point(49, 61)).waitAction(waitOptions(Duration.ofMillis(2000))).release().perform();
		Thread.sleep(5000);
		// Navi close
		n.longPress(point(946, 55)).waitAction(waitOptions(Duration.ofMillis(2000))).release().perform();
		Thread.sleep(4000);
		// Tap Settings icon button
		n.longPress(point(258, 2015)).waitAction(waitOptions(Duration.ofMillis(2000))).release().perform();
		Thread.sleep(3000);
		// Tap Logout button
		n.press(point(247, 1312)).waitAction(waitOptions(Duration.ofMillis(2000))).release().perform();
		Thread.sleep(5000);
		// driver.pressKeyCode(66);
		
	}
}
