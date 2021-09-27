package com.leafeground.playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathAxes {
	@Test
	public void axesTest()
	{
		String path = "C://webdriver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		//Xpath using parent
		System.out.println(driver.findElement(By.xpath("//label[text()='Email']/parent::div/a")).getAttribute("href"));
		
		//xpath using child
		 driver.findElement(By.xpath("//div[@class='container']/child::input[1]")).sendKeys("first name");
				
		// Xpath using following-sibling
		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]")).sendKeys("vk522603@gmail.com");
		
		//xpath using preceding-sibling
		driver.findElement(By.xpath("//label[text()='Email']/preceding-sibling::input[1]")).sendKeys("last name");
		
		//Xpath using following
		driver.findElement(By.xpath("//label[text()='First Name ']/following::input[1]")).sendKeys("xxxxxxxxxx");
		
		//Xpath using preceding
	    driver.findElement(By.xpath("//label[text()='Repeat Password']/preceding::input[1]")).sendKeys("xxxxxxxxxx");
				
		//xpath using Descendant
		driver.findElement(By.xpath("//div[@class='container']/descendant::button[text()='Clear']")).click();
		
		//xpath using Ancestor
		System.out.println(driver.findElement(By.xpath("//div[@class='container']/ancestor-or-self::div/a[text()='Sign in into account']")).getAttribute("href"));
		
	}
	

}
