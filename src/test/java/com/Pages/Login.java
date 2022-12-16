package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Login extends BasePage {
    public static String emailInput = "/html/body/div/div/div[2]/div/div[1]/form/div[1]/input";
    public static String passwordInput = "/html/body/div/div/div[2]/div/div[1]/form/div[2]/div/input";
    public static String acessButton = "/html/body/div/div/div[2]/div/div[1]/form/div[3]/button[1]";
    public static String verifyLabel = "/html/body/div/div/div[3]/div[1]/p";

    public void insertIntoField(String field, String value) {
        WebElement fieldPersonal = getWebElement(By.xpath(field));
        /* fieldPersonal.clear(); */
        fieldPersonal.sendKeys(value);
    }

    public void FillInput() throws InterruptedException {
        insertIntoField(emailInput, "test-0a37vixu5@srv1.mail-tester.com");
        insertIntoField(passwordInput, "Thiago123");
    }

    public void AcessButton() {
        WebElement buttonPage = getWebElement(By.xpath(acessButton));
        buttonPage.click();
    }

    public String verifyIfTextSucessed() {
        WebElement textAsert = getWebElement(By.xpath(verifyLabel));
        return textAsert.getText();
    }
}
