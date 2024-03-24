package spicejet.example.stepdefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import spicejet.example.utils.GlobalVariables;

import java.util.List;

public class DropDown {

    @Given("user click on currency dropdown")
    public void user_click_on_currency_dropdown() {

    }

    @Then("user select the usd")
    public void user_select_the_usd() {
        GlobalVariables.driver.findElement(By.xpath("//div[contains(text(),'Currency')]")).click();
        GlobalVariables.driver.findElement(By.xpath("//div[contains(text(),'USD')]")).click();
        String actualcurrency=GlobalVariables.driver.findElement(By.xpath("//div[contains(text(),'USD')]")).getText();

        Assert.assertEquals(actualcurrency,"USD","Actual and expected currency are not equal");
           }



}
