package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class howtohandleframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("text1");
		
		driver.switchTo().frame("frm3");
		driver.findElement(By.id("name")).sendKeys("text2");
		
		driver.switchTo().frame("frm1");
		Select courseNmae_ddSelect = new Select(driver.findElement(By.id("course")));
		courseNmae_ddSelect.selectByVisibleText("Python");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("Praveen");
		driver.findElement(By.id("lastName")).sendKeys("Reddy");
		driver.findElement(By.id("femalerb")).click();
		driver.findElement(By.id("englishchbx")).click();
		driver.findElement(By.id("email")).sendKeys("Praveen808008@gmail.com");

		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("text2");
		
	}

}
