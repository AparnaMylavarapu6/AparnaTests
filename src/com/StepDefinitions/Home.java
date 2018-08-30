package com.StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.genericfunctions.genericfunctions;
import com.screenFunctions.HomePage;

import cucumber.api.java.en.Then;

public class Home extends genericfunctions {

	public static HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	List<WebElement> alltabs;

	@Then("Verify the Home page is displayed")
	public void verifyhomepage() {
		homePage.Menu_HomePage();
	}

	@Then("^Verify the Home page tabs are displayed in correct order$")
	public void verify_the_Home_page_tabs_are_displayed_in_correct_order() {
		for (int i = 0; i < alltabs.size() - 1; i++) {

			HomePage.tabs.add(alltabs.get(i).getText().trim());
		}
		String[] taborder = { "Admin", "Staff", "Features", "Contact Us" };
		for (int j = 0; j < taborder.length; j++) {
			if (taborder[j].equals(HomePage.tabs.get(j))) {
				System.out.println(taborder[j] + " is displayed in correct order");
			} else {
				System.out.println(taborder[j] + " is not displayed in correct order");
			}
		}

	}

	@Then("^click on each tab and verify that user navigates to correct page\\.$")
	public void click_on_each_tab_and_verify_that_user_navigates_to_correct_page() {
		String[] pageTitle = { "Admin Login", "Staff Login", "Online Banking features", "Contact Us" };
		alltabs = driver
				.findElements(By.xpath("//a[normalize-space(text() = 'Home')]/parent::li/following-sibling::li/a"));
		try {

			int size = alltabs.size();
			System.out.println(size);
			for (int i = 0; i <= size - 1; i++) {
				alltabs.get(i).click();
				boolean status = elementisDisplayed(pageTitle[i]);
				System.out.println(status);
				System.out.println(pageTitle[i]);
				if (status = true) {
					System.out.println("The " + pageTitle[i] + " is displayed correctly");
				} else {
					System.out.println("The " + pageTitle[i] + " is not displayed correctly");
				}
				clickLink("Home");
				alltabs = driver.findElements(
						By.xpath("//a[normalize-space(text() = 'Home')]/parent::li/following-sibling::li/a"));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			driver.close();
		}
	}

}
