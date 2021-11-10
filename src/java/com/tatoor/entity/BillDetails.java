/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tatoor.entity;

/**
 *
 * @author MACBOOK PRO
 */
public class BillDetails {
    private float id,sanPham_id,tongtien;
    private int soLuong;

    public BillDetails(float id, float SanPham_id, float Tongtien, int soLuong) {
        this.id = id;
        this.sanPham_id = SanPham_id;
        this.tongtien = Tongtien;
        this.soLuong = soLuong;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public float getSanPham_id() {
        return sanPham_id;
    }

    public void setSanPham_id(float SanPham_id) {
        this.sanPham_id = SanPham_id;
    }

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float Tongtien) {
        this.tongtien = Tongtien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
