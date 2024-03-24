package spicejet.example.stepdefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import spicejet.example.utils.GlobalVariables;

public class Hover {

    @And("user hover to add on")
    public void user_hover_to_add_on() {
        Actions actions = new Actions(GlobalVariables.driver);
        WebElement addon = GlobalVariables.driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]"));
        actions.moveToElement(addon).perform();

    }
    @Then("contents is displayed")
    public void contents_is_displayed() {
        String actualname = GlobalVariables.driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar'][normalize-space()='SpiceMax']")).getText();
        Assert.assertEquals(actualname,"SpiceMax");


    }



}



