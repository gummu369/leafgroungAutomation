package com.leafeground.playground;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window {
	@Test
	public void testWindow() throws InterruptedException, MalformedURLException, IOException {
		String path = "C://webdriver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		WebElement windowIcon = driver.findElement(By.xpath("//img[@alt='Windows']"));
		windowIcon.click();
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parenetWindow_button1 = it.next();
		System.out.println(parenetWindow_button1);
		String childWindow_button1 = it.next();
		System.out.println(childWindow_button1);
		System.out.println(driver.switchTo().window(childWindow_button1).getTitle());
		Thread.sleep(2000);
		//driver.switchTo().window(childWindow_button1).close();
		driver.switchTo().window(parenetWindow_button1);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		WebElement openMultipleWindow = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
		openMultipleWindow.click();
		Set<String> handler2 = driver.getWindowHandles();
		System.out.println("number of windows opened:" + handler2.size());
		WebElement doNotCloseMe=driver.findElement(By.xpath("//button[text()='Do not close me ']"));
		doNotCloseMe.click();
		Thread.sleep(2000);
		Set<String> handler3=driver.getWindowHandles();
		Iterator<String> it3=handler3.iterator();
		String parenetWindow_button3=it3.next();
		String childWindow1_button3=it3.next();
		String childWindow2_button3=it3.next();
		driver.switchTo().window(childWindow1_button3).close();
		Thread.sleep(2000);
		driver.switchTo().window(childWindow2_button3).close();
		Thread.sleep(2000);
		driver.switchTo().window(parenetWindow_button3);
		Thread.sleep(2000);
		 WebElement WaitForFiveSec=driver.findElement(By.xpath("//button[text()='Wait for 5 seconds']"));
		 WaitForFiveSec.click();
		 Thread.sleep(2000);
		Set<String> handler4= driver.getWindowHandles();
		Iterator<String> it4=handler4.iterator();
		String parenetWindow_button4=it4.next();
		String childWindow1_button4=it4.next();
		String childWindow2_button4=it4.next();
		driver.switchTo().window(childWindow1_button4).close();
		Thread.sleep(2000);
		driver.switchTo().window(childWindow2_button4).close();
		Thread.sleep(2000);
		driver.switchTo().window(parenetWindow_button4);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt='logo Testleaf']")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
