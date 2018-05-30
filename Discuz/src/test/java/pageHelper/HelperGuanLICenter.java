package pageHelper;

import page.PageGuanLiCenter;
import util.SeleniumUtil;

/**
 * Created by 贾夏茹 on 2018/5/8.
 */
public class HelperGuanLICenter {
    /*点击顶部管理中心链接*/
    public static void gunlicenterlink(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageGuanLiCenter.GUANLI_CENTER_LINK);
    }
   public static void guanli(SeleniumUtil seleniumUtil,String password) throws InterruptedException {
       seleniumUtil.waitForElementLoad(PageGuanLiCenter.GUANLI_CENTER_LINK,20);
       seleniumUtil.click(PageGuanLiCenter.GUANLI_CENTER_LINK);
       seleniumUtil.windowhandles(PageGuanLiCenter.GUANLI_BUTTON);//切换窗口
       seleniumUtil.sendkeys(PageGuanLiCenter.GUANLI_PASSWORD_BLANK,"password");
       seleniumUtil.click(PageGuanLiCenter.GUANLI_BUTTON);//登录管理中心
       seleniumUtil.windowhandles(PageGuanLiCenter.GUANLI_BUTTON);
       seleniumUtil.click(PageGuanLiCenter.LUNTAN_LINK);
       seleniumUtil.getiframe("main");//切换iframe
       seleniumUtil.waitForElementLoad(PageGuanLiCenter.CREATE_NEW_BANKUAI,10);
       seleniumUtil.click(PageGuanLiCenter.CREATE_NEW_BANKUAI);
       seleniumUtil.click(PageGuanLiCenter.SUBMIT_BUTTON);
       seleniumUtil.quitiframe();

   }
}
