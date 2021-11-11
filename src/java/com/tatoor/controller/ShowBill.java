/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tatoor.controller;

import com.tatoor.Dao.DAO;
import com.tatoor.entity.Order;
import com.tatoor.entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
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
@WebServlet(name = "ShowBill", urlPatterns = {"/ShowBill"})
public class ShowBill extends HttpServlet {

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
        DAO dao = new DAO();
        HttpSession session = request.getSession();
        String user = session.getAttribute("User").toString();
        float user_id = dao.getIDByUser(user).getId();
        String name = dao.getIDByUser(user).getTen();
        String address = dao.getIDByUser(user).getDiaChi();
        request.setAttribute("phone", dao.getIDByUser(user).getSdt());
        request.setAttribute("name", name);
        request.setAttribute("address", address);
        List<Order> listOr = dao.getOrderByUserID(user_id);
        request.setAttribute("listOr", listOr);
        float Tongtien = 0;
        for (int i = 0; i < listOr.size(); i++) {
            Tongtien = Tongtien + listOr.get(i).getTongTien();
        }

        request.setAttribute("tongBill", Tongtien);
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        request.setAttribute("date", date);

        request.getRequestDispatcher("checkout.jsp").forward(request, response);
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
