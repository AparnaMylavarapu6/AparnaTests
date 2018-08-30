package com.StepDefinitions;

import java.util.List;

import com.genericfunctions.genericfunctions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login extends genericfunctions {

	static boolean status = true;

	@Given("^Launch \"([^\"]*)\" Browser and \"([^\"]*)\"$")
	public static boolean launchbrowser(String browsertype, String Url, DataTable table) {
		List<List<String>> data = table.raw();
		browsertype = data.get(0).get(0);
		Url = data.get(0).get(1);
		status = launchBrowser(browsertype, Url);
		return status;
	}

	@Then("Enter Username and Password")
	public static void verifyhomepage() {
		hoverandClick("Admin");
		elementisDisplayed("Admin Login");
		clicktextboxandSendData("uname", "admin");
		clicktextboxandSendData("pwd", "admin");
		clickButton("submitBtn");
	}

	@And("Verify the Admin page is displayed")
	public static void verifyAdminpage() {
		System.out.println(elementisDisplayed("Admin Home"));
		clickLink("Logout");
	}

}
