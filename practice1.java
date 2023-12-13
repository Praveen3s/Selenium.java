package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class practice1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qaloginpage.ccbp.tech/");
		Thread.sleep(3000);
		WebElement usernameTxt = driver.findElement(By.id("username"));
		if(usernameTxt.isDisplayed()){
			if(usernameTxt.isEnabled()) {
				usernameTxt.sendKeys("rahul");
				String enteredTxt = usernameTxt.getAttribute("value");
				System.out.println(enteredTxt);
				Thread.sleep(3000);
		WebElement passwordTxt = driver.findElement(By.id("password"));
		
				passwordTxt.sendKeys("rahul@2023");
				String enter = passwordTxt.getAttribute("value");
				System.out.println(enteredTxt);
				Thread.sleep(3000);
				WebElement SubmitBut = driver.findElement(By.className("login-button"));
				SubmitBut.submit();
				Thread.sleep(10000);
	}
			else
				System.out.println("jyuugediu");
			String cururl = driver.getCurrentUrl();
			System.out.println("this my current url........"+cururl);
			if("https://qaloginpage.ccbp.tech/".equals(cururl)) {
				System.out.println("ur successfully login");
				
			}
			else
				System.err.println("ur not  login");
				
			driver.close();
		}
		}
}


			
