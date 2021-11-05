/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tatoor.entity;

import java.util.List;

/**
 *
 * @author MACBOOK PRO
 */
public class Order {

    private float id;
    private float user_ID;
    private float sp_ID;
    private int soLuong;
    private float gia, tongTien;
    private List<Product> product;
    private int status;

    public Order(float id, float user_ID, float sp_ID, int soLuong,float tongTien, List<Product> product) {
        this.id = id;
        this.user_ID = user_ID;
        this.sp_ID = sp_ID;
        this.soLuong = soLuong;
        this.product = product;
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", user_ID=" + user_ID + ", sp_ID=" + sp_ID + ", soLuong=" + soLuong + ", gia=" + gia + ", tongTien=" + tongTien + ", product=" + product + ", status=" + status + '}';
    }

    
    public Order(float id, float user_ID,float sp_ID, int soLuong, float tongTien) {
        this.id = id;
        this.user_ID = user_ID;
        this.sp_ID = sp_ID;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
        
    }

    
    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public float getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(float user_ID) {
        this.user_ID = user_ID;
    }

    public float getSp_ID() {
        return sp_ID;
    }

    public void setSp_ID(float sp_ID) {
        this.sp_ID = sp_ID;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

   
}
