package Prueba;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
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


public class BusquedaMascota {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\AutoP\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://petstore.swagger.io/#/pet/getPetById");
		
	
		 
		 driver.manage().window().setSize(new Dimension(1261, 706));

		  
		// CASO BORDE INGRESAR ID NO REGISTRADO 
		 
		Thread.sleep(3000);   
		driver.findElement(By.cssSelector(".opblock-section:nth-child(2) .btn")).click();
		Thread.sleep(3000);
	    driver.findElement(By.cssSelector("input:nth-child(2)")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("input:nth-child(2)")).sendKeys("1234");
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".execute")).click();
	    
	    
	    {
	        WebElement element = driver.findElement(By.cssSelector(".execute"));
	        Actions builder = new Actions(driver);
	        builder.moveToElement(element).perform();
	      }
	    
	    {
	        WebElement element = driver.findElement(By.tagName("body"));
	        Actions builder = new Actions(driver);
	        builder.moveToElement(element, 0, 0).perform();
	      }
	    
	    
	    // CASO BORDE INGRESAR ID INVALIDO
	    
	    Thread.sleep(4000);   
	    driver.findElement(By.cssSelector("input:nth-child(2)")).clear();
	    driver.findElement(By.cssSelector("input:nth-child(2)")).sendKeys("123AAA");
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".execute")).click();
	    
	    // CASO FELIZ INGRESAR ID CORRECTO
	    
	    Thread.sleep(4000);   
	    driver.findElement(By.cssSelector("input:nth-child(2)")).clear();
	    driver.findElement(By.cssSelector("input:nth-child(2)")).sendKeys("12345");
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".execute")).click();
	    
	  
	   
	  }
	
	
}
