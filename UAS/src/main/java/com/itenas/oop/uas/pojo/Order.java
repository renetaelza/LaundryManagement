/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.uas.pojo;

/**
 *
 * @author user
 */
public class Order {
    private int id;
    private Pelanggan pelanggan;
    private String tanggalTransaksi;

    public Order() {
    }

    public Order(int id, Pelanggan pelanggan, String tanggalTransaksi) {
        this.id = id;
        this.pelanggan = pelanggan;
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public int getIdOrder() {
        return id;
    }

    public void setIdOrder(int id) {
        this.id = id;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(String tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }
}
