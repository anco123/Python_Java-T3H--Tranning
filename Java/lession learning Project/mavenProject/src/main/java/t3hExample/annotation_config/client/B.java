package t3hExample.annotation_config.client;

import org.springframework.beans.factory.annotation.Autowired;
import t3hExample.annotation_config.service.C;
import t3hExample.annotation_config.service.D;

public class B {

    @Autowired
    public D d;

    @Autowired
    public C c;

}
