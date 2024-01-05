/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.uas.view;

import com.itenas.oop.uas.pojo.Delivery;
import com.itenas.oop.uas.pojo.Karyawan;
import com.itenas.oop.uas.pojo.Order;
import com.itenas.oop.uas.pojo.Pelanggan;
import com.itenas.oop.uas.service.DeliveryService;
import com.itenas.oop.uas.serviceimpl.DeliveryServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ManageDeliveryViewDemo {
    static List<Delivery> listDelivery = new ArrayList<>();
    static Delivery delivery;
    static DeliveryService deliveryService;
    static Scanner scanner;
    
    public static void viewManageDelivery() {
        int menu = 0;
        boolean keluar = false;
        char pilihan;
        Scanner scanner;

        do {
            System.out.println("+--------------------------------------");
            System.out.println("|            DELIVERY MANAGEMENT       |");
            System.out.println("+--------------------------------------");
            System.out.println("1. Insert Delivery");
            System.out.println("2. Update Delivery");
            System.out.println("3. Delete Delivery");
            System.out.println("4. Display All Delivery");
            System.out.println("5. Find Delivery by ID");
            System.out.println("+--------------------------------------");
            System.out.println("");
            System.out.println("Masukkan pilihan menu: ");
            scanner = new Scanner(System.in);
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    char tampil;
                    delivery = new Delivery();
                    insertDelivery(delivery); 
                    System.out.println("Apakah ingin menampilkan data? y/Y: ");
                    tampil = scanner.next().charAt(0);
                    if (tampil == 'y' || tampil == 'Y') {
                        deliveryService = new DeliveryServiceImpl();
                        listDelivery = deliveryService.findAll();
                        findAllDelivery(listDelivery);
                    }
                break;
                case 2:
                    int updatedId;
                    Delivery updatedDelivery = new Delivery();
                    System.out.println("Masukkan ID: ");
                    updatedId = scanner.nextInt();
                    updatedDelivery = findDelivery(updatedId);
                    System.out.println("Data delivery yang akan diupdate: ");
                    if (updatedDelivery != null) {
                         System.out.println("ID Delivery: " + updatedDelivery.getId());
                         System.out.println("Tanggal Pengiriman: " + updatedDelivery.getTanggalKirim());
                         System.out.println("ID Order: " + updatedDelivery.getOrder().getIdOrder());
                         System.out.println("ID Karyawan: " + updatedDelivery.getKaryawan().getId());
                         System.out.println("Nama Karyawan: " + updatedDelivery.getKaryawan().getNama());
                         System.out.println("ID Pelanggan: " + updatedDelivery.getPelanggan().getId());
                         System.out.println("Nama Pelanggan: " + updatedDelivery.getPelanggan().getNama());
                         System.out.println("Alamat Pelanggan: " + updatedDelivery.getPelanggan().getAlamat());
                    } else {
                        System.out.println("Data tidak ditemukan!");
                    }
                    System.out.println("");
                    System.out.println("Masukkan data baru: ");
                    editDelivery(updatedDelivery.getId());
                break;
                case 3:
                    int deletedId;
                    Delivery deletedDelivery = new Delivery();
                    char confirmation;
                    deliveryService = new DeliveryServiceImpl();
                    
                    System.out.println("Masukkan ID: ");
                    deletedId = scanner.nextInt();
                    deletedDelivery = findDelivery(deletedId);
                    System.out.println("Apakah Anda yakin untuk menghapus? y/n: ");
                    confirmation = scanner.next().charAt(0);
                    
                    if (confirmation == 'y' || confirmation == 'Y') {
                        if (deletedDelivery != null) {
                            deliveryService.delete(deletedId);
                            System.out.println("Data berhasil dihapus...!");
                            System.out.println("");
                        } else {
                            System.out.println("Data tidak ditemukan!");
                        }
                    }
                break;
                case 4:
                    deliveryService = new DeliveryServiceImpl();
                    listDelivery = deliveryService.findAll();
                    findAllDelivery(listDelivery);
                break;
                case 5:
                    int searchedId;
                    Delivery searchedDelivery = new Delivery();
                    System.out.println("Masukkan ID: ");
                    searchedId = scanner.nextInt();
                    searchedDelivery = findDelivery(searchedId);
                    if (searchedDelivery != null) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("ID Delivery: " + searchedDelivery.getId());
                        System.out.println("Tanggal Pengiriman: " + searchedDelivery.getTanggalKirim());
                        System.out.println("ID Order: " + searchedDelivery.getOrder().getIdOrder());
                        System.out.println("ID Karyawan: " + searchedDelivery.getKaryawan().getId());
                        System.out.println("Nama Karyawan: " + searchedDelivery.getKaryawan().getNama());
                        System.out.println("ID Pelanggan: " + searchedDelivery.getPelanggan().getId());
                        System.out.println("Nama Pelanggan: " + searchedDelivery.getPelanggan().getNama());
                        System.out.println("Alamat Pelanggan: " + searchedDelivery.getPelanggan().getAlamat());
                        System.out.println("-----------------------------------------------------------------");
                    } else {
                        System.out.println("Data tidak ditemukan!");
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

    private static void findAllDelivery(List<Delivery> listDelivery) {
        for (Delivery delivery : listDelivery) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("ID Delivery: " + delivery.getId());
            System.out.println("Tanggal Pengiriman: " + delivery.getTanggalKirim());
            System.out.println("ID Order: " + delivery.getOrder().getIdOrder());
            System.out.println("ID Karyawan: " + delivery.getKaryawan().getId());
            System.out.println("Nama Karyawan: " + delivery.getKaryawan().getNama());
            System.out.println("ID Pelanggan: " + delivery.getPelanggan().getId());
            System.out.println("Nama Pelanggan: " + delivery.getPelanggan().getNama());
            System.out.println("Alamat Pelanggan: " + delivery.getPelanggan().getAlamat());
            System.out.println("-----------------------------------------------------------------");
            System.out.println("");
        }
    }

    public static void insertDelivery(Delivery delivery) {
        scanner = new Scanner(System.in);
        deliveryService = new DeliveryServiceImpl();
        String tanggalKirim, namaKaryawan, namaPelanggan, alamatPelanggan;
        int idOrder, idKaryawan, idPelanggan, result;
        
        System.out.println("Tanggal Kirim [YYYY-MM-DD]: ");
        tanggalKirim = scanner.nextLine();
        System.out.println("ID Order: ");
        idOrder = scanner.nextInt();
        System.out.println("ID Karyawan: ");
        idKaryawan = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nama Karyawan: ");
        namaKaryawan = scanner.nextLine();
        System.out.println("ID Pelanggan: ");
        idPelanggan = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nama Pelanggan: ");
        namaPelanggan = scanner.nextLine();
        System.out.println("Alamat Pelanggan: ");
        alamatPelanggan = scanner.nextLine();
        
        delivery.setTanggalKirim(tanggalKirim);
                
        Order order = new Order();
        order.setIdOrder(idOrder);
                
        Karyawan karyawan = new Karyawan();
        karyawan.setId(idKaryawan);
        karyawan.setNama(namaKaryawan);
                
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setId(idPelanggan);
        pelanggan.setNama(namaPelanggan);
        pelanggan.setAlamat(alamatPelanggan);
                
        delivery.setOrder(order);
        delivery.setKaryawan(karyawan);
        delivery.setPelanggan(pelanggan);
        
        result = deliveryService.create(delivery);
        System.out.println("Data berhasil disimpan...!");
        System.out.println("");
    }

    private static Delivery findDelivery(int updatedId) {
        delivery = new Delivery();
        deliveryService = new DeliveryServiceImpl();
        delivery = deliveryService.findById(updatedId);
    
        return delivery;
    }

    private static void editDelivery(Integer id) {
        scanner = new Scanner(System.in);
        deliveryService = new DeliveryServiceImpl();
        String tanggalKirim, namaKaryawan, namaPelanggan, alamatPelanggan;
        int idOrder, idKaryawan, idPelanggan, result;
        
        Delivery existingDelivery = findDelivery(id);
        
        if (existingDelivery != null) {
            System.out.println("Tanggal Kirim [YYYY-MM-DD]: ");
            tanggalKirim = scanner.nextLine();
            System.out.println("ID Order: ");
            idOrder = scanner.nextInt();
            System.out.println("ID Karyawan: ");
            idKaryawan = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nama Karyawan: ");
            namaKaryawan = scanner.nextLine();
            System.out.println("ID Pelanggan: ");
            idPelanggan = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nama Pelanggan: ");
            namaPelanggan = scanner.nextLine();
            System.out.println("Alamat Pelanggan: ");
            alamatPelanggan = scanner.nextLine();

            delivery.setTanggalKirim(tanggalKirim);

            Order order = new Order();
            order.setIdOrder(idOrder);

            Karyawan karyawan = new Karyawan();
            karyawan.setId(idKaryawan);
            karyawan.setNama(namaKaryawan);

            Pelanggan pelanggan = new Pelanggan();
            pelanggan.setId(idPelanggan);
            pelanggan.setNama(namaPelanggan);
            pelanggan.setAlamat(alamatPelanggan);

            delivery.setOrder(order);
            delivery.setKaryawan(karyawan);
            delivery.setPelanggan(pelanggan);

            deliveryService.update(delivery);
            System.out.println("Data berhasil diperbarui...!");
            System.out.println("");
        } else{
            System.out.println("Data tidak ditemukan!");
        }
    }
}
