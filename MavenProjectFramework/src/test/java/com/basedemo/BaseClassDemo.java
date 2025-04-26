package com.basedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.Baseutils;

public class BaseClassDemo extends Baseutils {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Baseutils bs =new Baseutils();
		
		
		browserLaunch("chrome");
		urlLaunch("https://www.facebook.com/");
		//System.out.println(bs.getCurrentUrl());
		//Thread.sleep(2000);
		
		maximize();
				
		WebElement user = driver.findElement(By.id("email"));
		inputOnElement(user, "renuka@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("pass"));
		inputOnElement(pwd, "254215");
		
		WebElement button = driver.findElement(By.name("login"));
		clickOnElement(button);
		
		//navigateTo("https://www.amazon.in/");
		//System.out.println(bs.getCurrentUrl());
		Thread.sleep(2000);

		//navigateAction("back");
		//Thread.sleep(2000);
		
		//navigateAction("forward");
		
		System.out.println(getCurrentUrl());
		
		//isDisplayed()
		boolean val = isDisplay(driver.findElement(By.xpath("//button[@name='login']")));
		System.out.println(val);
		Thread.sleep(2000);
		
		//getAttribute()
		WebElement attribute = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		
		getAttribute(attribute,"src");
		
		System.out.println("src :" +attribute.getAttribute("src"));
		
		navigateTo("https://www.amazon.in/");
		maximize();
		
		Thread.sleep(2000);
		
		//ActionsClass
		
		WebElement amazonPay = driver.findElement(By.xpath("//a[@href='/gp/sva/dashboard?ref_=nav_cs_apay']"));
		actions(amazonPay, "clickandhold");
		
		Thread.sleep(2000);
		
		//navigateAction("back");
	}	
	
}
