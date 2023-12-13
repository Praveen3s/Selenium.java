package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class practice2usinglinks {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qabloglist.ccbp.tech/");
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(3000);
		String CurUrl = driver.getCurrentUrl();
		System.out.println("this is my curren url" + CurUrl);
		if ("https://qabloglist.ccbp.tech/about".equals(CurUrl)) {
			System.out.println("Navigated to About Page");
		}
		else
			System.out.println("Navigated to About Page failed");
		
		driver.findElement(By.linkText("Contact")).click();
		Thread.sleep(3000);
		String cururl = driver.getCurrentUrl();
		System.out.println("this is my contact current url" + cururl);
		if("https://qabloglist.ccbp.tech/contact".equals(cururl)){
			System.out.println("Navigated to Contact Page");
			
		}
		else
			System.out.println("Navigated to Contact Page failed");
		
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(3000);
		String Cururl = driver.getCurrentUrl();
		System.out.println("this is my contact current url" + Cururl);
		if("https://qabloglist.ccbp.tech/".equals(Cururl)) {
			System.out.println("Navigated to Home Page");
		}
		else
			System.out.println("Navigated to Home Page failed");
			
		driver.quit();
	}

}
