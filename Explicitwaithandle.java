package com.testing;

import java.time.Duration;
import java.util.Set;import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwaithandle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		
		driver.get("https://github.com/");
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.linkText("Sign in")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		for (String windowhandle : windowhandles) {
			if(windowhandle.equals(parentwindow)) {
			
			driver.switchTo().window(windowhandle);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login_field")));
			driver.findElement(By.id("login_field")).sendKeys("Hyr tutorial");
			
		}
		

	}

}
}
