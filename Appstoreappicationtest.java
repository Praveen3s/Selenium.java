package com.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Appstoreappicationtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qaappstore.ccbp.tech");
		driver.findElement(By.xpath("//button[text()='Social']")).click();
		List<WebElement> appCount = driver.findElements(By.xpath("//li[@class='app-item']"));
		System.out.println(appCount.size());
		if(appCount.size()==10) {
			System.out.println("Social apps count is correct");
		}
		else {
			System.out.println("Social apps count is incorrect");
		}
		driver.findElement(By.xpath("//button[text()='Games']")).click();
		List<WebElement> appCount2 = driver.findElements(By.xpath("//li[@class='app-item']"));
		System.out.println(appCount2.size());
		if(appCount2.size()==10) {
			System.out.println("Gaming apps count is correct");
		}
		else {
			System.out.println("Gaming apps count is incorrect");
		}
		driver.findElement(By.xpath("//button[text()='News']")).click();
		List<WebElement> appCount3 = driver.findElements(By.xpath("//li[@class='app-item']"));
		System.out.println(appCount3.size());
		if(appCount3.size()==10) {
			System.out.println("News apps count is correct");
		}
		else {
			System.out.println("News apps count is incorrect");
		}
		driver.findElement(By.xpath("//button[text()='Food']")).click();
		List<WebElement> appCount4 = driver.findElements(By.xpath("//li[@class='app-item']"));
		System.out.println(appCount4.size());
		if(appCount4.size()==10) {
			System.out.println("Food apps count is correct");
		}
		else {
			System.out.println("Food apps count is incorrect");
		}
		// Test the search functionality
		driver.findElement(By.xpath("//button[text()='News']")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("News");
		
		List<WebElement> appCount5 = driver.findElements(By.xpath("//li[@class='app-item']"));
		
		System.out.println(appCount5.size());
		if(appCount5.size()==7) {
			System.out.println("News apps count is correct");
		}
			else {
				System.out.println("News apps count is incorrect");
			}
		int Count= 0;
		for (WebElement each : appCount5) {
			System.out.println(each.getText());
			String EachApp = each. getText();
			if(EachApp. contains("News" )){
			Count++;
			}
			}
		System.out.println(Count);
		if(Count==appCount5.size()) {
			System.out.println("Search functionality is as expected");
		}
		else {
			System.out.println("Search functionality is  not as expected");
		}
				
			
		}
	}


