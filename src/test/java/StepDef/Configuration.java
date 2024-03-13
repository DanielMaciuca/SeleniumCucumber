package StepDef;

import io.cucumber.java.ParameterType;

public class Configuration {

    @ParameterType("white|brown|black")
    public String color(String color) {
        return color;
    }


}
