package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBestSeller extends BaseTest {
	@Test
    public void testHomePage() {
        
        WebElement bestSellers = driver.findElement(By.linkText("Best Sellers"));
        Assert.assertTrue(bestSellers.isDisplayed(), "Best Sellers link is not visible.");
    }
}

