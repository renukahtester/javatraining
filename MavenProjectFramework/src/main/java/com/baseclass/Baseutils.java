package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseutils {

	public static WebDriver driver;

	public static void browserLaunch(String browser) {

		try {
			if (browser.equalsIgnoreCase("chrome")) {

				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			}
			else if (browser.equalsIgnoreCase("edge")) {

				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();

			}
			else if(browser.equalsIgnoreCase("firefox")) {

				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();

			}
			else {

				System.out.println("Invalid Driver");
			} 

		}catch(Exception ex) {
			System.out.println(ex);

		}
	}
	public static void urlLaunch(String url) {

		driver.get(url);
	}
	public static void maximize() {

		driver.manage().window().maximize();
	}
	public static void inputOnElement(WebElement element, String data) {

		element.sendKeys(data);
	}
	public static void clickOnElement(WebElement ele) {

		ele.click();
	}
	public static void close() {

		driver.close();
	}
	public static void quit() {

		driver.quit();
	}
	public static void navigateTo(String url) {

		driver.navigate().to(url);
	}	
	public static void navigateAction(String action) {

		if (action.equalsIgnoreCase("back")){

			driver.navigate().back();

		}else if (action.equalsIgnoreCase("forward")) {

			driver.navigate().forward();

		}else if (action.equalsIgnoreCase("refresh")) {

			driver.navigate().refresh();

		}else  {
			System.out.println("Invalid Method");
		}
	}
	//getCurrentUrl()
	public static String getCurrentUrl() {

		return driver.getCurrentUrl();
	}
	//singleDropDown()
	public static void dropDownSelect(WebElement ele , String option, String value) {

		Select s =new Select(ele);

		if(option.equalsIgnoreCase("index")) {

			int indx = Integer.parseInt(value);

			s.selectByIndex(indx);
		}
		else if (option.equalsIgnoreCase("value")) {

			s.selectByValue(value);
		}
		else if(option.equalsIgnoreCase("visibleText")) {

			s.selectByVisibleText(value);
		}
	}
	public static void actions(WebElement ele, String value) {

		Actions a =new Actions(driver);

		if (value.equalsIgnoreCase("click")) {
			a.click(ele).build().perform();
		}
		else if(value.equalsIgnoreCase("clickAndHold")) {
			a.clickAndHold(ele).build().perform();
		}
		else if(value.equalsIgnoreCase("contextClick")) {
			a.contextClick(ele).build().perform();
		}
		else if(value.equalsIgnoreCase("doubleClick")) {
			a.doubleClick(ele).build().perform();
		}
		else if(value.equalsIgnoreCase("moveToElement")) {
			a.moveToElement(ele).build().perform();
		}
	}
	public static void dragAndDrop (WebElement src, WebElement target){

		Actions a =new Actions(driver);

		a.dragAndDrop(src, target).build().perform();
	}
	public static boolean isDisplay (WebElement ele) {

		return ele.isDisplayed();
	}
	public static void get(String url) {

		driver.get(url);
	}
	public static boolean isEnable(WebElement ele) {

		return ele.isEnabled();
	}
	public static void isSelected(WebElement ele , String value) {

		ele.isSelected();
	}
	public static void getOptions(WebElement ele) {

		Select s = new Select(ele);
		s.getOptions();
	}
	public static String getAttribute(WebElement ele, String value) {

		String returnValue = ele.getAttribute(value);
		return returnValue;
	}
	public static void robot(WebElement ele,  String key) throws AWTException {

		Robot r =new Robot();
		if (key.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		else if (key.equalsIgnoreCase("up")){
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP); 
		}
		else if (key.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
		}
	}
	public static void radiobtn(WebElement ele) {

		ele.click();
	}
	public static void javaSriptExecutor(int up, int down) {

		JavascriptExecutor js =(JavascriptExecutor)driver;

		js.executeScript("window.scrollBy("+up +"," +down +")");
	}

	//js.executeScript("window.scrollBy(0,-5000)");
	//js.executeScript("window.scrollBy(0,2000)");

	/*if (option.equalsIgnoreCase("down")) {
		}
		else if (option.equalsIgnoreCase("up"))
		{
			js.executeScript("window.scrollBy(0,-5000)");	
		}
		else if(WebElement ele) {
    	js.executeScript("arguments[0].scrollIntoView();", ele);
    }*/

	public static void takesScreenShot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File loc = new File("D:\\Renuka\\Greens\\EW\\MavenProjectFramework\\src\\screenshot\\"+name+".png");
		FileHandler.copy(src, loc);
	}
}
