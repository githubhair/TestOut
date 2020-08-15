package Base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTests {

    protected WebDriver driver;
@BeforeTest
    public void baseSetup() throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
    driver = new ChromeDriver();
    driver.get("http://testoutlivecontent.blob.core.windows.net/netpro2018v5-en-us/en-us/sims/typescriptv1/netpro2018v5/simstartup_webpack.html?package=netpro2018v5windowspackage&sim=ipademail_np5&dev=true&automation=true");
    //System.out.println(driver.getTitle());
    //driver.manage().window().setSize(new Dimension(925, 950));
    driver.manage().window().fullscreen();

    Thread.sleep(5000);

    HomePage homepage = new HomePage(driver);
    homepage.changeSize();
}
//    @AfterTest
//    public void tearDown(){
//    driver.close();



}

//        homePage = new HomePage(driver);
//        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        homePage.clickSkipDemo();
    //
//    @AfterClass
//    public void cleanUp() {
//        driver.quit();
//    }

