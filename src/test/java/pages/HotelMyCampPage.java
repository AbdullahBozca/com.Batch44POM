package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampPage {
    public HotelMyCampPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement IlkLoginLink;

    @FindBy(xpath = "//input[@class='form-control required']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(id = "btnSubmit")
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()='ListOfUsers']")
    public WebElement listOfUsers;

    @FindBy(xpath = "//span[text()='Try again please']")
    public WebElement tryAgain;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManegement;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[2]")
    public WebElement hotelList;

    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addHotel;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement codeBox;

    @FindBy(xpath = "//select[@class='form-control input-lg required']")
    public WebElement IDGroupSelect;

    @FindBy(xpath = "//button[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement actualAllertText;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement actualAllertButton;




    public void bekle(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void login() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        IlkLoginLink.click();
        usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUserName"));
        passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        loginButton.click();
    }
}
