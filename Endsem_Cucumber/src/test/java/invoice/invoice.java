package invoice;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class invoice {
	@Given("I want to enter total_amount  and customer_name")
	public void i_want_to_enter_total_amount_and_customer_name() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside: I want to enter total_amount  and customer_name");
	}

	@When("I enter valid t_amt1 and c_name1")
	public void i_enter_valid_t_amt1_and_c_name1() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside: I enter valid t_amt1 and c_name1");
	}

	@Then("I have entered Info successfully")
	public void i_have_entered_info_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside: I have entered Info successfully");
	}

	@When("I enter valid t_amt2 and c_name2")
	public void i_enter_valid_t_amt2_and_c_name2() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside: I enter valid t_amt2 and c_name2");
	}

	@When("I enter valid t_amt3 and c_name3")
	public void i_enter_valid_t_amt3_and_c_name3() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside: I enter valid t_amt3 and c_name3");
	}

	@When("I enter valid t_amt4 and c_name4")
	public void i_enter_valid_t_amt4_and_c_name4() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside: i_enter_valid_t_amt4_and_c_name4");
	}

}
