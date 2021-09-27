package com.leafeground.playground;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdvanceTable {
	@Test
	public void testAdvanceTable() throws InterruptedException {
		String path = "C://webdriver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='sort']")).click();
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		String[] namesbeforeSort = new String[elements.size()];
		for (int i = 0; i <= elements.size() - 1; i++) {
			namesbeforeSort[i] = elements.get(i).getText().trim();

		}
		String list1Names=Arrays.toString(namesbeforeSort);
		System.out.println("names before sort :" + list1Names.hashCode());
		Arrays.sort(namesbeforeSort);
		String list2names=Arrays.toString(namesbeforeSort);
		System.out.println("names after sort :" + list2names.hashCode());
		System.out.println("names after sort :" + list2names);

		driver.findElement(By.xpath("//table/thead/tr/th[2]")).click();
		Thread.sleep(3000);
		List<WebElement> elements1 = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		String[] names = new String[elements1.size()];
		for (int i = 0; i <= elements1.size() - 1; i++) {
			names[i] = elements1.get(i).getText().trim();

		}
		String name=Arrays.toString(names);
		System.out.println("by default sort:" + name.hashCode());
		System.out.println("by default sort:" + name);

		// comparing namesAftersort and sortAfternames
		System.out.println(namesbeforeSort.equals(names));
		driver.quit();

	}

}
