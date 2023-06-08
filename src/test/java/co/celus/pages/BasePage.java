package co.celus.pages;

import co.celus.utilities.ConfigurationReader;
import co.celus.utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void login() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
}
