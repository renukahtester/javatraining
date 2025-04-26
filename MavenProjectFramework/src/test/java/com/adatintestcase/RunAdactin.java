package com.adatintestcase;

import java.io.IOException;

import com.adatinhotel.BookAHotelPage;
import com.adatinhotel.BookedItinerary;
import com.adatinhotel.BookingConfirmPage;
import com.adatinhotel.LoginPage;
import com.adatinhotel.SearchPage;
import com.adatinhotel.SelectHotelPage;
import com.baseclass.Baseutils;

public class RunAdactin extends Baseutils {

	public static void main(String[] args) throws InterruptedException, IOException {

		browserLaunch("chrome");

		urlLaunch("https://adactinhotelapp.com/index.php");

		maximize();
		Thread.sleep(2000);

		LoginPage lp = new LoginPage(driver);	

		inputOnElement(lp.getUser(),"Renuka2024");

		inputOnElement(lp.getPassword(), "3B4989");

		clickOnElement(lp.getLoginBtn());

		//navigateTo("https://adactinhotelapp.com/SearchHotel.php");

		SearchPage sp = new SearchPage(driver);

		dropDownSelect(sp.getLocation(),"value", "London");

		dropDownSelect(sp.getHotels(),"value", "Hotel Sunshine");
		dropDownSelect(sp.getRoomType(),"value", "Super Deluxe");
		dropDownSelect(sp.getNo_of_Rooms(),"index", "2");

		inputOnElement(sp.getCheck_in_Date(),"20/12/2024");
		inputOnElement( sp.getCheck_out_Date(),"25/12/2024");

		dropDownSelect(sp.getAdult_per_Room(),"index", "3");
		dropDownSelect(sp.getChildren_per_Room(),"index", "2");

		sp.getSearch().click(); 

		//navigateTo("https://adactinhotelapp.com/SelectHotel.php");

		SelectHotelPage sel =new SelectHotelPage(driver);

		sel.getRadiobtn().click();

		sel.getContinueBtn().click();

		//navigateTo("https://adactinhotelapp.com/BookHotel.php");

		BookAHotelPage bp = new BookAHotelPage(driver);

		inputOnElement(bp.getFirstName(), "Karthic");

		inputOnElement(bp.getLastName(), "Kumar");

		inputOnElement(bp.getBillingAddress(), "House no:534 Second Floor, Bangalore, Pincode:3676434");

		inputOnElement(bp.getCreditCardNo(), "6794647000007647");

		dropDownSelect(bp.getCreditCardType(), "value", "MAST");

		dropDownSelect(bp.getExpiryMonth(), "value", "6");

		dropDownSelect(bp.getExpiryYear(), "visibletext", "2030");

		inputOnElement(bp.getCvvNumber(), "4525");

		bp.getBookNow().click();

		Thread.sleep(3000);
		
		BookingConfirmPage conf = new BookingConfirmPage(driver);
		
		javaSriptExecutor(0,2000);
		Thread.sleep(2000);
		
		conf.getMyItinerary().click();
		
		takesScreenShot("adatin");
		
		BookedItinerary bi = new BookedItinerary(driver);
		
		bi.getLogout().click();
		
	}
}

