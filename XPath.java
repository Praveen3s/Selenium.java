package com.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class XPath {
	private static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		chapter7();
		
	}	
	
//		public static void highlight(WebElement element) {
//			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//			jsExecutor.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:yellow')",element);

	public static void highlight(WebElement element) {
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	    jsExecutor.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:yellow')", element);
	}


		// Types of Xpath
		      	// Absolute Xpath
//		public static void chapter2() {
//			driver.get("https://www.w3schools.com/");
//			highlight(driver.findElement(By.xpath("/html/body/div[2]/div[1]/nav[1]/a[2]")));
//		}
				// Realtive Xpath
//		public static void chapter3() {
//			driver.get("https://www.w3schools.com/");
//			driver.findElement(By.xpath("//a[@title='Login to your account']")).click();
//		}
//	public static void chapter3() {
//		driver.get("https://www.w3schools.com/");
//		highlight(driver.findElement(By.xpath("//h3[@class='learntocodeh3']")));
//	}
	//h3[@class='tnb-nav-section-title']
//	public static void chapter4() {
//		driver.get("https://www.w3schools.com/");
//		highlight(driver.findElement(By.xpath("	//h3[@class='tnb-nav-section-title']")));
//	}
	//Xpath Operators
//	public static void chapter4() {
//		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		
////		driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("test");
//////		driver.findElement(By.xpath("//input[@maxlength!='10']")).sendKeys("test2");
////		driver.findElement(By.xpath("//input[@maxlength<='10']")).sendKeys("test3");
////		driver.findElement(By.xpath("//input[@maxlength>='10']")).sendKeys("test4");
////		driver.findElement(By.xpath("//input[@maxlength='15']")).sendKeys("test5");
////		driver.findElement(By.xpath("//input[@maxlength>=10]")).sendKeys("test");	
//	}
	//Xpath CONDITIONS
//	public static void chapter5() {
////		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
////		driver.findElement(By.xpath("//input[@maxlength<15 and @name ='name']"));
////		driver.findElement(By.xpath("//input[@maxlength=10 or @name ='nametyfyfyt']"));
////		//input[not(@maxlength=10)]
//	List<WebElement> elements = driver.findElements(By.xpath("//input[not(@maxlength=10)]"));
//		System.out.println(elements.size());
//	}
	//Xpath Index
//	public static void chapter5() {
//		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
////		highlight(driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr[2]")));
//		highlight(driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr/td[2]")));
//		
//	}
	//xpath Functions
	// text()
//	public static void chapter6() {
//		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		highlight(driver.findElement(By.xpath("//a[text()='Sign in']")));
//		highlight(driver.findElement(By.xpath("//h1[text()='Register']")));
		// contains
//		highlight(driver.findElement(By.xpath("//a[contains(text(),'into account')]")));
		
//		highlight(driver.findElement(By.xpath("//div[contains(@class,'signin')]")));
		// starts with
//		highlight(driver.findElement(By.xpath("//a[starts-with(text(),'Sign in into')]")));
//	}
//	public static void chapter6() {
//		driver.get("https://github.com/login");
//		highlight(driver.findElement(By.xpath("//label[normalize-space(text())='Username or email address']")));
//	      // last () function
//		highlight(driver.findElement(By.xpath("(//table[@id=\"contactList\"]/tbody/tr)[last()]")));
		    // position
//		highlight(driver.findElement(By.xpath("(//table[@id=\"contactList\"]/tbody/tr)[position()=4]")));
//	}
		// xpath Axes
	// following sibling
	public static void chapter7() {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		highlight(driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']")));
		// preceding sibling and chid
		driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input")).click();
		// parent
		highlight(driver.findElement(By.xpath("//td[text()='Yoshi Tannamuri']/parent::tr")));
	}
	
}
