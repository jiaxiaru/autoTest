package pageHelper;


import org.apache.log4j.Logger;
import page.PageUserLogin;
import util.SeleniumUtil;

/**
 * Created by 贾夏茹 on 2018/5/7.
 */
public class HelperLoginPage {
    public Logger logger=Logger.getLogger(HelperLoginPage.class);

    /*点击登录按钮*/
    public static void clickLoginLink(SeleniumUtil seleniumUtil){
               seleniumUtil.click(PageUserLogin.LOGIN_BUTTON);
    }
    /*用户名输入*/
    public static void sendLoginUsername(SeleniumUtil seleniumUtil,String username){
        seleniumUtil.sendkeys(PageUserLogin.LOGIN_USERNAME_BLANK,username);
    }
    /*密码输入*/
    public static void sendLoginPassword(SeleniumUtil seleniumUtil,String password){
        seleniumUtil.sendkeys(PageUserLogin.LOGIN_PASSWORD_BLANK,password);
    }
    /*登录*/
    public static void login(SeleniumUtil seleniumUtil,String username,String password){
        seleniumUtil.sendkeys(PageUserLogin.LOGIN_USERNAME_BLANK,username);
        seleniumUtil.sendkeys(PageUserLogin.LOGIN_PASSWORD_BLANK,password);
        seleniumUtil.click(PageUserLogin.LOGIN_BUTTON);

    }
}
