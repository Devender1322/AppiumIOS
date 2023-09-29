package Mobile.automation.Test;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FirstTestclass {

	public static void main(String[] args) throws MalformedURLException {
	DesiredCapabilities option = new DesiredCapabilities();
	    option.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		option.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		option.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.0");
		option.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 13 Pro Max");
		option.setCapability(MobileCapabilityType.APP,"/Users/devekumar/Library/Developer/Xcode/DerivedData/UIKitCatalog-fjhunbejnzsanzfkfmgbaioaoutg/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");
		
		URL url  = new URL("http://127.0.0.1:4723/wd/hub");
		IOSDriver driver = new IOSDriver(url, option);
		
		driver.findElement(By.className("XCUIElementTypeButton")).click();
//		driver.findElement(By.className("XCUIElementTypeButton")).click();
		
		
	}

}
