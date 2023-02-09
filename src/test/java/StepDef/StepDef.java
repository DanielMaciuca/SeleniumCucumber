package StepDef;



import io.cucumber.datatable.DataTable;
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

    @Then("User enters <{int}>")
    public void userEnters(int arg0) {
        System.out.println(arg0);
    }

    @Given("^user enters another name$")
    public void userEntersAnotherName() {
        System.out.println("Another name");
    }

    @Then("user enters second password {string}")
    public void userEntersSecondPassword(String ac) {
        System.out.println(ac);
    }

    @Given("there are {int} cucumbers and {int}")
    public void thereAreStartCucumbers(int n, int m) {
        System.out.println(n + "" + m);

    }

    @Then("User enters the following details")
    public void userEntersTheFollowingDetails(DataTable table) {

    }
}
