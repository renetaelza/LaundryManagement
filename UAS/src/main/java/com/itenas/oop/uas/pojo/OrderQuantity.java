/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.uas.pojo;

/**
 *
 * @author user
 */
public class OrderQuantity {
    private int id;
    private Order order;
    private Layanan layanan;
    private int quantity;

    public OrderQuantity() {
    }

    public OrderQuantity(int id, Order order, Layanan layanan, int quantity) {
        this.id = id;
        this.order = order;
        this.layanan = layanan;
        this.quantity = quantity;
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

    public Layanan getLayanan() {
        return layanan;
    }

    public void setLayanan(Layanan layanan) {
        this.layanan = layanan;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
