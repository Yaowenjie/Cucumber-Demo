package com.wenjie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.openqa.selenium.support.PageFactory.initElements;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CucumberApplication.class)
public class CucumberApplicationTests {
	FirefoxDriver driver = new FirefoxDriver();
	BlogPage blogPage = initElements(driver, BlogPage.class);
	String blogUrl = "http://localhost:4000";

	// This is actually Selenium Test
	@Test
	public void search_function_should_work_well() {
		driver.get(blogUrl);

		blogPage.clickSearchButton();
		blogPage.inputSearchWording("PowerShell");
		blogPage.clickFirstResultOfSearch();
	}

}
