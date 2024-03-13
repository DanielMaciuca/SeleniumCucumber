package StepDef;

import io.cucumber.java.en.Then;

public class Expressions {

    @Then("Dog color is {color}")
    public void dogColorIs(String color) {
        System.out.println("Dog color is " + color);
    }

}
