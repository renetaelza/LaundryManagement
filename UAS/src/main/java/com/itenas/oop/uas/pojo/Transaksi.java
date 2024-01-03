/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.uas.pojo;

/**
 *
 * @author user
 */
public class Transaksi {
    private int idTransaksi;
    private String tanggal_transaksi;
    private Pelanggan pelanggan;
    private Layanan layanan;
    private int harga;
    private OrderQuantity orderQuantity;
    private Order order;
    private int harga_cucian;
    private String durasiCucian;
    private String delivery;
    private int totalHarga;

    public Transaksi() {
    }

    public Transaksi(int idTransaksi, String tanggal_transaksi, Pelanggan pelanggan, Layanan layanan, int harga, OrderQuantity orderQuantity, Order order, int harga_cucian, String durasiCucian, String delivery, int totalHarga) {
        this.idTransaksi = idTransaksi;
        this.tanggal_transaksi = tanggal_transaksi;
        this.pelanggan = pelanggan;
        this.layanan = layanan;
        this.harga = harga;
        this.orderQuantity = orderQuantity;
        this.order = order;
        this.harga_cucian = harga_cucian;
        this.durasiCucian = durasiCucian;
        this.delivery = delivery;
        this.totalHarga = totalHarga;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getTanggal_transaksi() {
        return tanggal_transaksi;
    }

    public void setTanggal_transaksi(String tanggal_transaksi) {
        this.tanggal_transaksi = tanggal_transaksi;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Layanan getLayanan() {
        return layanan;
    }

    public void setLayanan(Layanan layanan) {
        this.layanan = layanan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public OrderQuantity getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(OrderQuantity orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public int getHarga_cucian() {
        return harga_cucian;
    }

    public void setHarga_cucian(int harga_cucian) {
        this.harga_cucian = harga_cucian;
    }

    public String getDurasiCucian() {
        return durasiCucian;
    }

    public void setDurasiCucian(String durasiCucian) {
        this.durasiCucian = durasiCucian;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
}
