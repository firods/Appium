import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

//import org.testng.annotations.BeforeTest;

public class Appium {

public static AndroidDriver AndroidDriver;
public static void main(String [] args) throws MalformedURLException,InterruptedException
{
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("device", "Android");
	capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("deviceName","MyDevice");
	capabilities.setCapability(CapabilityType.HAS_TOUCHSCREEN, "Android");
	capabilities.setCapability(CapabilityType.VERSION, "4.4");
	capabilities.setCapability(CapabilityType.PLATFORM, org.openqa.selenium.Platform.ANDROID);
	capabilities.setCapability("app-package", "com.md.EriBank"); //Replace with your app's package
	capabilities.setCapability("app-activity", "com.md.EriBank.SplashScreenActivity"); //Replace with app's Activity

	Thread.sleep(3000);
	AndroidDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

	 Thread.sleep(3000);
	 AndroidElement UserName=(AndroidElement)AndroidDriver.findElementByXPath("//*[@text='Username']");
	 UserName.sendKeys("company");
	 
	 AndroidElement Password=(AndroidElement)AndroidDriver.findElementById("com.experitest.ExperiBank:id/passwordTextField");
	 Password.sendKeys("company");
	 
	 AndroidElement Login=(AndroidElement)AndroidDriver.findElementByXPath("//*[@text='Login']");	
	 Login.click();
	 
	 Thread.sleep(3000);
	 AndroidElement MakePayment=(AndroidElement)AndroidDriver.findElementByXPath("//*[@text='Make Payment']");
	 MakePayment.click();
	 
	 Thread.sleep(3000);
	 AndroidElement Phone=(AndroidElement)AndroidDriver.findElementByXPath("//*[@text='Phone']");
	 Phone.sendKeys("1234567890");
	 
	 AndroidElement Name=(AndroidElement)AndroidDriver.findElementByXPath("//*[@text='Name']");	
	 Name.sendKeys("Shrikant");
	 
	 AndroidElement Amount=(AndroidElement)AndroidDriver.findElementByXPath("//*[@text='Amount']");
	 Amount.sendKeys("1000");
	 
	 AndroidElement Country=(AndroidElement)AndroidDriver.findElementByXPath("//*[@text='Country']");
	 Country.sendKeys("India");
	 
	 AndroidElement Send_Payment=(AndroidElement)AndroidDriver.findElementByXPath("//*[@text='Send Payment']");
	 Send_Payment.click();
	 Thread.sleep(3000);
	 
	 AndroidElement Yes=(AndroidElement)AndroidDriver.findElementByXPath("//*[@text='Yes']");
	 Yes.click();

	
	//Sale sale=new Sale();
	//sale.SaleM();
	
}

}