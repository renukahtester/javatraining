package com.adatintestcase;

import java.io.IOException;

import com.adatinhotel.LoginPage;
import com.baseclass.Baseutils;
import com.pagemanager.PageManager;
import com.propertyfilereader.ConfigurationReader;
import com.propertyfilereader.SingletonDesignPattern;

public class Runner extends Baseutils{

	public static void main(String[] args) throws IOException, InterruptedException {

		browserLaunch("chrome");

		ConfigurationReader cr = new ConfigurationReader();
		//SingletonDesignPattern sdp = new SingletonDesignPattern();

		urlLaunch(cr.url());
		maximize();

		PageManager pm = new PageManager(driver);
		//LoginPage
		inputOnElement(pm.getLp().getUser(),SingletonDesignPattern.crReader().userName());
		inputOnElement(pm.getLp().getPassword(), cr.password());
		pm.getLp().getLoginBtn().click();
		//SearchPage
		dropDownSelect(pm.getSp().getLocation(),"value", "London");
		dropDownSelect(pm.getSp().getHotels(), "value", "Hotel Sunshine");
		dropDownSelect(pm.getSp().getRoomType(), "value", "Super Deluxe");
		dropDownSelect(pm.getSp().getNo_of_Rooms(), "index", "2");
		inputOnElement(pm.getSp().getCheck_in_Date(), "01/01/2025");
		inputOnElement(pm.getSp().getCheck_out_Date(), "05/01/2025");
		dropDownSelect(pm.getSp().getAdult_per_Room(), "index", "3");
		dropDownSelect(pm.getSp().getChildren_per_Room(), "index", "2");
		pm.getSp().getSearch().click();
		//SelectHotelPage
		pm.getSel().getRadiobtn().click();
		pm.getSel().getContinueBtn().click();
		//BookAHotelPage
		inputOnElement(pm.getBh().getFirstName(), "Renuka");
		inputOnElement(pm.getBh().getLastName(), "Karthic");
		inputOnElement(pm.getBh().getBillingAddress(), cr.address());
		inputOnElement(pm.getBh().getCreditCardNo(), cr.ccnum());
		dropDownSelect(pm.getBh().getCreditCardType(), "value", "MAST");
		dropDownSelect(pm.getBh().getExpiryMonth(), "value", "6");
		dropDownSelect(pm.getBh().getExpiryYear(), "visibletext", "2029");
		inputOnElement(pm.getBh().getCvvNumber(),cr.cvvnum());
		pm.getBh().getBookNow().click();
		Thread.sleep(3000);
		//BookingConfirmPage
		javaSriptExecutor(0,500);
		Thread.sleep(2000);
		pm.getConf().getMyItinerary().click();
		takesScreenShot("adatinbooking");
		//BookedItinerary
		pm.getBi().getLogout().click();
		Thread.sleep(3000);
		quit();
	}
}
