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

    public BillDetails(float id, float sanPham_id, int soLuong, float tongtien) {
        this.id = id;
        this.sanPham_id = sanPham_id;
        this.tongtien = tongtien;
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

    public void setSanPham_id(float sanPham_id) {
        this.sanPham_id = sanPham_id;
    }

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
