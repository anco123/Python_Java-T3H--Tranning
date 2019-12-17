package test;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class servletTest extends HttpServlet {
    public servletTest() {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletOutputStream out = resp.getOutputStream();
        out.println("<html>");
        out.println("<head><title>Hello world</title></head>");
        out.println("<body><h1>Hello world, this is body </h1></body>");

        out.println("</html>");



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
