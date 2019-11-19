package comSpringCore.app;
import comSpringCore.client.HelloWorldServiceClient;
import comSpringCore.service.HelloWorldServie;
import comSpringCore.service.implementation.HelloWorldServiceImplementation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppRunner {



    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationContext.class);
        HelloWorldServiceClient bean = context.getBean(HelloWorldServiceClient.class);
        bean.showMessage();

    }


}
