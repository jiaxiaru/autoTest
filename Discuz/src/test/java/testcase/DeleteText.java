package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperDeleteText;
import pageHelper.HelperLoginPage;

/**
 * Created by 贾夏茹 on 2018/5/8.
 */
public class DeleteText extends BasicTestCase {
    @Test
    public void delete() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","password");
        HelperDeleteText.delete(seleniumUtil);
    }

}
