package co.celus.step_definitions;

import co.celus.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setup() {

        try {
            Driver.getDriver().manage().window().maximize();
        } catch (WebDriverException e) {
            System.out.println("Failed to change window size" + e.getMessage());
        }
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDownScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Driver.getDriver().quit();
    }
}
