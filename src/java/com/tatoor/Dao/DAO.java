/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tatoor.Dao;

import com.tatoor.connect.DBConnection;
import static com.tatoor.connect.DBConnection.querySet;
import com.tatoor.entity.Product;
import com.tatoor.entity.Review;
import com.tatoor.entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author nguye
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<User> getAllUser() {
        List<User> list = new ArrayList<>();
        ResultSet resultSet = DBConnection.querySet("select * from NguoiDung");
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    list.add(new User(
                            resultSet.getFloat(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getString(4),
                            resultSet.getString(5),
                            resultSet.getString(6),
                            resultSet.getString(7),
                            resultSet.getString(8),
                            resultSet.getInt(9)
                    ));
                }
            } catch (Exception e) {
            }
        }
        return list;
    }

    public boolean CreateAccount(float ID, String taiKhoan, String pass, String Ten, String gioitinh, String namsinh, String sdt, int loai) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = DBConnection.getConnection();
            String sql = "INSERT INTO NguoiDung VALUES(?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setFloat(1, ID);
            ps.setString(2, taiKhoan);
            ps.setString(3, pass);
            ps.setString(4, Ten);
            ps.setString(5, gioitinh);
            ps.setString(6, namsinh);
            ps.setString(7, sdt);
            ps.setString(8, " ");
            ps.setInt(9, loai);
            int row = ps.executeUpdate();
            if (row > 0) {
                return true;
            }
        } finally {
            if (con != null) {
                con.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
        return false;
    }

    public User CheckAccount(String user, String pass) throws SQLException {
        try {
            String query = "Select * from NguoiDung where NguoiDung_TaiKhoan = ? and NguoiDung_MatKhau = ?";
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();

            while (rs.next()) {
                User users = new User(rs.getString(2), rs.getString(3));
                users.setLoai(rs.getInt(9));
                users.setTen(rs.getString(2));
                users.setId(rs.getFloat(1));
                return users;
            }
            //       String sql = "select NguoiDung_Loai from NguoiDung where NguoiDung_TaiKhoan = ? and NguoiDung_MatKhau = ? ";
            //     ps = conn.prepareStatement(sql);

        } catch (Exception e) {
            System.out.println(e.getMessage() + "loi ne");

        }
        ps.close();
        rs.close();
        return null;
    }

    public void DeleteAccount(float ID) throws SQLException {
        String sql = "DELETE FROM NguoiDung WHERE NguoiDung_ID = ? ";

        try {
            Connection con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setFloat(1, ID);
            ps.executeQuery();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public User getUserByID(float id) {

        String sql = "select * from NguoiDung where NguoiDung_ID = ? ";

        try {
            Connection con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setFloat(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new User(rs.getFloat(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9)
                );
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public void updateUserAdmin(float id, String taiKhoan, String matKhau, String ten, String gioiTinh, String ngaySinh, String sdt, String diaChi, int loai) throws SQLException {
        String sql = "UPDATE NguoiDung\n"
                + "set NguoiDung_TaiKhoan = ?,\n"
                + "NguoiDung_MatKhau = ?,\n"
                + "NguoiDung_Ten = ?,\n"
                + "NguoiDung_GioiTinh = ?,\n"
                + "NguoiDung_NgaySinh =?,\n"
                + "NguoiDung_SDT = ?,\n"
                + "NguoiDung_DiaChi = ?,\n"
                + "NguoiDung_Loai = ?\n"
                + "where NguoiDung_ID = ?";
        try {
            Connection con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, taiKhoan);
            ps.setString(2, matKhau);
            ps.setString(3, ten);
            ps.setString(4, gioiTinh);
            ps.setString(5, ngaySinh);
            ps.setString(6, sdt);
            ps.setString(7, diaChi);
            ps.setInt(8, loai);
            ps.setFloat(9, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public boolean updateUserNormal(float id, String ten, String gioiTinh, String ngaySinh, String sdt, String diaChi) throws SQLException {
        String sql = "UPDATE NguoiDung\n"
                + "set NguoiDung_Ten = ?,\n"
                + "NguoiDung_GioiTinh = ?,\n"
                + "NguoiDung_NgaySinh =?,\n"
                + "NguoiDung_SDT = ?,\n"
                + "NguoiDung_DiaChi = ?\n"
                + "WHERE NguoiDung_ID = ?";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, ten);
            ps.setString(2, gioiTinh);
            ps.setString(3, ngaySinh);
            ps.setString(4, sdt);
            ps.setString(5, diaChi);
            ps.setFloat(6, id);
            int row = ps.executeUpdate();
            if (row > 0) {
                return true;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if (con != null) {
                con.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
        return false;
    }

    public void ChangePassword(float id, String MatKhau) {
        String sql = "UPDATE NguoiDung Set NguoiDung_MatKhau = ? where NguoiDung_ID = ? ";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, MatKhau);
            ps.setFloat(2, id);
            ps.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        ResultSet resultSet = DBConnection.querySet("select * from SanPham");
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    list.add(new Product(
                            resultSet.getFloat(1),
                            resultSet.getString(2),
                            resultSet.getFloat(3),
                            resultSet.getString(4),
                            resultSet.getString(5),
                            resultSet.getInt(6),
                            resultSet.getString(7)
                    ));
                }
            } catch (Exception e) {
            }
        }
        return list;
    }

    public boolean CreateProduct(float ID, String Ten, float GiaTien, String ThuocTinh, String Mota, int danhgia, String Anh) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBConnection.getConnection();
            String sql = "INSERT INTO SanPham VALUES(?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setFloat(1, ID);
            ps.setString(2, Ten);
            ps.setFloat(3, GiaTien);
            ps.setString(4, ThuocTinh);
            ps.setString(5, Mota);
            ps.setInt(6, danhgia);
            ps.setString(7, Anh);
            int row = ps.executeUpdate();
            if (row > 0) {
                return true;
            }
        } finally {
            if (con != null) {
                con.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
        return false;
    }

    public void DeleteProduct(float ID) throws SQLException {
        String sql = "DELETE FROM SanPham WHERE SanPham_ID = ? ";

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setFloat(1, ID);
            ps.executeQuery();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public Product getProductByID(float id) {

        String sql = "select * from SanPham where SanPham_ID = ? ";

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setFloat(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(
                        rs.getFloat(1),
                        rs.getString(2),
                        rs.getFloat(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7)
                );
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public void updateProduct(float id, String ten, float giaTien, String thuocTinh, String moTa, int danhGia, String anh) throws SQLException {
        String sql = "UPDATE SanPham\n"
                + "SET SanPham_Ten = ?,\n"
                + "SanPham_GiaTien = ?,\n"
                + "SanPham_ThuocTinh = ? ,\n"
                + "SanPham_MoTa = ?,\n"
                + "SanPham_DanhGia = ?,\n"
                + "SanPham_Anh = ? \n"
                + "where SanPham_ID = ?";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ten);
            ps.setFloat(2, giaTien);
            ps.setString(3, thuocTinh);
            ps.setString(4, moTa);
            ps.setInt(5, danhGia);
            ps.setString(6, anh);
            ps.setFloat(7, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public boolean CreateReview(float ID, float NguoiDung_ID,float SanPham_ID,int sao, String BinhLuan,String anh, int damua, int hienthi,int sua) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = DBConnection.getConnection();
            String sql = "INSERT INTO DanhGia VALUES(?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setFloat(1, ID);
            ps.setFloat(2, NguoiDung_ID);
            ps.setFloat(3, SanPham_ID);
            ps.setInt(4, sao);
            ps.setString(5, BinhLuan);
            ps.setString(6, anh);
            ps.setInt(7, damua);
            ps.setInt(8, hienthi);
            ps.setInt(9, sua);
            int row = ps.executeUpdate();
            if (row > 0) {
                return true;
            }
        } finally {
            if (con != null) {
                con.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
        return false;
    }
    public List<Review> getAllReview() {
        List<Review> list = new ArrayList<>();
        ResultSet resultSet = DBConnection.querySet("select * from DanhGia");
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    list.add(new Review(
                            resultSet.getFloat(1),
                            resultSet.getFloat(2),
                            resultSet.getFloat(3),
                            resultSet.getInt(4),
                            resultSet.getString(5),
                            resultSet.getString(6),
                            resultSet.getInt(7),
                            resultSet.getInt(8),
                            resultSet.getInt(9)
                    ));
                }
            } catch (Exception e) {
            }
        }
        return list;
    }
    public void setReviewtype(float ID, int hienthi) {
        String sql = "UPDATE DanhGia SET DanhGia_HienThi = ? WHERE DanhGia_ID = ? ";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,hienthi);
            ps.setFloat(2, ID);
            ps.execute();
            con.close();
            ps.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) throws SQLException {
        DAO d = new DAO();
//        boolean check = false;
//        try {
//            check = d.CreateProduct(0, " ", 9999, "Do An", "An Do", 5, "ko");
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        if (check) {
//            System.out.println("Thanh Cong");
//        } else {
//            System.out.println("fail");
//        }
//        try {
//            String query = "select * from SanPham";
//            ResultSet rs = querySet(query);
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2)
//                        + "  " + rs.getString(3));
//            }
//        } catch (Exception e) {
//        }
//        Product p = d.getProductByID(1);
//        System.out.println(p.getTen());

        List<Review> r = d.getAllReview();
        for(int i=0;i<r.size();i++){
            System.out.println(r.get(i).getId());
        }
    }
}
