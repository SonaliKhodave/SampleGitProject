package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class Loginpage {

    WebDriver ldriver;

    public Loginpage (WebDriver rdriver){
        ldriver =rdriver;
        PageFactory.initElements(rdriver,this);
    }
@FindBy(name = "uid")
    WebElement username;

    public void setUsername(String uname) {
      username.sendKeys(uname);
    }
}
