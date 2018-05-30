package pageHelper;

import page.PageActualText;
import util.SeleniumUtil;

/**
 * Created by 贾夏茹 on 2018/5/9.
 */
public class HelperActualText {
    /*点击实际文本链接*/
    public static void actual(SeleniumUtil seleniumUtil,String expected){
        seleniumUtil.windowhandles(PageActualText.ACTUAL_TEXT_LINK);//切换窗口
        seleniumUtil.waitForElementLoad(PageActualText.ACTUAL_TEXT_LINK,20);
        seleniumUtil.click(PageActualText.ACTUAL_TEXT_LINK); //点击实际文本链接
        //seleniumUtil.waitForElementLoad(PageActualText.ACTUAL_TEXT_TITLE,20);
        seleniumUtil.windowhandles(PageActualText.ACTUAL_TEXT_TITLE);//切换窗口
        seleniumUtil.waitForElementLoad(PageActualText.ACTUAL_TEXT_TITLE,20);
        seleniumUtil.assertForText(PageActualText.ACTUAL_TEXT_TITLE,expected);
        //seleniumUtil.assertForText();
    }

}
