package com.leafeground.playground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Download {
	@Test
	public void testDowload() throws InterruptedException
	{
		String chromePath=  "C://webdriver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Download']")).click();
		List<WebElement> element= driver.findElements(By.xpath("//div/child::a"));
		for(int i=0;i<=element.size()-1;i++)
		{
			element.get(i).click();
			Thread.sleep(1000);
		}
		
	}

}
