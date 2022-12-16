package com.Tests;

import com.Pages.Login;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {
    private static Login page2;

    @BeforeEach
    public void setUp() {
        page2 = new Login();
        page2.openApp();
    }

    @Test
    public void searchIphoneTestAndAddToCart() throws InterruptedException {
        page2.FillInput();
        page2.AcessButton();
        Thread.sleep(2000);
        assertTrue(page2.verifyIfTextSucessed().contains("Saldo em conta"));
    }

}
