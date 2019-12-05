package javaParametterT3hSpringCore.pre.xml;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("dbConfig_javaParametterT3hSpringCore.xml");
        DbInfo info = context.getBean(DbInfo.class);
        System.out.println(info);
    }
}
