/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.uas.view;

import com.itenas.oop.uas.pojo.Layanan;
import com.itenas.oop.uas.pojo.Order;
import com.itenas.oop.uas.pojo.OrderQuantity;
import com.itenas.oop.uas.pojo.Pelanggan;
import com.itenas.oop.uas.pojo.Transaksi;
import com.itenas.oop.uas.service.LayananService;
import com.itenas.oop.uas.service.PelangganService;
import com.itenas.oop.uas.service.TransaksiService;
import com.itenas.oop.uas.serviceimpl.LayananServiceImpl;
import com.itenas.oop.uas.serviceimpl.OrderQuantityServiceImpl;
import com.itenas.oop.uas.serviceimpl.OrderServiceImpl;
import com.itenas.oop.uas.serviceimpl.PelangganServiceImpl;
import com.itenas.oop.uas.serviceimpl.TransaksiServiceImpl;
import static com.itenas.oop.uas.view.ManageOrderQuantityViewDemo.orderQuantityService;
import static com.itenas.oop.uas.view.ManageOrderViewDemo.order;
import static com.itenas.oop.uas.view.ManageOrderViewDemo.orderService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.crypto.interfaces.PBEKey;

public class ManageTransaksiViewDemo {
    static List<Transaksi> listTransaksi = new ArrayList<>();
    static Transaksi transaksi;
    static TransaksiService transaksiService;
    static Scanner scanner;
    static Pelanggan pelanggan;
    static Layanan layanan;
    static OrderQuantity orderQuantity;
    
