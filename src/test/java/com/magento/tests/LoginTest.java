package com.magento.tests;

import com.magento.utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void loginForm(){

        String expected_message="Account Information";

        // go to register page
        loginPage.goToSignInLink();

        //fill the form
        loginPage.fillOutFormLogin();

        //submit information
        loginPage.submitData();

/*
        //espera por un elemento que contenga el xpath y texto account information
        WebElement msg = new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div[1]/strong")));

        //assertion
        Assert.assertEquals(msg.getText(), expected_message);

 */

    }
}
