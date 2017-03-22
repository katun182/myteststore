package tests;

import elements.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by saman on 3/22/17.
 */
public class BasicTest {

    @Test
    public void loginTest(){

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");

        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.get("http://www.admin.qa.yurstore.net");

        LoginPage loginpageObj = new LoginPage(webDriver);

        loginpageObj.setEmail("bbking@bbking.com");

        loginpageObj.setPassword("123456");

    }

}
