/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.uas.view;

import com.itenas.oop.uas.pojo.Admin;
import com.itenas.oop.uas.service.AdminService;
import com.itenas.oop.uas.serviceimpl.AdminServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageAdminViewDemo {
    static List<Admin> listAdmin = new ArrayList<>();
    static Admin admin;
    static AdminService adminService;
    static Scanner scanner;
    
    public static void viewManageAdmin() {
        int menu = 0;
        boolean keluar = false;
        char pilihan;
        Scanner scanner;

        do {
            System.out.println("+--------------------------------------");
            System.out.println("|            ADMIN MANAGEMENT         |");
            System.out.println("+--------------------------------------");
            System.out.println("1. Insert Admin");
            System.out.println("2. Update Admin");
            System.out.println("3. Delete Admin");
            System.out.println("4. Display All Admin");
            System.out.println("5. Find Admin by ID");
            System.out.println("+--------------------------------------");
            System.out.println("");
            System.out.println("Masukkan pilihan menu: ");
            scanner = new Scanner(System.in);
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    char tampil;
                    admin = new Admin();
                    insertAdmin(admin); 
                    System.out.println("Apakah ingin menampilkan data? y/Y: ");
                    tampil = scanner.next().charAt(0);
                    if (tampil == 'y' || tampil == 'Y') {
                        adminService = new AdminServiceImpl();
                        listAdmin = adminService.findAll();
                        findAllAdmin(listAdmin);
                    }
                break;
                case 2:
                    int updatedId;
                    Admin updatedAdmin = new Admin();
                    System.out.println("Masukkan ID: ");
                    updatedId = scanner.nextInt();
                    updatedAdmin = findAdmin(updatedId);
                    System.out.println("Data admin yang akan diupdate: ");
                    if (updatedAdmin != null) {
                        System.out.println("ID: " + updatedAdmin.getId());
                        System.out.println("Email: " + updatedAdmin.getEmail());
                        System.out.println("Username: " + updatedAdmin.getUsername());
                        System.out.println("Password: " + updatedAdmin.getPassword());
                        System.out.println("Nama: " + updatedAdmin.getNama());
                        System.out.println("Nomor Telepon: " + updatedAdmin.getNomorTelepon());
                        System.out.println("Alamat: " + updatedAdmin.getAlamat());
                    } else {
                        System.out.println("Data tidak ditemukan!");
                    }
                    System.out.println("");
                    System.out.println("Masukkan data baru: ");
                    editAdmin(updatedAdmin.getId());
                break;
                case 3:
                    int deletedId;
                    Admin deletedAdmin = new Admin();
                    char confirmation;
                    adminService = new AdminServiceImpl();
                    
                    System.out.println("Masukkan ID: ");
                    deletedId = scanner.nextInt();
                    deletedAdmin = findAdmin(deletedId);
                    System.out.println("Apakah Anda yakin untuk menghapus? y/n: ");
                    confirmation = scanner.next().charAt(0);
                    
                    if (confirmation == 'y' || confirmation == 'Y') {
                        if (deletedAdmin != null) {
                            adminService.delete(deletedId);
                            System.out.println("Data berhasil dihapus...!");
                            System.out.println("");
                        } else {
                            System.out.println("Data tidak ditemukan!");
                        }
                    }
                break;
                case 4:
                    adminService = new AdminServiceImpl();
                    listAdmin = adminService.findAll();
                    findAllAdmin(listAdmin);
                break;
                case 5:
                    int searchedId;
                    Admin searchedAdmin = new Admin();
                    System.out.println("Masukkan ID: ");
                    searchedId = scanner.nextInt();
                    searchedAdmin = findAdmin(searchedId);
                    if (searchedAdmin != null) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("ID\t\t: " + searchedAdmin.getId());
                        System.out.println("Email\t\t: " + searchedAdmin.getEmail());
                        System.out.println("Username\t\t: " + searchedAdmin.getUsername());
                        System.out.println("Password\t\t: " + searchedAdmin.getPassword());
                        System.out.println("Nama\t\t: " + searchedAdmin.getNama());
                        System.out.println("Telepon\t\t: " + searchedAdmin.getNomorTelepon());
                        System.out.println("Alamat\t\t: " + searchedAdmin.getAlamat());
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

    private static void findAllAdmin(List<Admin> listAdmin) {
        for (Admin admin : listAdmin) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("ID\t\t: " + admin.getId());
            System.out.println("Email\t\t: " + admin.getEmail());
            System.out.println("Username\t\t: " + admin.getUsername());
            System.out.println("Password\t\t: " + admin.getPassword());
            System.out.println("Nama\t\t: " + admin.getNama());
            System.out.println("Telepon\t\t: " + admin.getNomorTelepon());
            System.out.println("Alamat\t\t: " + admin.getAlamat());
            System.out.println("-----------------------------------------------------------------");
            System.out.println("");
        }
    }

    public static void insertAdmin(Admin admin) {
        scanner = new Scanner(System.in);
        adminService = new AdminServiceImpl();
        String email, username, password, nama, nomorTelepon, alamat;
        int result;
        
        System.out.println("Email: ");
        email = scanner.nextLine();
        System.out.println("Username: ");
        username = scanner.nextLine();
        System.out.println("Password: ");
        password = scanner.nextLine();
        System.out.println("Nama: ");
        nama = scanner.nextLine();
        System.out.println("No. Telepon: ");
        nomorTelepon = scanner.nextLine();
        System.out.println("Alamat: ");
        alamat = scanner.nextLine();
        
        admin.setEmail(email);
        admin.setUsername(username);
        admin.setPassword(password);
        admin.setNama(nama);
        admin.setNomorTelepon(nomorTelepon);
        admin.setAlamat(alamat);
        
        result = adminService.create(admin);
        System.out.println("Data berhasil disimpan...!");
        System.out.println("");
    }

    private static Admin findAdmin(int updatedId) {
        admin = new Admin();
        adminService = new AdminServiceImpl();
        admin = adminService.findById(updatedId);
    
        return admin;
    }

    private static void editAdmin(Integer id) {
        scanner = new Scanner(System.in);
        adminService = new AdminServiceImpl();
        admin = new Admin();
        String email, username, password, nama, nomorTelepon, alamat;
        
        System.out.println("Email: ");
        email = scanner.nextLine();
        System.out.println("Username: ");
        username = scanner.nextLine();
        System.out.println("Password: ");
        password = scanner.nextLine();
        System.out.println("Nama: ");
        nama = scanner.nextLine();
        System.out.println("No. Telepon: ");
        nomorTelepon = scanner.nextLine();
        System.out.println("Alamat: ");
        alamat = scanner.nextLine();
        
        admin.setEmail(email);
        admin.setUsername(username);
        admin.setPassword(password);
        admin.setId(id);
        admin.setNama(nama);
        admin.setNomorTelepon(nomorTelepon);
        admin.setAlamat(alamat);
        
        adminService.update(admin);
        System.out.println("Data berhasil diperbarui...!");
        System.out.println("");
    }
}
