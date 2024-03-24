package spicejet.example.stepdefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import spicejet.example.utils.GlobalVariables;

import java.util.Set;

public class MouseAction {

    @And("user rightclick on deals and open deal page")
    public void user_rightclick_on_deals_and_open_deal_page() {
        Actions action = new Actions(GlobalVariables.driver);
        WebElement rclick = GlobalVariables.driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41 r-1pzd9i8'][normalize-space()='Deals']"));
        action.contextClick(rclick).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();


    }

    @And("on dealpage user click on flight")
    public void on_dealpage_user_click_on_flight() {
        String originalwindow = GlobalVariables.driver.getWindowHandle();
        Set<String> allwindow = GlobalVariables.driver.getWindowHandles();
        for (String windowHandle : allwindow) {
            if (!originalwindow.contentEquals(windowHandle)) {
                GlobalVariables.driver.switchTo().window(windowHandle);
                GlobalVariables.driver.findElement(By.xpath("//a[normalize-space()='Flight']//span")).click();


            }
       }


    }

    @Then("user doubleclick and highlight welcome to hot deals")
    public void userDoubleclickAndHighlightWelcomeToHotDeals() {
        WebElement text = GlobalVariables.driver.findElement(By.xpath("//h1[normalize-space()='Welcome to Hot Deals']"));
        Actions action = new Actions(GlobalVariables.driver);
        action.moveToElement(text).doubleClick().perform();

    }
}

