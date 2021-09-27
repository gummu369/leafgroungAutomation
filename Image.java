package com.leafeground.playground;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Image {
@Test
public void testImage() throws InterruptedException
{
	 String path="C://webdriver//chromedriver.exe";
     System.setProperty("webdriver.chrome.driver", path);
     WebDriver driver=new ChromeDriver();
     driver.get("http://www.leafground.com/");
     driver.manage().deleteAllCookies();
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//img[@alt='Images']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
     driver.findElement(By.xpath("//img[@alt='Images']")).click();
     Thread.sleep(2000);
     List<WebElement>  imageList=driver.findElements(By.tagName("img"));
     for(WebElement image:imageList)
     {
    	 if (image.getAttribute("naturalWidth").equals("0"))
    	 {
    	 	System.out.println(image.getAttribute("outerHTML") + " is broken.");
    	 }
     }
     Thread.sleep(2000);
     WebElement element1=driver.findElement(By.xpath("//img[@src='../images/keyboard.png']"));
     Actions action=new Actions(driver);
     action.moveToElement(element1).click();
     Thread.sleep(2000);
     driver.quit();
}
}
