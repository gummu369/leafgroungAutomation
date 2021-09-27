package com.leafeground.playground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Table {
	@Test
	public void testTable() throws InterruptedException
	{
		String path="C://webdriver//chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", path);
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.leafground.com/");
	     driver.manage().deleteAllCookies();
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//img[@alt='Table']")).click();//table[@id='table_id']/tbody/tr[4]/td[3]/input
	     Thread.sleep(2000);
	     List<WebElement> columEelements= driver.findElements(By.xpath("//table[@id='table_id']//tr//th"));
	     System.out.println("number of columns in a table: "+columEelements.size());
	     List<WebElement> rowElements= driver.findElements(By.xpath("//table[@id='table_id']//tr"));
	     System.out.println("number of rows in a table: "+rowElements.size());
   	    
	    System.out.println("Get the progress value of 'Learn to interact with Elements"
                +driver.findElement(By.xpath("//table[@id='table_id']/tbody/tr[3]/td[2]")).getText()); 
	     driver.findElement(By.xpath("//table[@id='table_id']/tbody/tr[4]/td[3]/input")).click();
	     Thread.sleep(2000);
	    driver.quit();
	}

}
