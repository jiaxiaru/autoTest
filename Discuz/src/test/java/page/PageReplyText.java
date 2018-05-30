package page;

import org.openqa.selenium.By;

/**
 * Created by 贾夏茹 on 2018/5/8.
 */
public class PageReplyText {
    /*帖子链接*/
    public static final By TEXT_LINK=By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[1]/td[4]/div/a");
    /*默认板块回复帖子输入框*/
    public static final By REPLY_TEXT_BLANK=By.className("pt");
    /*回复帖子按钮*/
    public static final By REPLAY_TEXT_BUTTON=By.xpath("//*[@id=\"fastpostsubmit\"]");
    /*新板块回复帖子输入框*/
    public static final By REPLAY_NEWTEXT_Blank=By.xpath("//*[@id=\"fastpostmessage\"]");
}
