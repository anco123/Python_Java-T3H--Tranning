package firstServletProject.services;

import firstServletProject.model.Model;

import java.util.List;

public interface InvokeModelService {
    List<Model> getModel();
    Model getModel(String id);
}
