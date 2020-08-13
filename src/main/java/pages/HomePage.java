package home;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ssl.SettingSSLPage;
import wifi.WiFiPage;

public class HomePage extends BasePage {
    By screenSizeDial = By.id("HorizontalThumb");
    By settingLink = By.id("wpDesktop.DesktopIcon15.Grid.gContent.imImage");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage changeSize(){
        Actions actions = new Actions(driver);
        WebElement horizontalThumb = driver.findElement(screenSizeDial);
        actions.moveToElement(horizontalThumb, -10,0).click().build().perform();
        return new HomePage(driver);
    }

    public SettingSSLPage clickSettingsLink() throws InterruptedException {
        driver.findElement(settingLink).click();
        return new SettingSSLPage(driver);
    }
    public WiFiPage onlyClickSettingsLink(){
        driver.findElement(settingLink).click();
        return new WiFiPage(driver);
    }

}
