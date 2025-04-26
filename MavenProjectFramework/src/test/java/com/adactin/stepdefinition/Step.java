package com.adactin.stepdefinition;

import java.io.IOException;

import com.adactin.runner.Runnerfile;
import com.pagemanager.PageManager;
import com.propertyfilereader.SingletonDesignPattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step extends Runnerfile {
	PageManager pm = new PageManager(driver);

	@Given("User launch the application by using URL.")
	public void userLaunchTheApplicationByUsingURL() throws InterruptedException, IOException {
		PageManager pm = new PageManager(driver);
		urlLaunch(pm.getCr().url());
		Thread.sleep(1000);
	}

	@When("User enter username in inputfield.")
	public void userEnterUsernameInInputfield() throws IOException {
		inputOnElement(pm.getLp().getUser(), pm.getCr().userName());

	}

	@When("User enter password in inputfield.")
	public void userEnterPasswordInInputfield() throws IOException {
		inputOnElement(pm.getLp().getPassword(), pm.getCr().password());
	}

	@Then("Clicking login button.")
	public void clickingLoginButton() {
		pm.getLp().getLoginBtn().click();
	}

	@When("Selecting location using dropdown button.")
	public void selectingLocationUsingDropdownButton() {
		dropDownSelect(pm.getSp().getLocation(), "value", "London");
	}

	@When("Selecting hotels using dropdown button.")
	public void selectingHotelsUsingDropdownButton() {
		dropDownSelect(pm.getSp().getHotels(), "value", "Hotel Sunshine");
	}

	@When("Selecting Room-type using dropdown button.")
	public void selectingRoomTypeUsingDropdownButton() {
		dropDownSelect(pm.getSp().getRoomType(), "value", "Super Deluxe");
	}

	@When("Selecting No.of.rooms using dropdown button.")
	public void selectingNoOfRoomsUsingDropdownButton() {
		dropDownSelect(pm.getSp().getNo_of_Rooms(), "index", "2");
	}

	@When("User enter Check-in-date in input field.")
	public void userEnterCheckInDateInInputField() {
		inputOnElement(pm.getSp().getCheck_in_Date(), "01/01/2025");
	}

	@When("User enter Check-out-date in input field.")
	public void userEnterCheckOutDateInInputField() {
		inputOnElement(pm.getSp().getCheck_out_Date(), "05/01/2025");
	}

	@When("Selecting Adults-per-room using dropdown button.")
	public void selectingAdultsPerRoomUsingDropdownButton() {
		dropDownSelect(pm.getSp().getAdult_per_Room(), "index", "3");
	}

	@When("Selecting Children-per-room using dropdown button.")
	public void selectingChildrenPerRoomUsingDropdownButton() {
		dropDownSelect(pm.getSp().getChildren_per_Room(), "index", "2");
	}

	@Then("User click the search button.")
	public void userClickTheSearchButton() {
		pm.getSp().getSearch().click();
	}

	@When("User click the radio button to select the hotel.")
	public void userClickTheRadioButtonToSelectTheHotel() {
		pm.getSel().getRadiobtn().click();
	}

	@Then("User click on the continue button.")
	public void userClickOnTheContinueButton() {
		pm.getSel().getContinueBtn().click();
	}

	@When("First name is given in input field.")
	public void firstNameIsGivenInInputField() {
		inputOnElement(pm.getBh().getFirstName(), "Renuka");
	}

	@When("Last name is given in the input field.")
	public void lastNameIsGivenInTheInputField() {
		inputOnElement(pm.getBh().getLastName(), "Karthic");
	}

	@When("Billing address is given in input field.")
	public void billingAddressIsGivenInInputField() throws IOException {
		inputOnElement(pm.getBh().getBillingAddress(), pm.getCr().address());
	}

	@When("Credit card no is given in input field.")
	public void creditCardNoIsGivenInInputField() throws IOException {
		inputOnElement(pm.getBh().getCreditCardNo(), pm.getCr().ccnum());
	}

	@When("Selecting Credit card type using dropdown button.")
	public void selectingCreditCardTypeUsingDropdownButton() {
		dropDownSelect(pm.getBh().getCreditCardType(), "value", "MAST");
	}

	@When("Selecting Expiry month using dropdown button.")
	public void selectingExpiryMonthUsingDropdownButton() {
		dropDownSelect(pm.getBh().getExpiryMonth(), "value", "6");
	}

	@When("Selecting Expiry year using dropdown button.")
	public void selectingExpiryYearUsingDropdownButton() {
		dropDownSelect(pm.getBh().getExpiryYear(), "visibletext", "2029");
	}

	@When("User enter CVV no in the input field.")
	public void userEnterCVVNoInTheInputField() throws IOException {
		inputOnElement(pm.getBh().getCvvNumber(), pm.getCr().cvvnum());
	}

	@Then("User click book now button.")
	public void userClickBookNowButton() throws InterruptedException {
		pm.getBh().getBookNow().click();
		Thread.sleep(3000);
	}

	@When("User click on the MyItinerary button.")
	public void userClickOnTheMyItineraryButton() throws InterruptedException, IOException {
		javaSriptExecutor(0, 500);
		Thread.sleep(2000);
		pm.getConf().getMyItinerary().click();
		takesScreenShot("adatinbookingCum");
	}

	@When("User click on logout button.")
	public void userClickOnLogoutButton() throws InterruptedException {
		pm.getBi().getLogout().click();
		Thread.sleep(2000);
	}
}
