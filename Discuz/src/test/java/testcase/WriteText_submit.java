package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperWriteTextPage;

/**
 * Created by 贾夏茹 on 2018/5/7.
 */
public class WriteText_submit extends BasicTestCase{

    @Test
    public void submit() throws InterruptedException {//用火狐
        HelperLoginPage.login(seleniumUtil,"admin","password");
        HelperWriteTextPage.submittext(seleniumUtil,"我的新帖子","欢迎回帖");

    }

}
