package com.leafeground.playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditButton {
	@Test
	public void testEditButton() throws InterruptedException
	{
		String chromePath=  "C://webdriver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vk522603@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("i am sixteen years old");
		Thread.sleep(1000);
		String defaultText=driver.findElement(By.xpath("//input[@value='TestLeaf']")).getText();
		System.out.println(defaultText);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		Thread.sleep(1000);
		boolean bool=driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		System.out.println(bool);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@alt='logo Testleaf']")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
