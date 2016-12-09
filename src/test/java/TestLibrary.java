import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


/**
 * Created by User on 06.12.2016.
 */
public class TestLibrary extends Helpers {

    public TestLibrary(AppiumDriver driver){
        this.driver = driver;
    }

    protected void successLogin(){
        elementIsPresent(By.xpath("//android.widget.TextView[@text='Sign in']"));
        driver.findElement(By.xpath("//android.widget.TextView[@text='Sign in']")).click();
        WebElement mail_input = driver.findElement(By.xpath("//android.widget.EditText[@text='Email']"));
        mail_input.sendKeys("skyfenceodessa@gmail.com");
        sleep(2);
        driver.findElement(By.xpath("//android.widget.EditText[@password='true']")).click();
        WebElement pass_input = driver.findElement(By.xpath("//android.widget.EditText[@password='true']"));
        pass_input.sendKeys("Password1@");
        driver.findElement(By.xpath("//android.widget.Button[@text='Sign in']")).click();
        sleep(2);
        Assert.assertTrue(elementIsPresent(By.xpath("//android.widget.TextView[@text='Robert Skyfence']")));
    }


}
