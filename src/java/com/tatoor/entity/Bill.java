/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tatoor.entity;

import java.util.Date;
import java.util.List;

/**
 *
 * @author MACBOOK PRO
 */
public class Bill {

    private float id, nguoiDungid, tongtien;
    private String phuongthuc, diachi;
    private Date ngaymua;
    private int damua;
    private BillDetails billDetails;

    public Bill(float id, float nguoiDungid, String diachi, float tongtien, Date ngaymua, String phuongthuc, int damua, BillDetails billDetails) {
        this.id = id;
        this.nguoiDungid = nguoiDungid;
        this.tongtien = tongtien;
        this.phuongthuc = phuongthuc;
        this.ngaymua = ngaymua;
        this.damua = damua;
        this.diachi = diachi;
        this.billDetails = billDetails;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public Bill(float id, float nguoiDungid, String diachi, float tongtien, Date ngaymua, String phuongthuc, int damua) {
        this.id = id;
        this.nguoiDungid = nguoiDungid;
        this.tongtien = tongtien;
        this.phuongthuc = phuongthuc;
        this.ngaymua = ngaymua;
        this.damua = damua;
        this.diachi = diachi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public float getNguoiDungid() {
        return nguoiDungid;
    }

    public void setNguoiDungid(float nguoiDungid) {
        this.nguoiDungid = nguoiDungid;
    }

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }

    public String getPhuongthuc() {
        return phuongthuc;
    }

    public void setPhuongthuc(String phuongthuc) {
        this.phuongthuc = phuongthuc;
    }

    public Date getNgaymua() {
        return ngaymua;
    }

    public void setNgaymua(Date ngaymua) {
        this.ngaymua = ngaymua;
    }

    public int getDamua() {
        return damua;
    }

    public void setDamua(int damua) {
        this.damua = damua;
    }

    public BillDetails getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(BillDetails billDetails) {
        this.billDetails = billDetails;
    }

    
}
