package com.magento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

    // Identificar los WebElementes
     By linkAccount= By.linkText("Create an Account");
     By fname= By.id("firstname");
     By lname=By.id("lastname");
     By email=By.id("email_address");
     By pass=By.id("password");
     By confPass=By.id("password-confirmation");

     By buttonRegister = By.xpath("//*[@id='form-validate']/div/div[1]/button/span");


    // Constructor
    public RegisterPage(WebDriver driver){// el drver sera pasado desde el Base test , en el metodo setUp
        this.driver=driver;
    }

    //Metodos o funciones

    public void  goToRegisterLink(){
        driver.findElement(linkAccount).click();
    }
    public void fillOutForm(){
        driver.findElement(fname).sendKeys("Pedro");
        driver.findElement(lname).sendKeys("Perico");
        driver.findElement(email).sendKeys("perod343@gmail.com");
        driver.findElement(pass).sendKeys("2]H9N%S9q[Dk");
        driver.findElement(confPass).sendKeys("2]H9N%S9q[Dk");
    }
    public void fillOutFormWithFakeData(String sFname, String sLname, String sEmail, String sPass){
        driver.findElement(fname).sendKeys(sFname);
        driver.findElement(lname).sendKeys(sLname);
        driver.findElement(email).sendKeys(sEmail);
        driver.findElement(pass).sendKeys(sPass);
        driver.findElement(confPass).sendKeys(sPass);
    }

    public void submitData(){
        driver.findElement(buttonRegister).submit();
    }

}
