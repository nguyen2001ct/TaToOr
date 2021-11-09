/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tatoor.controller;

import com.tatoor.Dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author nguye
 */
@WebServlet(name = "CreateAccount", urlPatterns = {"/CreateAccount"})
public class CreateAccount extends HttpServlet {

    private final String Success_Page = "index.jsp";
    private final String Failed_Page = "Fail.jsp";

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
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        String url = "index.jsp";
        String taiKhoan = request.getParameter("taiKhoan");
        String pass = request.getParameter("pass");
        String ten = request.getParameter("ten");
        String gioitinh = request.getParameter("gioitinh");
        String namsinh = request.getParameter("namsinh");
        String sdt = request.getParameter("sdt");
        int loai = Integer.parseInt(session.getAttribute("loai").toString());
        try {
            DAO dao = new DAO();
            float ID=0;
            for(int i=0;i<dao.getAllUser().size();i++){
                ID=dao.getAllUser().get(i).getId()+1;
            }
            System.out.println(ID);
            if (loai == 0) {
                String repass = request.getParameter("repass");
                if (!pass.equals(repass)) {
                    request.setAttribute("error5", "ko hop le");
                    request.getRequestDispatcher("Register.jsp").forward(request, response);
                } else {
                    boolean check = dao.CreateAccount(ID, taiKhoan, pass, ten, gioitinh, namsinh, sdt, 0);
                    if (check) {
                        float GioHang_id = ID;
                        dao.AddUserToCart(GioHang_id, ID);
                        url = Success_Page;
                    } else {
                        url = Failed_Page;
                    }
                }
            } else if (loai == 1) {
                int chinhloai = Integer.parseInt(request.getParameter("loai"));
                boolean check = dao.CreateAccount(ID, taiKhoan, pass, ten, gioitinh, namsinh, sdt, chinhloai);
                if (check) {
                    url = Success_Page;
                } else {
                    url = Failed_Page;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
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
