package com.Tests;

import static org.junit.jupiter.api.Assertions.*;

import com.Pages.Login;
import com.Pages.Register;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RegisterTest {
	private static Register page;
	private static Login page2;

	@BeforeEach
	public void setUp() {
		page = new Register();
		page.openApp();
	}

	@Test
	public void getIntoPagAndRegister() throws InterruptedException {
		page.getInRegisterPag();
		page.insertFields();
		page.confirmRegister();
		assertTrue(
				page.verifyIfSucessed().contains("foi criada com sucesso"));
	}

	@Test
	public void searchIphoneTestAndAddToCart() throws InterruptedException {
		page2.FillInput();
		page2.AcessButton();
		Thread.sleep(2000);
		assertTrue(page2.verifyIfTextSucessed().contains("Saldo em conta"));
	}

}
