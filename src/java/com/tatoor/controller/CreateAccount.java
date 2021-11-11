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
import java.util.List;
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

    private final String Failed_Page = "shop.jsp";

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
        System.out.println(taiKhoan + "Nguyen");
        String gioitinh = request.getParameter("gioitinh");
        String namsinh = request.getParameter("namsinh");
        String sdt = request.getParameter("sdt");
        int loai = Integer.parseInt(session.getAttribute("loai").toString());
        float checktrung = 0;
        try {
            DAO dao = new DAO();
            float ID = 0;
            for (int i = 0; i < dao.getAllUser().size(); i++) {
                ID = dao.getAllUser().get(i).getId() + 1;
            }
            if (loai == 0) {

                session.setAttribute("loai", 1);
                String repass = request.getParameter("repass");
                if (!pass.equals(repass)) {
                    request.setAttribute("error5", "Mật Khẩu Nhập Lại Không Hợp Lệ");
                    request.getRequestDispatcher("Register.jsp").forward(request, response);
                } else if (taiKhoan.isEmpty() || pass.isEmpty() || ten.isEmpty() || gioitinh.isEmpty() || namsinh.isEmpty() || sdt.isEmpty()) {
                    request.setAttribute("error5", "Vui lòng điền đầy đủ thông tin đăng ký!!!");
                    request.getRequestDispatcher("Register.jsp").forward(request, response);
                } else {
                    List<User> listuser = dao.getAllUser();
                    for (int i = 0; i < listuser.size(); i++) {
                        System.out.println(listuser.get(i).getTaiKhoan().trim().toLowerCase().equals(taiKhoan.trim().toLowerCase()));
                        if (listuser.get(i).getTaiKhoan().trim().toLowerCase().equals(taiKhoan.trim().toLowerCase())) {
                            checktrung = 1;
                        }
                    }
                    if (checktrung == 1) {
                        request.setAttribute("error5", "Tài Khoản Đã Có Trong Hệ Thống");
                        request.getRequestDispatcher("Register.jsp").forward(request, response);
                    } else {
                        boolean check = dao.CreateAccount(ID, taiKhoan, pass, ten, gioitinh, namsinh, sdt, 0);
                        if (check) {
                            float GioHang_id = ID;
                            dao.AddUserToCart(GioHang_id, ID);
                            request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
                        } else {
                            url = Failed_Page;
                        }
                    }
                }

            } else if (loai == 1) {
                int chinhloai = Integer.parseInt(request.getParameter("loai"));

                List<User> listuser = dao.getAllUser();
                for (int i = 0; i < listuser.size(); i++) {
                    if (listuser.get(i).getTaiKhoan().trim().toLowerCase().equals(taiKhoan.trim().toLowerCase())) {
                        checktrung = 1;

                    }
                }
                if (checktrung == 1) {
                    request.setAttribute("error5", "Tài Khoản Đã Có Trong Hệ Thống");
                    request.getRequestDispatcher("Register.jsp").forward(request, response);
                } else {
                    boolean check = dao.CreateAccount(ID, taiKhoan, pass, ten, gioitinh, namsinh, sdt, chinhloai);
                    if (check) {
                        float GioHang_id = ID;
                        dao.AddUserToCart(GioHang_id, ID);
                        request.getRequestDispatcher("ShowAdmin").forward(request, response);
                    } else {
                        request.getRequestDispatcher("Guest").forward(request, response);
                    }
                }

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
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
