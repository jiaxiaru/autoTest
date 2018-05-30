package pageHelper;

import page.UserQuit;
import util.SeleniumUtil;

/**
 * Created by 贾夏茹 on 2018/5/8.
 */
public class HelperQuit {
    /*首页退出*/
    public static void quit(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(UserQuit.USER_QUIT,20);
        seleniumUtil.click(UserQuit.USER_QUIT);
    }
    /*iframe退出链接*/
    public static void quitgunli(SeleniumUtil seleniumUtil){
        seleniumUtil.click(UserQuit.GUANLI_QUIT);
    }
}
