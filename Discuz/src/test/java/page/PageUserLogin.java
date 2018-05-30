package page;

import org.openqa.selenium.By;

/**
 * Created by 贾夏茹 on 2018/5/7.
 */
public class PageUserLogin {
 /*用户名输入框*/
    public static final By LOGIN_USERNAME_BLANK=By.id("ls_username");
    /*密码输入框*/
    public static final By LOGIN_PASSWORD_BLANK=By.id("ls_password");
    /*登录按钮*/
    public static final By LOGIN_BUTTON=By.xpath("//*[@id=\"lsform\"]/div/div/table/tbody/tr[2]/td[3]/button");
    /*找回密码链接*/
    public static final By LOGIN_FINDPASSWORD_LINKTEST=By.linkText("找回密码");
    /*立即注册链接*/
    public static final By LOGIN_REDISTER_LINKTEXT=By.linkText("立即注册");
    /*自动登录按钮*/
    public static final By LOGIN_AOTO_BUTTON=By.id("ls_cookietime");


}
