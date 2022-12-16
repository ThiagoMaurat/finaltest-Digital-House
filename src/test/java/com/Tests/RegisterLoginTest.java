package com.Tests;

import static org.junit.jupiter.api.Assertions.*;
import com.Pages.Register;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RegisterLoginTest {
	private static Register page;

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
		page.closeModalButton();
		page.FillInput();
		page.AcessButton();
		Thread.sleep(2000);
		assertTrue(page.verifyIfTextSucessed().contains("Saldo em conta"));
	}

}
