package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SearchVideo extends BaseTest{
	@Test
	public void LoginTest() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement accountList = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-link-accountList")));
            accountList.click();

        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("a-input-text")));
            emailField.sendKeys("9360775116");
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("continue")));
            continueButton.click();

            
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
            passwordField.sendKeys("mishika@24");
            driver.findElement(By.id("signInSubmit")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("fida");
            
           driver.findElement(By.id("nav-search-submit-button")).click();
           Thread.sleep(2000); 
          
	}
}