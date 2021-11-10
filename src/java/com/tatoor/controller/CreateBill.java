/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tatoor.controller;

import com.tatoor.Dao.DAO;
import com.tatoor.entity.Bill;
import com.tatoor.entity.Order;
import com.tatoor.entity.OrderAll;
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
@WebServlet(name = "CreateBill", urlPatterns = {"/CreateBill"})
public class CreateBill extends HttpServlet {

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
        DAO dao = new DAO();
        String User = session.getAttribute("User").toString();
        float user_id = dao.getIDByUser(User).getId();
        String PhuongThucThanhToan = request.getParameter("PhuongThuc");
        String tongBill = request.getParameter("TongTienBill");
        float tongtienBill = Float.parseFloat(tongBill);
        String DiaChi = request.getParameter("DiaChi");
        List<Bill> listbill = dao.getAllBill();
        List<Order> listorder = dao.getAllOrder();
        List<OrderAll> listoa = dao.getOrderAll();
        int damua = 0;
        float ID = 0;
        long millis = System.currentTimeMillis();
        java.sql.Date NgayMua = new java.sql.Date(millis);
        System.out.println(tongtienBill);
        System.out.println(NgayMua);
        for (int i = 0; i < dao.getAllBill().size(); i++) {
            ID = dao.getAllBill().get(i).getId() + 1;
        }
        for (int i = 0; i < listoa.size(); i++) {
            for (int j = 0; j < listorder.size(); j++) {
                if (listorder.get(j).getCartSum_id() == listoa.get(i).getId()) {
                    if (listoa.get(i).getNguoidung_id() == user_id) {
                        dao.CreateBillDetails(ID, listorder.get(j).getSp_ID(), listorder.get(j).getSoLuong(), listorder.get(j).getTongTien());
                    }
                }
            }
        }
        dao.AddAllBill(ID, user_id, DiaChi, tongtienBill, NgayMua, PhuongThucThanhToan, damua);

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
