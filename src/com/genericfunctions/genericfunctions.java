package com.genericfunctions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class genericfunctions {

	public static WebDriver driver;

	/*********************************************************************
	 * Method Name : launchBrowser Description : This Method is used to launch
	 * Browser Input Parameters : browsertype,url Status : boolean Design Date :
	 * 20-8-2018 Reviewed by : Reviewed Date :
	 **********************************************************************/
	public static boolean launchBrowser(String browsertype, String url) {

		boolean status = true;
		try {
			switch (browsertype.toLowerCase()) {
			case "ff":
				driver = new FirefoxDriver();
				driver.get(url);
				break;
			}
			driver.manage().window().maximize();
		} catch (Exception e) {
			status = false;
		}
		return status;
	}

	public static void clicktextboxandSendData(String strInputFieldName, String strFieldValue) {

		driver.findElement(By.name(strInputFieldName)).click();
		driver.findElement(By.name(strInputFieldName)).clear();
		driver.findElement(By.name(strInputFieldName)).sendKeys(strFieldValue);
	}

	public static void hoverandClick(String strInputFieldName) {

		Actions act = new Actions(driver);
		WebElement toElement = driver.findElement(By.linkText(strInputFieldName));
		act.moveToElement(toElement).build().perform();
		toElement.click();
	}

	public static boolean elementisDisplayed(String strInputFieldName) {

		boolean status;
		return status = driver.findElement(By.xpath("//*[text() ='" + strInputFieldName + "']")).isDisplayed();

	}

	public static void clickButton(String strButtonName) {
		driver.findElement(By.name(strButtonName)).click();
	}

	public static void clickLink(String strLinkName) {

		driver.findElement(By.linkText(strLinkName)).click();
		;
	}

	/*********************************************************************
	 * Method Name : brokenlinks Description : This Method is used to return the
	 * broken links in the page. Input Parameters : Null Status : boolean Design
	 * Date : 20-8-2018 Reviewed by : Reviewed Date :
	 **********************************************************************/
	public void brokenlinks() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		try {
			for (int i = 0; i <= links.size(); i++) {
				WebElement ele = links.get(i);
				String url = ele.getAttribute("href");
				URL url1 = new URL(url);
				HttpURLConnection con = (HttpURLConnection) url1.openConnection();
				con.setConnectTimeout(3000);
				con.connect();
				if (con.getResponseCode() == 200) {
					System.out.println(con.getResponseCode());
				} else {
					System.out.println(con.HTTP_NOT_FOUND);
				}

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}