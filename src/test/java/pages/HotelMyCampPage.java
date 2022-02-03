package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {
    public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement IlkLoginLink;
    @FindBy(xpath = "//input[@class='form-control required']")
    public  WebElement usernameBox;
    @FindBy(xpath = "//input[@id='Password']")
    public  WebElement passwordBox;
    @FindBy(id = "btnSubmit")
    public WebElement loginButton;
    @FindBy(xpath = "//span[text()='ListOfUsers']")
    public WebElement listOfUsers;
    @FindBy(xpath = "//span[text()='Try again please']")
    public WebElement tryAgain;

    public void bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
