package com.wenjie;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlogPage {
    @FindBy(xpath = "//*[@id=\"masthead\"]/button")
    private WebElement searchButton;

    @FindBy(xpath = "/html/body/div[1]/div/input")
    private WebElement searchInput;

    @FindBy(xpath = "/html/body/div[1]/div/ul/li[1]/article/a")
    private WebElement searchResultFirst;

    public void clickSearchButton() {
        searchButton.click();
    }

    public void inputSearchWording(String wantedStr){
        searchInput.sendKeys(wantedStr);
    }

    public void clickFirstResultOfSearch() {
        searchResultFirst.click();
    }
}
