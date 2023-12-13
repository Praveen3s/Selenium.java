package com.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiceemail {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qaotploginpage.ccbp.tech");
		driver.findElement(By.id("email")).sendKeys("example@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.className("send-otp-btn")).click();
		String CurTitle= driver.getTitle();
		System.out.println("OTP Verification"+ CurTitle);
		String ExpTitle  = "OTP Verification";
		if (CurTitle.equals(ExpTitle)) {
			System.out.println("OTP sent successfully");
		}
		System.out.println("otp printed");	
		driver.findElement(By.id("otp")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.id("verifyOtpBtn"));
		Thread.sleep(10000);
		String Cururl = driver.getCurrentUrl();
		System.out.println("this my currenturl" + Cururl);
		//System.out.println("this my current url....");
		if ("https://qaotploginpage.ccbp.tech/otp".equals(Cururl)) {
			System.out.println("Logged in succesfully");
		}
		
		driver.quit();
	}
	

}
