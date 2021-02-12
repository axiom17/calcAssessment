package nuix.github.io.calcAssessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(xpath = "//input[@value='C']")
    public WebElement clear;

    @FindBy(xpath = "//input[@value='0']")
    public WebElement zero;

    @FindBy(xpath = "//input[@value='1']")
    public WebElement one;

    @FindBy(xpath = "//input[@value='2']")
    public WebElement two;

    @FindBy(xpath = "//input[@value='3']")
    public WebElement three;

    @FindBy(xpath = "//input[@value='4']")
    public WebElement four;

    @FindBy(xpath = "//input[@value='5']")
    public WebElement five;

    @FindBy(xpath = "//input[@value='6']")
    public WebElement six;

    @FindBy(xpath = "//input[@value='7']")
    public WebElement seven;

    @FindBy(xpath = "//input[@value='8']")
    public WebElement eight;

    @FindBy(xpath = "//input[@value='9']")
    public WebElement nine;

    @FindBy(xpath = "//input[@value='+']")
    public WebElement add;

    @FindBy(xpath = "//input[@value='-']")
    public WebElement subtract;

    @FindBy(xpath = "//input[@id='multiply']")
    public WebElement multiply;

    @FindBy(xpath = "//input[@id='divide']")
    public WebElement divide;

    @FindBy(xpath = "//input[@value='=']")
    public WebElement equals;

    @FindBy(xpath = "//input[@value='.']")
    public WebElement decimal;

    @FindBy(xpath = "//div[@id='display']")
    public WebElement answerBox;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
