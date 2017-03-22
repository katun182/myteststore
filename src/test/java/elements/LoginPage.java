package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by saman on 3/22/17.
 */
public class LoginPage {

    public LoginPage(WebDriver myWebdriver){

        PageFactory.initElements(myWebdriver,this);

    }

    @FindBy(id="email")
    WebElement emailInput;

    public void setEmail(String useremail){
        emailInput.sendKeys(useremail);
    }

    @FindBy(id="password")
    WebElement passwordInput;

    public void setPassword(String userpassword){
         passwordInput.sendKeys(userpassword);
     }

}
