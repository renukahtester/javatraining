package com.adatinhotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	WebDriver driver;

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement roomType;

	@FindBy(id = "room_nos")
	private WebElement no_of_Rooms;

	@FindBy(id = "datepick_in")
	private WebElement check_in_Date;

	@FindBy(id = "datepick_out")
	private WebElement check_out_Date;

	@FindBy(id = "adult_room")
	private WebElement adult_per_Room;

	@FindBy(id = "child_room")
	private WebElement children_per_Room;

	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement search;

	@FindBy(xpath =  "//input[@id='Reset']")
	private WebElement reset;

	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNo_of_Rooms() {
		return no_of_Rooms;
	}

	public WebElement getCheck_in_Date() {
		return check_in_Date;
	}

	public WebElement getCheck_out_Date() {
		return check_out_Date;
	}

	public WebElement getAdult_per_Room() {
		return adult_per_Room;
	}

	public WebElement getChildren_per_Room() {
		return children_per_Room;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getReset() {
		return reset;
	}

	public SearchPage (WebDriver dri){
		driver=dri;
		PageFactory.initElements(driver, this);
	}
}