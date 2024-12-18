package Prueba;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;




public class ApiTest {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\AutoP\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://petstore.swagger.io/#/pet");
		
			  
		    Thread.sleep(3000);
		    driver.findElement(By.cssSelector("#operations-pet-uploadFile > div.opblock-summary.opblock-summary-post > button.opblock-control-arrow")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.cssSelector("#operations-pet-uploadFile > div.no-margin > div > div.opblock-section > div.opblock-section-header > div.try-out > button" )).click();
		    Thread.sleep(3000);
		    driver.findElement(By.cssSelector("tr:nth-child(1) input")).sendKeys("1234");
		    Thread.sleep(3000);
		    driver.findElement(By.cssSelector("tr:nth-child(2) input")).click();
		    driver.findElement(By.cssSelector("tr:nth-child(2) input")).sendKeys("mascotaa");
		   // driver.findElement(By.cssSelector("tr:nth-child(3) input")).sendKeys("C:\\fakepath\\Perrito1.JPG");
		    Thread.sleep(5000);
		    driver.findElement(By.cssSelector("#operations-pet-uploadFile > div.no-margin > div > div.execute-wrapper > button")).click();
		    
		   
		    
		}	
}
