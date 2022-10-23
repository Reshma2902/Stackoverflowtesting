package org.reshma.stackoverflowtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StackOverflowTest {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		log.info("setup successful");
	}
	
	@Test
	public void openStackOverflow() {
		driver.get("https://stackoverflow.com/");
		driver.manage().window().maximize();
		log.info("Stackoverflow opened");
	}
	
	@AfterTest
	public void tearDown() {
		// closing stack overflow
		driver.close();
		log.info("Window closed");
	}
	

}
