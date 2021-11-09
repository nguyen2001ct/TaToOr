/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tatoor.controller;

import com.tatoor.Dao.DAO;
import com.tatoor.entity.Bill;
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
@WebServlet(name = "SortShowBillAdmin", urlPatterns = {"/SortShowBillAdmin"})
public class SortShowBillAdmin extends HttpServlet {

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
        DAO dao = new DAO();
        List<Bill> ListBill = dao.getAllBill();
        List<User> ListUser = dao.getAllUser();
        List<Bill> list1 = new ArrayList<>();
        int getgiaohang = Integer.parseInt(request.getParameter("loaigiaohang"));
        System.out.println(getgiaohang);
        for (int i = 0; i < ListBill.size(); i++) {
            if (getgiaohang == 0) {
                if (getgiaohang == ListBill.get(i).getDamua()) {
                    {
                        list1.add(ListBill.get(i));
                    }

                }
            } else if (getgiaohang == 1) {
                if (getgiaohang == ListBill.get(i).getDamua()) {
                    list1.add(ListBill.get(i));
                }
            }
        }
        System.out.println(list1.toString());
        int dagiaohang = 0, chuagiaohang = 0;
        for (int i = 0; i < ListBill.size(); i++) {
            if (ListBill.get(i).getDamua() == 1) {
                dagiaohang += 1;
            } else if (ListBill.get(i).getDamua() == 0) {
                chuagiaohang += 1;
            }
        }
        request.setAttribute("listbill", list1);
        request.setAttribute("listuser", ListUser);
        request.setAttribute("dagiaohang", dagiaohang);
        request.setAttribute("chuagiaohang", chuagiaohang);
        request.setAttribute("tonggiaohang", ListBill.size());
        request.getRequestDispatcher("AdminBill.jsp").forward(request, response);
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
