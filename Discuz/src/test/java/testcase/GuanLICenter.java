package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperDeleteText;
import pageHelper.HelperGuanLICenter;
import pageHelper.HelperLoginPage;
import pageHelper.HelperQuit;

/**
 * Created by 贾夏茹 on 2018/5/8.
 */
public class GuanLICenter extends BasicTestCase {
    @Test
    public void guanlicenter() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","password");
        //Thread.sleep(3000);
        HelperGuanLICenter.guanli(seleniumUtil,"password");
       // Thread.sleep(3000);
        HelperQuit.quitgunli(seleniumUtil);

    }
}
