package samples;

	import java.io.File;
	import java.io.IOException;
	import java.net.URL;
	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebDriverException;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import io.appium.java_client.android.AndroidDriver;

	public class ScreenOrientation {
		
		public static void main(String[] args)throws InterruptedException, WebDriverException, IOException {

			AndroidDriver<WebElement> driver ;
			DesiredCapabilities capability = new DesiredCapabilities();
			
			File targetApp = new File("C:\\Users\\gopek\\Downloads\\LeafOrg.apk");
			
			capability.setCapability("platformName", "Android");
			capability.setCapability("deviceName", "da7e6aee0504");
			capability.setCapability("app", targetApp.getAbsolutePath());
			capability.setCapability("appPackage", "com.testleaf.leaforg");
			capability.setCapability("appActivity", "com.testleaf.leaforg.MainActivity");

			driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);	
/*
			ScreenOrientation orientation= driver.getOrientation();
			System.out.println("By Default: "+orientation.value());

			if(orientation.value().contains("landscape"))
			{
				driver.rotate(ScreenOrientation.PORTRAIT);
				Thread.sleep(10000);
				System.out.println(driver.getOrientation());
			}
			else
			{
				driver.rotate(ScreenOrientation.LANDSCAPE);
				Thread.sleep(10000);
				System.out.println(driver.getOrientation());
			}
			**/
			FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE) , new File("C:\\Users\\gopek\\Downloads\\Proof\\"+"Orientation"+".jpg"));
			Thread.sleep(5000);
			//Close App
			driver.closeApp();
			driver.quit();
		}
}
