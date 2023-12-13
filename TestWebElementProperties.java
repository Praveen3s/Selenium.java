package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * How to get Tagname, HTML attribute value, text, CSS value using Selenium Webdriver?
 */

public class TestWebElementProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://github.com/login");
		//System.out.println(driver.findElement(By.name("commit")).getTagName());
		
//		System.out.println(driver.findElement(By.name("commit")).getAttribute("type"));
		
//		WebElement UsernameText = driver.findElement(By.id("login_field"));
//		UsernameText.sendKeys("test@gamil.com");
//		System.out.println(UsernameText.getAttribute("value"));
		
//		System.out.println(driver.findElement(By.xpath("//input[@id='login_field']/preceding-sibling::label")).getText());
		
		System.out.println(driver.findElement(By.name("commit")).getCssValue("background-color"));
		
		driver.quit();
		
		
		
	}

}
