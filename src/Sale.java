import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Sale {

	public static List<WebElement> Header;
	//public static AndroidDriver AndroidDriver;
	
	public static void SaleM() throws MalformedURLException, InterruptedException
	{
		Header=Appium.AndroidDriver.findElementsById("com.rnd.flowermarket:id/adminsaleButton");
		
		while (Header.isEmpty()==true)
		{
			Thread.sleep(10000);
			//Header=Appium.AndroidDriver.findElementsByXPath("//*[@text='Sale']");
			Header=Appium.AndroidDriver.findElementsById("com.rnd.flowermarket:id/adminsaleButton");
			System.out.println("Application opening");
		}

		AndroidElement Sale=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Sale']");
		Sale.click();
		
		AndroidElement FiveStar=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Five Star']");
		FiveStar.click();
		
		AndroidElement Garbera=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Garbera']");
		Garbera.click();
		
		AndroidElement Bundle=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Bundle']");
		Bundle.click();
		Bundle.sendKeys("10");
		
		AndroidElement Rate_1=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Rate']");
		Rate_1.click();
		Rate_1.sendKeys("10");
		
		AndroidElement Rate_2=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Rate']");
		Rate_2.click();
		Rate_2.sendKeys("10");
		
		AndroidElement Credit=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Credit']");
		Credit.click();
		AndroidElement Sel_Credit_Acc=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Select Credit Account']");
		Sel_Credit_Acc.click();
		Appium.AndroidDriver.navigate().back();
		
		AndroidElement C=(AndroidElement)Appium.AndroidDriver.findElementById("com.rnd.flowermarket:id/editCommission");
		C.click();
		C.sendKeys("10");
		
		AndroidElement T=(AndroidElement)Appium.AndroidDriver.findElementById("com.rnd.flowermarket:id/editTransport");
		T.click();
		T.sendKeys("10");
		
		AndroidElement H=(AndroidElement)Appium.AndroidDriver.findElementById("com.rnd.flowermarket:id/editHamali");
		H.click();
		H.sendKeys("10");
		
		AndroidElement Recovery=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Recovery']");
		Recovery.click();
		
		AndroidElement Cancel=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Cancel']");
		Cancel.click();
		Thread.sleep(1000);
		
		//Appium.AndroidDriver.navigate().back();
		//Thread.sleep(1000);
		
		AndroidElement Carnesium=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Carnesium']");
		Carnesium.click();
		
		Appium.AndroidDriver.navigate().back();
		Thread.sleep(1000);
		
		AndroidElement Shevanti=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Shevanti']");
		Shevanti.click();
		
		Appium.AndroidDriver.navigate().back();
		Thread.sleep(1000);
		
		AndroidElement Anthorium=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Anthorium']");
		Anthorium.click();
		
		Appium.AndroidDriver.navigate().back();
		Thread.sleep(1000);
		
		AndroidElement Lilium_Asiatic=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Lilium Asiatic']");
		Lilium_Asiatic.click();
		
		Appium.AndroidDriver.navigate().back();
		Thread.sleep(1000);
		
		AndroidElement Lilium_Oriental=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Lilium Oriental']");
		Lilium_Oriental.click();
		
		Appium.AndroidDriver.navigate().back();
		Thread.sleep(1000);
		
		AndroidElement Dutch_Gulab=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Dutch Gulab']");
		Dutch_Gulab.click();
		
		Appium.AndroidDriver.navigate().back();
		Thread.sleep(1000);
		
		AndroidElement B_O_P=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='B O P']");
		B_O_P.click();
		
		Appium.AndroidDriver.navigate().back();
		Thread.sleep(1000);
		
		AndroidElement Single_Kadi=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Single Kadi']");
		Single_Kadi.click();
		
		Appium.AndroidDriver.navigate().back();
		Thread.sleep(1000);
		
		AndroidElement Double_Kadi=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Double Kadi']");
		Double_Kadi.click();
		
		Appium.AndroidDriver.navigate().back();
		Thread.sleep(1000);
		
		AndroidElement Gladio_White=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Gladio White']");
		Gladio_White.click();
		
		Appium.AndroidDriver.navigate().back();
		Thread.sleep(1000);
		
		AndroidElement Gladio_Yellow=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Gladio Yellow']");
		Gladio_Yellow.click();
		
		Appium.AndroidDriver.navigate().back();
		Thread.sleep(1000);
		
		AndroidElement Gladio_Pink=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Gladio Pink']");
		Gladio_Pink.click();
		
		Appium.AndroidDriver.navigate().back();
		Thread.sleep(1000);
		
		AndroidElement Gladio_Red=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Gladio Red']");
		Gladio_Red.click();
		
		Appium.AndroidDriver.navigate().back();
		Thread.sleep(1000);
		
		AndroidElement Gladio_Ornage=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Gladio Ornage']");
		Gladio_Ornage.click();
		
		Appium.AndroidDriver.navigate().back();
		Thread.sleep(1000);
		
		AndroidElement Gladio_Mix=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Gladio Mix']");
		Gladio_Mix.click();
		
		Appium.AndroidDriver.navigate().back();
		Thread.sleep(1000);
		
		AndroidElement Shevanti_Bundle=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Shevanti Bundle']");
		Shevanti_Bundle.click();
		
		Appium.AndroidDriver.navigate().back();
		Thread.sleep(1000);
		
		AndroidElement Five_Star_Other=(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='5 Star Other']");
		Five_Star_Other.click();
		
		Appium.AndroidDriver.navigate().back();
		Thread.sleep(1000);
		
	//	Appium.AndroidDriver.swipe(20,315,86,378, 2);
		
//		System.out.println("-----------------------------");
//	AndroidElement row=	(AndroidElement)Appium.AndroidDriver.findElementByXPath("//*[@text='Gipso']");
//		row.swipe(SwipeElementDirection.UP,10000);
//		System.out.println("-----------------------------");
		 

	}
	
}
