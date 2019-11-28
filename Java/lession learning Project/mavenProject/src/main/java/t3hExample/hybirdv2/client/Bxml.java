package t3hExample.hybirdv2.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import t3hExample.hybirdv2.service.Cxml;
import t3hExample.hybirdv2.service.Dxml;
@Component
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
