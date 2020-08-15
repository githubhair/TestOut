package ssl;

import Base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SettingSSLPage;

public class SetupSSLTest extends BaseTests {

    @Test
    public void SetupSSLTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        SettingSSLPage settingSSLPage = homePage.clickSettingsLink();
        settingSSLPage.clickMailContactsCalendarsLink();
        settingSSLPage.clickMaggieAccountLink();
        settingSSLPage.clickEmailLink();
        settingSSLPage.clickAccountAdvancedLink();
        settingSSLPage.turnOnSsl();
        //driver.switchTo().frame(driver.findElement(By.id("hcHeaderedContentControl.Grid.svScrollViewer")));
        settingSSLPage.mouseUp();
        settingSSLPage.mouseLeft();
    //((JavascriptExecutor)driver).executeScript("scroll(-20,100)");

        Assert.assertEquals(settingSSLPage.getPort(),"993");
        settingSSLPage.clickMaggieAccountLink();
//        settingSSLPage.clickDoneLink();
//        settingSSLPage.clickHomeButton();
//
//        driver.findElement(doneLink).click();
//        driver.findElement(homeButton).click();
    }
}
