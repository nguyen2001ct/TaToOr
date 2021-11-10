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
public class OrderAll {

    float id, nguoidung_id;

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

    public OrderAll(float id, float nguoidung_id) {
        this.id = id;
        this.nguoidung_id = nguoidung_id;
    }

    @Override
    public String toString() {
        return "OrderAll{" + "id=" + id + ", nguoidung_id=" + nguoidung_id + '}';
    }

}
