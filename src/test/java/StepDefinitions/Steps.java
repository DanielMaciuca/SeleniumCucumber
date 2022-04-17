package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

    @Given("he user is on login page")
    public void he_user_is_on_login_page() {
        System.out.println("User is on login page");
    }

    @When("the user enters the right credentials")
    public void the_user_enters_the_right_credentials() {
        System.out.println("User enters right credentials");
    }

    @And("hits submit button")
    public void hits_submit_button() {
        System.out.println("User hits submit button");
    }

    @Then("the user is logged in successfully")
    public void the_user_is_logged_in_successfully() {
        System.out.println("User is logged in");
    }

}
