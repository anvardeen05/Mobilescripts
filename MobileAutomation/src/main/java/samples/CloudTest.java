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

public class CloudTest {

	AndroidDriver<WebElement> driver;
	public static final String USERNAME = "Anvar07";
	public static final String ACCESS_KEY = "128170ba-41f0-417d-a288-68333f6c3df8";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	@BeforeTest
	public void setup() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "Samsung Galaxy S4 Emulator");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("app", "http://saucelabs.com/example_files/ContactManager.apk");
		capabilities.setCapability("browserName", "");
		//capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("deviceOrientation", "landscape");
		capabilities.setCapability("appiumVersion", "1.7.2");

		driver = new AndroidDriver<>(new URL(URL), capabilities);

		}

	@Test
	public void Login() throws InterruptedException, IOException {
		{
			driver.findElementById("com.example.android.contactmanager:id/addContactButton").click();
			driver.findElementById("com.example.android.contactmanager:id/contactNameEditText").sendKeys("Boss");
			
			}
		}
	@AfterTest
	public void teardown() {
		driver.quit();
		
	}

}