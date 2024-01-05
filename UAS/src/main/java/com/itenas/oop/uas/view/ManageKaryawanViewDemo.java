/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.uas.view;

import com.itenas.oop.uas.pojo.Karyawan;
import com.itenas.oop.uas.service.KaryawanService;
import com.itenas.oop.uas.serviceimpl.KaryawanServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ManageKaryawanViewDemo {
    static List<Karyawan> listKaryawan = new ArrayList<>();
    static Karyawan karyawan;
    static KaryawanService karyawanService;
    static Scanner scanner;
    
    public static void viewManageKaryawan() {
        int menu = 0;
        boolean keluar = false;
        char pilihan;
        Scanner scanner;

        do {
            System.out.println("+--------------------------------------");
            System.out.println("|         KARYAWAN MANAGEMENT         |");
            System.out.println("+--------------------------------------");
            System.out.println("1. Insert Karyawan");
            System.out.println("2. Update Karyawan");
            System.out.println("3. Delete Karyawan");
            System.out.println("4. Display All Karyawan");
            System.out.println("5. Find Karyawan by ID");
            System.out.println("+--------------------------------------");
            System.out.println("");
            System.out.println("Masukkan pilihan menu: ");
            scanner = new Scanner(System.in);
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    char tampil;
                    karyawan = new Karyawan();
                    insertKaryawan(karyawan); 
                    System.out.println("Apakah ingin menampilkan data? y/Y: ");
                    tampil = scanner.next().charAt(0);
                    if (tampil == 'y' || tampil == 'Y') {
                        karyawanService = new KaryawanServiceImpl();
                        listKaryawan = karyawanService.findAll();
                        findAllKaryawan(listKaryawan);
                    }
                break;
                case 2:
                    int updatedId;
                    Karyawan updatedKaryawan = new Karyawan();
                    System.out.println("Masukkan ID: ");
                    updatedId = scanner.nextInt();
                    updatedKaryawan = findKaryawan(updatedId);
                    System.out.println("Data karyawan yang akan diupdate: ");
                    if (updatedKaryawan != null) {
                        System.out.println("ID: " + updatedKaryawan.getId());
                        System.out.println("Nama: " + updatedKaryawan.getNama());
                        System.out.println("Nomor Telepon: " + updatedKaryawan.getNomorTelepon());
                        System.out.println("Alamat: " + updatedKaryawan.getAlamat());
                    } else {
                        System.out.println("Data tidak ditemukan!");
                    }
                    System.out.println("");
                    System.out.println("Masukkan data baru: ");
                    editKaryawan(updatedKaryawan.getId());
                break;
                case 3:
                    int deletedId;
                    Karyawan deletedKaryawan = new Karyawan();
                    char confirmation;
                    karyawanService = new KaryawanServiceImpl();
                    
                    System.out.println("Masukkan ID: ");
                    deletedId = scanner.nextInt();
                    deletedKaryawan = findKaryawan(deletedId);
                    System.out.println("Apakah Anda yakin untuk menghapus? y/n: ");
                    confirmation = scanner.next().charAt(0);
                    
                    if (confirmation == 'y' || confirmation == 'Y') {
                        if (deletedKaryawan != null) {
                            karyawanService.delete(deletedId);
                            System.out.println("Data berhasil dihapus...!");
                            System.out.println("");
                        } else {
                            System.out.println("Data tidak ditemukan!");
                        }
                    }
                break;
                case 4:
                    karyawanService = new KaryawanServiceImpl();
                    listKaryawan = karyawanService.findAll();
                    findAllKaryawan(listKaryawan);
                break;
                case 5:
                    int searchedId;
                    Karyawan searchedKaryawan = new Karyawan();
                    System.out.println("Masukkan ID: ");
                    searchedId = scanner.nextInt();
                    searchedKaryawan = findKaryawan(searchedId);
                    if (searchedKaryawan != null) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("ID\t\t: " + searchedKaryawan.getId());
                        System.out.println("Nama\t\t: " + searchedKaryawan.getNama());
                        System.out.println("Telepon\t\t: " + searchedKaryawan.getNomorTelepon());
                        System.out.println("Alamat\t\t: " + searchedKaryawan.getAlamat());
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

    private static void findAllKaryawan(List<Karyawan> listKaryawan) {
        for (Karyawan karyawan : listKaryawan) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("ID\t\t: " + karyawan.getId());
            System.out.println("Nama\t\t: " + karyawan.getNama());
            System.out.println("Telepon\t\t: " + karyawan.getNomorTelepon());
            System.out.println("Alamat\t\t: " + karyawan.getAlamat());
            System.out.println("-----------------------------------------------------------------");
            System.out.println("");
        }
    }

    public static void insertKaryawan(Karyawan karyawan) {
        scanner = new Scanner(System.in);
        karyawanService = new KaryawanServiceImpl();
        String nama, nomorTelepon, alamat;
        int result;
        
        System.out.println("Nama: ");
        nama = scanner.nextLine();
        System.out.println("No. Telepon: ");
        nomorTelepon = scanner.nextLine();
        System.out.println("Alamat: ");
        alamat = scanner.nextLine();
        
        karyawan.setNama(nama);
        karyawan.setNomorTelepon(nomorTelepon);
        karyawan.setAlamat(alamat);
        
        result = karyawanService.create(karyawan);
        System.out.println("Data berhasil disimpan...!");
        System.out.println("");
    }

    private static Karyawan findKaryawan(int updatedId) {
        karyawan = new Karyawan();
        karyawanService = new KaryawanServiceImpl();
        karyawan = karyawanService.findById(updatedId);
    
        return karyawan;
    }

    private static void editKaryawan(Integer id) {
        scanner = new Scanner(System.in);
        karyawanService = new KaryawanServiceImpl();
        karyawan = new Karyawan();
        String nama, nomorTelepon, alamat;
        
        System.out.println("Nama: ");
        nama = scanner.nextLine();
        System.out.println("No. Telepon: ");
        nomorTelepon = scanner.nextLine();
        System.out.println("Alamat: ");
        alamat = scanner.nextLine();
        
        karyawan.setId(id);
        karyawan.setNama(nama);
        karyawan.setNomorTelepon(nomorTelepon);
        karyawan.setAlamat(alamat);
        
        karyawanService.update(karyawan);
        System.out.println("Data berhasil diperbarui...!");
        System.out.println("");
    }
}
