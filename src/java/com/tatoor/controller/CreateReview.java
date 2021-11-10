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
import javax.servlet.http.HttpSession;

/**
 *
 * @author nguye
 */
@WebServlet(name = "CreateReview", urlPatterns = {"/CreateReview"})
public class CreateReview extends HttpServlet {

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
        int danhgiasao = Integer.parseInt(request.getParameter("danhgiasao"));
        String binhluan = request.getParameter("binhluandanhgia");
        Float ProductID = Float.parseFloat(request.getParameter("productid"));
        String AnhDanhGia = request.getParameter("anhdanhgia");
        float danhgia_id = 0;
        float nguoidung_id = Float.parseFloat(session.getAttribute("id").toString());
        DAO dao = new DAO();
        for (int i = 0; i < dao.getAllReview().size(); i++) {
            danhgia_id = dao.getAllReview().get(i).getId() + 1;
        }
        List<Bill> lbill = dao.getAllBill();
        List<BillDetails> lbilld = dao.getAllBillDetails();
        int getdamua = 3;
        int checkdamua = 0;
        try {
            String url = "ProductDetail?sid=" + ProductID;
            for (int i = 0; i < lbill.size(); i++) {
                if (nguoidung_id == lbill.get(i).getNguoiDungid()) {
                    for (int j = 0; j < lbilld.size(); j++) {
                        if (lbill.get(i).getId() == lbilld.get(j).getId()) {
                            if (ProductID == lbilld.get(j).getSanPham_id()) {
                                if (lbill.get(i).getDamua() == 1) {
                                    getdamua = 1;
                                    checkdamua = 1;
                                    break;
                                }
                            } else {
                                if (checkdamua == 1) {
                                    getdamua = 1;
                                } else {
                                    getdamua = 0;
                                }
                            }
                        }
                    }
                }
            }

            if (getdamua == 1) {
                boolean check = dao.CreateReview(danhgia_id, nguoidung_id, ProductID, danhgiasao, binhluan, AnhDanhGia, getdamua, 0, 1);
                response.sendRedirect(url);
            } else if (getdamua == 0) {
                request.setAttribute("thongbaochuamua", "Bạn chỉ mua hàng mới có thể đánh giá");
                request.getRequestDispatcher(url).forward(request, response);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + "Nguyen");
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
