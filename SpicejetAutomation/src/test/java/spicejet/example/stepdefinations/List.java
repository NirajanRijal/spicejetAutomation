package spicejet.example.stepdefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import spicejet.example.utils.GlobalVariables;

public class List {

    @And("user click add on")
    public void user_click_add_on() {
        GlobalVariables.driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]")).click();

    }
    @Then("user stored all value on list")
    public void user_stored_all_value_on_list() {
        java.util.List<WebElement> w = GlobalVariables.driver.findElements(By.xpath("//div[@class='css - 76zvg2 r - homxoj r - ubezar']"));
        System.out.println("Number of store element in list w is " + w.size());

    }
}

