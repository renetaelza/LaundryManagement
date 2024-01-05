package com.itenas.oop.uas.serviceimpl;

import com.itenas.oop.uas.pojo.*;
import com.itenas.oop.uas.service.TransaksiService;
import com.itenas.oop.uas.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TransaksiServiceImpl implements TransaksiService{
    
    private ConnectionManager conMan;
    private Connection conn;
    Statement st;
    ResultSet rs;
    
    @Override
    public List<Transaksi> findAll() {
        List<Transaksi> listTransaksi = new ArrayList<>();
        Transaksi transaksi = null;
        Pelanggan pelanggan = null;
        Layanan layanan = null;
        OrderQuantity orderQuantity = null;
        Order order = null;

        String sql = "SELECT * FROM transaksi";

        conMan = new ConnectionManager();
        conn = conMan.connect();

        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                transaksi = new Transaksi();

                transaksi.setIdTransaksi(rs.getInt("id_transaksi"));

                order = new Order();
                order.setIdOrder(rs.getInt("id_order"));
                transaksi.setTanggal_transaksi(rs.getString("tanggal_transaksi"));

                pelanggan = new Pelanggan();
                pelanggan.setId(rs.getInt("id_pelanggan"));
                pelanggan.setNama(rs.getString("nama_pelanggan"));

                layanan = new Layanan();
                layanan.setId(rs.getInt("id_layanan"));
                layanan.setNama_layanan(rs.getString("nama_layanan"));

                transaksi.setHarga(rs.getInt("harga"));

                orderQuantity = new OrderQuantity();
                orderQuantity.setQuantity(rs.getInt("quantity"));

                transaksi.setHarga_cucian(rs.getInt("harga_cucian"));
                transaksi.setDurasiCucian(rs.getString("durasi_cuci"));
                transaksi.setDelivery(rs.getString("delivery"));
                transaksi.setTotalHarga(rs.getInt("total_harga"));

                transaksi.setPelanggan(pelanggan);
                transaksi.setLayanan(layanan);
                transaksi.setOrderQuantity(orderQuantity);

                listTransaksi.add(transaksi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                e.printStackTrace(); 
            }

            conMan.disconnect();
        }
    return listTransaksi;
}

    @Override
    public Integer create(Transaksi object) {
        int result = 0;
        
        OrderQuantity orderQuantity = object.getOrderQuantity();
        int hargaCucian = hargaCucian(orderQuantity, object.getHarga());
        int totalHarga = totalHarga(object);

        object.setHarga_cucian(hargaCucian);
        object.setTotalHarga(totalHarga);
        
        String sql = "INSERT INTO transaksi (id_order, tanggal_transaksi, id_pelanggan, nama_pelanggan,"
        + "id_layanan, nama_layanan, harga, quantity, harga_cucian, durasi_cuci, delivery, total_harga)"
        + " VALUES("+object.getOrder().getIdOrder()+", "
        + "'"+object.getTanggal_transaksi()+"', "
        + ""+object.getPelanggan().getId()+", "
        + "'"+object.getPelanggan().getNama()+"', "
        + ""+object.getLayanan().getId()+", "
        + "'"+object.getLayanan().getNama_layanan()+"', "
        + ""+object.getHarga()+", "
        + ""+object.getOrderQuantity().getQuantity()+", "
        + ""+object.getHarga_cucian()+", "
        + "'"+object.getDurasiCucian()+"', "
        + "'"+object.getDelivery()+"', "
        + ""+object.getTotalHarga()+")";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Integer update(Transaksi object) {
        int result = 0;
        OrderQuantity orderQuantity = object.getOrderQuantity();
        int hargaCucian = hargaCucian(orderQuantity, object.getHarga());
        int totalHarga = totalHarga(object);
        
        String sql = "UPDATE transaksi SET id_order='" + object.getOrder().getIdOrder() + "', "
        + "tanggal_transaksi='" + object.getTanggal_transaksi() + "', "
        + "id_pelanggan='" + object.getPelanggan().getId() + "', "
        + "nama_pelanggan='" + object.getPelanggan().getNama() + "', "
        + "id_layanan='" + object.getLayanan().getId() + "', "
        + "nama_layanan='" + object.getLayanan().getNama_layanan() + "', "
        + "harga='" + object.getHarga() + "', "
        + "quantity=" + object.getOrderQuantity().getQuantity() + ", "
        + "harga_cucian=" + object.getHarga_cucian() + ", "
        + "durasi_cuci='" + object.getDurasiCucian() + "', "
        + "delivery='" + object.getDelivery() + "', "
        + "total_harga=" + object.getTotalHarga() + " "
        + "WHERE id_transaksi=" + object.getIdTransaksi();

        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            result = st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiServiceImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Transaksi findById(int id) {
        Transaksi transaksi = null;
        Pelanggan pelanggan =  null;
        Layanan layanan = null;
        OrderQuantity orderQuantity = null;
        Order order = null;
        
        String sql = "SELECT * FROM transaksi WHERE id_transaksi="+id+"";

        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                transaksi = new Transaksi();
                
                transaksi.setIdTransaksi(rs.getInt("id_transaksi"));
                order = new Order();
                order.setIdOrder(rs.getInt("id_order"));
                transaksi.setTanggal_transaksi(rs.getString("tanggal_transaksi"));
                
                pelanggan = new Pelanggan();
                pelanggan.setId(rs.getInt("id_pelanggan"));
                pelanggan.setNama(rs.getString("nama_pelanggan"));
                
                layanan = new Layanan();
                layanan.setId(rs.getInt("id_layanan"));
                layanan.setNama_layanan(rs.getString("nama_layanan"));
                
                transaksi.setHarga(rs.getInt("harga"));
                
                orderQuantity = new OrderQuantity();
                orderQuantity.setQuantity(rs.getInt("quantity"));
                
                transaksi.setHarga_cucian(rs.getInt("harga_cucian"));
                transaksi.setDurasiCucian(rs.getString("durasi_cuci"));
                transaksi.setDelivery(rs.getString("delivery"));
                transaksi.setTotalHarga(rs.getInt("total_harga"));
                
                transaksi.setPelanggan(pelanggan);
                transaksi.setLayanan(layanan);
                transaksi.setOrderQuantity(orderQuantity);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return transaksi;
    }

    @Override
    public Integer delete(int id) {
        int result = 0;
        String sql = "DELETE FROM transaksi WHERE id_transaksi="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            result = st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public int hargaCucian(OrderQuantity orderQuantity, int harga) {
    int total = orderQuantity.getQuantity() * harga;
        return total;
    }

    public int totalHarga(Transaksi transaksi) {
        int totalHarga = 0;

        if (transaksi != null && transaksi.getDurasiCucian() != null && transaksi.getOrderQuantity() != null) {
            OrderQuantity orderQuantity = transaksi.getOrderQuantity();
            int harga = transaksi.getHarga(); 

            int hargaCucian = hargaCucian(orderQuantity, harga);

            if (transaksi.getDurasiCucian().equals("EXPRESS")) {
                totalHarga = (int) (hargaCucian + (hargaCucian * 0.2));
                if (transaksi.getDelivery() != null && transaksi.getDelivery().equals("YES")) {
                    return (int) (totalHarga + (totalHarga * 0.2));
                } else if (transaksi.getDelivery() != null && transaksi.getDelivery().equals("NO")) {
                    return totalHarga;
                }
            } else if (transaksi.getDurasiCucian().equals("REGULER")) {
                totalHarga = hargaCucian * transaksi.getOrderQuantity().getQuantity();
                if (transaksi.getDelivery() != null && transaksi.getDelivery().equals("YES")) {
                    return (int) (totalHarga + (totalHarga * 0.2));
                } else if (transaksi.getDelivery() != null && transaksi.getDelivery().equals("NO")) {
                    return totalHarga;
                }
            }
    }
    return totalHarga;
    }

    @Override
    public int getTransaksiCount() {
        int count = 0;
        String sql = "SELECT COUNT(*) FROM transaksi";

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
