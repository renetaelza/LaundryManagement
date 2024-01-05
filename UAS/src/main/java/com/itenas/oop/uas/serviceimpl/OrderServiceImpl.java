package com.itenas.oop.uas.serviceimpl;

import com.itenas.oop.uas.pojo.Order;
import com.itenas.oop.uas.pojo.Pelanggan;
import com.itenas.oop.uas.service.OrderService;
import com.itenas.oop.uas.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderServiceImpl implements OrderService{

    private ConnectionManager conMan;
    private Connection conn;
    Statement st;
    ResultSet rs;

    @Override
    public List<Order> findAll() {
        List<Order> listOrder = new ArrayList<>();
        String sql = "SELECT * FROM orders";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {                
                Order order = new Order();
                order.setIdOrder(rs.getInt("id_order"));
                
                Pelanggan pelanggan = new Pelanggan();
                pelanggan.setId(rs.getInt("id_pelanggan"));
                
                order.setTanggalTransaksi(rs.getString("tanggal_transaksi"));
                order.setPelanggan(pelanggan);
                listOrder.add(order);
                
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(OrderServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return listOrder;
    }

    @Override
    public Integer create(Order object) {
    int result = 0;
    String sql = "INSERT INTO orders (id_pelanggan, tanggal_transaksi) "
            + "VALUES('"+object.getPelanggan().getId()+"', "
            + "'"+object.getTanggalTransaksi()+"')";
    
    conMan = new ConnectionManager();
    conn = conMan.connect();
    
    try {
        st = conn.createStatement();
        st.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
        
        ResultSet rs = st.getGeneratedKeys();
        if (rs.next()) {
            result = rs.getInt(1);
        }
        
        conMan.disconnect();
    } catch (SQLException ex) {
        Logger.getLogger(OrderServiceImpl.class.getName())
                .log(Level.SEVERE, null, ex);
    }

    return result;
}


    @Override
    public Integer update(Order object) {
        int result = 0;
        String sql = "UPDATE orders SET id_pelanggan='"+object.getPelanggan().getId()+"', "
                + "tanggal_transaksi="+object.getTanggalTransaksi()+" "
                + "WHERE id_order="+object.getIdOrder()+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            result = st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(OrderServiceImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Order findById(int id) {
        Order order = null;
        Pelanggan pelanggan =  null;
        
        String sql = "SELECT * FROM orders "
                + "WHERE id_order="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                order = new Order();
                order.setIdOrder(rs.getInt("id_order"));
                
                pelanggan = new Pelanggan();
                pelanggan.setId(rs.getInt("id_pelanggan"));
                
                order.setTanggalTransaksi(rs.getString("tanggal_transaksi"));
                order.setPelanggan(pelanggan);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(OrderServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return order;
    }

    @Override
    public Integer delete(int id) {
        int result = 0;
        String sql = "DELETE FROM orders WHERE id_order="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            result = st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(OrderServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
}
