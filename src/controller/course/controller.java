package controller.course;

import DBHelper.CourseDBHelper;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by cafe5hsang on 12/5/2017.
 */
@WebServlet("/admin/course")
public class controller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("_CONTENT_FILE", "pages/courses/courses");
        request.setAttribute("_MOD_STYLES", "pages/courses/styles");
        request.setAttribute("_MOD_SCRIPTS", "pages/courses/scripts");

        String action = request.getParameter("action");
        if (action == null) {
            action = "list";
        }

        RequestDispatcher rd;
        switch(action) {
            case "list":
                rd = request.getRequestDispatcher("GetListAction.java");
                rd.forward(request, response);
                break;

            case "course_category":
                rd = request.getRequestDispatcher(request.getContextPath() + "/view/admin/index.jsp");
                rd.forward(request, response);
                break;
        }
    }
}
