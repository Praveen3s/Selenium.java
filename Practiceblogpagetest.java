package com.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practiceblogpagetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qabloglist.ccbp.tech/");
		List<WebElement> blogItems = driver.findElements(By.xpath("//li[@class='blog-item']"));
		System.out.println(blogItems.size());
		if (blogItems.size()== 5) {
			
		
			System.out.println("5 Blog Items found");
		}
		else {
			System.out.println("Mismatch Blog Items found");
		}
		List<WebElement> blogTitle = driver.findElements(By.xpath("//h1[@class='blog-title']"));
		System.out.println(blogTitle.size());
		if (blogTitle.size()==5) {
			System.out.println("5 Blog titles found");
		}
		else {
			System.out.println("Mismatch Blog titles count");
		}
		List<WebElement> blogDescription = driver.findElements(By.xpath("//p[@class='blog-description']"));
		System.out.println(blogDescription.size());
		if (blogDescription.size()==5)  {
			System.out.println("5 Blog Description found");
		}
		else {
			System.out.println("Mismatch Blog Description count");
		}
		driver.close();
		}
	}


