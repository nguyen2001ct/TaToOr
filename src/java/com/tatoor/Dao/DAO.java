/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tatoor.Dao;

import com.tatoor.connect.DBConnection;
import static com.tatoor.connect.DBConnection.querySet;
import com.tatoor.entity.Bill;
import com.tatoor.entity.Order;
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
                rs.close();
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
    public void AddUserToCart(float id,float user_id){
        try {
            String sql="insert into GioHangTong Values(?,?)";
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setFloat(1, id);
            ps.setFloat(2, user_id);
            ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage()+"loi them cart");
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
            ps.close();
            rs.close();
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
            ps.close();
            con.close();
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
            ps.close();
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
                resultSet.close();
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
            ps.close();
            con.close();
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
            rs.close();
            ps.close();
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
            ps.close();
            con.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public int getTotalProduct() {
        String query = "select count(*) from SanPham";
        try {
            Connection con = DBConnection.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<Product> pagingProduct(int index) {
        List<Product> list = new ArrayList<>();
        String query = "select * from SanPham \n"
                + "ORDER BY SanPham_ID\n"
                + "OFFSET ? ROWS FETCH NEXT 12 ROWS ONLY;";
        try {
            Connection con = DBConnection.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, (index - 1) * 12);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(
                        rs.getFloat(1),
                        rs.getString(2),
                        rs.getFloat(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public boolean CreateReview(float ID, float NguoiDung_ID, float SanPham_ID, int sao, String BinhLuan, String anh, int damua, int hienthi, int sua) throws SQLException {
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
                resultSet.close();
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
            ps.setInt(1, hienthi);
            ps.setFloat(2, ID);
            ps.execute();
            con.close();
            ps.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void editReview(float ID, String anh, String binhluan, int sao, int hienthi) {
        String sql = "UPDATE DanhGia SET "
                + "DanhGia_Anh = ? ,"
                + "DanhGia_BinhLuan = ? ,"
                + "DanhGia_Sao = ? ,"
                + "DanhGia_HienThi = ? ,"
                + "DanhGia_Sua = ? "
                + "WHERE DanhGia_ID = ? ";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, anh);
            ps.setString(2, binhluan);
            ps.setInt(3, sao);
            ps.setInt(4, hienthi);
            ps.setInt(5, hienthi);
            ps.setFloat(6, ID);
            ps.execute();
            con.close();
            ps.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean AddOrder(float ID, float GioHangTong_ID, float SanPham_ID, int SoLuong, float TongTien) {
        String sql = "INSERT INTO GioHangChiTiet VALUES (?,?,?,?,?);";
        try {
            Connection con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setFloat(1, ID);
            ps.setFloat(2, GioHangTong_ID);
            ps.setFloat(3, SanPham_ID);
            ps.setInt(4, SoLuong);
            ps.setFloat(5, TongTien);
            int row = ps.executeUpdate();
            if (row > 0) {
                return true;
            }
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "khong chay dc");

        }
        return false;
    }

    public User getIDByUser(String User) {

        String sql = "select * from NguoiDung where NguoiDung_TaiKhoan = ? ";

        try {
            Connection con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, User);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new User(
                        rs.getFloat(1),
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
            ps.close();
            rs.close();
            con.close();
        } catch (Exception e) {

        }
        return null;
    }

    public List<Order> getAllOrder() {
        List<Order> list = new ArrayList<>();
        ResultSet resultSet = DBConnection.querySet("select * from GioHangChiTiet");
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    list.add(new Order(
                            resultSet.getFloat(1),
                            resultSet.getFloat(2),
                            resultSet.getFloat(3),
                            resultSet.getInt(4),
                            resultSet.getFloat(5)
                    ));
                }
                resultSet.close();
            } catch (Exception e) {
            }
        }
        return list;
    }

    public List<Order> getOrderByUserID(float GioHangTong_ID) {
        List<Order> list = new ArrayList<>();
        List<Product> listPro = getAllProduct();
        String sql = "select * from GioHangChiTiet where GioHangTong_ID = ?;";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setFloat(1, GioHangTong_ID);
            rs = ps.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < listPro.size(); i++) {
                    if (listPro.get(i).getId() == rs.getFloat(3)) {
                        list.add(new Order(
                                rs.getFloat(1),
                                rs.getFloat(2),
                                rs.getFloat(3),
                                rs.getInt(4),
                                rs.getFloat(5),
                                listPro.get(i)
                        ));
                    }
                }

            }
            ps.close();
            rs.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public boolean UpdateSoLuongSP(float GioHangTong_ID, float SanPham_ID, int soLuong, float tongTien) {
        String sql = "Update GioHangChiTiet set GioHang_SoLuongSanPham = ?, GioHang_TongTien = ? where GioHangTong_ID = ? and SanPham_ID = ?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, soLuong);
            ps.setFloat(2, tongTien);
            ps.setFloat(3, GioHangTong_ID);
            ps.setFloat(4, SanPham_ID);
            int row = ps.executeUpdate();
            if (row > 0) {
                return true;
            }
            ps.close();
            conn.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "loi roi");
        }
        return false;
    }

    public void DeleteProductInCart(float ID) {
        String sql = "Delete from GioHangChiTiet where GioHang_ID= ?";

        try {
            Connection con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setFloat(1, ID);
            ps.executeUpdate();
            ps.close();
            conn.close();
            rs.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public boolean UpdateGioHang(float GioHang_ID, int SoLuong, float TongTien) {
        String sql = "Update GioHangChiTiet set GioHang_SoLuongSanPham = ?, GioHang_TongTien = ? where GioHang_ID = ?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setFloat(1, SoLuong);
            ps.setFloat(2, TongTien);
            ps.setFloat(3, GioHang_ID);
            int row = ps.executeUpdate();
            if (row > 0) {
                return true;
            }
            ps.close();
            conn.close();
            rs.close();
        } catch (Exception e) {
        }
        return false;
    }

    public List<Bill> getAllBill() {
        List<Bill> list = new ArrayList<>();
        try {
            String sql = "select * from HoaDonTong";
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Bill(rs.getFloat(1),
                        rs.getFloat(2),
                        rs.getString(3),
                        rs.getFloat(4),
                        rs.getDate(5),
                        rs.getString(6),
                        rs.getInt(7)
                ));
            }
            ps.close();
            conn.close();
            rs.close();
        } catch (Exception e) {
        }
        return list;
    }

    public void setDonHangDaMua(float ID, int hienthi) {
        String sql = "UPDATE HoaDonTong SET HoaDon_DaMua = ? WHERE HoaDon_ID = ? ";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, hienthi);
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
        //        List<Review> r = d.getAllReview();
        //        for (int i = 0; i < r.size(); i++) {
        //            System.out.println(r.get(i).getId());
        //        }
        //List<Order> lst = d.getOrderByUserID(3);
        //        for (int i = 0; i < lst.size(); i++) {
        //            System.out.println(lst.get(i));
        //        }
        List<Bill> list = d.getAllBill();
        for (Bill p : list) {
            System.out.println(p.toString());
        }

    }
}
