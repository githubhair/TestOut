package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WiFiPage extends BasePage {
    By wiFiLink = new By.ById("rectClickArea");
    By specificNetworkLink = new By.ById("gClient.WiFiNetworks.ContentPresenter.HeaderedContentControl.Grid.svScrollViewer.Grid.Viewport.ScrollContentPresenter.OuterElement.InnerElement.Border.ContentPresenter.spStackPanel.PropertyGroup.Border.ContentPresenter.lbAvailable.Grid.Border.ScrollViewer.Grid.Viewport.ScrollContentPresenter.OuterElement.InnerElement.ItemsPresenter.StackPanel.SettingsItemNetwork.Grid.rectClickArea");
    By networkPasswordField = new By.ById("");

    public WiFiPage(WebDriver driver) {
        super(driver);
    }

    public WiFiPage clickNetwork() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(wiFiLink).click();
        return new WiFiPage(driver);
    }

    public void clickWifiLink(){
        driver.findElement(specificNetworkLink).sendKeys("@CorpNetWeRSecure!&");
    }
}