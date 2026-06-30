package saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
     @Test
     public void get() {
    	 WebDriver driver=new ChromeDriver();
    	 System.out.println("driver initialised");
    	 driver.get("https://www.saucedemo.com/");
    	 driver.findElement(By.id("user-name")).sendKeys("error_user");
    	 driver.findElement(By.id("password")).sendKeys("secret_sauce");
    	 driver.findElement(By.id("login-button")).click();
    	 
    	 
     }
}
