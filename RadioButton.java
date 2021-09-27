package com.leafeground.playground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
	@Test
	public void testRadioButton() throws InterruptedException
	{
		 String path="C://webdriver//chromedriver.exe";
	     System.setProperty("webdriver.chrome.driver", path);
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://www.leafground.com/");
	     driver.manage().deleteAllCookies();
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//img[@alt='Radio Button']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//label[@for='yes']")).click();
	     Thread.sleep(2000);
	     String selectedRadio=driver.findElement(By.xpath("//label[@for='Checked']")).getText();
	     System.out.println("selected button is "+selectedRadio);
	    WebElement element=driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
	    boolean bool= element.isSelected();
	    System.out.println(bool);
	    if(bool==true)
	    {
	    	 Thread.sleep(2000);
		     driver.findElement(By.xpath("//img[@alt='logo Testleaf']")).click(); 
		     Thread.sleep(2000);
		     driver.quit();
	    }
	  
	     
	}

}
