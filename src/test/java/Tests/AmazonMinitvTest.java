package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonMinitvTest extends BaseTest{
    @Test
    public void checkMiniTVVisible() {
        
        WebElement miniTVSection = driver.findElement(By.linkText("Amazon miniTV"));
        Assert.assertTrue(miniTVSection.isDisplayed(), "Amazon MiniTV section is not visible.");
    }
}


