package t3h_example_abcd_config.xmlConfig.Apprunner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import t3h_example_abcd_config.xmlConfig.client.Axml;
import t3h_example_abcd_config.xmlConfig.client.Bxml;
import t3h_example_abcd_config.xmlConfig.service.Cxml;
import t3h_example_abcd_config.xmlConfig.service.Dxml;

public class apprunner {
//    static {}

    public static void main(String[] args) {
        ApplicationContext contextXml =
//                new FileSystemXmlApplicationContext("/src/main/resource/application.xml");
                new ClassPathXmlApplicationContext("classpath:application.xml");

//        Axml axmlInstance = contextXml.getBean(Axml.class);
        Bxml bxmlInstance = contextXml.getBean(Bxml.class);
        Cxml cxmlInstance = contextXml.getBean(Cxml.class);
        Dxml dxmlInstance = contextXml.getBean(Dxml.class);



    }
}
