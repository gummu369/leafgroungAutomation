package com.leafeground.playground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selectable {
	@Test
	public void draggableTest() throws InterruptedException {
		String path = "C://webdriver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='selectable']")).click();
		Thread.sleep(2000);
		List<WebElement> elements=driver.findElements(By.xpath("//div[@id='mydiv']//li"));
		Actions action=new Actions(driver);
		int size=elements.size();
		for(int i=0;i<=size-4;i++)
		{
			WebElement elementsInFor=elements.get(i);
			 action.keyDown(Keys.CONTROL).click(elementsInFor).perform();
			 Thread.sleep(1000);
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	

}
