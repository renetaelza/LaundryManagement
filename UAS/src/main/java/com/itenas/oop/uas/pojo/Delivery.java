/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.uas.pojo;

/**
 *
 * @author user
 */
public class Delivery {
    private int id;
    private Order order;
    private Karyawan karyawan;
    private Pelanggan pelanggan;
    private String tanggalKirim;

    public Delivery() {
    }

    public Delivery(int id, Order order, Karyawan karyawan, Pelanggan pelanggan, String tanggalKirim) {
        this.id = id;
        this.order = order;
        this.karyawan = karyawan;
        this.pelanggan = pelanggan;
        this.tanggalKirim = tanggalKirim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Karyawan getKaryawan() {
        return karyawan;
    }

    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public String getTanggalKirim() {
        return tanggalKirim;
    }

    public void setTanggalKirim(String tanggalKirim) {
        this.tanggalKirim = tanggalKirim;
    }

    
}

