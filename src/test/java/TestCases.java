import org.testng.annotations.Test;

/**
 * Created by User on 09.12.2016.
 */
public class TestCases extends DriverConfig{

    @Test
    protected void successLoginTest(){
        TestLibrary testLibrary = new TestLibrary(driver);
        testLibrary.successLogin();
    }

}
