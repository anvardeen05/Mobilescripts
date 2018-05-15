package samples;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CallApp {
	@Test
	public void moto_dialNumber() throws WebDriverException, IOException, InterruptedException{
		AndroidDriver<AndroidElement> driver = null;
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("deviceName", "ZY223G7T3B");
		capability.setCapability("platformName", "Android");
		capability.setCapability("appPackage", "com.android.dialer");
		capability.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
		
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElementById("com.google.android.contacts:id/floating_action_button").click();
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc='dial pad']").click();
		//driver.findElementById("com.google.android.dialer:id/digits").sendKeys("8508638651");
		driver.findElementByXPath("//android.widget.TextView[@text='8']").click();
		//driver.findElement(By.xpath("//android.widget.FrameLayout[contains(@resource-id,'com.android.dialer:id/eight') and @index='11']")).click();
		/*
		driver.findElementByXPath("//android.widget.EditText[@text = 'First name']").sendKeys("Anvar");
		driver.findElementByXPath("//android.widget.EditText[@text = 'Last name']").sendKeys("K A");
		driver.findElementByXPath("//android.widget.Button[@text = 'SAVE']").click();
		/*
		driver.findElementById("com.google.android.apps.messaging:id/contact_picker_create_group").click();
		driver.findElementById("com.google.android.apps.messaging:id/compose_message_text").sendKeys("Hai");
		driver.findElementById("com.google.android.apps.messaging:id/send_message_button_icon").click();
		//driver.pressKeyCode(36);
		//driver.pressKeyCode(29);
		//driver.pressKeyCode(37);
//		driver.findElementById("com.google.android.apps.messaging:id/send_message_button_icon").click();
		//FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE) , new File("E:\\Tools\\References\\Appium\\appium log"+"Orientation"+".jpg"));
		 **/		 
		Thread.sleep(5000);
		driver.quit();		
	}	
	@Test
	public void pixel_dialNumber() throws WebDriverException, IOException, InterruptedException{
		AndroidDriver<AndroidElement> driver = null;
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("deviceName", "FA68B0303679");
		capability.setCapability("platformName", "Android");
		capability.setCapability("appPackage", "com.android.dialer");
		capability.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
		
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElementById("com.google.android.contacts:id/floating_action_button").click();
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc='key pad']").click();
		//driver.findElementById("com.google.android.dialer:id/digits").sendKeys("8508638651");
		driver.findElementByXPath("//android.widget.TextView[@text='8']").click();
		//driver.findElement(By.xpath("//android.widget.FrameLayout[contains(@resource-id,'com.android.dialer:id/eight') and @index='11']")).click();
		/*
		driver.findElementByXPath("//android.widget.EditText[@text = 'First name']").sendKeys("Anvar");
		driver.findElementByXPath("//android.widget.EditText[@text = 'Last name']").sendKeys("K A");
		driver.findElementByXPath("//android.widget.Button[@text = 'SAVE']").click();
		/*
		driver.findElementById("com.google.android.apps.messaging:id/contact_picker_create_group").click();
		driver.findElementById("com.google.android.apps.messaging:id/compose_message_text").sendKeys("Hai");
		driver.findElementById("com.google.android.apps.messaging:id/send_message_button_icon").click();
		//driver.pressKeyCode(36);
		//driver.pressKeyCode(29);
		//driver.pressKeyCode(37);
//		driver.findElementById("com.google.android.apps.messaging:id/send_message_button_icon").click();
		//FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE) , new File("E:\\Tools\\References\\Appium\\appium log"+"Orientation"+".jpg"));
		 **/		 
		Thread.sleep(5000);
		driver.quit();		
	}	

}
