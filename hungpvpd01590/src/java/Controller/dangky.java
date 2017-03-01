/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
@WebServlet(name = "dangky", urlPatterns = {"/dangky"})
public class dangky extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
      
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String user=request.getParameter("Username");
        String pass=request.getParameter("Pass");
        String vaitro=request.getParameter("Vai_tro");
        String hoten=request.getParameter("Ho_ten");
        String diachi=request.getParameter("Dia_chi");
        String email=request.getParameter("Email");
        String sdt =request.getParameter("Sdt");
         try {
            
            
            PreparedStatement pr=Controller.ConnecDB.getConnecttion().prepareStatement("INSERT into TAI_KHOAN values(?,?,?,?,?,?,?)");
            pr.setString(1, user);
            pr.setString(2, pass);
            pr.setString(3, vaitro);
            pr.setNString(4, hoten);
            pr.setNString(5, diachi);
            pr.setString(6, email);
            pr.setString(7, sdt);
            
            pr.executeUpdate();
            PrintWriter out = response.getWriter();
            out.println("<h1>Đăng kí thành công.</h1>");
            out.println("<a href='Index.jsp'>Trở lại trang chủ</a>");
            out.println("<p>"+hoten+"</p>");
        } catch (IOException | SQLException ex) {
            PrintWriter out = response.getWriter();
            out.println("<h1>Đăng kí thất bại.</h1>");
            out.println("<h3 style='color:#FF0004'>Sai thông tin hoặc tên đăng nhập đã tồn tại.</h3>");
            out.println("<a href='Index.jsp'>Trở lại trang chủ</a>");
            
            
            
        }
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
