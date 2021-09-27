package com.leafeground.playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Upload {
	@Test
	public void testupload() throws InterruptedException {
		String path = "C://webdriver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='contextClick']")).click();
		WebElement element = driver.findElement(By.tagName("input"));
		element.sendKeys("C:\\Users\\Admin\\Downloads\\vamsiResume.docx");
		System.out.println("uploaded sucessfully");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='logo Testleaf']")).click();
		Thread.sleep(1000);
		driver.quit();
	}

}
