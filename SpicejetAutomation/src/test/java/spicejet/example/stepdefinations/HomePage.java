package spicejet.example.stepdefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import spicejet.example.utils.GlobalVariables;


public class HomePage {

    @Given("user enter website address")
    public void user_enter_website_address() {
        GlobalVariables.driver.get("https://www.spicejet.com/");


    }

    @Then("homepage is displayed")
    public void homepage_is_displayed() {
        System.out.println(GlobalVariables.driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1loqt21 r-13awgt0 r-1mlwlqe r-1udh08x r-1otgn73 r-1lgpqti']//img[@class='css-9pa8cd']")).isDisplayed());

    }
}










