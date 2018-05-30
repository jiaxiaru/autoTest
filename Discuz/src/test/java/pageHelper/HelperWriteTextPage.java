package pageHelper;

import page.PageUserLogin;
import page.PageWriteText;
import util.SeleniumUtil;

/**
 * Created by 贾夏茹 on 2018/5/7.
 */
public class HelperWriteTextPage {
    /*默认板块链接*/
    public  static void morenbankuailink(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageWriteText.MORENBANKUAI_LINK);
    }
    /*帖子标题输入*/
    public static void sendWriteTitle(SeleniumUtil seleniumUtil,String title){
        seleniumUtil.sendkeys(PageWriteText.WRITE_TITLE_BLANK,title);
    }
    /*帖子内容输入*/
    public static void sendWriteText(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.sendkeys(PageWriteText.WRITE_TEXT_BLANK,text);
    }
    /*点击发表帖子按钮*/
    public static void clicksubmitbutton(SeleniumUtil seleniumUtil){

        seleniumUtil.click(PageWriteText.WRITE_BUTTON);
    }
    public static void submittext(SeleniumUtil seleniumUtil,String title,String text){
        seleniumUtil.waitForElementLoad(PageWriteText.MORENBANKUAI_LINK,20);
        seleniumUtil.click(PageWriteText.MORENBANKUAI_LINK);

        seleniumUtil.sendkeys(PageWriteText.WRITE_TITLE_BLANK,title);
        seleniumUtil.sendkeys(PageWriteText.WRITE_TEXT_BLANK,text);
        seleniumUtil.click(PageWriteText.WRITE_BUTTON);
    }
    /*新板块回复帖子*/
    public static void newsubmittext(SeleniumUtil seleniumUtil,String title,String text){
        //seleniumUtil.click(PageWriteText.MORENBANKUAI_LINK);
        seleniumUtil.sendkeys(PageWriteText.WRITE_TITLE_BLANK,title);
        seleniumUtil.sendkeys(PageWriteText.WRITE_TEXT_BLANK,text);
        seleniumUtil.click(PageWriteText.WRITE_BUTTON);
    }


}
