/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.uas.view;

import com.itenas.oop.uas.pojo.Order;
import com.itenas.oop.uas.pojo.Pelanggan;
import com.itenas.oop.uas.service.OrderService;
import com.itenas.oop.uas.serviceimpl.OrderServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ManageOrderViewDemo {
    static List<Order> listOrder = new ArrayList<>();
    static Order order;
    static OrderService orderService;
    static Scanner scanner;

    private static void findAllOrder(List<Order> listOrder) {
        for (Order order : listOrder) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("ID Order\t\t: " + order.getIdOrder());
            System.out.println("ID Pelanggan\t\t: " + order.getPelanggan().getId());
            System.out.println("Tanggal Transaksi\t\t: " + order.getTanggalTransaksi());
            System.out.println("-----------------------------------------------------------------");
            System.out.println("");
        }
    }

    public static void insertOrder(Order order) {
        scanner = new Scanner(System.in);
        orderService = new OrderServiceImpl();
        String tanggalTransaksi;
        int idPelanggan, result;
        
        System.out.println("ID Pelanggan: ");
        idPelanggan = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Tanggal Transaksi [YYYY-MM-DD]: ");
        tanggalTransaksi = scanner.nextLine();
                
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setId(idPelanggan);
                
        order.setTanggalTransaksi(tanggalTransaksi);
        order.setPelanggan(pelanggan);
        
        result = orderService.create(order);
        System.out.println("");
    }

    private static Order findOrder(int updatedId) {
        order = new Order();
        orderService = new OrderServiceImpl();
        order = orderService.findById(updatedId);
    
        return order;
    }

    private static void editOrder(Integer id) {
        scanner = new Scanner(System.in);
        orderService = new OrderServiceImpl();
        String tanggalTransaksi;
        int idPelanggan, result;
        
        System.out.println("ID Pelanggan: ");
        idPelanggan = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Tanggal Transaksi [YYYY-MM-DD]: ");
        tanggalTransaksi = scanner.nextLine();
                
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setId(idPelanggan);
                
        order.setTanggalTransaksi(tanggalTransaksi);
        order.setPelanggan(pelanggan);
        
        orderService.update(order);
        System.out.println("Data berhasil diperbarui...!");
        System.out.println("");
    }
}
