package com.leafeground.playground;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOver {
	@Test
	public void testToolTip() throws InterruptedException {
		String path = "C://webdriver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='mouseover']")).click();
		WebElement element = driver.findElement(By.xpath("//a[text()='TestLeaf Courses']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		System.out.println(12);
		List<WebElement> links = driver.findElements(By.xpath("(//ul)[3]//li"));
		System.out.println("number of links present:" + links.size());
		for (int i = 0; i <= links.size() - 1; i++) {
			String printLinks = links.get(i).getAttribute("href");
			System.out.println(printLinks);
			if (links.get(i).getText().equals("Selenium")) {
				links.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='logo Testleaf']")).click();
		Thread.sleep(1000);
		driver.quit();

	}
}
