package com.itenas.oop.uas.serviceimpl;

import com.itenas.oop.uas.pojo.*;
import com.itenas.oop.uas.service.LayananService;
import com.itenas.oop.uas.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LayananServiceImpl implements LayananService{
    private ConnectionManager conMan;
    private Connection conn;
    Statement st;
    ResultSet rs;

    @Override
    public List<Layanan> findAll() {
        List<Layanan> listLayanan = new ArrayList<>();
        String sql = "SELECT * FROM layanan";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {                
                Layanan layanan = new Layanan();
                layanan.setId(rs.getInt("id_layanan"));
                layanan.setNama_layanan(rs.getString("nama_layanan"));
                layanan.setHarga(rs.getInt("harga"));
                listLayanan.add(layanan);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(LayananServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return listLayanan;
    }

    @Override
    public Integer create(Layanan object) {
        int result = 0;
        String sql = "INSERT INTO layanan(nama_layanan, harga) "
                + "VALUES('"+object.getNama_layanan()+"', "
                + "'"+object.getHarga()+"')";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(LayananServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Integer update(Layanan object) {
        int result = 0;
        String sql = "UPDATE layanan SET nama_layanan='"+object.getNama_layanan()+"', "
                + "harga='"+object.getHarga()+"' "
                + "WHERE id_layanan="+object.getId()+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            result = st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(LayananServiceImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Layanan findById(int id) {
        Layanan layanan = null;
        String sql = "SELECT * FROM layanan WHERE id_layanan="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                layanan = new Layanan();
                layanan.setId(rs.getInt("id_layanan"));
                layanan.setNama_layanan(rs.getString("nama_layanan"));
                layanan.setHarga(rs.getInt("harga"));
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(LayananServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return layanan;
    }

    @Override
    public Integer delete(int id) {
        int result = 0;
        String sql = "DELETE FROM layanan WHERE id_layanan="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            result = st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(LayananServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    @Override
    public Layanan findByName(String namaLayanan) {
        Layanan layanan = null;
        String sql = "SELECT * FROM layanan WHERE nama_layanan='" + namaLayanan + "'";

        try {
            conMan = new ConnectionManager();
            conn = conMan.connect();
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                layanan = new Layanan();
                layanan.setId(rs.getInt("id_layanan"));
                layanan.setNama_layanan(rs.getString("nama_layanan"));
                layanan.setHarga(rs.getInt("harga"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return layanan;
}

}
