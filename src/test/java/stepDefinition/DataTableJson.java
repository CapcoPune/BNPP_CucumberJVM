package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import dataProviders.FileReaderManager;
import testDataTypes.Customer;

public class DataTableJson {
	
	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page()  {
	    System.out.println("in GIven Steps");
	}

	@When("^he search for \"([^\"]*)\"$")
	public void he_search_for(String arg1)  {
		System.out.println("in When  Steps");
	}

	@When("^enter \"([^\"]*)\" personal details on checkout page$")
	public void enter_personal_details_on_checkout_page(String customerName)  {
		
		Customer customer = FileReaderManager.getInstance().getJsonReader().getCustomerByName(customerName);
		System.out.println(customer.phoneNumber.mob);
		 
	   
	}


}
