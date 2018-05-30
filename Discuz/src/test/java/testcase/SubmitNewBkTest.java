package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperNewBankuaiWrite;
import pageHelper.HelperReplyText;
import pageHelper.HelperWriteTextPage;

/**
 * Created by 贾夏茹 on 2018/5/9.
 */
public class SubmitNewBkTest extends BasicTestCase {
    @Test
    public void submitnewbk() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"jxr","123456");
        Thread.sleep(3000);
        HelperNewBankuaiWrite.submitnewbankuai(seleniumUtil);
        HelperWriteTextPage.newsubmittext(seleniumUtil,"新板块的第一条回复","欢迎回帖。。。。。。。。。");
        Thread.sleep(3000);
        HelperReplyText.newreplytext(seleniumUtil,"哈哈哈哈哈");
    }
}
