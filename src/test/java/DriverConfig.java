import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by User on 09.12.2016.
 */
public class DriverConfig {
    protected AppiumDriver driver;

    @BeforeMethod
    protected void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Nexus 5");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }

    @AfterMethod
    protected void tearDown(){
        driver.quit();
    }
}
