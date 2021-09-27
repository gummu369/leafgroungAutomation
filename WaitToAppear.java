package com.leafeground.playground;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitToAppear {
	
	@Test
	public void testWaitToDisappear() throws InterruptedException, MalformedURLException, IOException {
	      String path="C://webdriver//chromedriver.exe";
	      System.setProperty("webdriver.chrome.driver", path);
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://www.leafground.com/");
	      driver.manage().deleteAllCookies();
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//img[@alt='appear']")).click();
	      WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	     String text= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button/child::b[text()='I know you can find him']"))).getText();
	     System.out.println(text);
	}
}
