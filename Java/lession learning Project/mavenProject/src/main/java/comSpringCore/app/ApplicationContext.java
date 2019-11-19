package comSpringCore.app;

import comSpringCore.client.HelloWorldServiceClient;
import comSpringCore.service.HelloWorldServie;
import comSpringCore.service.implementation.HelloWorldServiceImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "comSpringCore.service")
public class ApplicationContext {

//    @Bean
//    public HelloWorldServie createHelloWorkService(){
//        return new HelloWorldServiceImplementation();
//    }

    @Bean
    @Scope("prototype")
    HelloWorldServiceClient createClient(){
        return new HelloWorldServiceClient();

    }
}
