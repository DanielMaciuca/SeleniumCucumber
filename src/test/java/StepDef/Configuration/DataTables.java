package StepDef.Configuration;

import io.cucumber.java.ParameterType;
import models.Color;

public class DataTables {

    @ParameterType("white|brown|black")
    public String color(String color) {
        return color;
    }
    @ParameterType(".*")
    public Color objectColor(String color) {
        return new Color(color);
    }

}
