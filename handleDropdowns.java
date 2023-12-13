package com.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleDropdowns {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		 Thread.sleep(3000);
//		 WebElement courseElement = driver.findElement(By.id("course"));
//		 Select courseNameDropdown = new Select(courseElement);
//		 List<WebElement> courseNameDropdownOptions = courseNameDropdown.getOptions();
//		 for (WebElement option : courseNameDropdownOptions) {  // SELECT ALL OPTIONS IN CONSOLE
//			 System.out.println(option.getText());
//		 }
//		 courseNameDropdown.selectByIndex(2); //Dotnet
//		 Thread.sleep(3000);
//		 courseNameDropdown.selectByValue("js"); //Javascript
//		 Thread.sleep(3000);
//		 courseNameDropdown.selectByVisibleText("Dot Net"); //dotnet
//		 Thread.sleep(3000);
//		  String selectedText = courseNameDropdown.getFirstSelectedOption().getText();
//		  System.out.println("Selected visible text -" + selectedText);
		 WebElement ideElement = driver.findElement(By.id("ide"));
		 Select ideDropdown = new Select(ideElement);
		 List<WebElement> ideDropdownOptions = ideDropdown.getOptions();
		 for (WebElement option : ideDropdownOptions) {  
			 System.out.println(option.getText());
		 }
		 ideDropdown.selectByIndex(0); //Eclipse
		 Thread.sleep(3000);
		 ideDropdown.selectByValue("ij"); //IntelliJ IDEA
		 Thread.sleep(3000);
		 ideDropdown.selectByVisibleText("NetBeans"); //NetBeans
		 Thread.sleep(3000);
		
		 ideDropdown.deselectByVisibleText("IntelliJ IDEA");
		 
		 List<WebElement> selectedOptions = ideDropdown.getAllSelectedOptions();
		 for (WebElement selectedOption : selectedOptions) {
			 System.out.println("Selected visible text - " +selectedOption.getText());
		 }
		  
	}

}
