package t3hExample.hybrid.client;

import org.springframework.beans.factory.annotation.Autowired;

public class Axml {
    private Bxml bxmlInstance;

    @Autowired
    public Axml(Bxml bxmlInstance){
        this.bxmlInstance = bxmlInstance;
    }
}
