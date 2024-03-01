package Hooks;

import io.cucumber.java.Before;

public class GeneralHooks {

    @Before("@FirstHook")
    public void firstFunction(){
        System.out.println("This is the first hook");
    }


}
