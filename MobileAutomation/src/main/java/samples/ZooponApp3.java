package samples;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ZooponApp3 {
	@Test
	public void moto_loginUser() throws WebDriverException, IOException, InterruptedException {
		AndroidDriver<AndroidElement> driver = null;
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("deviceName", "ZY223G7T3B");
		//capability.setCapability("deviceName", "9DCY9DMVCES8RSEY");
		
		
		capability.setCapability("platformName", "Android");
		capability.setCapability("appPackage", "com.smacar.zooponandroid");
		capability.setCapability("appActivity", "com.smacar.zooponandroid.activities.SplashScreen_Activity");

		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//driver.findElementById("com.smacar.zooponandroid:id/email_ph_edittext").sendKeys("anvarka06@gmail.com");
		driver.findElementById("com.smacar.zooponandroid:id/email_ph_edittext").click();
		
		// Enter Phone number 88 38 04 96 72
		
		driver.pressKeyCode(15);
		driver.pressKeyCode(15);
		driver.pressKeyCode(10);
		driver.pressKeyCode(15);
		driver.pressKeyCode(7);
		driver.pressKeyCode(11);
		driver.pressKeyCode(16);
		driver.pressKeyCode(13);
		driver.pressKeyCode(14);
		
		
		
	}
}
