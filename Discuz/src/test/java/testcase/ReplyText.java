package testcase;

import org.testng.annotations.Test;
import page.UserQuit;
import pageHelper.HelperLoginPage;
import pageHelper.HelperQuit;
import pageHelper.HelperReplyText;
import util.SeleniumUtil;

/**
 * Created by 贾夏茹 on 2018/5/8.
 */
public class ReplyText extends BasicTestCase {
    @Test
    //默认板块回复
    public  void replytext() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","password");
        Thread.sleep(3000);
        HelperReplyText.replytext(seleniumUtil,"哈哈");
        HelperQuit.quit(seleniumUtil);

    }

}
