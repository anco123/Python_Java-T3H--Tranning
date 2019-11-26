package t3hExample.xmlConfig.Apprunner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class apprunner {
//    static {}

    public static void main(String[] args) {
        ApplicationContext contextXml =
                new FileSystemXmlApplicationContext("/src/main/resource/application.xml");
//                new ClassPathXmlApplicationContext("Classpath:application.xml");

//        Axml axmlInstance = contextXml.getBean(Axml.class);
//        Bxml bxmlInstance = contextXml.getBean(Bxml.class);
//        Cxml cxmlInstance = contextXml.getBean(Cxml.class);
//        Dxml dxmlInstance = contextXml.getBean(Dxml.class);



    }
}
