package t3hExample.hybrid.client;

import org.springframework.beans.factory.annotation.Autowired;
import t3hExample.hybrid.service.Cxml;
import t3hExample.hybrid.service.Dxml;

public class Bxml {
    private Cxml cxmlInstance;

    private Dxml dxmlInstance;

    @Autowired
    public Bxml(Cxml cxmlInstance) {
        this.cxmlInstance = cxmlInstance;
    }

    @Autowired
    public void setDxmlInstance(Dxml dxmlInstance) {
        this.dxmlInstance = dxmlInstance;
    }
}
