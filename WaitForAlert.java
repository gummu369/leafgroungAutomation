package com.leafeground.playground;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitForAlert {
	@Test
	public void testWaitForAlert() throws InterruptedException {
		String path = "C://webdriver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h5[text()='Wait for Alert']")).click();
		driver.findElement(By.id("alert")).click();
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert =driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
