package home;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import secure_the_site_page.SettingsPage;
import wifi.WiFiPage;

public class HomePage extends BasePage {
    By settingLink = By.id("wpDesktop.DesktopIcon15.Grid.gContent.imImage");
    By wiFiLink = By.id("siBluetooth.Grid.rectClickArea");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public SettingsPage clickSettingsLink() throws InterruptedException {
        Thread.sleep(8000);
        driver.findElement(settingLink).click();
        return new SettingsPage(driver);
    }

    public WiFiPage selectCorpNet(){
        driver.findElement(wiFiLink).click();
        return new WiFiPage(driver);


    }
}
