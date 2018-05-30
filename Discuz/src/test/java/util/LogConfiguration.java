package util;

import org.apache.log4j.PropertyConfigurator;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * Created by 贾夏茹 on 2018/5/7.
 */
public class LogConfiguration {
    public static void intiLog(){
        //设置日期格式
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
        String date=dateFormat.format(new Date());
        final String LogFilePath="./Log/"+"/"+date+".Log";
        Properties pro=new Properties();
        //配置日志格式
        pro.setProperty("log4j.rootLogger","info,toConsole,toFile");     //log4j级别info   输出到控制台，文件
        pro.setProperty("log4j.appender.toConsole","org.apache.log4j.ConsoleAppender");  //控制台
        pro.setProperty("log4j.appender.toConsole.layout","org.apache.log4j.PatternLayout");//灵活配置
        pro.setProperty("log4j.appender.toConsole.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");//日期格式
        pro.setProperty("log4j.appender.toFile","org.apache.log4j.DailyRollingFileAppender");  //每天产生一个日志文件
        pro.setProperty("log4j.appender.toFile.layout","org.apache.log4j.PatternLayout");
        pro.setProperty("log4j.appender.toFile.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");

        pro.setProperty("log4j.appender.toFile.file",LogFilePath);
        //是配置生效
        PropertyConfigurator.configure(pro);
        //配置生效
        PropertyConfigurator.configure(pro);

    }
}
