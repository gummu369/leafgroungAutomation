package com.leafeground.playground;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitForTextChange {
	@Test
	public void testWaitForText() throws InterruptedException
	{
		String chromePath=  "C://webdriver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h5[text()='Wait for Text Change']")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click ME!']"))).click();
		Thread.sleep(2000);
		Alert alert= driver.switchTo().alert();
	    String alertText=alert.getText();
	    if(alertText.equals("Click ME!"))
	    {
	    	alert.accept();
	    }
	    Thread.sleep(1000);
	    driver.quit();
		
	}

}
