package pageHelper;

import page.PageReplyText;
import page.PageWriteText;
import util.SeleniumUtil;

/**
 * Created by 贾夏茹 on 2018/5/8.
 */
public class HelperReplyText {
    /*默认板块回复帖子*/
    public static void replytext(SeleniumUtil seleniumUtil, String replymessages){
        seleniumUtil.click(PageReplyText.TEXT_LINK);
        seleniumUtil.sendkeys(PageReplyText.REPLY_TEXT_BLANK,replymessages);
        seleniumUtil.click(PageReplyText.REPLAY_TEXT_BUTTON);
    }
    public static void newreplytext(SeleniumUtil seleniumUtil, String replymessages) throws InterruptedException {
        //seleniumUtil.click(PageReplyText.TEXT_LINK);
        seleniumUtil.sendkeys(PageReplyText.REPLAY_NEWTEXT_Blank,replymessages);
        seleniumUtil.waitForElementLoad(PageReplyText.REPLAY_TEXT_BUTTON,5);
        seleniumUtil.click(PageReplyText.REPLAY_TEXT_BUTTON);
    }

}
