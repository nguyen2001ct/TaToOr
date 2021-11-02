/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tatoor.entity;

/**
 *
 * @author nguye
 */
public class User {

    private String matKhau, sdt, diaChi, gioiTinh, ten, taiKhoan;
    private int loai;
    private String ngaySinh;
    private float id;

    public User(float ID, String TaiKhoan, String MatKhau, String Ten, String GioiTinh, String NamSinh, String SDT, String DiaChi, int Loai) {
        this.matKhau = MatKhau;
        this.sdt = SDT;
        this.diaChi = DiaChi;
        this.gioiTinh = GioiTinh;
        this.ten = Ten;
        this.loai = Loai;
        this.ngaySinh = NamSinh;
        this.id = ID;
        this.taiKhoan = TaiKhoan;
    }

    public User() {
    }

    public User(String taiKhoan,String matKhau) {
        this.matKhau = matKhau;
        this.taiKhoan = taiKhoan;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.matKhau = MatKhau;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.diaChi = DiaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.gioiTinh = GioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String Ten) {
        this.ten = Ten;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int Loai) {
        this.loai = Loai;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return id+ten; //To change body of generated methods, choose Tools | Templates.
    }
    
}
