package spicejet.example.stepdefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import spicejet.example.utils.GlobalVariables;

import java.sql.SQLOutput;

public class SelectCity {

    @And("user is able to select specefic city")
    public void user_is_able_to_select_specefic_city(){
        GlobalVariables.driver.findElement(By.xpath("//input[@autocapitalize=\"sentences\"]")).sendKeys("Ahm");

    }

    @Then("selected city is displayed")
    public void selected_city_is_displayed() {
        System.out.println("City is displayed");

    }
}
