package saucelabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
     @Test
     public void get() {
    	 WebDriver driver=new ChromeDriver();
    	 System.out.println("driver initialised");
    	 driver.get("https://www.google.com");
    	 System.out.println("google opened");
    	 
     }
}
