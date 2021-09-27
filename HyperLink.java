package com.leafeground.playground;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HyperLink {
	@Test

	public void testHyperlink() throws InterruptedException, MalformedURLException, IOException {
      String path="C://webdriver//chromedriver.exe";
      System.setProperty("webdriver.chrome.driver", path);
      WebDriver driver=new ChromeDriver();
      driver.get("http://www.leafground.com/");
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//img[@alt='Link']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//img[@alt='Link']")).click();
      Thread.sleep(2000);
      System.out.println(driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).getAttribute("href"));
      driver.get("http://www.leafground.com/pages/Link.html");
      List<WebElement> links=driver.findElements(By.tagName("a"));
      for(int i=0;i<=links.size()-1;i++)
      {
    	  HttpURLConnection connection=(HttpURLConnection) new URL(links.get(i).getAttribute("href")).openConnection();
    	  connection.connect();
    	  int responseCode=connection.getResponseCode();
    	  connection.disconnect();
    	  System.out.println(links.get(i).getAttribute("href")+" "+responseCode);
    	  if(responseCode==404)
    	  {
    		  System.out.println("---------------"+links.get(i).getAttribute("href")+"is broken"+"---------------------------");
    	  }
    	  
    	  
      }
      driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//img[@alt='Link']")).click();
      Thread.sleep(2000);
      WebElement element=driver.findElement(By.xpath("//a[text()='How many links are available in this page?']"));
      Actions actions=new Actions(driver);
      actions.moveToElement(element);
      Thread.sleep(2000);
      System.out.println("links that are available in this page: "+links.size());
      driver.findElement(By.xpath("//img[@alt='logo Testleaf']")).click();
	  Thread.sleep(5000);
      driver.quit();
      
	}

}
