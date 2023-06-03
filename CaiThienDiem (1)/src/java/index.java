/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
public class index extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
         PrintWriter out = resp.getWriter();
        
        String code = req.getParameter("code");
        String name = req.getParameter("name");
        String gender = req.getParameter("gender");
        String dob = req.getParameter("dob");
        
        if (code.isEmpty() || name.isEmpty() || dob.isEmpty()) {
            out.println(" Không được để trống");
        }else {
            resp.getWriter().print("code: " + code);
            resp.getWriter().print("<br> name: " + name);
            resp.getWriter().print("<br> gender: " + gender);
            resp.getWriter().print("<br> dob: " + dob);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
   
    
}
