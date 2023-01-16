package pages;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginPageTest { 
	ChromeDriver driver;
	
	
	
  @Test
  public void LoginHomePage() {
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			    
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	WebDriverManager.chromedriver().setup();  
	 driver = new ChromeDriver();
	  driver.get("https://itera-qa.azurewebsites.net/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  } 

}
