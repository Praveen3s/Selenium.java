package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class textboxes {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		WebElement usernameTxt = driver.findElement(By.id("login_field"));
		if(usernameTxt.isDisplayed()){
			if(usernameTxt.isEnabled()) {
				usernameTxt.sendKeys("HYR");
				String enteredTxt = usernameTxt.getAttribute("value");
				System.out.println(enteredTxt);
				Thread.sleep(3000);
				usernameTxt.clear();
			}
			else
				System.err.println("username textbox is not enabled");
		}
		else
			System.err.println("username textbox is not displayed");
		String cururl = driver.getTitle();
		System.out.println("this my current url........"+cururl);
		if("https://github.com/login78".equals(cururl)) {
			System.out.println("ur successfully login");
			
		}
		else
			System.err.println("ur not  login");
			
		driver.close();
		
	 }
	
}
