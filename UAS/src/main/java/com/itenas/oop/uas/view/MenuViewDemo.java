/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.uas.view;

import com.itenas.oop.uas.pojo.Admin;
import java.util.Scanner;

public class MenuViewDemo {
    
    static void menuAdmin(Admin admin) {
        int menu = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("+--------------------------------------");
            System.out.println("|ADMIN DASHBOARD");
            System.out.println("+--------------------------------------");
            System.out.println("Selamat datang " + admin.getNama());
            System.out.println("[1] Manage Admin");
            System.out.println("[2] Manage Karyawan");
            System.out.println("[3] Manage Pelanggan");
            System.out.println("[4] Manage Layanan");
            System.out.println("[5] Manage Transaksi");
            System.out.println("[6] Manage Delivery");
            System.out.println("[7] Logout");
            System.out.println("---------------------------------------");
            System.out.println("");
            System.out.println("Masukkan pilihan menu: ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    ManageAdminViewDemo.viewManageAdmin();
                    break;
                case 2:
                    ManageKaryawanViewDemo.viewManageKaryawan();
                    break;
                case 3:
                    ManagePelangganViewDemo.viewManagePelanggan();
                    break;
                case 4:
                    ManageLayananViewDemo.viewManageLayanan();
                    break;
                case 5:
                    ManageTransaksiViewDemo.viewManageTransaksi();
                    break;
                case 6:
                    ManageDeliveryViewDemo.viewManageDelivery();
                    break;
                case 7:
                    System.out.println("Apakah ingin logout? [Y/N]: ");
                    char pilihan = scanner.next().charAt(0);
                    if (pilihan == 'y' || pilihan == 'Y') {
                        admin.setLoginStatus(false);
                        System.out.println("Logout!");
                        LandingPageViewDemo.landingPage();
                    }
                    break;
                default:
                    System.out.println("Pilihan yang Anda masukkan salah!");
                    break;
            }
        } while (admin.getLoginStatus());

        System.out.println("Terima kasih sudah menggunakan aplikasi.");
        System.exit(0);
    }
}
