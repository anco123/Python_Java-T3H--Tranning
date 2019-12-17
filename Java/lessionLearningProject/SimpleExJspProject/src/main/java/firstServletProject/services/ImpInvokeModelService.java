package firstServletProject.services;

import firstServletProject.model.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImpInvokeModelService implements InvokeModelService {
    private static final long serialVersionUID = 1L;

    private Map<String, Model> modelInstance = new HashMap<>();


//    public Map<String, Model> getModel(){return ,modelInstance};


    public ImpInvokeModelService(){
        Model model1 = new Model();
        Model model2 = new Model();
        model1.setId(1);
        model1.setPersonDetail("model 1");
        model2.setId(2);
        model2.setPersonDetail("model 2");




    }

    @Override
    public List<Model> getModel() {
        return new ArrayList<>(modelInstance.values());
    }

    @Override
    public Model getModel(String id) {
        return modelInstance.get(id);
    }
}
