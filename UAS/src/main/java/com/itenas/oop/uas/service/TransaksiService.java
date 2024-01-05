/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itenas.oop.uas.service;

import com.itenas.oop.uas.pojo.OrderQuantity;
import com.itenas.oop.uas.pojo.Transaksi;
import com.itenas.oop.uas.repository.CrudRepository;

/**
 *
 * @author ASUS
 */
public interface TransaksiService extends CrudRepository<Transaksi, Integer>{
    public int hargaCucian(OrderQuantity orderQuantity, int harga);
    public int totalHarga(Transaksi transaksi);
    public int getTransaksiCount();
}
