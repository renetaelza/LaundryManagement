/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.uas.serviceimpl;

import com.itenas.oop.uas.pojo.Admin;
import com.itenas.oop.uas.service.AdminService;
import com.itenas.oop.uas.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminServiceImpl implements AdminService{
    private ConnectionManager conMan;
    private Connection conn;
    static Admin admin;
    Statement st;
    ResultSet rs;
    
    @Override
    public List<Admin> findAll() {
        List<Admin> listAdmin = new ArrayList<>();
        String sql = "SELECT * FROM admin";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {                
                Admin admin = new Admin();
                admin.setId(rs.getInt("id_admin"));
                admin.setEmail(rs.getString("email"));
                admin.setUsername(rs.getString("username"));
                admin.setPassword(rs.getString("password"));
                admin.setNama(rs.getString("nama"));
                admin.setNomorTelepon(rs.getString("nomor_telepon"));
                admin.setAlamat(rs.getString("alamat"));

                listAdmin.add(admin);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(AdminServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return listAdmin;
    }

    @Override
    public Integer create(Admin admin) {
        int result = 0;
        String sql = "INSERT INTO admin (email, username, password, nama, nomor_telepon, alamat) VALUES('"
        + admin.getEmail() + "', '"
        + admin.getUsername() + "', '"
        + admin.getPassword() + "', '"
        + admin.getNama() + "', '"
        + admin.getNomorTelepon() + "', '"
        + admin.getAlamat() + "')";

        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(AdminServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Integer update(Admin admin) {
        int result = 0;
        String sql = "UPDATE admin SET email='"+admin.getEmail()+"', "
        + "username='"+admin.getUsername()+"', "
        + "password='"+admin.getPassword()+"', "
        + "nama='"+admin.getNama()+"', "
        + "nomor_telepon='"+admin.getNomorTelepon()+"', "
        + "alamat='"+admin.getAlamat()+"' "
        + "WHERE id_admin="+admin.getId()+"";

        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            result = st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(AdminServiceImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    @Override
    public Admin findById(int id) {
        Admin admin = null;
        String sql = "SELECT * FROM admin WHERE id_admin="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                admin = new Admin();
                admin.setId(rs.getInt("id_admin"));
                admin.setEmail(rs.getString("email"));
                admin.setUsername(rs.getString("username"));
                admin.setPassword(rs.getString("password"));
                admin.setNama(rs.getString("nama"));
                admin.setNomorTelepon(rs.getString("nomor_telepon"));
                admin.setAlamat(rs.getString("alamat"));
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(AdminServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return admin;
    }

    @Override
    public Integer delete(int id) {
        int result = 0;
        String sql = "DELETE FROM admin WHERE id_admin="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            result = st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(AdminServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Admin login(String username, String password) {
        String sql = "SELECT id_admin, username, password, email, nama, nomor_telepon, alamat " +
             "FROM admin " +
             "WHERE username ='" + username + "' AND password = '" + password + "'";

        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            if (rs.next()) {
                admin = new Admin();
                admin.setId(rs.getInt("id_admin"));
                admin.setEmail(rs.getString("email"));
                admin.setUsername(rs.getString("username"));
                admin.setPassword(rs.getString("password"));
                admin.setNama(rs.getString("nama"));
                admin.setNomorTelepon(rs.getString("nomor_telepon"));
                admin.setAlamat(rs.getString("alamat"));
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(AdminServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return admin;
    }
    
    public boolean register(Admin admin){
        int result = 0;
        String sql = "INSERT INTO admin (email, username, password, nama, nomor_telepon, alamat) VALUES('"
        + admin.getEmail() + "', '"
        + admin.getUsername() + "', '"
        + admin.getPassword() + "', '"
        + admin.getNama() + "', '"
        + admin.getNomorTelepon() + "', '"
        + admin.getAlamat() + "')";

        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }
    
    public boolean isUsernameExists(String username) {
        String sql = "SELECT COUNT(*) FROM admin WHERE username = ?";

        conMan = new ConnectionManager();
        conn = conMan.connect();

        try {
            try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setString(1, username);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    return count > 0; // If count is greater than 0, username exists
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } finally {
            conMan.disconnect();
        }

        return false; 
    }
    
}
