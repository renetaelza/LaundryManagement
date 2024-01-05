/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.uas.view;

import com.itenas.oop.uas.pojo.Admin;
import com.itenas.oop.uas.service.AdminService;
import com.itenas.oop.uas.serviceimpl.AdminServiceImpl;
import com.itenas.oop.uas.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class LoginAdminViewDemo {
    private static AdminService adminService = new AdminServiceImpl();
    private static Scanner scanner = new Scanner(System.in);
    private static ConnectionManager conMan;
    private static Connection conn;
    static Statement st;
    static ResultSet rs;
    static Admin admin;

    public static void register() {
        String email, username, password, nama, nomorTelepon, alamat;

        System.out.println("+-------------------------------------------+");
        System.out.println("|REGISTER ADMIN                             |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| Email: ");
        email = scanner.nextLine();
        System.out.println("| Username: ");
        username = scanner.nextLine();
        System.out.println("| Password: ");
        password = scanner.nextLine();
        System.out.println("| Nama: ");
        nama = scanner.nextLine();
        System.out.println("| Nomor Telepon: ");
        nomorTelepon = scanner.nextLine();
        System.out.println("| Alamat: ");
        alamat = scanner.nextLine();
        System.out.println("+-------------------------------------------+");

        Admin admin = new Admin();
        admin.setEmail(email);
        admin.setUsername(username);
        admin.setPassword(password);
        admin.setNama(nama);
        admin.setNomorTelepon(nomorTelepon);
        admin.setAlamat(alamat);

        if (adminService.register(admin)) {
            System.out.println("Registrasi berhasil. Silakan login.");
            login();
        } else {
            System.out.println("Registrasi gagal. Silakan coba lagi.");
            System.out.println("");
        }
    }

    public static void login() {
        String username, password;
        AdminService adminService = new AdminServiceImpl();

        do {
            System.out.println("+-------------------------------------------+");
            System.out.println("|LOGIN ADMIN                                |");
            System.out.println("+-------------------------------------------+");
            System.out.println("| Username: ");
            username = scanner.nextLine();
            System.out.println("| Password: ");
            password = scanner.nextLine();
            System.out.println("+-------------------------------------------+");
            System.out.println();

            Admin admin = adminService.login(username, password);

            if (admin != null) {
                admin.setLoginStatus(true);
                System.out.println("Login berhasil...!");
                System.out.println("");
                MenuViewDemo.menuAdmin(admin);
            } else {
                System.out.println("Username atau password yang Anda masukkan salah, coba lagi...!");
            }
        } while (true);
    }
}
