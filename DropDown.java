package com.leafeground.playground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	@Test
	public void testDropDown() throws InterruptedException
	{
		 String path="C://webdriver//chromedriver.exe";
	     System.setProperty("webdriver.chrome.driver", path);
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://www.leafground.com/");
	     driver.manage().deleteAllCookies();
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//img[@alt='ListBox']")).click();
	     Thread.sleep(2000);
	     Select selectByIndex=new Select(driver.findElement(By.xpath("//select[@id='dropdown1']")));
	     selectByIndex.selectByIndex(1);
	     Thread.sleep(2000);
	     Select selectByText=new Select(driver.findElement(By.xpath("//select[@name='dropdown2']")));
	     selectByText.selectByVisibleText("Appium");
	     Thread.sleep(2000);
	     Select selectByValue=new Select(driver.findElement(By.xpath("//select[@name='dropdown3']")));
	     selectByValue.selectByIndex(3);
	     Thread.sleep(2000);
	     Select noOfSelectors =new Select(driver.findElement(By.xpath("//select[@class='dropdown']")));
	     List<WebElement> option=noOfSelectors.getOptions();
	     System.out.println(option.size());
	     Thread.sleep(2000);
	     //pending
	     WebElement element =driver.findElement(By.xpath("(//select)[5]"));
	     element.click();
	     Thread.sleep(2000);
	     element.sendKeys(Keys.DOWN);
	     Thread.sleep(1000);
	     element.sendKeys(Keys.DOWN);
	     Thread.sleep(1000);
	     element.sendKeys(Keys.DOWN);
	     Thread.sleep(1000);
	     element.sendKeys(Keys.DOWN);
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//select[@multiple]//option[text()='Selenium']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//img[@alt='logo Testleaf']")).click();
			Thread.sleep(2000);
	     
	     driver.quit();
		
	}

}
