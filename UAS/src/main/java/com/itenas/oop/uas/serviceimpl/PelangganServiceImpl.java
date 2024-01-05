package com.itenas.oop.uas.serviceimpl;

import com.itenas.oop.uas.pojo.*;
import com.itenas.oop.uas.service.PelangganService;
import com.itenas.oop.uas.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PelangganServiceImpl implements PelangganService{
    private ConnectionManager conMan;
    private Connection conn;
    Statement st;
    ResultSet rs;
    
    
    @Override
    public List<Pelanggan> findAll() {
        List<Pelanggan> listPelanggan = new ArrayList<>();
        String sql = "SELECT * FROM pelanggan";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {                
                Pelanggan pelanggan = new Pelanggan();
                pelanggan.setId(rs.getInt("id_pelanggan"));
                pelanggan.setNama(rs.getString("nama"));
                pelanggan.setAlamat(rs.getString("alamat"));
                pelanggan.setNomorTelepon(rs.getString("nomor_telepon"));
                
                listPelanggan.add(pelanggan);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PelangganServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return listPelanggan;
    }

    @Override
    public Integer create(Pelanggan object) {
        int result = 0;
        String sql = "INSERT INTO pelanggan(nama, alamat, nomor_telepon) "
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
            Logger.getLogger(PelangganServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Integer update(Pelanggan object) {
        int result = 0;
        String sql = "UPDATE pelanggan SET nama='" + object.getNama() + "', "
            + "alamat='" + object.getAlamat() + "', "
            + "nomor_telepon='" + object.getNomorTelepon() + "' "
            + "WHERE id_pelanggan=" + object.getId();
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            result = st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PelangganServiceImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Pelanggan findById(int id) {
        Pelanggan pelanggan = null;
        String sql = "SELECT * FROM pelanggan WHERE id_pelanggan="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                pelanggan = new Pelanggan();
                pelanggan.setId(rs.getInt("id_pelanggan"));
                pelanggan.setNama(rs.getString("nama"));
                pelanggan.setAlamat(rs.getString("alamat"));
                pelanggan.setNomorTelepon(rs.getString("nomor_telepon"));
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PelangganServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return pelanggan;
    }

    @Override
    public Integer delete(int id) {
        int result = 0;
        String sql = "DELETE FROM pelanggan WHERE id_pelanggan="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            result = st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PelangganServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public int getPelangganCount() {
        int count = 0;
        String sql = "SELECT COUNT(*) FROM pelanggan";

        conMan = new ConnectionManager();
        conn = conMan.connect();

        try (Statement st = conn.createStatement();
             ResultSet resultSet = st.executeQuery(sql)) {

            if (resultSet.next()) {
                count = resultSet.getInt(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TransaksiServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        } finally {
            conMan.disconnect();
        }

        return count;
    }
    
}
