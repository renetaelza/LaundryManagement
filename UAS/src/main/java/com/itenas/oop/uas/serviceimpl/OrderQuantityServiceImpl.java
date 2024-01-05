package com.itenas.oop.uas.serviceimpl;

import com.itenas.oop.uas.pojo.Layanan;
import com.itenas.oop.uas.pojo.Order;
import com.itenas.oop.uas.pojo.OrderQuantity;
import com.itenas.oop.uas.service.OrderQuantityService;
import com.itenas.oop.uas.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderQuantityServiceImpl implements OrderQuantityService{

    private ConnectionManager conMan;
    private Connection conn;
    Statement st;
    ResultSet rs;

    @Override
    public List<OrderQuantity> findAll() {
        List<OrderQuantity> listOrderQuantity = new ArrayList<>();
        String sql = "SELECT * FROM order_quantity";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {                
                OrderQuantity orderQuantity = new OrderQuantity();
                orderQuantity.setId(rs.getInt("id_quantity"));
                
                Order order = new Order();
                order.setIdOrder(rs.getInt("id_order"));
                
                Layanan layanan = new Layanan();
                layanan.setId(rs.getInt("id_layanan"));
                
                orderQuantity.setQuantity(rs.getInt("quantity"));
                
                orderQuantity.setOrder(order);
                orderQuantity.setLayanan(layanan);
                listOrderQuantity.add(orderQuantity);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(OrderQuantityServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return listOrderQuantity;
    }

    @Override
    public Integer create(OrderQuantity object) {
        int result = 0;
        String sql = "INSERT INTO order_quantity (id_order, id_layanan, quantity) "
                + "VALUES('"+object.getOrder().getIdOrder()+"', "
                + "'"+object.getLayanan().getId()+"', "
                + "'"+object.getQuantity()+"')";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(OrderQuantityServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Integer update(OrderQuantity object) {
        int result = 0;
        String sql = "UPDATE order_quantity SET id_order='"+object.getOrder().getIdOrder()+"', "
                + "id_layanan='"+object.getLayanan().getId()+"', "
                + "quantity='"+object.getQuantity()+"' "
                + "WHERE id_quantity="+object.getId()+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            result = st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(OrderQuantityServiceImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public OrderQuantity findById(int id) {
        OrderQuantity orderQuantity = null;
        Order order = null;
        Layanan layanan = null;
        
        String sql = "SELECT * FROM order_quantity WHERE id_quantity="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                orderQuantity = new OrderQuantity();
                orderQuantity.setId(rs.getInt("id_quantity"));
                
                order = new Order();
                order.setIdOrder(rs.getInt("id_order"));
                
                layanan = new Layanan();
                layanan.setId(rs.getInt("id_layanan"));
                
                orderQuantity.setQuantity(rs.getInt("quantity"));
                
                orderQuantity.setOrder(order);
                orderQuantity.setLayanan(layanan);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(OrderQuantityServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return orderQuantity;
    }

    @Override
    public Integer delete(int id) {
        int result = 0;
        String sql = "DELETE FROM order_quantity WHERE id_quantity="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            st = conn.createStatement();
            result = st.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(OrderQuantityServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    
}
