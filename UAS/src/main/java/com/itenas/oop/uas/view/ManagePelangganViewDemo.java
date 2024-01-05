/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.uas.view;

import com.itenas.oop.uas.pojo.Pelanggan;
import com.itenas.oop.uas.service.PelangganService;
import com.itenas.oop.uas.serviceimpl.PelangganServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ManagePelangganViewDemo {
    static List<Pelanggan> listPelanggan = new ArrayList<>();
    static Pelanggan pelanggan;
    static PelangganService pelangganService;
    static Scanner scanner;
    
    public static void viewManagePelanggan() {
        int menu = 0;
        boolean keluar = false;
        char pilihan;
        Scanner scanner;

        do {
            System.out.println("+--------------------------------------");
            System.out.println("|         PELANGGAN MANAGEMENT        |");
            System.out.println("+--------------------------------------");
            System.out.println("1. Insert Pelanggan");
            System.out.println("2. Update Pelanggan");
            System.out.println("3. Delete Pelanggan");
            System.out.println("4. Display All Pelanggan");
            System.out.println("5. Find Pelanggan by ID");
            System.out.println("+--------------------------------------");
            System.out.println("");
            System.out.println("Masukkan pilihan menu: ");
            scanner = new Scanner(System.in);
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    char tampil;
                    pelanggan = new Pelanggan();
                    insertPelanggan(pelanggan); 
                    System.out.println("Apakah ingin menampilkan data? y/Y: ");
                    tampil = scanner.next().charAt(0);
                    if (tampil == 'y' || tampil == 'Y') {
                        pelangganService = new PelangganServiceImpl();
                        listPelanggan = pelangganService.findAll();
                        findAllPelanggan(listPelanggan);
                    }
                break;
                case 2:
                    int updatedId;
                    Pelanggan updatedPelanggan = new Pelanggan();
                    System.out.println("Masukkan ID: ");
                    updatedId = scanner.nextInt();
                    updatedPelanggan = findPelanggan(updatedId);
                    System.out.println("Data pelanggan yang akan diupdate: ");
                    if (updatedPelanggan != null) {
                        System.out.println("ID: " + updatedPelanggan.getId());
                        System.out.println("Nama: " + updatedPelanggan.getNama());
                        System.out.println("Nomor Telepon: " + updatedPelanggan.getNomorTelepon());
                        System.out.println("Alamat: " + updatedPelanggan.getAlamat());
                    } else {
                        System.out.println("Data tidak ditemukan!");
                    }
                    System.out.println("");
                    System.out.println("Masukkan data baru: ");
                    editPelanggan(updatedPelanggan.getId());
                break;
                case 3:
                    int deletedId;
                    Pelanggan deletedPelanggan = new Pelanggan();
                    char confirmation;
                    pelangganService = new PelangganServiceImpl();
                    
                    System.out.println("Masukkan ID: ");
                    deletedId = scanner.nextInt();
                    deletedPelanggan = findPelanggan(deletedId);
                    System.out.println("Apakah Anda yakin untuk menghapus? y/n: ");
                    confirmation = scanner.next().charAt(0);
                    
                    if (confirmation == 'y' || confirmation == 'Y') {
                        if (deletedPelanggan != null) {
                            pelangganService.delete(deletedId);
                            System.out.println("Data berhasil dihapus...!");
                            System.out.println("");
                        } else {
                            System.out.println("Data tidak ditemukan!");
                        }
                    }
                break;
                case 4:
                    pelangganService = new PelangganServiceImpl();
                    listPelanggan = pelangganService.findAll();
                    findAllPelanggan(listPelanggan);
                break;
                case 5:
                    int searchedId;
                    Pelanggan searchedPelanggan = new Pelanggan();
                    System.out.println("Masukkan ID: ");
                    searchedId = scanner.nextInt();
                    searchedPelanggan = findPelanggan(searchedId);
                    if (searchedPelanggan != null) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("ID\t\t: " + searchedPelanggan.getId());
                        System.out.println("Nama\t\t: " + searchedPelanggan.getNama());
                        System.out.println("Telepon\t\t: " + searchedPelanggan.getNomorTelepon());
                        System.out.println("Alamat\t\t: " + searchedPelanggan.getAlamat());
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

    private static void findAllPelanggan(List<Pelanggan> listPelanggan) {
        for (Pelanggan pelanggan : listPelanggan) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("ID\t\t: " + pelanggan.getId());
            System.out.println("Nama\t\t: " + pelanggan.getNama());
            System.out.println("Telepon\t\t: " + pelanggan.getNomorTelepon());
            System.out.println("Alamat\t\t: " + pelanggan.getAlamat());
            System.out.println("-----------------------------------------------------------------");
            System.out.println("");
        }
    }

    public static void insertPelanggan(Pelanggan pelanggan) {
        scanner = new Scanner(System.in);
        pelangganService = new PelangganServiceImpl();
        String nama, nomorTelepon, alamat;
        int result;
        
        System.out.println("Nama: ");
        nama = scanner.nextLine();
        System.out.println("No. Telepon: ");
        nomorTelepon = scanner.nextLine();
        System.out.println("Alamat: ");
        alamat = scanner.nextLine();
        
        pelanggan.setNama(nama);
        pelanggan.setNomorTelepon(nomorTelepon);
        pelanggan.setAlamat(alamat);
        
        result = pelangganService.create(pelanggan);
        System.out.println("Data berhasil disimpan...!");
        System.out.println("");
    }

    private static Pelanggan findPelanggan(int updatedId) {
        pelanggan = new Pelanggan();
        pelangganService = new PelangganServiceImpl();
        pelanggan = pelangganService.findById(updatedId);
    
        return pelanggan;
    }

    private static void editPelanggan(Integer id) {
        scanner = new Scanner(System.in);
        pelangganService = new PelangganServiceImpl();
        pelanggan = new Pelanggan();
        String nama, nomorTelepon, alamat;
        
        System.out.println("Nama: ");
        nama = scanner.nextLine();
        System.out.println("No. Telepon: ");
        nomorTelepon = scanner.nextLine();
        System.out.println("Alamat: ");
        alamat = scanner.nextLine();
        
        pelanggan.setId(id);
        pelanggan.setNama(nama);
        pelanggan.setNomorTelepon(nomorTelepon);
        pelanggan.setAlamat(alamat);
        
        pelangganService.update(pelanggan);
        System.out.println("Data berhasil diperbarui...!");
        System.out.println("");
    }
}
