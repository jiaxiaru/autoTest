package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperActualText;
import pageHelper.HelperLoginPage;
import pageHelper.HelperQuit;
import pageHelper.HelperSearch;

/**
 * Created by 贾夏茹 on 2018/5/9.
 */
public class SearchText  extends BasicTestCase{//用火狐
    @Test
      public  void searchtext() throws InterruptedException {
          HelperLoginPage.login(seleniumUtil,"jxr","123456");//登录
          HelperSearch.search(seleniumUtil,"tit"); //输入文字 并搜索
          HelperActualText.actual(seleniumUtil,"tit"); //验证预期文字
          HelperQuit.quit(seleniumUtil); //退出

      }
}
