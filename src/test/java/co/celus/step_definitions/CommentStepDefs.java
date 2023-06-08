package co.celus.step_definitions;

import co.celus.pages.TravelBlogPage;
import co.celus.utilities.BrowserUtils;
import co.celus.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.collections.functors.WhileClosure;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CommentStepDefs {

    TravelBlogPage travelBlogPage = new TravelBlogPage();


    @When("User clicks first travel card")
    public void user_clicks_first_travel_card() {
        travelBlogPage.card1.click();
    }

    @And("User types {string} in comment input box and send")
    public void user_types_in_comment_input_box_and_send(String comment) {
        travelBlogPage.commentInputBox.sendKeys(comment);
        travelBlogPage.sendButton.click();
    }

    @Then("User should see {string} comment under comments section")
    public void user_should_see_comment_under_comments_section(String comment) {

        for (WebElement eachComment : travelBlogPage.allComments) {
            if (!eachComment.getText().equals(comment)) {
                continue;
            } else {
                Assert.assertEquals(eachComment.getText(), comment);
            }
        }
    }



    @When("User should be able to delete {string} comment by clicking delete icon")
    public void user_should_be_able_to_delete_comment_by_clicking_delete_icon(String comment) {
        BrowserUtils.waitForVisibilityOf(travelBlogPage.lastCommentDeleteButton);
        travelBlogPage.lastCommentDeleteButton.click();
        travelBlogPage.proceedButton.click();
    }

    @Then("User should not be seeing {string} comment under comments section")
    public void user_should_not_be_seeing_comment_under_comments_section(String comment) {
        Assert.assertFalse(travelBlogPage.allComments.contains(travelBlogPage.celusComment.getText()));
    }


}
