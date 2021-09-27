package com.leafeground.playground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CheckBox {
	@Test
	public void testCheckBoc() throws InterruptedException
	{
	 String path="C://webdriver//chromedriver.exe";
     System.setProperty("webdriver.chrome.driver", path);
     WebDriver driver=new ChromeDriver();
     driver.get("http://www.leafground.com/");
     driver.manage().deleteAllCookies();
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//img[@alt='Checkbox']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
     Thread.sleep(2000);
     boolean selectedCheckbox=driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected();
     System.out.println("is checkbox is selected :"+selectedCheckbox);
     Thread.sleep(2000);
     boolean bool= driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).isSelected();
     System.out.println(bool);
     if(bool==true)
     {
    	 driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click(); 
     }
     Thread.sleep(2000 );
     List<WebElement> allCheckboxes= driver.findElements(By.xpath("//input[@type='checkbox']"));
    for(int i=8;i<=allCheckboxes.size()-1;i++)
    {
    	allCheckboxes.get(i).click();
    }
    Thread.sleep(2000 ); driver.findElement(By.xpath("//img[@alt='logo Testleaf']")).click();
	Thread.sleep(5000);
     driver.quit();

}
}
