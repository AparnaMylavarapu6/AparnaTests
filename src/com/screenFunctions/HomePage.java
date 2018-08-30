package com.screenFunctions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.genericfunctions.genericfunctions;

public class HomePage extends genericfunctions {

	// ******************************Objects*********************************
	@FindBy(how = How.XPATH, using = "//a[normalize-space(text()='Home')]")
	public static WebElement eleSecureLogin;

	public static List<String> tabs = new ArrayList<String>();

	// ******************************Objects*********************************

	public void Menu_HomePage() {

		try {
			if (eleSecureLogin.isDisplayed()) {
				System.out.println("Passed");
			}
		} catch (Exception E) {
			System.out.println("Failed");
		}

	}

}
