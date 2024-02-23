package StepDef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class StepDef {

    @Then("User is on page")
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

    @Then("User enters the following details:")
    public void userEntersTheFollowingDetails(DataTable dataTable) {

        List<Map<String, String>> items = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> item : items) {
            String itemName = item.get("Item");
            System.out.println(itemName);
            int quantity = Integer.parseInt(item.get("Quantity"));
            System.out.println(quantity);
            double price = Double.parseDouble(item.get("Price"));
            System.out.println(price);
            // NU MERGE
        }

    }

    @Given("check if <{int}> equal <{int}>")
    public void checkIfEqual(int arg0, int arg1) {

        assertEquals(arg0, arg1);
    }
}
