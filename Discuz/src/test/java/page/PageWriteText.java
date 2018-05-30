package page;

import org.openqa.selenium.By;

/**
 * Created by 贾夏茹 on 2018/5/7.
 */
public class PageWriteText {
    /*默认板块链接*/
    public static final By MORENBANKUAI_LINK=By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[1]/td[2]/h2/a");
    /*发帖标题输入框*/
    public static final By WRITE_TITLE_BLANK=By.id("subject");
    /*发帖文章输入框*/
    public static final By WRITE_TEXT_BLANK=By.id("fastpostmessage");
    /*发表帖子按钮*/
    public static final By WRITE_BUTTON=By.id("fastpostsubmit");




}
