package stepDefinations;


import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
//@RunWith(Cucumber.class)
public class StepDefination {

    @Given("^user is on netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    	System.out.println("navigated to url page");
       
    }

    @When("^User login into apllication with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_apllication_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }



    
    	@Then("home page is papulated")
    	public void home_page_is_papulated() {
    	    // Write code here that turns the phrase above into concrete actions
    	    
    	     System.out.println("successfully validated home page");
     
    	}
    	 @And("^cards are displayed \"([^\"]*)\"$")
    	    public void cards_are_displayed_something(String strArg1) throws Throwable {
    	       System.out.println(strArg1);
    	    }

}