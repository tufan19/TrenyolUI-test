package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import Utilities.BaseDriver;

public class Hooks {

    @Before
    public void before()
    {
        System.out.println("*** Scenario Started ***");
    }

    @After
    public void after(Scenario scenario)  {
        System.out.println("*** Scenario Finished ***");
        if (scenario.isFailed()){
            //extend report da çalışan kısım
            TakesScreenshot ts=(TakesScreenshot) BaseDriver.getDriver();
            final byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(hafizadakiHali, "image/png","screenshot name");
        }
        BaseDriver.quitDriver();
    }

}
