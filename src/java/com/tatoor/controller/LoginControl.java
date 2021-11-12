/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tatoor.controller;

import com.tatoor.Dao.DAO;
import com.tatoor.entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MACBOOK PRO
 */
@WebServlet(name = "LoginControl", urlPatterns = {"/LoginControl"})
public class LoginControl extends HttpServlet {

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
        String user = request.getParameter("Username").trim();
        String pass = request.getParameter("password").trim();

        try {
            HttpSession session = request.getSession();
            DAO dao = new DAO();
            session.removeAttribute("id");
            User users = dao.CheckAccount(user, pass);
            String page = "LoginForm.jsp";
            if (users == null) {
                request.setAttribute("error1", "Sai tài khoản hoặc mật khẩu ");
                request.setAttribute("username", user);
            } else {
                String tag = "<a href=\"ProfileAll\" class=\"Login\">Thông tin</a>";
                if (users.getLoai() == 0) {
                    session.setAttribute("Admin", tag);//Do lúc làm đặt tên nhầm thành Admin chứ thực ra là set header show
                    session.setAttribute("id", users.getId());
                    session.setAttribute("loai", users.getLoai());
                } else {
                    session.setAttribute("Admin", "<a href=\"ShowUser\" class=\"Login\">Quản Lý</a>");
                    session.setAttribute("id", users.getId());
                    session.setAttribute("loai", users.getLoai());
                }
                session.setAttribute("User", user);
                page = "index.jsp";
            }
            request.getRequestDispatcher(page).forward(request, response);

//            HttpServletRequest HttpRequest = (HttpServletRequest) request;
//            HttpServletResponse HttpRespone = (HttpServletResponse) response;
//            HttpSession session = HttpRequest.getSession();
//
//            String url = HttpRequest.getServletPath();
//            if (url.endsWith("AdminIndex.jsp") && users.getLoai() == 0) {
//                request.getRequestDispatcher("index.jsp").forward(request, response);
//            } else if (url.endsWith("AdminIndex.jsp") && users.getLoai() == 1) {
//                request.getRequestDispatcher("AdminIndex.jsp").forward(request, response);
//            }
        } catch (Exception e) {

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
