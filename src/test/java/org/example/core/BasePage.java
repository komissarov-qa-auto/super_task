package org.example.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.example.driver.DriverManager;
import java.time.Duration;

public abstract class BasePage {

    private static final Duration WAIT_TIMEOUT = Duration.ofSeconds(10);

    protected WebElement find(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void click(By Locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(Locator)).click();
    }

    protected void type(By Locator, String value) {
        WebElement element = find(Locator);
        element.clear();
        element.sendKeys(value);
    }

    protected boolean isVisible(By locator) {
        return find(locator).isDisplayed();
    }

    public String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    }

    private WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), WAIT_TIMEOUT);
    }


    protected WebDriver getDriver() {
        return DriverManager.getDriver();
    }

}
