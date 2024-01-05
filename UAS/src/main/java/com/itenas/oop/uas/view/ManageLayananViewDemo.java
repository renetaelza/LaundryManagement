/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.uas.view;

import com.itenas.oop.uas.pojo.Layanan;
import com.itenas.oop.uas.service.LayananService;
import com.itenas.oop.uas.serviceimpl.LayananServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ManageLayananViewDemo {
    static List<Layanan> listLayanan = new ArrayList<>();
    static Layanan layanan;
    static LayananService layananService;
    static Scanner scanner;
    
    public static void viewManageLayanan() {
        int menu = 0;
        boolean keluar = false;
        char pilihan;
        Scanner scanner;

        do {
            System.out.println("+--------------------------------------");
            System.out.println("|          LAYANAN MANAGEMENT         |");
            System.out.println("+--------------------------------------");
            System.out.println("1. Insert Layanan");
            System.out.println("2. Update Layanan");
            System.out.println("3. Delete Layanan");
            System.out.println("4. Display All Layanan");
            System.out.println("5. Find Layanan by ID");
            System.out.println("+--------------------------------------");
            System.out.println("");
            System.out.println("Masukkan pilihan menu: ");
            scanner = new Scanner(System.in);
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    char tampil;
                    layanan = new Layanan();
                    insertLayanan(layanan); 
                    System.out.println("Apakah ingin menampilkan data? y/Y: ");
                    tampil = scanner.next().charAt(0);
                    if (tampil == 'y' || tampil == 'Y') {
                        layananService = new LayananServiceImpl();
                        listLayanan = layananService.findAll();
                        findAllLayanan(listLayanan);
                    }
                break;
                case 2:
                    int updatedId;
                    Layanan updatedLayanan = new Layanan();
                    System.out.println("Masukkan ID: ");
                    updatedId = scanner.nextInt();
                    updatedLayanan = findLayanan(updatedId);
                    System.out.println("Data layanan yang akan diupdate: ");
                    if (updatedLayanan != null) {
                        System.out.println("ID: " + updatedLayanan.getId());
                        System.out.println("Nama: " + updatedLayanan.getNama_layanan());
                        System.out.println("Harga: " + updatedLayanan.getHarga());
                    } else {
                        System.out.println("Data tidak ditemukan!");
                    }
                    System.out.println("");
                    System.out.println("Masukkan data baru: ");
                    editLayanan(updatedLayanan.getId());
                break;
                case 3:
                    int deletedId;
                    Layanan deletedLayanan = new Layanan();
                    char confirmation;
                    layananService = new LayananServiceImpl();
                    
                    System.out.println("Masukkan ID: ");
                    deletedId = scanner.nextInt();
                    deletedLayanan = findLayanan(deletedId);
                    System.out.println("Apakah Anda yakin untuk menghapus? y/n: ");
                    confirmation = scanner.next().charAt(0);
                    
                    if (confirmation == 'y' || confirmation == 'Y') {
                        if (deletedLayanan != null) {
                            layananService.delete(deletedId);
                            System.out.println("Data berhasil dihapus...!");
                            System.out.println("");
                        } else {
                            System.out.println("Data tidak ditemukan!");
                        }
                    }
                break;
                case 4:
                    layananService = new LayananServiceImpl();
                    listLayanan = layananService.findAll();
                    findAllLayanan(listLayanan);
                break;
                case 5:
                    int searchedId;
                    Layanan searchedLayanan = new Layanan();
                    System.out.println("Masukkan ID: ");
                    searchedId = scanner.nextInt();
                    searchedLayanan = findLayanan(searchedId);
                    if (searchedLayanan != null) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("ID\t\t: " + searchedLayanan.getId());
                        System.out.println("Nama\t\t: " + searchedLayanan.getNama_layanan());
                        System.out.println("Harga\t\t: " + searchedLayanan.getHarga());
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

    private static void findAllLayanan(List<Layanan> listLayanan) {
        for (Layanan layanan : listLayanan) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("ID\t\t: " + layanan.getId());
            System.out.println("Nama\t\t: " + layanan.getNama_layanan());
            System.out.println("Harga\t\t: " + layanan.getHarga());
            System.out.println("-----------------------------------------------------------------");
            System.out.println("");
        }
    }

    public static void insertLayanan(Layanan layanan) {
        scanner = new Scanner(System.in);
        layananService = new LayananServiceImpl();
        String nama;
        int harga, result;
        
        System.out.println("Nama: ");
        nama = scanner.nextLine();
        System.out.println("Harga: ");
        harga = scanner.nextInt();
        
        layanan.setNama_layanan(nama);
        layanan.setHarga(harga);
        
        result = layananService.create(layanan);
        System.out.println("Data berhasil disimpan...!");
        System.out.println("");
    }

    private static Layanan findLayanan(int updatedId) {
        layanan = new Layanan();
        layananService = new LayananServiceImpl();
        layanan = layananService.findById(updatedId);
    
        return layanan;
    }

    private static void editLayanan(Integer id) {
        scanner = new Scanner(System.in);
        layananService = new LayananServiceImpl();
        String nama;
        int harga, result;
        
        System.out.println("Nama: ");
        nama = scanner.nextLine();
        System.out.println("Harga: ");
        harga = scanner.nextInt();
        
        layanan.setNama_layanan(nama);
        layanan.setHarga(harga);
        
        result = layananService.create(layanan);
        System.out.println("Data berhasil disimpan...!");
        System.out.println("");
        
        layananService.update(layanan);
        System.out.println("Data berhasil diperbarui...!");
        System.out.println("");
    }
}
