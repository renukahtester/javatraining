package adactin_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPage {

	WebDriver driver;

	@FindBy(xpath = "//input[@id='search_hotel']")
	private WebElement searchHotels;

	@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement myItinerary;

	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logout;

	public WebElement getSearchHotels() {
		return searchHotels;
	}

	public WebElement getMyItinerary() {
		return myItinerary;
	}

	public WebElement getLogout() {
		return logout;
	}

	public BookingConfirmPage(WebDriver dri) {
		driver = dri;
		PageFactory.initElements(driver, this);
	}

}
