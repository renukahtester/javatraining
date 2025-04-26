package com.page.manager;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseutils;
import com.property.reader.ConfigurationReader;

import adactin_Testng.*;



public class PageManager extends Baseutils{

	/*
	 * Page object it will be manage page object model
	 * step 1 : Declare the page model class as a private
	 * step 2 : generate getter
	 * step 3 : Create object for page object model inside the getter methods
	 * step 4 : Declare the driver
	 * step 5 : Create constructor and assign the driver
	 */

	WebDriver driver;

	public PageManager(WebDriver dri){
		driver=dri;
		PageFactory.initElements(driver, this);
	}
	private BookAHotelPage bhp;
	private LoginPage lp;
	private SearchPage sp;
	private SelectHotelPage sel;
	private BookedItinerary bi;
	private BookingConfirmPage conf;
	private ConfigurationReader cr;


	public SearchPage getSp() {
		sp = new SearchPage(driver);
		return sp;
	}

	public SelectHotelPage getSel() {
		sel = new SelectHotelPage(driver);
		return sel;
	}

	public BookedItinerary getBi() {
		bi = new BookedItinerary(driver);
		return bi;
	}

	public BookingConfirmPage getConf() {
		conf = new BookingConfirmPage(driver);
		return conf;
	}

	public BookAHotelPage getBh() {
		bhp = new BookAHotelPage(driver);
		return bhp;
	}
	public LoginPage getLp() {
		lp = new LoginPage(driver);
		return lp;
	}

	public ConfigurationReader getCr() throws IOException {
		cr = new ConfigurationReader();
		return cr;
	}
}




