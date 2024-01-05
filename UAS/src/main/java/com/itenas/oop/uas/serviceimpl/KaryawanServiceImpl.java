package com.itenas.oop.uas.serviceimpl;

import com.itenas.oop.uas.pojo.*;
import com.itenas.oop.uas.service.KaryawanService;
import com.itenas.oop.uas.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KaryawanServiceImpl implements KaryawanService{
    private ConnectionManager conMan;
    private Connection conn;
    Statement st;
    ResultSet rs;
    
    
    @Override
    public List<Karyawan> findAll() {
        List<Karyawan> listKaryawan = new ArrayList<>();
        String sql = "SELECT * FROM karyawan";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {                
                Karyawan karyawan = new Karyawan();
                karyawan.setId(rs.getInt("id_karyawan"));
                karyawan.setNama(rs.getString("nama"));
                karyawan.setAlamat(rs.getString("alamat"));
                karyawan.setNomorTelepon(rs.getString("nomor_telepon"));
                
                listKaryawan.add(karyawan);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return listKaryawan;
    }

    @Override
    public Integer create(Karyawan object) {
        int result = 0;
        String sql = "INSERT INTO karyawan(nama, alamat, nomor_telepon) "
                + "VALUES('"+object.getNama()+"', "
                + "'"+object.getAlamat()+"', "
                + "'"+object.getNomorTelepon()+"')";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Integer update(Karyawan object) {
        int result = 0;
        String sql = "UPDATE karyawan SET nama='"+object.getNama()+"', "
                + "alamat='"+object.getAlamat()+"', "
                + "nomor_telepon='"+object.getNomorTelepon()+"' "
                + "WHERE id_karyawan="+object.getId()+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            result = st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanServiceImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Karyawan findById(int id) {
        Karyawan karyawan = null;
        String sql = "SELECT * FROM karyawan WHERE id_karyawan="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                karyawan = new Karyawan();
                karyawan.setId(rs.getInt("id_karyawan"));
                karyawan.setNama(rs.getString("nama"));
                karyawan.setAlamat(rs.getString("alamat"));
                karyawan.setNomorTelepon(rs.getString("nomor_telepon"));
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return karyawan;
    }

    @Override
    public Integer delete(int id) {
        int result = 0;
        String sql = "DELETE FROM karyawan WHERE id_karyawan="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            result = st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
