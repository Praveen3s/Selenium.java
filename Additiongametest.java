package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Additiongametest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qaadditiongame.ccbp.tech/");
		driver.findElement(By.xpath("//input[@id='userInput']/preceding-sibling::span[4]"));
		//input[@id='userInput']/preceding-sibling::span[2]"
		driver.findElement(By.xpath("//input[@id='userInput']/preceding-sibling::span[2]"));
		driver.findElement(By.xpath("//input[@id='userInput']")).sendKeys("20");
		driver.findElement(By.xpath("//input[@id='userInput']/following-sibling::div[1]/child::button[1]")).click();
		driver.findElement(By.xpath("//input[@id='userInput']/following-sibling::p[1]"));
		String resultStatus = 
				//= 'Congratulations! You got it right.']"
		if
	}

}
