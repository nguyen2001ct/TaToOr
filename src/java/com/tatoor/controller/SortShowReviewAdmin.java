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
import java.util.ArrayList;
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
@WebServlet(name = "SortShowReviewAdmin", urlPatterns = {"/SortShowReviewAdmin"})
public class SortShowReviewAdmin extends HttpServlet {

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
        float count = 0, count1 = 0;
        List<Review> review = d.getAllReview();
        List<User> user = d.getAllUser();
        List<Product> product = d.getAllProduct();
        List<Review> list1 = new ArrayList<>();
        List<Review> list2 = new ArrayList<>();
        int getsao = Integer.parseInt(request.getParameter("loaisao"));
        for (int i = 0; i < review.size(); i++) {
            if (review.get(i).getSao() <= 3) {
                count += 1;
            } else {
                count1 += 1;
            }
        }
        for (int i = 0; i < review.size(); i++) {
            if (getsao >= review.get(i).getSao()) {
                list1.add(review.get(i));
            } else {
                list2.add(review.get(i));
            }
        }
        if(getsao==3){
            request.setAttribute("listreview", list1);
        }else if (getsao==4){
            request.setAttribute("listreview", list2);
        }
        request.setAttribute("tongdanhgia", review.size());
        request.setAttribute("listuser", user);
        request.setAttribute("listproduct", product);
        request.setAttribute("danhgiathap", count);
        request.setAttribute("danhgiacao", count1);
        request.getRequestDispatcher("AdminReview.jsp").forward(request, response);
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
