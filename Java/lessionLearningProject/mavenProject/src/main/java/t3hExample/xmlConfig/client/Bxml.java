package t3hExample.xmlConfig.client;

import t3hExample.xmlConfig.service.Cxml;
import t3hExample.xmlConfig.service.Dxml;

public class Bxml {
    private Cxml cxmlInstance;

    private Dxml dxmlInstance;


    public void setCxmlInstance(Cxml cxmlInstance) {
        this.cxmlInstance = cxmlInstance;
    }

    public void setDxmlInstance(Dxml dxmlInstance) {
        this.dxmlInstance = dxmlInstance;
    }
}
