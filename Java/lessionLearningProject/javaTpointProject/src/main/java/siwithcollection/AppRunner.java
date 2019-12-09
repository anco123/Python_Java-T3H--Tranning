package siwithcollection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:sourc_siwithcollection/rcSiWithCollection.xml");
    }
}
