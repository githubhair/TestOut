package Base;

import home.HomePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class BaseTests {

    protected WebDriver driver;
@Test
    public void baseSetup() throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
    driver = new ChromeDriver();
    driver.get("http://testoutlivecontent.blob.core.windows.net/netpro2018v5-en-us/en-us/sims/typescriptv1/netpro2018v5/simstartup_webpack.html?package=netpro2018v5windowspackage&sim=ipademail_np5&dev=true&automation=true");
    //System.out.println(driver.getTitle());
    //driver.manage().window().setSize(new Dimension(925, 950));
    //driver.manage().window().maximize();

    HomePage homepage = new HomePage(driver);
    homepage.clickSettingsLink();



    }
}

//        homePage = new HomePage(driver);
//        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        homePage.clickSkipDemo();
    //
//    @AfterClass
//    public void cleanUp() {
//        driver.quit();
//    }

