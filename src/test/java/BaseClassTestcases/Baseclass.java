package BaseClassTestcases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Baseclass {

      public   String baseURL="https://demo.guru99.com/v4/";
      public   String username ="mngr453268";
      public  static WebDriver driver ;

        @BeforeClass
        public  void setup(){

            System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"/Driver/chromedriver 8");
            driver=new ChromeDriver();


        }
        @AfterClass
        public  void teardown(){

            driver.close();
        }

    }

