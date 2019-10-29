package Tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumScript {
    public static void main(String[] args) {
        //we have to setup webdriver based on the driver that we gonna use
        WebDriverManager.chromedriver().setup();
        //we need to create an object of appropriate class
        ChromeDriver driver=new ChromeDriver();
        //lets open gooegle.com
        //.get() method allows you open some website

        driver.get("http://google.com");
        //to read page titile , method  .getTitle();
        //teat1. verify that title of the page is "Google"
        String actualResult=driver.getTitle();
        String expectedResult ="Google";
        if(actualResult.equals(expectedResult)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
        //to close browser
        //if we open gate we need to close it.
        driver.close();
    }
}
