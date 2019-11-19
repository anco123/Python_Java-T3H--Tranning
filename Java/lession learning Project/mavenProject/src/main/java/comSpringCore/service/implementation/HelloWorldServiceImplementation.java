package comSpringCore.service.implementation;
import comSpringCore.service.HelloWorldServie;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImplementation implements HelloWorldServie {
    public void sayHi(String message) {
        System.out.println(message);
    }

}
