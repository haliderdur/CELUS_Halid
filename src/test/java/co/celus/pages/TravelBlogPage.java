package co.celus.pages;

import co.celus.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TravelBlogPage extends BasePage {

    @FindBy(xpath = "//div/h5")
    public List<WebElement> cardTitles;

    @FindBy(xpath = "//h2[.='Unable to fetch post']")
    public List<WebElement> errorMessage;

    @FindBy(css = "img[alt='15 Undeniable Reasons to Love Travel']")
    public WebElement card1;

    @FindBy(css = "textarea[class='sc-cxabCf fJILdP']")
    public WebElement commentInputBox;

    @FindBy(xpath = "//button[.='Send']")
    public WebElement sendButton;

    @FindBy(xpath = "//p[@class='sc-bZkfAO gzjmhQ']")
    public List<WebElement> allComments;

    @FindBy(xpath = "//button[@aria-label='delete']")
    public List<WebElement> deleteButtons;

    @FindBy(xpath = "//p[.='CELUS IS COOL AMAZING']/..//following-sibling::footer//button[@aria-label='delete']")
    public WebElement lastCommentDeleteButton;

    @FindBy(xpath = "//button[.='Proceed']")
    public WebElement proceedButton;

    @FindBy(xpath = "//p[.='CELUS IS COOL AMAZING']")
    public WebElement celusComment;

}
