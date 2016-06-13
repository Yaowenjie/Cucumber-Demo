package com.wenjie;

import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.openqa.selenium.support.PageFactory.initElements;

public class BaseSteps implements En {
    private WebDriver driver = new FirefoxDriver();
    private BlogPage blogPage = new BlogPage();

    public BaseSteps() {
        blogPage = initElements(driver, BlogPage.class);

        Given("^I enter my blog address \"([^\"]*)\" and go to Home page$", (String url) -> {
            driver.get(url);
        });

        When("^I click the search button$", () -> {
            blogPage.clickSearchButton();
        });

        And("^I enter \"([^\"]*)\" in the input field$", (String keyword) -> {
            blogPage.inputSearchWording(keyword);
        });

        And("^I click the first result of search$", () -> {
            blogPage.clickFirstResultOfSearch();
        });

        Then("^I go to the article page with title containing \"([^\"]*)\"$", (String keyword) -> {
            assertContainsIngoreCase(blogPage.getArticleTitle(), keyword);
        });
    }

    public static void assertContainsIngoreCase(String set, String subset) {
        assertThat(set.toLowerCase(), containsString(subset.toLowerCase()));
    }
}
