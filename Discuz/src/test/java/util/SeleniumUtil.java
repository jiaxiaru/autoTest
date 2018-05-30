package util;
import javafx.scene.control.Cell;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;

import java.io.*;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.NoSuchElementException;

/**
 * Created by 贾夏茹 on 2018/5/7.
 */
public class SeleniumUtil {

         private static Logger logger=Logger.getLogger(SeleniumUtil.class);
         public WebDriver driver=null;
    /*获取webdriver*/
   public WebDriver getDriver(String DriverType){
     if(DriverType.equals("chrome")){
         System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
         driver=new ChromeDriver();
         logger.info("启动ChromeDriver");
     }else if(DriverType.equals("firefox")){
         System.setProperty("webdriver.gecko.driver","D:\\firefox\\geckodriver.exe");
         driver=new FirefoxDriver();
         logger.info("启动FirefoxDriver");
     }else{
         logger.info("不能识别");
     }
     return driver;
 }

    /*识别一个元素*/
    public WebElement findElement(By by){
        WebElement ele=null;
        try {
            ele=driver.findElement(by);
            logger.info("找到元素"+ele);
            return ele;
        }catch(NoSuchElementException e){
            e.printStackTrace();
            logger.info("没有找到元素");
            return null;
        }

    }

   /*打开网址*/
    public void url(String url){
        driver.get(url);
        logger.info("打开网址"+url);
    }
    /*对文本框进行操作*/
    public void sendkeys(By by,String text){
        WebElement ele=findElement(by);
        ele.sendKeys(text);
        logger.info("输入内容为："+text);

    }
    /*对元素进行点击操作*/
    public void click(By by){
        WebElement ele=findElement(by);
        ele.click();
        logger.info("元素点击成功");
    }
    /*获取句柄窗口*/
    public void windowhandles(By by){
        Set<String> windows=driver.getWindowHandles();
        for(String window:windows){
            driver.switchTo().window(window);
            System.out.println("获取每一个句柄/窗口："+window);
            logger.info("获取窗口"+window);
        }

    }
   /*切换iframe*/
    public void getiframe(String id){
        driver.switchTo().frame(id);
    }
    /*退出iframe*/
    public void quitiframe(){
        driver.switchTo().defaultContent();
    }

    /**校验元素是否存在*/
    public boolean isExist(By element){
        try{
            driver.findElement(element);
            return true;
        } catch (NoSuchElementException e){
            //如果输出一个对象 toString
            logger.info(element.toString()+"元素不存在");
        }
        return false;
    }

    /**根据顶部title判断当前页面是否是预期页面*/
    public void assertPage(String expected){
        String actual =driver.getTitle();
        try{
            Assert.assertEquals(actual, expected);
        } catch (AssertionError e){
            logger.error("预期文字是：["+expected+"],但实际文字是: ["+actual+"]");
            Assert.fail("预期文字是：["+expected+"],但实际文字是: ["+actual+"]");
        }
        logger.info("找到了对应title，当前页面正确：【"+actual+"】");
    }

    /**校验文本是否与预期一致*/
    public void assertForText(By by ,String expected){
        String  actual=findElement(by).getText();
        try{
            Assert.assertEquals(actual, expected);
        } catch (AssertionError e){
            logger.error("期望的文字是 [" + expected + "] 但是找到了 [" + actual + "]");
            Assert.fail("期望的文字是 [" + expected + "] 但是找到了 [" + actual + "]");
        }
        logger.info("找到了期望的文字: [" + expected + "]");
    }
    /**设置显示等待元素*/
    public void waitForElementLoad(final By by, int timeOut){
        logger.info("开始查找元素："+by);
        try{
            WebDriverWait wait = new WebDriverWait(driver, timeOut, 1000);
            wait.until(new ExpectedCondition<Boolean>() {

                public Boolean apply(WebDriver driver) {
                    WebElement element = driver.findElement(by);
                    return element.isDisplayed();
                }
            });
        } catch (Exception e){
            logger.error("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
            Assert.fail("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
        }
        logger.info("找到了元素 [" + by + "]");
    }
    /** 截图函数 */
    public static void takesSceenshot(WebDriver chromeDriver,String filepath,String filename) throws Exception {
        File screenshotFile = ((TakesScreenshot)chromeDriver).getScreenshotAs(OutputType.FILE);
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
        String data=dateFormat.format(new Date());
        logger.info("开始进行截图");
        FileUtils.copyFile(screenshotFile,new File(filepath+data+filename));
    }
    /**截图函数相对路径固定*/
    public static void takesSceenshots(WebDriver chromeDriver,String filename) throws Exception {
        File screenshotFile = ((TakesScreenshot)chromeDriver).getScreenshotAs(OutputType.FILE);
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
        String data=dateFormat.format(new Date());
        logger.info("开始进行截图");
        FileUtils.copyFile(screenshotFile,new File("./result/takessceenchot/"+data+filename+".png"));
    }
    /**截图函数加强版* /
     *
     * @param tr
     * @param driver
     */
    public void saveScreenShot(ITestResult tr, WebDriver driver) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        String mDateTime = formatter.format(new Date());
        String fileName = mDateTime + "_" + tr.getName();
        String filePath = "";
        try {
            // 这里可以调用不同框架的截图功能
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            filePath = "result/screenshot/"+ fileName + ".jpg";
            File destFile = new File(filePath);
            FileUtils.copyFile(screenshot, destFile);
            logger.info("["+fileName + "] 截图成功，保存在：" + "[ " + filePath + " ]");

        } catch (Exception e) {
            filePath = "["+fileName+"]" + " ,截图失败，原因：" + e.getMessage();
            logger.error(filePath);
        }


    }
    /**获取文件的绝对路径 */
    public static  String getFilePath(String filePath) throws URISyntaxException {
        File file= new File(sun.reflect.Reflection.getCallerClass(2).getResource(filePath).toURI());
        return file.getAbsolutePath();
    }
    /** junit中的使用方法读取csv文件*/
    public static List<String[]> csv_data(String filepath) throws Exception {
        List<String[]> list=new ArrayList<String[]>();
        InputStream in=null;
        BufferedReader buf=null;

        in=new FileInputStream(filepath);
        buf=new BufferedReader(new InputStreamReader(in));
        String tmp;
        while(!(tmp= StringUtils.trimToEmpty(buf.readLine())).equals("")){
            String user[]=tmp.split(",");
            list.add(user);

        }
        return list;
    }
     /*testng中的使用方法:读取excel文件*/



}
