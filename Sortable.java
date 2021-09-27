package com.leafeground.playground;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sortable {
	@Test

	public void testSortable() throws InterruptedException, MalformedURLException, IOException {
      String path="C://webdriver//chromedriver.exe";
      System.setProperty("webdriver.chrome.driver", path);
      WebDriver driver=new ChromeDriver();
      driver.get("http://www.leafground.com/");
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//img[@alt='sortable']")).click();
      Thread.sleep(2000);
      WebElement element1=driver.findElement(By.xpath("//li[text()='Item 1']"));
      WebElement element2=driver.findElement(By.xpath("//li[text()='Item 2']"));
      WebElement element3=driver.findElement(By.xpath("//li[text()='Item 3']"));
      WebElement element4=driver.findElement(By.xpath("//li[text()='Item 4']"));
      WebElement element5=driver.findElement(By.xpath("//li[text()='Item 5']"));
      WebElement element6=driver.findElement(By.xpath("//li[text()='Item 6']"));
      WebElement element7=driver.findElement(By.xpath("//li[text()='Item 7']"));
      Actions action=new Actions(driver);
      action.clickAndHold(element1).moveToElement(element7).moveByOffset(1, 3).release().perform();
      Thread.sleep(1000);
      action.clickAndHold(element2).moveToElement(element6).moveByOffset(1,3).release().perform();
      Thread.sleep(1000);
      action.clickAndHold(element3).moveToElement(element5).moveByOffset(1,3).release().perform();
      Thread.sleep(1000);
      action.clickAndHold(element4).moveToElement(element4).moveByOffset(1,3).release().perform();
      Thread.sleep(1000);
      
      
	}

}
