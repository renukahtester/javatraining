package com.adatinhotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItinerary {

	WebDriver driver;

	@FindBy(xpath = "//input[@value='Cancel Selected']")
	private WebElement cancelSelected;

	@FindBy(xpath = "//input[@id='search_hotel']")
	private WebElement searchHotel;

	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logout;

	public WebElement getCancelSelected() {
		return cancelSelected;
	}

	public WebElement getSearchHotel() {
		return searchHotel;
	}

	public WebElement getLogout() {
		return logout;
	}
	public BookedItinerary(WebDriver dri){
		driver =dri;
		PageFactory.initElements(driver, this);
	}
}
