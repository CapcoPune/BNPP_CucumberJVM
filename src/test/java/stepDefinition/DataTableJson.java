package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import dataProviders.FileReaderManager;
import library.ApplicationLibraryWeb;
import testDataTypes.Customer;

public class DataTableJson {
	ApplicationLibraryWeb lib;

	public DataTableJson(ApplicationLibraryWeb lib) {
		this.lib = lib;
	}

	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() {
		lib.infoLog("User is on home page");
		System.out.println("in GIven Steps");

	}

	@When("^he search for \"([^\"]*)\"$")
	public void he_search_for(String arg1) {
		lib.infoLog("He searching for" + arg1);
		System.out.println("in When  Steps");
	}

	@When("^enter \"([^\"]*)\" personal details on checkout page$")
	public void enter_personal_details_on_checkout_page(String customerName) {
		lib.infoLog("entering personal details on checkout page");
		Customer customer = FileReaderManager.getInstance().getJsonReader().getCustomerByName(customerName);
		System.out.println(customer.phoneNumber.mob);
		lib.infoLog("Name :" + customer.firstName + " " + customer.lastName);
		lib.infoLog("Email :" + customer.emailAddress);
		lib.infoLog("Email :" + customer.address.country);

	}

}
