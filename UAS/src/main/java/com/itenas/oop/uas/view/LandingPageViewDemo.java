/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.uas.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LandingPageViewDemo {

    public static void main(String[] args) {
       landingPage();
    }
    
    public static void landingPage() {
        int menu = 0;
        boolean keluar = false;
        char pilihan;
        Scanner scanner;

        do {
            System.out.println("+--------------------------------------");
            System.out.println("| LAUNDRY DEE KILOS |");
            System.out.println("+--------------------------------------");
            System.out.println("Welcome, please login first");
            System.out.println("[1] Register Admin");
            System.out.println("[2] Login Admin");
            System.out.println("[3] Exit");
            System.out.println("---------------------------------------");
            System.out.println("");
            System.out.println("Masukkan pilihan menu: ");
            scanner = new Scanner(System.in);
            
            try {
                menu = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Mohon masukkan angka " +e);
            }
            
            switch (menu) {
                case 1:
                    LoginAdminViewDemo.register();
                break;
                case 2:
                    LoginAdminViewDemo.login();
                break;
                case 3:
                    System.out.println("Anda sudah keluar dari aplikasi");
                    System.exit(0);
                break;
                default:
                    System.out.println("Pilihan yang Anda masukkan salah!");
                break;
            }
            System.out.println("");
            System.out.println("Apakah ingin melanjutkan? [y/n]: ");
            scanner = new Scanner(System.in);
            pilihan = scanner.next().charAt(0);
            if (pilihan == 'n' || pilihan == 'N') {
                keluar = true;
            }
            
        } while (!keluar);
        System.out.println("Terima kasih sudah menggunakan aplikasi.");
        System.exit(0);
    }
}

