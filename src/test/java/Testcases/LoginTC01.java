package Testcases;

import BaseClassTestcases.Baseclass;
import PageObject.Loginpage;
import org.testng.annotations.Test;

public class LoginTC01 extends Baseclass {
    @Test
   public void Login() {
        driver.get(baseURL);
        //driver.get("https://demo.guru99.com/v4/");

        Loginpage lp =new Loginpage(driver);
        lp.setUsername(username);

    }
}
