package t3hExample.hybirdv2.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Axml {
    private Bxml bxmlInstance;

    @Autowired
    public Axml(Bxml bxmlInstance){
        this.bxmlInstance = bxmlInstance;
    }
}
