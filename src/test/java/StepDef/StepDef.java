package StepDef;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDef {

    @Given("User is on page")
    public void user_is_on_page() {
        System.out.println("Test1");
    }
    @Then("User click")
    public void user_click() {
        System.out.println("Test2");
    }


    @Then("User click again")
    public void userClickAgain() {
        System.out.println("Test3");
    }

    @Then("User click again {string} and price {int}")
    public void userClickAgainAndPrice(String prim, int sec) {
        System.out.println(prim + " " + sec);
    }
}
