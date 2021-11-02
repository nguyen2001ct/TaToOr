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
public class Product {

    private String ten, thuoctinh, mota, anh;
    private float id, giatien;
    private int danhgia;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getThuoctinh() {
        return thuoctinh;
    }

    public void setThuoctinh(String thuoctinh) {
        this.thuoctinh = thuoctinh;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public float getGiatien() {
        return giatien;
    }

    public void setGiatien(float giatien) {
        this.giatien = giatien;
    }

    public int getDanhgia() {
        return danhgia;
    }

    public void setDanhgia(int danhgia) {
        this.danhgia = danhgia;
    }

    public Product(float id,String ten,float giatien, String thuoctinh, String mota,int danhgia, String anh  ) {
        this.ten = ten;
        this.thuoctinh = thuoctinh;
        this.mota = mota;
        this.anh = anh;
        this.id = id;
        this.giatien = giatien;
        this.danhgia = danhgia;
    }

    public Product() {
    }
}
