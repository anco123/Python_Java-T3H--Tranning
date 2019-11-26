package t3hExample.xmlConfig.client;

import t3hExample.xmlConfig.service.Cxml;
import t3hExample.xmlConfig.service.Dxml;

public class Bxml {
    private Cxml cxmlInstance;

    private Dxml dxmlInstance;

    public Bxml(Cxml cxmlInstance,Dxml dxmlInstance){
        this.cxmlInstance= cxmlInstance;
        this.dxmlInstance = dxmlInstance;
    }
}
