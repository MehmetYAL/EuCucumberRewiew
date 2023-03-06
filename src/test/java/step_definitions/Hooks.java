package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utulities.Driver;

public class Hooks {
    WebDriver driver;

    @Before(value = "@smoke")
    public void init(){
        System.out.println("This is running before every step definitions");
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }

}
