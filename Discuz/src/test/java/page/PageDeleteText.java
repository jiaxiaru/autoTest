package page;

import org.openqa.selenium.By;

/**
 * Created by 贾夏茹 on 2018/5/8.
 */
public class PageDeleteText {
    /*默认板块链接*/
    public static final By MORENBANKUAI_LINK=By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[1]/td[2]/h2/a");
    /*帖子复选按钮*/
    public static final By CHECK_BOX=By.xpath("//*[@id=\"normalthread_21\"]/tr/td[2]/input");
    /*删除链接*/
    public static final By DELETE_LINK=By.xpath("//*[@id=\"mdly\"]/p[1]/strong[1]/a");
    /*确定删除按钮*/
    public static final By SURE_DELETE_BUTTON=By.id("modsubmit");

}
