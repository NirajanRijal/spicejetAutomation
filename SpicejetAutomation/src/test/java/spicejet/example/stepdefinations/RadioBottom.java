package spicejet.example.stepdefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import spicejet.example.utils.GlobalVariables;

public class RadioBottom {

    @Given("user click round trip on flights")
    public void user_click_round_trip_on_flights() {
        GlobalVariables.driver.findElement(By.xpath("//div[contains(text(),'round trip')]")).click();

    }
    @Then("will select the round trip")
    public void will_select_the_round_trip() {
        System.out.println("Round bottom is clicked");

    }
}
