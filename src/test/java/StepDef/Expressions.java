package StepDef;

import io.cucumber.java.en.Then;
import models.Color;

import java.util.List;

public class Expressions {

    @Then("Dog color is {color}")
    public void dogColorIs(String color) {
        System.out.println("Dog color is " + color);
    }

    @Then("Cat color is {objectColor}")
    public void catColorIs(Color objectColor) {
        System.out.println("Cat color is " + objectColor.getObjectColor());
    }

    @Then("I like dogs to be:")
    public void iLikeDogsToBe(List<String> colors) {

        for (String color : colors) {

            System.out.println(color);
        }

    }
}
