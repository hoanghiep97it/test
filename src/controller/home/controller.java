package controller.home;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin")
public class controller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("_CONTENT_FILE", "pages/home/home");
        request.setAttribute("_MOD_STYLES", "pages/home/styles");
        request.setAttribute("_MOD_SCRIPTS", "pages/home/scripts");



        RequestDispatcher rd = request.getRequestDispatcher(request.getContextPath() + "/view/admin/index.jsp");
        rd.forward(request, response);
    }
}
