package pageHelper;

import page.PageNewBankuaiWrite;
import util.SeleniumUtil;

/**
 * Created by 贾夏茹 on 2018/5/9.
 */
public class HelperNewBankuaiWrite {
    public static void submitnewbankuai(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageNewBankuaiWrite.NEW_BANKUAI_LINK);//点击新板块链接

    }
}
