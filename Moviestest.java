package com.testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Moviestest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://qamoviesapp.ccbp.tech");
		driver.findElement(By.id("usernameInput")).sendKeys("rahul");
		driver.findElement(By.id("passwordInput")).sendKeys("rahul@2021");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//img[@class='poster']")));
		
		List<WebElement> appCount = driver.findElements(By.xpath("//img[@class='poster']/descendant-or-self::*"));
		System.out.println(appCount.size());
	}

}
