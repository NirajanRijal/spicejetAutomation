package spicejet.example.stepdefinations;
import io.cucumber.java.*;
import spicejet.example.utils.GlobalVariables;
import spicejet.example.utils.SingletonBrowserClass;

public class Hooks{



    @Before
    public static void before(){
        //setupdriver();
        GlobalVariables.driver = SingletonBrowserClass.getInstanceOfSingletonBrowserClass().getDriver();
    }


    @AfterAll
    public static void close(){
        //closedriver();
        GlobalVariables.driver.quit();
        GlobalVariables.driver=null;





    }

    @AfterStep
    public void teardown(Scenario scenario){
        if(scenario.isFailed()){
            System.out.println("Scenario "+scenario.getName()+"is failed");
        }
    }
}


