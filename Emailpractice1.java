package com.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Emailpractice1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://qaotploginpage.ccbp.tech");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("example@gmail.com");
		System.out.println("Email address entered");
		driver.findElement(By.xpath("//button[text()='Send OTP']")).click();
		String CurTitle = driver.getTitle();
		String ExpTitle = "OTP Verification";
				if(ExpTitle.equals(CurTitle)) {
					System.out.println("Otp sent successfully");
					
				}
				System.out.println(driver.getCurrentUrl()+ "1");
				driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("123456");
				System.out.println("Otp entered");
				driver.findElement(By.xpath("//button[@id='verifyOtpBtn']")).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='home-heading']")));
				
				Thread.sleep(3000);
					String CurUrl = driver.getCurrentUrl();
					String ExpUrl = "https://qaotploginpage.ccbp.tech/home";
					System.out.println(CurUrl);
					System.out.println(ExpUrl);
					if(CurUrl.equals(ExpUrl)) {
						System.out.println("Logged in successfully");
					 } else {
				            System.out.println("Login failed");
					}
					driver.close();
	}

}
