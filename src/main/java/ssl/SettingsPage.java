package secure_the_site_page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SettingsPage extends BasePage {
    By mailContactsCalendarsLink = new By.ById("siMailContactsCalendars.Grid.tbText");
    By maggieSubPageLink = new By.ById("lbAccounts.Grid.Border.ScrollViewer.Grid.Viewport.ScrollContentPresenter.OuterElement.InnerElement.ItemsPresenter.StackPanel.SettingsItemSubMenu.Grid.ContentPresenter.StackPanel.TextBlock");
    By selectEmailLink = new By.ById("siAccount.Grid.tbStateText");
    By accountAdvancedLink = new By.ById("siAdvanced.Grid.tbText");
//    By selectSSLButton = new By.ById("siUseSSL.Grid.tbOnOff.Grid.SwitchRoot");
    By turnSSLButtonOn = new By.ById("siUseSSL.Grid.tbOnOff.Grid.SwitchRoot");
    By accountLink = new By.ById("btnAccount.grid.contentPresenter.TextBlock");
    By doneLink = new By.ById("btnDone.grid.contentPresenter.TextBlock");

    public SettingsPage(WebDriver driver) throws InterruptedException {
        super(driver);
        driver.findElement(mailContactsCalendarsLink).click();
        //sub screen
        driver.findElement(maggieSubPageLink).click();
        driver.findElement(selectEmailLink).click();
        driver.findElement(accountAdvancedLink).click();
        Actions actions = new Actions(driver);
        WebElement sourceLocator = driver.findElement(turnSSLButtonOn);
        actions.moveToElement(sourceLocator, 10,0).click().build().perform();
        driver.findElement(accountLink).click();
        Thread.sleep(1000);
        driver.findElement(doneLink).click();







        //To get target locator
        WebElement targetLocator = driver.findElement(By.id("siUseSSL.Grid.tbOnOff.Grid.SwitchRoot.Canvas.SwitchThumb.Grid.Border.Grid.Background"));
        //dragAndDrop(source, target) method accepts two parameters source and locator.
        //used dragAndDrop method to drag and drop the source locator to target locator
//        actions.dragAndDrop(sourceLocator, targetLocator).build().perform();

//        Actions actions = new Actions(driver);
//        actions.dragAndDrop(By.id("siUseSSL.Grid.tbOnOff.Grid.SwitchRoot.Canvas.SwitchTrack.StackPanel.Border1"), (By.id("siUseSSL.Grid.tbOnOff.Grid.SwitchRoot.Canvas.SwitchThumb.Grid.Border.Grid.Background"));




        //Position off
        //position: absolute; overflow: visible; display: inherit; cursor: pointer; left: 1px; top: 1px; width: 28px; height: 28px;
        //Position on
        //position: absolute; overflow: visible; display: inherit; cursor: pointer; left: 19px; top: 1px; width: 28px; height: 28px;


    }
}
