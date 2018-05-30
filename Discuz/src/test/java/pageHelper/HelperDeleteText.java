package pageHelper;

import page.PageDeleteText;
import page.PageReplyText;
import util.SeleniumUtil;

/**
 * Created by 贾夏茹 on 2018/5/8.
 */
public class HelperDeleteText {
    /*复选框选中操作*/
    public static void checkbox(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageDeleteText.CHECK_BOX);
    }
    /*删除*/
    public static void delete(SeleniumUtil seleniumUtil) throws InterruptedException {
        seleniumUtil.click(PageDeleteText.MORENBANKUAI_LINK);
        seleniumUtil.click(PageDeleteText.CHECK_BOX);
        seleniumUtil.click(PageDeleteText.DELETE_LINK);
        seleniumUtil.waitForElementLoad(PageDeleteText.SURE_DELETE_BUTTON,10);
        seleniumUtil.click(PageDeleteText.SURE_DELETE_BUTTON);

    }


}
