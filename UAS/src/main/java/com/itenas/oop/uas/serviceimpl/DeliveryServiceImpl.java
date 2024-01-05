package com.itenas.oop.uas.serviceimpl;

import com.itenas.oop.uas.pojo.*;
import com.itenas.oop.uas.service.DeliveryService;
import com.itenas.oop.uas.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeliveryServiceImpl implements DeliveryService{

    private ConnectionManager conMan;
    private Connection conn;
    Statement st;
    ResultSet rs;

    @Override
    public List<Delivery> findAll() {
        List<Delivery> listDelivery = new ArrayList<>();
        String sql = "SELECT * FROM delivery";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {                
                Delivery delivery = new Delivery();
                delivery.setId(rs.getInt("id_delivery"));
                delivery.setTanggalKirim(rs.getString("tanggal_pengiriman"));
                
                Order order = new Order();
                order.setIdOrder(rs.getInt("id_order"));
                
                Karyawan karyawan = new Karyawan();
                karyawan.setId(rs.getInt("id_karyawan"));
                karyawan.setNama(rs.getString("nama_karyawan"));
                
                Pelanggan pelanggan = new Pelanggan();
                pelanggan.setId(rs.getInt("id_pelanggan"));
                pelanggan.setNama(rs.getString("nama_pelanggan"));
                pelanggan.setAlamat(rs.getString("alamat_pelanggan"));
                
                delivery.setOrder(order);
                delivery.setKaryawan(karyawan);
                delivery.setPelanggan(pelanggan);

                listDelivery.add(delivery);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(DeliveryServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return listDelivery;
    }

    @Override
    public Integer create(Delivery object) {
        int result = 0;
        String sql = "INSERT INTO delivery (tanggal_pengiriman, id_order, id_karyawan, "
                + "nama_karyawan, id_pelanggan, nama_pelanggan, alamat_pelanggan) VALUES "
                + "('" + object.getTanggalKirim() + "', '" + object.getOrder().getIdOrder() + "', '" 
                + object.getKaryawan().getId() + "', '" + object.getKaryawan().getNama() + "', '" 
                + object.getPelanggan().getId() + "', '" + object.getPelanggan().getNama() + "', '" 
                + object.getPelanggan().getAlamat() + "')";

        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(DeliveryServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Integer update(Delivery object) {
        int result = 0;
        
        String sql = "UPDATE delivery SET tanggal_pengiriman='" + object.getTanggalKirim() + "', "
        + "id_order=" + object.getOrder().getIdOrder() + ", "
        + "id_karyawan='" + object.getKaryawan().getId() + "', "
        + "nama_karyawan='" + object.getKaryawan().getNama() + "', "
        + "id_pelanggan='" + object.getPelanggan().getId() + "', "
        + "nama_pelanggan='" + object.getPelanggan().getNama() + "', "
        + "alamat_pelanggan='" + object.getPelanggan().getAlamat() + "' "
        + "WHERE id_delivery=" + object.getId();
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            result = st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(DeliveryServiceImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    @Override
    public Delivery findById(int id) {
        Delivery delivery = null;
        String sql = "SELECT * FROM delivery WHERE id_delivery="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                delivery = new Delivery();
                delivery.setId(rs.getInt("id_delivery"));
                delivery.setTanggalKirim(rs.getString("tanggal_pengiriman"));
                
                Order order = new Order();
                order.setIdOrder(rs.getInt("id_order"));
                
                Karyawan karyawan = new Karyawan();
                karyawan.setId(rs.getInt("id_karyawan"));
                karyawan.setNama(rs.getString("nama_karyawan"));
                
                Pelanggan pelanggan = new Pelanggan();
                pelanggan.setId(rs.getInt("id_pelanggan"));
                pelanggan.setNama(rs.getString("nama_pelanggan"));
                pelanggan.setAlamat(rs.getString("alamat_pelanggan"));
                
                delivery.setOrder(order);
                delivery.setKaryawan(karyawan);
                delivery.setPelanggan(pelanggan);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(DeliveryServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return delivery;
    }

    @Override
    public Integer delete(int id) {
        int result = 0;
        String sql = "DELETE FROM delivery WHERE id_delivery="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            result = st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(DeliveryServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public int getDeliveryCount() {
        int count = 0;
        String sql = "SELECT COUNT(*) FROM delivery";

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
