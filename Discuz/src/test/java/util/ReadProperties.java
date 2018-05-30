package util;

import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by 贾夏茹 on 2018/5/8.
 */
public class ReadProperties {
    public static String browserName;
    public static WebDriver driver;
    public static String url;
    public static void configdata()  throws IOException {
        Properties properties=new Properties();
        //加载配置文件
        InputStream input=new FileInputStream(".\\config.properties");
        properties.load(input);
       browserName= properties.getProperty("browserName");
        url=properties.getProperty("url");
    }

    static {
        try {
            configdata();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
