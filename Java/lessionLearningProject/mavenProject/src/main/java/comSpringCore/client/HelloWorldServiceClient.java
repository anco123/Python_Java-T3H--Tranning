package comSpringCore.client;



import comSpringCore.service.HelloWorldServie;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorldServiceClient {
    @Autowired
    private HelloWorldServie helloWorld;

    public void showMessage() {
        helloWorld.sayHi("Hello world!");

    }

    public HelloWorldServie getHelloWorld() {
        return helloWorld;
    }
}
