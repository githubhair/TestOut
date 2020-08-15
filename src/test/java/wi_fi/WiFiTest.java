package wi_fi;

import Base.BaseTests;
import pages.HomePage;
import org.testng.annotations.Test;
import pages.SettingSSLPage;
import pages.WiFiPage;

public class WiFiTest extends BaseTests {

    @Test
    public void clickWiFiLink() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        homePage.onlyClickSettingsLink();
        Thread.sleep(1000);

       WiFiPage wiFiPage = new WiFiPage(driver);
       wiFiPage.clickNetwork();
       wiFiPage.clickWifiLink(); //not sure why this isn't getting selected

    }
}
