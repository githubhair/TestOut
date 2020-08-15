package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SettingSSLPage extends BasePage {
    By mailContactsCalendarsLink = new By.ById("siMailContactsCalendars.Grid.tbText");
    By MaggieAccountLink = new By.ById("lbAccounts.Grid.Border.ScrollViewer.Grid.Viewport.ScrollContentPresenter.OuterElement.InnerElement.ItemsPresenter.StackPanel.SettingsItemSubMenu.Grid.ContentPresenter.StackPanel.TextBlock");
    By EmailLink = new By.ById("siAccount.Grid.tbStateText");
    By accountAdvancedLink = new By.ById("siAdvanced.Grid.tbText");
    By sslHandle = new By.ById("siUseSSL.Grid.tbOnOff.Grid.SwitchRoot");
    By accountLink = new By.ById("btnAccount.grid.contentPresenter.TextBlock");
    By sslPort = new By.ById("grdClient.spAdvanced.PropertyGroup2.Border.ContentPresenter.SettingsListBox.Grid.Border.ScrollViewer.Grid.Viewport.ScrollContentPresenter.OuterElement.InnerElement.ItemsPresenter.StackPanel.SettingsItem1.Grid.ContentPresenter.tbServerPort");
    By doneLink = new By.ById("btnDone.grid.contentPresenter.TextBlock");
    By homeButton = new By.ById("bHome.LayoutRoot");
    WebDriverWait wait = new WebDriverWait(driver, 10);


    public SettingSSLPage(WebDriver driver) throws InterruptedException {
        super(driver);
    }

    public void clickMailContactsCalendarsLink() {
        driver.findElement(mailContactsCalendarsLink).click();
    }

    public void clickMaggieAccountLink() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(MaggieAccountLink).click();
    }

    public void clickEmailLink() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(EmailLink).click();
    }

    public void clickAccountAdvancedLink() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(accountAdvancedLink).click();
    }

    public void turnOnSsl() {
        Actions actions = new Actions(driver);
        WebElement sslButton = driver.findElement((By) sslHandle);
        actions.moveToElement(sslButton, 6, 0).click().build().perform();

    }
    public String getPort() {
        return driver.findElement(sslPort).getAttribute("value");
    }
    public void clickAccountLink() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(accountLink).click();
    }
    public void clickDoneLink(){
        driver.findElement(doneLink).click();
    }
    public void clickHomeButton(){
        driver.findElement(homeButton).click();
    }
    public void mouseUp(){
        Actions actions = new Actions(driver);
        actions.moveByOffset(0,-11).click().build().perform();
    }
    public void mouseLeft(){
        Actions actions = new Actions(driver);
        actions.moveByOffset(8,0).click().build().perform();
    }
}
