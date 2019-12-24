package test;

import jdbc.ConnectionUtils;
import model.CustomerModel;
import querysource.CustomersService;
import querysource.ExcuteQueryGetList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class servletTest extends HttpServlet {



//        ServletOutputStream out = resp.getOutputStream();
//        out.println("<html>");
//        out.println("<head><title>Hello world</title></head>");
//        out.println("<body><h1>Hello world, this is body </h1></body>");
//        out.println("</html>");

//    public servletTest() {
//


        CustomersService customersService;

        public void init() {
            customersService = new ExcuteQueryGetList();
        }

//        try {
//            Connection connection = ConnectionUtils.getMySQLConnection();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        String task = req.getRequestURI().substring(req.getContextPath().length());
//        if ("/home".equals(task)){
//            RequestDispatcher dispatcher = req.getRequestDispatcher("view/servletTag.jsp");
//            dispatcher.forward(req, resp);
//        }
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<CustomerModel> listCustomers = customersService.listCustomers();
        req.setAttribute("viewListCustomer", listCustomers);
//
        String task = req.getRequestURI().substring(req.getContextPath().length());
        if ("/home".equals(task)) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("view/_viewlistcustomer.jsp");
            dispatcher.forward(req, resp);
//
        }



//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        this.do(req,resp);
//    }

    }
}
