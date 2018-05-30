package page;

import org.openqa.selenium.By;

/**
 * Created by 贾夏茹 on 2018/5/8.
 */
public class UserQuit {
    /*首页退出链接*/
   // public static final By USER_QUIT=By.xpath("//*[@id=\"um\"]/p[1]/a[7]");
    /*火狐首页退出*/
    public static final By USER_QUIT=By.linkText("退出");
    /*管理中心*/
    public static final By GUANLI_QUIT=By.xpath("//*[@id=\"frameuinfo\"]/p[1]/a");
}
