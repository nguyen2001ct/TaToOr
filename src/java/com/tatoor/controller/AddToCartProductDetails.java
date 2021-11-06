/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tatoor.controller;

import com.tatoor.Dao.DAO;
import com.tatoor.entity.Order;
import com.tatoor.entity.Product;
import java.io.IOException;
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
@WebServlet(name = "AddToCartProductDetails", urlPatterns = {"/AddToCartProductDetails"})
public class AddToCartProductDetails extends HttpServlet {

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
        try {
            String SL = request.getParameter("soluongsp");
            int SoLuong = Integer.parseInt(SL);
            boolean check = false;
            HttpSession session = request.getSession();
            DAO dao = new DAO();
            String SanPham_id = session.getAttribute("spid").toString();
            float SP_id = Float.parseFloat(SanPham_id);
            Product product = dao.getProductByID(SP_id);
            float TongTien = product.getGiatien();
            if (session.getAttribute("User") == null) {
                request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
            } else {
                String user = String.valueOf(session.getAttribute("User"));
                float User_id = dao.getIDByUser(user).getId();
                List<Order> list = dao.getOrderByUserID(User_id);
                float ID = dao.getAllOrder().size() + 1;
                for (int i = 0; i < list.size(); i++) {
                    if (SP_id == list.get(i).getSp_ID()) {
                        SoLuong = SoLuong + list.get(i).getSoLuong();
                    }
                }
                TongTien = TongTien * SoLuong;
                check = dao.UpdateSoLuongSP(User_id, SP_id, SoLuong, TongTien);
                if (check == true) {
                    request.getRequestDispatcher("/ShowOrder").forward(request, response);
                } else {
                    dao.AddOrder(ID, User_id, SP_id, SoLuong, TongTien);
                    request.getRequestDispatcher("/ShowOrder").forward(request, response);
                }
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
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
