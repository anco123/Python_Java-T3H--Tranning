package t3hExample.xmlConfig.Apprunner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class apprunner {

    public static void main(String[] args) {
            ApplicationContext contextXml = new ClassPathXmlApplicationContext("application.xml");

    }
}
