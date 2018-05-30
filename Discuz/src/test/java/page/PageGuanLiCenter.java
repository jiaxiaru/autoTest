package page;

import org.openqa.selenium.By;

/**
 * Created by 贾夏茹 on 2018/5/8.
 */
public class PageGuanLiCenter {
    /*顶部管理中心链接*/
    public static final By GUANLI_CENTER_LINK=By.xpath("//*[@id=\"um\"]/p[1]/a[6]");
    /*管理中心密码输入框*/
    public static final By GUANLI_PASSWORD_BLANK=By.className("txt");
    /*管理中心登录按钮*/
    public static final By GUANLI_BUTTON=By.xpath("//*[@id=\"loginform\"]/p[9]/input");
    /*顶部论坛链接*/
    public static final By LUNTAN_LINK=By.id("header_forum");
    /* 添加新板块链接*/
    public static final By CREATE_NEW_BANKUAI=By.xpath("//*[@id=\"cpform\"]/table/tbody[3]/tr/td[2]/div/a");
    /*板块提交按钮*/
    public static final By SUBMIT_BUTTON=By.id("submit_editsubmit");

}
