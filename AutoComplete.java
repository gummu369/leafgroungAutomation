package com.leafeground.playground;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AutoComplete {
	@Test
	public void testAutoComplete() throws InterruptedException
	{
		String chromePath=  "C://webdriver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Auto Complete']")).click();
		driver.findElement(By.xpath("//input[@class='ui-autocomplete-input']")).sendKeys("se");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui-menu-item-wrapper']")));
		List<WebElement> element=driver.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
		for(WebElement option:element)
		{
			if(option.getText().equals("Selenium"))
			{
				option.click();
				break;
			}
		}
		Thread.sleep(1000);
		driver.quit();
	}

}
