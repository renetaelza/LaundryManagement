/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.uas.pojo;

/**
 *
 * @author renet
 */
public class Admin {
    private Integer id;
    private String email;
    private String username;
    private String password;
    private String nama;
    private String nomorTelepon;
    private String alamat;
    private boolean loginStatus;

    public Admin() {
    }

    public Admin(Integer id, String email, String username, String password, String nama, String nomorTelepon, String alamat, boolean loginStatus) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
        this.alamat = alamat;
        this.loginStatus = loginStatus;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    
}
