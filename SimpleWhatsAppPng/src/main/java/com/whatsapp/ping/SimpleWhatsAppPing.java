package com.whatsapp.ping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SimpleWhatsAppPing {

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chrome\\chromedriver_win32\\chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			options.addArguments("user-data-dir=C:\\Drivers\\chromeusr");

			WebDriver driver = new ChromeDriver(options);

			String baseURL = "https://api.whatsapp.com/send?phone=919976526520&text=";

			String msg = "SayHai";
			
			driver.get(baseURL+msg);
			driver.findElement(By.id("action-button")).click();
			Thread.sleep(30000);
			WebElement sendButton = driver.findElement(By.className("_35EW6"));
			sendButton.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
