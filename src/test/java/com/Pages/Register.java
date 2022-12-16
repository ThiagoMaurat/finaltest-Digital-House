package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Register extends BasePage {
    public static final String registerButton = "/html/body/div/div/div[2]/div/div[1]/form/div[3]/button[2]";
    public static final String email = "/html/body/div/div/div[2]/div/div[2]/form/div[2]/input";
    public static final String name = "/html/body/div/div/div[2]/div/div[2]/form/div[3]/input";
    public static final String password = "/html/body/div/div/div[2]/div/div[2]/form/div[4]/div/input";
    public static final String confirmPassword = "/html/body/div/div/div[2]/div/div[2]/form/div[5]/div/input";
    public static final String confirmRegister = "/html/body/div/div/div[2]/div/div[2]/form/button";
    public static final String successMessage = "/html/body/div/div/div[3]/div/div[2]/p";

    public void getInRegisterPag() throws InterruptedException {
        WebElement myAccountButton = getWebElement(By.xpath(registerButton));
        myAccountButton.click();
        Thread.sleep(2000);
    }

    public void insertIntoField(String field, String value) {
        WebElement fieldPersonal = getWebElement(By.xpath(field));
        /* fieldPersonal.clear(); */
        fieldPersonal.sendKeys(value);
    }

    public void insertFields() throws InterruptedException {
        insertIntoField(email, "test-0a37vixu5@srv1.mail-tester.com");
        insertIntoField(name, "Thiago");
        insertIntoField(password, "Thiago123");
        insertIntoField(confirmPassword, "Thiago123");
    }

    public void confirmRegister() throws InterruptedException {
        WebElement registerButton = getWebElement(By.xpath(confirmRegister));
        registerButton.click();
        Thread.sleep(2000);
    }

    public String verifyIfSucessed() {
        WebElement verifyMessageSucess = getWebElement(By.xpath(successMessage));
        System.out.println(verifyMessageSucess.getText());
        return verifyMessageSucess.getText();

    }
}