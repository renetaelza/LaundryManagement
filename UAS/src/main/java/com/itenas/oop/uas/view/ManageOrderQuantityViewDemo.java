/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.uas.view;

import com.itenas.oop.uas.pojo.Layanan;
import com.itenas.oop.uas.pojo.Order;
import com.itenas.oop.uas.pojo.OrderQuantity;
import com.itenas.oop.uas.service.OrderQuantityService;
import com.itenas.oop.uas.serviceimpl.OrderQuantityServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ManageOrderQuantityViewDemo {
    static List<OrderQuantity> listOrderQuantity = new ArrayList<>();
    static OrderQuantity orderQuantity;
    static OrderQuantityService orderQuantityService;
    static Scanner scanner;

    private static void findAllOrderQuantity(List<OrderQuantity> listOrderQuantity) {
        for (OrderQuantity orderQuantity : listOrderQuantity) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("ID OrderQuantity\t\t: " + orderQuantity.getId());
            System.out.println("ID Order\t\t: " + orderQuantity.getOrder().getIdOrder());
            System.out.println("ID Layanan\t\t: " + orderQuantity.getLayanan().getId());
            System.out.println("Quantity\t\t: " + orderQuantity.getQuantity());
            System.out.println("-----------------------------------------------------------------");
            System.out.println("");
        }
    }

    public static void insertOrderQuantity(OrderQuantity orderQuantity) {
        scanner = new Scanner(System.in);
        orderQuantityService = new OrderQuantityServiceImpl();
        int idOrder, idLayanan, quantity, result;
        
        System.out.println("ID Order: ");
        idOrder = scanner.nextInt();
        System.out.println("ID Layanan: ");
        idLayanan = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Quantity: ");
        quantity = scanner.nextInt();
                
        Order order = new Order();
        order.setIdOrder(idOrder);
                
        Layanan layanan = new Layanan();
        layanan.setId(idLayanan);
                
        orderQuantity.setQuantity(quantity);
                
        orderQuantity.setOrder(order);
        orderQuantity.setLayanan(layanan);
        
        result = orderQuantityService.create(orderQuantity);
        System.out.println("Data berhasil disimpan...!");
        System.out.println("");
    }

    private static OrderQuantity findOrderQuantity(int updatedId) {
        orderQuantity = new OrderQuantity();
        orderQuantityService = new OrderQuantityServiceImpl();
        orderQuantity = orderQuantityService.findById(updatedId);
    
        return orderQuantity;
    }

    private static void editOrderQuantity(Integer id) {
        scanner = new Scanner(System.in);
        orderQuantityService = new OrderQuantityServiceImpl();
        int idOrder, idLayanan, quantity, result;
        
        System.out.println("ID Order: ");
        idOrder = scanner.nextInt();
        System.out.println("ID Layanan: ");
        idLayanan = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Quantity: ");
        quantity = scanner.nextInt();
                
        Order order = new Order();
        order.setIdOrder(idOrder);
                
        Layanan layanan = new Layanan();
        layanan.setId(idLayanan);
                
        orderQuantity.setQuantity(quantity);
                
        orderQuantity.setOrder(order);
        orderQuantity.setLayanan(layanan);
        
        orderQuantityService.update(orderQuantity);
        System.out.println("Data berhasil diperbarui...!");
        System.out.println("");
    }
}
