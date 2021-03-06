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
    private float cartSum_id;
    private float sp_ID;
    private int soLuong;
    private float gia, tongTien;
    private Product product;
    private int status;

    public Order(float id, float cartSum_id, float sp_ID, int soLuong,float tongTien,Product product) {
        this.id = id;
        this.cartSum_id = cartSum_id;
        this.sp_ID = sp_ID;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", user_ID=" + cartSum_id + ", sp_ID=" + sp_ID + ", soLuong=" + soLuong + ", tongTien=" + tongTien + ", product=" + product + '}';
    }

    
    public Order(float id, float cartSum_id,float sp_ID, int soLuong, float tongTien) {
        this.id = id;
        this.cartSum_id = cartSum_id;
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

    public float getCartSum_id() {
        return cartSum_id;
    }

    public void setCartSum_id(float cartSum_id) {
        this.cartSum_id = cartSum_id;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

   
}
