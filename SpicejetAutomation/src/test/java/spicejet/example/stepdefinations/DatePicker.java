package spicejet.example.stepdefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import spicejet.example.utils.GlobalVariables;

public class DatePicker {

    @And("user select required departure date")
    public void user_select_required_departure_date() throws InterruptedException {
        GlobalVariables.driver.findElement(By.xpath("//div[normalize-space()='Departure Date']")).click();
        String YearMonth = GlobalVariables.driver.findElement(By.xpath("//div[contains(text(),'April')] ")).getText();
        System.out.println(YearMonth);
        String Year = YearMonth.split(" ")[0].trim();
        String Month = YearMonth.split(" ")[1].trim();
        System.out.println(Year);
        System.out.println(Month);

        if ((Month.equals("April") && Year.equals("2024"))) {
            Thread.sleep(8000);
            GlobalVariables.driver.findElement(By.xpath("//div[contains(text(),'5')]")).click();
        }


    }

    @Then("selected date should be displayed")
    public void selected_date_should_be_displayed() {
        String day=GlobalVariables.driver.findElement(By.xpath("//div[contains(text(),'5')]")).getText();
        System.out.println("Required day is " + day);
            }
}
