package com.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practicexpaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://qaebank.ccbp.tech/ebank/login");
		driver.findElement(By.xpath("//input[@id='userIdInput']")).sendKeys("praveen3s");
		System.out.println("Username entered");
		driver.findElement(By.xpath("//input[@id='pinInput']")).sendKeys("12345678");
		System.out.println("Password entered");
		driver.findElement(By.xpath("//button[text()='Login']")).submit();
		System.out.println("Submitted login details");
		String CurrUr = driver.getCurrentUrl();
		System.out.println("this is curretn url" + CurrUr);
		String ExpUrl = "https://qaebank.ccbp.tech/";
		if (ExpUrl.equals(CurrUr)) {
			System.out.println("Logged in successfully");	
		}
		
		
	}

}
