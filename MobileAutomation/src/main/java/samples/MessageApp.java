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

public class MessageApp {
	@Test(enabled=true)
	public void pixel_sendSMS() throws WebDriverException, IOException, InterruptedException{
		AndroidDriver<AndroidElement> driver = null;
		DesiredCapabilities capability = new DesiredCapabilities();
		//capability.setCapability("deviceName", "FA68B0303679");
		capability.setCapability("deviceName", "9DCY9DMVCES8RSEY");
		capability.setCapability("platformName", "Android");
		capability.setCapability("appPackage", "com.google.android.apps.messaging");
		capability.setCapability("appActivity", "com.google.android.apps.messaging.ui.ConversationListActivity");
		
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("com.google.android.apps.messaging:id/start_new_conversation_button").click();
		driver.findElementById("com.google.android.apps.messaging:id/recipient_text_view").sendKeys("9789534863");
		driver.findElementById("com.google.android.apps.messaging:id/contact_picker_create_group").click();
		driver.findElementById("com.google.android.apps.messaging:id/compose_message_text").sendKeys("Hai");
		driver.findElementById("com.google.android.apps.messaging:id/send_message_button_icon").click();
		//driver.pressKeyCode(36);
		//driver.pressKeyCode(29);
		//driver.pressKeyCode(37);
//		driver.findElementById("com.google.android.apps.messaging:id/send_message_button_icon").click();
		//FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE) , new File("E:\\Tools\\References\\Appium\\appium log"+"Orientation"+".jpg"));
		Thread.sleep(5000);
		driver.quit();
		
	}
	
	@Test(enabled=false)
	public void motoZ_sendSMS() throws WebDriverException, IOException, InterruptedException{
		AndroidDriver<AndroidElement> driver = null;
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("deviceName", "ZY223G7T3B");
		capability.setCapability("platformName", "Android");
		capability.setCapability("appPackage", "com.google.android.apps.messaging");
		capability.setCapability("appActivity", "com.google.android.apps.messaging.ui.ConversationListActivity");
		
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("com.google.android.apps.messaging:id/start_new_conversation_button").click();
		driver.findElementById("com.google.android.apps.messaging:id/recipient_text_view").sendKeys("8508638651");
		driver.findElementById("com.google.android.apps.messaging:id/contact_picker_create_group").click();
		driver.findElementById("com.google.android.apps.messaging:id/compose_message_text").sendKeys("Hai");
		driver.findElementById("com.google.android.apps.messaging:id/send_message_button_icon").click();
		//driver.pressKeyCode(36);
		//driver.pressKeyCode(29);
		//driver.pressKeyCode(37);
//		driver.findElementById("com.google.android.apps.messaging:id/send_message_button_icon").click();
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE) , new File("E:\\Tools\\References\\Appium\\appium log"+"Orientation"+".jpg"));
		Thread.sleep(5000);
		driver.quit();
		
	}
	@Test(enabled=false)
	public void oppo_sendSMS() throws WebDriverException, IOException, InterruptedException{
		AndroidDriver<AndroidElement> driver = null;
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("deviceName", "9DCY9DMVCES8RSEY");
		capability.setCapability("platformName", "Android");
		capability.setCapability("appPackage", "com.android.mms");
		capability.setCapability("appActivity", "com.android.mms.ui.ConversationList");
		
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("com.android.mms:id/action_new").click();
		driver.findElementById("com.android.mms:id/recipients_editor").sendKeys("8508638651");
		//driver.findElementById("com.google.android.apps.messaging:id/contact_picker_create_group").click();
		driver.findElementById("com.android.mms:id/embedded_text_editor").sendKeys("Hai");
		driver.findElementById("com.android.mms:id/sim1_button").click();
		//driver.pressKeyCode(36);
		//driver.pressKeyCode(29);
		//driver.pressKeyCode(37);
//		driver.findElementById("com.google.android.apps.messaging:id/send_message_button_icon").click();
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE) , new File("E:\\Tools\\References\\Appium\\appium log"+"Orientation"+".jpg"));
		Thread.sleep(5000);
		driver.quit();
		
	}
}
