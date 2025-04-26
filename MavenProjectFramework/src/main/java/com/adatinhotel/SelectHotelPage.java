package com.adatinhotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {

	WebDriver driver;

	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement radiobtn;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement searchBtn;

	@FindBy(xpath = "//input[@id='cancel']")
	private WebElement cancelBtn;

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getContinueBtn() {
		return searchBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	public SelectHotelPage (WebDriver dri){
		driver=dri;
		PageFactory.initElements(driver, this);
	}
}
