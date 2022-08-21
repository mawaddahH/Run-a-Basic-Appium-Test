package Appium.Appium.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumAss3W11D2 {
	@Test
	public void firstTest() throws InterruptedException, MalformedURLException {

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("23b9cb400c1c7ece");
		options.setApp("C:\\Users\\lo0ol\\Downloads\\Collect-data-Application.apk");
		Thread.sleep(2000);

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
