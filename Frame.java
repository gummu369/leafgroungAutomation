package com.leafeground.playground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frame {
	@Test
	public void frameTest() throws InterruptedException {
		String path = "C://webdriver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Frame']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement frame1 = driver.findElement(By.xpath("//button[@id='Click']"));
		frame1.click();
		System.out.println(frame1.getText());
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame(1).switchTo().frame(driver.findElement(By.id("frame2")));
		WebElement frame2 = driver.findElement(By.xpath("//button[@id='Click1']"));
		frame2.click();
		System.out.println(frame2.getText());
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("number of frames in webpage : " + frames.size());
		driver.findElement(By.xpath("//img[@alt='logo Testleaf']")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
