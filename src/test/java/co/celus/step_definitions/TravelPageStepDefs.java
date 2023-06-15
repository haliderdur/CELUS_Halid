package co.celus.step_definitions;


import co.celus.pages.TravelBlogPage;
import co.celus.utilities.BrowserUtils;
import co.celus.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelPageStepDefs {

    TravelBlogPage travelBlogPage = new TravelBlogPage();

    @Given("User is on Travel Blog main page")
    public void user_is_on_travel_blog_main_page() {
        travelBlogPage.login();
    }

    @When("User clicks {string}")
    public void user_clicks(String cardName) {

        for (WebElement eachCardTitle : travelBlogPage.cardTitles) {
            BrowserUtils.waitForVisibilityOf(eachCardTitle);
            //BrowserUtils.waitForStaleElement(eachCardTitle);
            BrowserUtils.waitForPresenceOfElement(By.tagName("h5"),100);

            if (eachCardTitle.getText().equals(cardName)) {
                eachCardTitle.click();
                break;
            }
        }
    }

    @Then("User able to see {string} as same as page header in card page")
    public void user_able_to_see_cardName_as_same_as_page_header_in_card_page(String cardPageHeader) {

        if (travelBlogPage.errorMessage.size() == 1) {
            Assert.assertFalse(true);
        } else {
            String actualCardPageHeader = Driver.getDriver().findElement(By.xpath("//main/h4")).getText();
            Assert.assertEquals(cardPageHeader, actualCardPageHeader);

        }
    }

}



