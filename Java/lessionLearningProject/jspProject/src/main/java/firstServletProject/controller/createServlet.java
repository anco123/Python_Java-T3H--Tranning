package firstServletProject.controller;


import firstServletProject.model.Model;
import firstServletProject.services.InvokeModelService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.io.IOException;
import java.util.List;


//create new servlet
public class createServlet extends HttpServlet {

    private InvokeModelService invokeModelService;

    private WebApplicationContext webApplicationContext;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        // get Spring ApplicationContext
        webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(config.getServletContext());
        // get the bean from ApplicationContext
        invokeModelService = (InvokeModelService) webApplicationContext.getBean("todoService");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        // get the data from source using Spring Service
        List<Model> model = invokeModelService.getModel();
        // set the returned data to the variable for later use
        req.setAttribute("todos", model);
        // forward the response to the jsp page
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    //    @Override
//    public void init() throws ServletException {
//        super.init();
//        webApplicationContext = WebApplicationContextUtils.getWebApplicationContext();
//        invokeModelService = (invokeModelService) webApplicationContext.getBean()
//    }
//
//    public createServlet() {
//        super();
//    }
//
//
//    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
//
//    }

}
