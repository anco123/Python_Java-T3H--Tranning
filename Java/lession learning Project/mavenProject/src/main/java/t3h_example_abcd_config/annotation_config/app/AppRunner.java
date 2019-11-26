package t3h_example_abcd_config.annotation_config.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import t3h_example_abcd_config.annotation_config.client.A;
import t3h_example_abcd_config.annotation_config.client.B;
import t3h_example_abcd_config.annotation_config.service.C;
import t3h_example_abcd_config.annotation_config.service.D;

@Configuration
public class AppRunner {

    @Bean
    public A getA(){
        return new A();
    }

    @Bean
    public B getB(){
        return new B();
    }

    @Bean
    public C getC(){
        return new C();
    }

    @Bean
    public D getD(){
        return new D();
    }

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppRunner.class);

    }
}
