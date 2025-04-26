package com.adactin.stepfile;

import java.io.IOException;

import com.adactin.runner.Runnerfile;
import com.pagemanager.PageManager;
import com.propertyfilereader.SingletonDesignPattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepfile extends Runnerfile {
	PageManager pm = new PageManager(driver);

	@Given("User launch the application by using URL")
	public void user_launch_the_application_by_using_url() throws IOException, InterruptedException {
		
		urlLaunch(SingletonDesignPattern.crReader().url());
		Thread.sleep(1000);
	}

	@When("User enter the username in the username field.")
	public void user_enter_the_username_in_the_username_field() throws IOException {
		inputOnElement(pm.getLp().getUser(), pm.getCr().userName());

	}

	@When("User enter the password in the password field.")
	public void user_enter_the_password_in_the_password_field() throws IOException {
		inputOnElement(pm.getLp().getPassword(), pm.getCr().password());

	}

	@Then("Click the LoginButton.")
	public void click_the_login_button() {
		pm.getLp().getLoginBtn().click();

	}

	@When("Selecting location in the location field using dropdown button.")
	public void selecting_location_in_the_location_field_using_dropdown_button() {
		dropDownSelect(pm.getSp().getLocation(), "value", "London");
	}

	@When("Selecting hotels in the hotel field using dropdown button.")
	public void selecting_hotels_in_the_hotel_field_using_dropdown_button() {
		dropDownSelect(pm.getSp().getHotels(), "value", "Hotel Sunshine");

	}

	@When("Selecting Room type in the Room type field using dropdown button.")
	public void selecting_room_type_in_the_room_type_field_using_dropdown_button() {
		dropDownSelect(pm.getSp().getRoomType(), "value", "Super Deluxe");

	}

	@When("Selecting No.of.Rooms in the No.of.Rooms field using dropdown button.")
	public void selecting_no_of_rooms_in_the_no_of_rooms_field_using_dropdown_button() {
		dropDownSelect(pm.getSp().getNo_of_Rooms(), "index", "2");

	}

	@When("User enter Check-in-Date in the input field.")
	public void user_enter_check_in_date_in_the_input_field() {
		inputOnElement(pm.getSp().getCheck_in_Date(), "01/01/2025");

	}

	@When("User enter Check-out-Date in the input field.")
	public void user_enter_check_out_date_in_the_input_field() {
		inputOnElement(pm.getSp().getCheck_out_Date(), "05/01/2025");

	}

	@When("Selecting Adults-per-Room in the input field using dropdown button.")
	public void selecting_adults_per_room_in_the_input_field_using_dropdown_button() {
		dropDownSelect(pm.getSp().getAdult_per_Room(), "index", "3");

	}

	@When("Selecting Children-per-Room in the input field using dropdown button.")
	public void selecting_children_per_room_in_the_input_field_using_dropdown_button() {
		dropDownSelect(pm.getSp().getChildren_per_Room(), "index", "2");

	}

	@Then("Now user click the search button.")
	public void now_user_click_the_search_button() {
		pm.getSp().getSearch().click();

	}

	@When("Now user click the radio button to select the hotel.")
	public void now_user_click_the_radio_button_to_select_the_hotel() {
		pm.getSel().getRadiobtn().click();

	}

	@Then("User now click on the continue button.")
	public void user_now_click_on_the_continue_button() {
		pm.getSel().getContinueBtn().click();

	}

	@When("First name is given in the input field.")
	public void first_name_is_given_in_the_input_field() {
		inputOnElement(pm.getBh().getFirstName(), "Renuka");

	}

	@When("Last name is given in the input field.")
	public void last_name_is_given_in_the_input_field() {
		inputOnElement(pm.getBh().getLastName(), "Karthic");

	}

	@When("Billing Address is given in input field.")
	public void billing_address_is_given_in_input_field() throws IOException {
		inputOnElement(pm.getBh().getBillingAddress(), pm.getCr().address());

	}

	@When("Credit card no is given in the input field.")
	public void credit_card_no_is_given_in_the_input_field() throws IOException {
		inputOnElement(pm.getBh().getCreditCardNo(), pm.getCr().ccnum());

	}

	@When("Selecting Credit card type in the input field using dropdown button.")
	public void selecting_credit_card_type_in_the_input_field_using_dropdown_button() {
		dropDownSelect(pm.getBh().getCreditCardType(), "value", "MAST");

	}

	@When("Selecting Expiry month  in the input field using dropdown button.")
	public void selecting_expiry_month_in_the_input_field_using_dropdown_button() {
		dropDownSelect(pm.getBh().getExpiryMonth(), "value", "6");

	}

	@When("Selecting Expiry year in the input field using dropdown button.")
	public void selecting_expiry_year_in_the_input_field_using_dropdown_button() {
		dropDownSelect(pm.getBh().getExpiryYear(), "visibletext", "2029");

	}

	@When("User enter CVV no in the input field.")
	public void user_enter_cvv_no_in_the_input_field() throws IOException {
		inputOnElement(pm.getBh().getCvvNumber(), pm.getCr().cvvnum());

	}

	@Then("User now click BookNow button.")
	public void user_now_click_book_now_button() throws InterruptedException {
		pm.getBh().getBookNow().click();
		Thread.sleep(3000);

	}

	@When("User now click on the MyItinerary button.")
	public void user_now_click_on_the_my_itinerary_button() throws InterruptedException, IOException {
		javaSriptExecutor(0, 500);
		Thread.sleep(2000);
		pm.getConf().getMyItinerary().click();
		takesScreenShot("adatinbookingCum");
	}

	@When("User now click on the Logout button.")
	public void user_now_click_on_the_logout_buuton() throws InterruptedException {
		pm.getBi().getLogout().click();
		Thread.sleep(2000);

	}
}