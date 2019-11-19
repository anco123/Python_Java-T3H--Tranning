package comSpringCore.service.implementation;
import comSpringCore.service.HelloWorldServie;

public class HelloWorldServiceImplementation implements HelloWorldServie {
    public void sayHi(String message) {
        System.out.println(message);
    }

}
