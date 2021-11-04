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
public class Review {

    private float id, nguoidung_id, sanpham_id;
    private int sao, hienthi, damua;
    private String binhluan;

    public Review(float id, float nguoidung_id, float sanpham_id, int sao, String binhluan, int hienthi,int damua) {
        this.id = id;
        this.nguoidung_id = nguoidung_id;
        this.sanpham_id = sanpham_id;
        this.sao = sao;
        this.hienthi = hienthi;
        this.binhluan = binhluan;
        this.damua=damua;
    }
    public int getDamua() {
        return damua;
    }

    public void setDamua(int damua) {
        this.damua = damua;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public float getNguoidung_id() {
        return nguoidung_id;
    }

    public void setNguoidung_id(float nguoidung_id) {
        this.nguoidung_id = nguoidung_id;
    }

    public float getSanpham_id() {
        return sanpham_id;
    }

    public void setSanpham_id(float sanpham_id) {
        this.sanpham_id = sanpham_id;
    }

    public int getSao() {
        return sao;
    }

    public void setSao(int sao) {
        this.sao = sao;
    }

    public int getHienthi() {
        return hienthi;
    }

    public void setHienthi(int hienthi) {
        this.hienthi = hienthi;
    }

    public String getBinhluan() {
        return binhluan;
    }

    public void setBinhluan(String binhluan) {
        this.binhluan = binhluan;
    }

}
