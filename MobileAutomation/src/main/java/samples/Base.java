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

public class Base {
	
	AndroidDriver<WebElement> driver;
	String username = "sakthivel@testleaf.com"; // rajkumar@testleaf.com
	String password = "Leaf@123";
	String phone = "9840098400";
	
	@BeforeTest
	public void setup() throws MalformedURLException
	{
		File targetApp = new File("C:\\Users\\Anvar1022\\Downloads\\base.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Samsung_Galaxy_S6_sjc_free");
//		capability.setCapability("udid", "Samsung_Galaxy_S6_sjc_free");
		capabilities.setCapability("testobjectApiKey", "940A05EDE494483B916101451ECA146E");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "7.0");
		capabilities.setCapability("phoneOnly", "true");
		capabilities.setCapability("tabletOnly ", "false");
		capabilities.setCapability("privateDevicesOnly", "false");		
		capabilities.setCapability("app", targetApp.getAbsolutePath());
//		capabilities.setCapability("appiumVersion", "1.7.1");
		capabilities.setCapability("appPackage", "com.imaginea.fontli");
		capabilities.setCapability("appActivity", "com.imaginea.fontli.screens.HolderActivity");
		
		driver = new AndroidDriver<WebElement>(new URL("http://us1.appium.testobject.com/wd/hub"), capabilities);
//		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test(priority = 1)
	public void Login() throws InterruptedException  
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
		
//		Thread.sleep(5000);
//		Set<String> contextNames = driver.getContextHandles();
//		
//		for(String contextName : contextNames)
//		{
//			if(contextName.contains("WEBVIEW"))
//				driver.context(contextName);			
//			System.out.println(contextName);
//		}
//		
////		driver.context("NATIVE_APP");
//		Thread.sleep(5000);
//		WebDriverWait wait= new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Create an Account')]")));
//		driver.findElementByXPath("(//input[@formcontrolname='email'])").sendKeys(username);
//		driver.findElementByXPath("(//input[@formcontrolname='password'])").sendKeys(password);
//		driver.findElementByXPath("//span[contains(text(), 'Login')]").click();
//		Thread.sleep(5000);
//		driver.findElementByXPath("//span[text()= 'Settings']").click();;
//		Thread.sleep(10000);
//		List<WebElement> icons = driver.findElementsByXPath("//ion-icon[@name='arrow-forward']");
//		icons.get(icons.size()-1).click();
//		Thread.sleep(3000);
//		String To = driver.findElementByXPath("//ion-label[text()[contains(.,'To')]]").getText();
//		String Cc = driver.findElementByXPath("//ion-label[text()[contains(.,'Cc')]]").getText();
//		System.out.println("To: "+To);
//		System.out.println("Cc: "+Cc);
//		driver.findElementByXPath("//input[@formcontrolname='subject']").sendKeys("Appium Test");
//		driver.pressKeyCode(AndroidKeyCode.KEYCODE_TAB);
//		driver.findElementByXPath("//textarea[@formcontrolname='content']").sendKeys("Test Message for Appium Testing");
//		driver.pressKeyCode(AndroidKeyCode.KEYCODE_TAB);				
//		WebElement submitButton = driver.findElementByXPath("//span[text()='SEND']");
//		wait.until(ExpectedConditions.elementToBeClickable(submitButton));	
//		submitButton.click();
//		Thread.sleep(3000);		
//		/*(userName.equalsIgnoreCase(Cc)) {
//			System.out.println("The email ID matches and Test case is passed");*/
//		driver.findElementByXPath("//button[@category='alert-button']").click();
//		Thread.sleep(3000);	
	}
	
/*	@Test(priority = 2)
	public void updateProfile() throws InterruptedException
	{
		WebDriverWait wait= new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//Span[contains(text(),'Settings')]")));
		driver.findElementByXPath("//Span[contains(text(),'Settings')]").click();

		// Click Profile
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id='tabpanel-t0-2']//ion-item[1]//ion-label")));		
		actions.click();	
		actions.build().perform();	

		Thread.sleep(2000); 

		driver.findElement(By.xpath("//ion-input[@formcontrolname='phone']")).click();	

		WebElement ele = driver.findElementByXPath("//ion-input[@formcontrolname='phone']");
		actions.moveToElement(ele);	
		actions.click();
		actions.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		actions.sendKeys(phone);
		actions.build().perform();

		driver.findElementByXPath("//*[contains(text(),'SAVE CHANGES') and @class='button-inner']").click();

		Thread.sleep(2000); 

		String infoMsg  = driver.findElementById("alert-msg-0").getText();
		System.out.println(infoMsg);
		Thread.sleep(3000);

		driver.findElementByXPath("//*[contains(text(),'OK')]").click();
		Thread.sleep(5000);

	}*/
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
