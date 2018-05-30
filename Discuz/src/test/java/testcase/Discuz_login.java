package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;

/**
 * Created by 贾夏茹 on 2018/5/7.
 */
public class Discuz_login extends  BasicTestCase {

    @Test
    public void login() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","password");
        Thread.sleep(3000);
    }
}
