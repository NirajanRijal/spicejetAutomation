package spicejet.example.stepdefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import spicejet.example.utils.GlobalVariables;

import java.util.Set;

public class NavigationPage {

    @Given("user is in homepage")
    public void user_is_in_homepage() {
        GlobalVariables.driver.get("https://www.spicejet.com/");

    }

    @And("user click hotel on header on navigation")
    public void user_click_hotel_on_header_on_navigation() {
        GlobalVariables.driver.findElement(By.xpath("//div[contains(text(),'Hotels')]")).click();

    }

    @Then("will navigated to hotel page")
    public void will_navigated_to_hotel_page() {
        String originalWindow = GlobalVariables.driver.getWindowHandle();
        Set<String> allwindow = GlobalVariables.driver.getWindowHandles();
        for (String windowHandle : allwindow) {
            if (!originalWindow.contentEquals(windowHandle)) {
                GlobalVariables.driver.switchTo().window(windowHandle);
                GlobalVariables.driver.findElement(By.xpath("//img[@alt='logo']")).isDisplayed();


            }

        }
    }
}
