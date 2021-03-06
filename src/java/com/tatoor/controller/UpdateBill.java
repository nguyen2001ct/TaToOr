/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tatoor.controller;

import com.tatoor.Dao.DAO;
import com.tatoor.entity.Bill;
import com.tatoor.entity.BillDetails;
import com.tatoor.entity.Review;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nguye
 */
@WebServlet(name = "UpdateBill", urlPatterns = {"/UpdateBill"})
public class UpdateBill extends HttpServlet {

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
        float id = Float.parseFloat(request.getParameter("id"));
        int type = Integer.parseInt(request.getParameter("trangthaimuahang"));
        DAO dao = new DAO();
        dao.setDonHangDaMua(id, type);
        List<BillDetails> lbilld = dao.getAllBillDetails();
        List<Review> lreview = dao.getAllReview();
        Bill b = dao.getBillByID(id);
        System.out.println(b.toString());
        for (int i = 0; i < lbilld.size(); i++) {
            if (b.getId() == lbilld.get(i).getId()) {
                for (int j = 0; j < lreview.size(); j++) {
                    if ((float)b.getNguoiDungid() == lreview.get(j).getNguoidung_id()) {
                        if (lbilld.get(i).getSanPham_id() == lreview.get(j).getSanpham_id()) {
                            dao.setReviewDamua(lreview.get(j).getId(), type);
                            System.out.println(lreview.get(j).getId() + "" + type);
                        }
                    }
                }
            }

        }

        response.sendRedirect("ShowBillAdmin");
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
