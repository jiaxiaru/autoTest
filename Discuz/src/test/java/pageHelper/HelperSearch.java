package pageHelper;

import page.PageSearchText;
import page.UserQuit;
import util.SeleniumUtil;

/**
 * Created by 贾夏茹 on 2018/5/9.
 */
public class HelperSearch {
    /*搜索帖子*/
    public static void search(SeleniumUtil seleniumUtil,String searchtext){
        seleniumUtil.waitForElementLoad(PageSearchText.SEARCH_TEXT_BUTTON,20);
        seleniumUtil.sendkeys(PageSearchText.SEARCH_TEXT_BLANK,searchtext);//搜索输入框
        seleniumUtil.click(PageSearchText.SEARCH_TEXT_BUTTON);//搜索按钮
    }
}
