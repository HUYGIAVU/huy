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
public class ex extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
         PrintWriter out = resp.getWriter();
        
        String code = req.getParameter("code");
        String name = req.getParameter("name");
        String subject = req.getParameter("subject");
        String dob = req.getParameter("dob");
        
        if (code.isEmpty() || name.isEmpty() || dob.isEmpty()) {
            out.println(" Không được để trống");
        }else {
            resp.getWriter().print("code: " + code + "<br>");
            resp.getWriter().print("name: " + name + "<br>" );
            resp.getWriter().print("subject: " + subject + "<br>");
            resp.getWriter().print("dob: " + dob.charAt(5) + "" + dob.charAt(6) + "/" + dob.charAt(8) + "" + dob.charAt(9) + "/" +dob.charAt(2) + "" +dob.charAt(3) + "<br>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
   
    
}
