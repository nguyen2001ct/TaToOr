/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tatoor.controller;

import com.tatoor.Dao.DAO;
import com.tatoor.entity.Product;
import com.tatoor.entity.Review;
import com.tatoor.entity.User;
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
@WebServlet(name = "ProductDetail", urlPatterns = {"/ProductDetail"})
public class ProductDetail extends HttpServlet {

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

        DAO d = new DAO();
        HttpSession session = request.getSession();
        float id = Float.parseFloat(request.getParameter("sid"));
        float id_user = Float.parseFloat(session.getAttribute("id").toString());
        Product p = d.getProductByID(id);
        List<Product> p1 = d.getAllProduct();
        List<Review> review = d.getAllReview();
        List<User> user = d.getAllUser();

        request.setAttribute("product", p);
        request.setAttribute("listreview", review);
        request.setAttribute("listuser", user);
        request.setAttribute("productlist", p1);
        if (id_user == 0) {
            request.setAttribute("checkdanhgia", 1);
        } else {
            for (int i = 0; i < review.size(); i++) {
                if (id_user != review.get(i).getNguoidung_id()) {
                    request.setAttribute("checkdanhgia", 0);
                } else {
                    if (id == review.get(i).getSanpham_id()) {
                        request.setAttribute("nguoidung_danhgia_anh", review.get(i).getAnh());
                        request.setAttribute("nguoidung_danhgia_id", review.get(i).getId());
                        request.setAttribute("sanpham_id", review.get(i).getSanpham_id());
                        request.setAttribute("nguoidung_danhgia_sao", review.get(i).getSao());
                        request.setAttribute("nguoidung_danhgia_binhluan", review.get(i).getBinhluan());
                        if (review.get(i).getSua() == 1) {
                            
                            request.setAttribute("suadanhgia", 1);
                            request.setAttribute("checkdanhgia", 1);
                        } else {
                            request.setAttribute("suadanhgia", 0);
                            request.setAttribute("checkdanhgia", 1);
                        }
                        if(review.get(i).getHienthi()==0){
                            request.setAttribute("danhgiatrangthai", "Đánh giá của bạn chưa được duyệt!!!");
                        }else{
                            request.setAttribute("danhgiatrangthai2", "Đánh giá của bạn đã được duyệt!!!");
                        }
                        break;
                    }
                }
            }
        }
        request.getRequestDispatcher("shop-details.jsp").forward(request, response);
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
