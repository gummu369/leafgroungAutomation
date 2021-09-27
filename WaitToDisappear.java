package com.leafeground.playground;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitToDisappear {
	@Test
	public void testWaitToDisappear() throws InterruptedException, MalformedURLException, IOException {
	      String path="C://webdriver//chromedriver.exe";
	      System.setProperty("webdriver.chrome.driver", path);
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://www.leafground.com/");
	      driver.manage().deleteAllCookies();
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//img[@alt='disapper']")).click();
	     WebElement element= driver.findElement(By.className("disappear"));  
	     boolean bool=element.isDisplayed();
	     System.out.println("is button is dispayed:"+bool);
	     WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	     String text=wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("strong"))).getText();
	     System.out.println(text);
	     driver.quit();
	}

}
