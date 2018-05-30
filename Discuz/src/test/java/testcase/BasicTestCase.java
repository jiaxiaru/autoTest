package testcase;

import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.LogConfiguration;
import util.ReadProperties;
import util.SeleniumUtil;

import java.io.IOException;

/**
 * Created by 贾夏茹 on 2018/5/7.
 */
public class BasicTestCase {
    SeleniumUtil seleniumUtil=null;
    public WebDriver  driver=null;

    @BeforeMethod
    public void setUp() throws IOException {
        LogConfiguration.intiLog();
        seleniumUtil=new SeleniumUtil();
        /* System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");//设置系统属性
         driver=seleniumUtil.getDriver("chrome");*/
        //调用readproperties里面的方法 属性 实现浏览器切换
        seleniumUtil.getDriver(ReadProperties.browserName);
        seleniumUtil.url(ReadProperties.url);
    }

    @AfterMethod
    public void tearDown(){
        //driver.quit();
    }
}
