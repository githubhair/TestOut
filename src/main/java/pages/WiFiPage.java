package wifi;

import base.BasePage;
import net.bytebuddy.build.ToStringPlugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WiFiPage extends BasePage {
    By wiFiLink = new By.ById("rectClickArea");
    By specificNetworkLink = new By.ById("SettingsItemNetwork.Grid.tbText");
    By networkPasswordField = new By.ById("grdMousePreview");

    public WiFiPage(WebDriver driver) {
        super(driver);
    }

    public WiFiPage clickNetwork() {
        driver.findElement(wiFiLink).click();
        return new WiFiPage(driver);
    }

    public void clickWifiLink(){
        driver.findElement(specificNetworkLink).sendKeys("@CorpNetWeRSecure!&");
    }
}