    public static void viewManageTransaksi() {
        int menu = 0;
        boolean keluar = false;
        char pilihan;
        Scanner scanner;

        do {
            System.out.println("+--------------------------------------");
            System.out.println("|          TRANSAKSI MANAGEMENT       |");
            System.out.println("+--------------------------------------");
            System.out.println("1. Insert Transaksi");
            System.out.println("2. Update Transaksi");
            System.out.println("3. Delete Transaksi");
            System.out.println("4. Display All Transaksi");
            System.out.println("5. Find Transaksi by ID Transaksi");
            System.out.println("+--------------------------------------");
            System.out.println("");
            System.out.println("Masukkan pilihan menu: ");
            scanner = new Scanner(System.in);
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    transaksi = new Transaksi();
                    order = new Order();
                    orderQuantity = new OrderQuantity();
                    int orderId = insertOrder(order);
                    insertOrderQuantity(orderQuantity, orderId);
                    char tampil;
                    insertTransaksi(transaksi); 
                    System.out.println("Apakah ingin menampilkan data? y/Y: ");
                    tampil = scanner.next().charAt(0);
                    if (tampil == 'y' || tampil == 'Y') {
                        transaksiService = new TransaksiServiceImpl();
                        listTransaksi = transaksiService.findAll();
                        findAllTransaksi(listTransaksi);
                    }
                break;
                case 2:
                    orderService = new OrderServiceImpl();
                    orderQuantityService = new OrderQuantityServiceImpl();
                    transaksiService = new TransaksiServiceImpl();

                    System.out.println("Masukkan ID yang akan diupdate: ");
                    int updatedId = scanner.nextInt();

                    Order existingOrder = findOrder(updatedId);

                    if (existingOrder != null) {
                        OrderQuantity existingOrderQuantity = findOrderQuantity(existingOrder.getIdOrder());
                        if (existingOrderQuantity != null) {
                            Transaksi existingTransaksi = findTransaksi(existingOrder.getIdOrder());

                            if (existingTransaksi != null) {
                                System.out.println("-----------------------------------------------------------------");
                                System.out.println("ID Transaksi: " + existingTransaksi.getIdTransaksi());
                                System.out.println("Tanggal Transaksi: " + existingTransaksi.getTanggal_transaksi());
                                System.out.println("ID Pelanggan: " + existingTransaksi.getPelanggan().getId());
                                System.out.println("Nama Pelanggan: " + existingTransaksi.getPelanggan().getNama());
                                System.out.println("ID Layanan: " + existingTransaksi.getLayanan().getId());
                                System.out.println("Nama Layanan: " + existingTransaksi.getLayanan().getNama_layanan());
                                System.out.println("Harga: " + existingTransaksi.getHarga());
                                System.out.println("Quantity: " + existingTransaksi.getOrderQuantity().getQuantity());
                                System.out.println("Harga Cucian: " + existingTransaksi.getHarga_cucian());
                                System.out.println("Durasi Cuci: " + existingTransaksi.getDurasiCucian());
                                System.out.println("Delivery: " + existingTransaksi.getDelivery());
                                System.out.println("Total Harga: " + existingTransaksi.getTotalHarga());
                                System.out.println("-----------------------------------------------------------------");

                                order = existingOrder;
                                editOrder(order.getIdOrder());
                                editOrderQuantity(order.getIdOrder());
                                editTransaksi(order.getIdOrder());
                            } else {
                                System.out.println("Data Transaksi tidak ditemukan!");
                            }
                        } else {
                            System.out.println("Data Order Quantity tidak ditemukan!");
                        }
                    } else {
                        System.out.println("Data Order tidak ditemukan!");
                    }
                break;
                case 3:
                    int deletedId;
                    System.out.println("Masukkan ID yang akan dihapus: ");
                    deletedId = scanner.nextInt();
                    System.out.println("Apakah anda yakin hapus data? [y/Y]: ");
                    char confirmation;
                    confirmation = scanner.next().charAt(0);
                    if (confirmation == 'y' || confirmation == 'Y') {
                        deleteTransaksi(deletedId);
                    }
                break;
                case 4:
                    transaksiService = new TransaksiServiceImpl();
                    listTransaksi = transaksiService.findAll();
                    findAllTransaksi(listTransaksi);
                break;
                case 5:
                int searchedId;
                Order searchedOrder;
                Transaksi searchedTransaksi;

                System.out.println("Masukkan ID: ");
                searchedId = scanner.nextInt();
                searchedOrder = findOrder(searchedId);

                if (searchedOrder != null) {
                    OrderQuantity searchedOrderQuantity = findOrderQuantity(searchedOrder.getIdOrder());
                    if (searchedOrderQuantity != null) {
                        searchedTransaksi = findTransaksi(searchedOrder.getIdOrder());

                        if (searchedTransaksi != null) {
                            System.out.println("-----------------------------------------------------------------");
                            System.out.println("ID Transaksi: " + searchedTransaksi.getIdTransaksi());
                            System.out.println("Tanggal Transaksi: " + searchedTransaksi.getTanggal_transaksi());
                            System.out.println("ID Pelanggan: " + searchedTransaksi.getPelanggan().getId());
                            System.out.println("Nama Pelanggan: " + searchedTransaksi.getPelanggan().getNama());
                            System.out.println("ID Layanan: " + searchedTransaksi.getLayanan().getId());
                            System.out.println("Nama Layanan: " + searchedTransaksi.getLayanan().getNama_layanan());
                            System.out.println("Harga: " + searchedTransaksi.getHarga());
                            System.out.println("Quantity: " + searchedTransaksi.getOrderQuantity().getQuantity());
                            System.out.println("Harga Cucian: " + searchedTransaksi.getHarga_cucian());
                            System.out.println("Durasi Cuci: " + searchedTransaksi.getDurasiCucian());
                            System.out.println("Delivery: " + searchedTransaksi.getDelivery());
                            System.out.println("Total Harga: " + searchedTransaksi.getTotalHarga());
                            System.out.println("-----------------------------------------------------------------");
                        } else {
                            System.out.println("Data Transaksi tidak ditemukan!");
                        }
                    } else {
                        System.out.println("Data Order Quantity tidak ditemukan!");
                    }
                } else {
                    System.out.println("Data Order tidak ditemukan!");
                }
                break;
                default:
                    System.out.println("Pilihan yang Anda masukkan salah!");
                break;
            }
            System.out.println("");
            System.out.println("Apakah ingin melanjutkan? y/n: ");
            scanner = new Scanner(System.in);
            pilihan = scanner.next().charAt(0);
            if (pilihan == 'n' || pilihan == 'N') {
                keluar = true;
            }
            
        } while (!keluar);
        System.out.println("Kembali ke menu utama!");
    }

    private static void findAllTransaksi(List<Transaksi> listTransaksi) {
        for (Transaksi transaksi : listTransaksi) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Tanggal Transaksi: " + transaksi.getTanggal_transaksi());
            System.out.println("ID Pelanggan: " + transaksi.getPelanggan().getId());
            System.out.println("Nama Pelanggan: " + transaksi.getPelanggan().getNama());
            System.out.println("ID Layanan: " + transaksi.getLayanan().getId());
            System.out.println("Nama Layanan: " + transaksi.getLayanan().getNama_layanan());
            System.out.println("Harga: " + transaksi.getHarga());
            System.out.println("Quantity: " + transaksi.getOrderQuantity().getQuantity());
            System.out.println("Harga Cucian: " + transaksi.getHarga_cucian());
            System.out.println("Durasi Cuci: " + transaksi.getDurasiCucian());
            System.out.println("Delivery: " + transaksi.getDelivery());
            System.out.println("Total Harga: " + transaksi.getTotalHarga());
            System.out.println("-----------------------------------------------------------------");
            System.out.println("");
        }
    }

    public static void insertTransaksi(Transaksi transaksi) {
        order = new Order();
        scanner = new Scanner(System.in);
        transaksiService = new TransaksiServiceImpl();
        transaksi = new Transaksi();
        String tanggalTransaksi, namaPelanggan, namaLayanan, durasiCuci, delivery;
        int idPelanggan, idOrder, idLayanan, harga, totalQuantity, hargaCucian, totalHarga, result;

        idOrder = order.getIdOrder();
        tanggalTransaksi = order.getTanggalTransaksi();

        order.setPelanggan(new Pelanggan());

        idPelanggan = order.getPelanggan().getId();

        System.out.println("Nama Pelanggan: ");
        namaPelanggan = scanner.nextLine();

        idLayanan = orderQuantity.getLayanan().getId();

        System.out.println("Nama Layanan: ");
        namaLayanan = scanner.nextLine();

        System.out.println("Harga: ");
        harga = scanner.nextInt();
        scanner.nextLine(); 

        totalQuantity = orderQuantity.getQuantity();

        hargaCucian = transaksiService.hargaCucian(orderQuantity, harga);

        System.out.println("Durasi Cuci [EXPRESS/REGULER]: ");
        durasiCuci = scanner.nextLine();

        System.out.println("Delivery [YES/NO]: ");
        delivery = scanner.nextLine();

        totalHarga = transaksiService.totalHarga(transaksi);

        order.setIdOrder(idOrder);
        order.setTanggalTransaksi(tanggalTransaksi);

        pelanggan = new Pelanggan();
        pelanggan.setId(idPelanggan);
        pelanggan.setNama(namaPelanggan);

        layanan = new Layanan();
        layanan.setId(idLayanan);
        layanan.setNama_layanan(namaLayanan);

        transaksi.setHarga(harga);
        
        orderQuantity = new OrderQuantity();
        orderQuantity.setQuantity(totalQuantity);
        
        transaksi.setHarga_cucian(hargaCucian);
        transaksi.setDurasiCucian(durasiCuci);
        transaksi.setDelivery(delivery);
        transaksi.setTotalHarga(totalHarga);

        transaksi.setOrder(order);
        transaksi.setPelanggan(pelanggan);
        transaksi.setLayanan(layanan);
        transaksi.setOrderQuantity(orderQuantity);

        result = transaksiService.create(transaksi);
        System.out.println("Data berhasil disimpan...!");
        System.out.println("");
    }
    
    private static Order findOrder(int updatedId) {
        order = new Order();
        orderService = new OrderServiceImpl();
        order = orderService.findById(updatedId);
    
        return order;
    }
    
    private static Transaksi findTransaksi(int updatedId) {
        transaksi = new Transaksi();
        transaksiService = new TransaksiServiceImpl();
        transaksi = transaksiService.findById(updatedId);
    
        return transaksi;
    }
    
    private static OrderQuantity findOrderQuantity(int updatedId) {
        orderQuantity = new OrderQuantity();
        orderQuantityService = new OrderQuantityServiceImpl();
        orderQuantity = orderQuantityService.findById(updatedId);
    
        return orderQuantity;
    }
    
    private static void editTransaksi(Integer id) {
        scanner = new Scanner(System.in);
        transaksiService = new TransaksiServiceImpl();
        Order orderToUpdate = findOrder(id);
        OrderQuantity orderQuantityToUpdate = findOrderQuantity(id);
        Transaksi transaksiToUpdate = findTransaksi(id);

        if (orderToUpdate != null && transaksiToUpdate != null) {
            System.out.println("Nama Pelanggan: ");
            String namaPelanggan = scanner.nextLine();

            System.out.println("Nama Layanan: ");
            String namaLayanan = scanner.nextLine();

            System.out.println("Harga: ");
            int harga = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Durasi Cuci [EXPRESS/REGULER]: ");
            String durasiCuci = scanner.nextLine();

            System.out.println("Delivery [YES/NO]: ");
            String delivery = scanner.nextLine();

            int totalQuantity = orderQuantityToUpdate.getQuantity();
            int hargaCucian = transaksiService.hargaCucian(orderQuantityToUpdate, harga);
            int totalHarga = transaksiService.totalHarga(transaksiToUpdate);

            transaksiToUpdate.setHarga(harga);
            transaksiToUpdate.setHarga_cucian(hargaCucian);
            transaksiToUpdate.setDurasiCucian(durasiCuci);
            transaksiToUpdate.setDelivery(delivery);
            transaksiToUpdate.setTotalHarga(totalHarga);

            transaksiToUpdate.setOrder(orderToUpdate);

            transaksiService.update(transaksiToUpdate);
            System.out.println("Data Transaksi berhasil diperbarui...!");
            System.out.println("");
        } else {
            System.out.println("Data Order atau Transaksi tidak ditemukan!");
        }
    }
   
    public static int insertOrder(Order order) {
        scanner = new Scanner(System.in);
        orderService = new OrderServiceImpl();
        String tanggalTransaksi;
        int idPelanggan, orderId;

        PelangganService pelangganService = new PelangganServiceImpl();
        List<Pelanggan> listPelanggan = pelangganService.findAll();

        System.out.println("Daftar Pelanggan:");
        for (Pelanggan pelanggan : listPelanggan) {
            System.out.println("["+pelanggan.getId()+"]\t"+ " - " +pelanggan.getNama());
        }
        System.out.println("Pilih ID Pelanggan: ");
        idPelanggan = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Tanggal Transaksi [yyyy-MM-dd] contoh 2023-09-28: ");
        tanggalTransaksi = scanner.nextLine();

        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setId(idPelanggan);

        order.setTanggalTransaksi(tanggalTransaksi);
        order.setPelanggan(pelanggan);
        orderId = orderService.create(order);

        return orderId;
}


    public static void insertOrderQuantity(OrderQuantity orderQuantity, int orderId) {
        scanner = new Scanner(System.in);
        orderQuantityService = new OrderQuantityServiceImpl();
        int idLayanan, quantity, result;

        LayananService layananService = new LayananServiceImpl();
        List<Layanan> listLayanan = layananService.findAll();
        
        System.out.println("Daftar Layanan:");
        for (Layanan layanan : listLayanan) {
            System.out.println("["+layanan.getId()+"]\t"+ " - " +layanan.getNama_layanan()+ " - " +layanan.getHarga());
        }
        
        System.out.println("Pilih ID Layanan: ");
        idLayanan = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Quantity: ");
        quantity = scanner.nextInt();

        Order order = new Order();
        order.setIdOrder(orderId); 

        Layanan layanan = new Layanan();
        layanan.setId(idLayanan);

        orderQuantity.setQuantity(quantity);

        orderQuantity.setOrder(order);
        orderQuantity.setLayanan(layanan);

        result = orderQuantityService.create(orderQuantity);
        System.out.println("");
    }
    
    private static void editOrder(Integer id) {
        scanner = new Scanner(System.in);
        orderService = new OrderServiceImpl();
        Order orderToUpdate = findOrder(id);
        String tanggalTransaksi;
        PelangganService pelangganService = new PelangganServiceImpl();
        List<Pelanggan> listPelanggan = pelangganService.findAll();
        
        if (orderToUpdate != null) {
            System.out.println("Daftar Pelanggan:");
            for (Pelanggan pelanggan : listPelanggan) {
                System.out.println("["+pelanggan.getId()+"]\t"+ " - " +pelanggan.getNama());
            }
            System.out.println("Pilih ID Pelanggan: ");
            int idPelanggan = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Tanggal Transaksi [yyyy-MM-dd] contoh 2023-09-28: ");
            tanggalTransaksi = scanner.nextLine();

            Pelanggan pelanggan = new Pelanggan();
            pelanggan.setId(idPelanggan);

            orderToUpdate.setTanggalTransaksi(tanggalTransaksi);
            orderToUpdate.setPelanggan(pelanggan);

            orderService.update(orderToUpdate);
            System.out.println("");
        } else {
            System.out.println("Data tidak ditemukan!");
        }
    }
    
    private static void editOrderQuantity(Integer id) {
        scanner = new Scanner(System.in);
        orderQuantityService = new OrderQuantityServiceImpl();
        Order orderToUpdate = findOrder(id);
        OrderQuantity orderQuantityToUpdate = findOrderQuantity(id);

        if (orderToUpdate != null && orderQuantityToUpdate != null) {
            System.out.println("ID Layanan: ");
            int idLayanan = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Quantity: ");
            int quantity = scanner.nextInt();

            Layanan layanan = new Layanan();
            layanan.setId(idLayanan);

            orderQuantityToUpdate.setQuantity(quantity);
            orderQuantityToUpdate.setOrder(orderToUpdate);
            orderQuantityToUpdate.setLayanan(layanan);

            orderQuantityService.update(orderQuantityToUpdate);
            System.out.println("");
        } else {
            System.out.println("Data tidak ditemukan!");
        }
    }
    
    public static void deleteTransaksi(int idOrder) {
        Transaksi searchedTransaksi = findTransaksi(idOrder);
        if (searchedTransaksi != null) {
            transaksiService.delete(searchedTransaksi.getIdTransaksi());
        } else {
            System.out.println("Data Transaksi tidak ditemukan!");
            return;
        }

        OrderQuantity searchedOrderQuantity = findOrderQuantity(idOrder);
        if (searchedOrderQuantity != null) {
            orderQuantityService.delete(searchedOrderQuantity.getId());
        } else {
            System.out.println("Data Order Quantity tidak ditemukan!");
            return;
        }

        Order searchedOrder = findOrder(idOrder);
        if (searchedOrder != null) {
            orderService.delete(searchedOrder.getIdOrder());
        } else {
            System.out.println("Data Order tidak ditemukan!");
    }
}

}
