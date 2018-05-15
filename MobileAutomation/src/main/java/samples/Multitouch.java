package samples;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.TouchAction;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MultiTouchAction;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.offset.ElementOption.*;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Multitouch {
	
	AndroidDriver<AndroidElement> driver;
	Dimension size;

	@BeforeMethod
	 public void setUp() throws MalformedURLException {
		// TODO Auto-generated method stub
	
		File targetApp = new File("C:\\Apps\\MultiTouchTester.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "9DCY9DMVCES8RSEY");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("fastReset", "True");
		capabilities.setCapability("app", targetApp.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.the511plus.MultiTouchTester");
		capabilities.setCapability("appActivity", "com.the511plus.MultiTouchTester.MultiTouchTester");

		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		}
	
	//@Test(priority = 1)
	public void touchActPress() throws InterruptedException
	{
		int x  = driver.findElement(MobileBy.id("com.the511plus.MultiTouchTester:id/touchStr")).getLocation().getX();
        int y  = driver.findElement(MobileBy.id("com.the511plus.MultiTouchTester:id/touchStr")).getLocation().getY();
        System.out.println("X-AXIS="+x+" Y-AXIS="+y);
        MultiTouchAction multiTouch = new MultiTouchAction(driver);
        
        //multiTouch.add(new TouchAction<>(driver).press(point(x+5,y+y)).waitAction(waitOptions(Duration.ofMillis(2000))).release())
        
       
        multiTouch.add(new TouchAction<>(driver).press(point(x+5, y+y)).waitAction(waitOptions(Duration.ofMillis(2000))).release())
        .add(new TouchAction<>(driver).press(point(x+300,y+300)).waitAction(waitOptions(Duration.ofMillis(2000))).release())
        .add(new TouchAction<>(driver).press(point(x+250,y+250)).waitAction(waitOptions(Duration.ofMillis(2000))).release())
        .add(new TouchAction<>(driver).press(point(x+150,y+150)).waitAction(waitOptions(Duration.ofMillis(2000))).release())
        .add(new TouchAction<>(driver).press(point(x-100,y-100)).waitAction(waitOptions(Duration.ofMillis(2000))).release())
        .perform();
        
        
		Thread.sleep(10000);
		
	}
	
	
	//@Test(priority = 2)
	public void touchActionLongPress() throws InterruptedException
	{
		size = driver.manage().window().getSize();
		Thread.sleep(5000);
		  //Get X Y Coordinates for touch action 1(Top left side).
		  int x1 = (int) (size.width * 0.20);
		  int y1 = (int) (size.height * 0.20);
		  
		  //Get X Y Coordinates for touch action 2(Top right side).
		  int x2 = (int) (size.width * 0.80);
		  int y2 = (int) (size.height * 0.20);
		  
		  //Get X Y Coordinates for touch action 3(Bottom left side).
		  int x3 = (int) (size.width * 0.20);
		  int y3 = (int) (size.height * 0.80);
		  
		  //Get X Y Coordinates for touch action 4(Bottom right side).
		  int x4 = (int) (size.width * 0.80);
		  int y4 = (int) (size.height * 0.80);
		  
		  //Get X Y Coordinates for touch action 5(middle of the screen).
		  int x5 = size.width / 2;
		  int y5 = size.height / 2;
		  
		  // Create object of MultiTouchAction class.
		  MultiTouchAction multiTouches = new MultiTouchAction(driver);
		  
		// Set touch action1 on given X Y Coordinates of screen -- Client 6.0.0-Beta3
		  multiTouches.add(new TouchAction<>(driver).longPress(point(x1, y1)).waitAction(waitOptions(Duration.ofMillis(1500))))
		  .add(new TouchAction<>(driver).longPress(point(x2, y2)).waitAction(waitOptions(Duration.ofMillis(1500))))
		  .add(new TouchAction<>(driver).longPress(point(x3, y3)).waitAction(waitOptions(Duration.ofMillis(1500))))
		  .add(new TouchAction<>(driver).longPress(point(x4, y4)).waitAction(waitOptions(Duration.ofMillis(1500))))
		  .add(new TouchAction<>(driver).longPress(point(x5, y5)).waitAction(waitOptions(Duration.ofMillis(1500))))
		  .perform();
		  Thread.sleep(10000);
	}
	
	
	@Test(priority = 3)
	public void touchActionTap() throws InterruptedException, IOException
	{
		new TouchAction<>(driver)
		.tap(element(driver.findElement(MobileBy.id("com.the511plus.MultiTouchTester:id/touchStr"))))
		.release().perform();
		File srcFile=driver.getScreenshotAs(OutputType.FILE);
		String filename=UUID.randomUUID().toString(); 
		File targetFile=new File("C:\\Apps\\Proof" + filename +".jpg");
		org.apache.commons.io.FileUtils.copyFile(srcFile,targetFile);
	}
	
	
	@Test(priority = 4)
	public void touchActionSwipe() throws InterruptedException, IOException
	{
		
		new TouchAction<>(driver)
				.press(point(550, 920))
                .waitAction(waitOptions(Duration.ofMillis(5000)))
				.moveTo(point(940, 860))
                .release()
                .perform();
				
		 Thread.sleep(10000);
	}
	
		 
	@AfterMethod
	public void logout()
	{
		driver.quit();
	}

}