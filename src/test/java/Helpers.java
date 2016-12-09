import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 09.12.2016.
 */
public class Helpers {

    protected AppiumDriver driver;

    protected boolean elementIsPresent(By by){
        int pause = 15;
        driver.manage().timeouts().implicitlyWait(pause, TimeUnit.SECONDS);
        boolean b = driver.findElements(by).isEmpty();
        if(!b){
            return true;
        }
        else {
            return false;
        }
    }

    protected void sleep(int timeout) {
        try {
            Thread.sleep(timeout * 1000);
        } catch (InterruptedException e) {
        }
    }

}
