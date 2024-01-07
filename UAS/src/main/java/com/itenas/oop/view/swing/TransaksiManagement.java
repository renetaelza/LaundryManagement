package com.itenas.oop.view.swing;

import com.itenas.oop.uas.pojo.Layanan;
import com.itenas.oop.uas.pojo.Order;
import com.itenas.oop.uas.pojo.OrderQuantity;
import com.itenas.oop.uas.pojo.Pelanggan;
import com.itenas.oop.uas.pojo.Transaksi;
import com.itenas.oop.uas.service.DeliveryService;
import com.itenas.oop.uas.service.LayananService;
import com.itenas.oop.uas.service.OrderQuantityService;
import com.itenas.oop.uas.service.OrderService;
import com.itenas.oop.uas.service.PelangganService;
import com.itenas.oop.uas.service.TransaksiService;
import com.itenas.oop.uas.serviceimpl.DeliveryServiceImpl;
import com.itenas.oop.uas.serviceimpl.PelangganServiceImpl;
import com.itenas.oop.uas.serviceimpl.TransaksiServiceImpl;
import com.itenas.oop.uas.serviceimpl.LayananServiceImpl;
import com.itenas.oop.uas.serviceimpl.OrderQuantityServiceImpl;
import com.itenas.oop.uas.serviceimpl.OrderServiceImpl;
import com.itenas.oop.uas.utilities.ConnectionManager;
import java.awt.Color;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TransaksiManagement extends javax.swing.JPanel {
    Boolean hasil;
    TransaksiService transaksiService = new TransaksiServiceImpl();
    PelangganService pelangganService = new PelangganServiceImpl();
    DeliveryService deliveryService = new DeliveryServiceImpl();
    Transaksi transaksi;
    Pelanggan pelanggan;
    Layanan layanan;
    OrderQuantity orderQuantity;
    Order order;
    private DefaultTableModel model;
    private DefaultTableModel modelPelanggan;
    private ConnectionManager conMan;
    private Connection conn;
    Statement st;
    ResultSet rs;
    

    public TransaksiManagement() {
        initComponents();
        model = new DefaultTableModel();
        tabelTransaksi.setModel(model);
        model.addColumn("ID Transaksi");
        model.addColumn("Tanggal Transaksi");
        model.addColumn("ID Pelanggan");
        model.addColumn("Nama Pelanggan");
        model.addColumn("ID Layanan");
        model.addColumn("Nama Layanan");
        model.addColumn("Harga");
        model.addColumn("Quantity");
        model.addColumn("Harga Cucian");
        model.addColumn("Durasi Cuci");
        model.addColumn("Delivery");
        model.addColumn("Total Harga");
        getData();
        
        modelPelanggan = new DefaultTableModel();
        tabelPelanggan.setModel(modelPelanggan);
        modelPelanggan.addColumn("ID Pelanggan");
        modelPelanggan.addColumn("Nama");;
        getDataPelanggan();
        
        combo_layanan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboLayananItemStateChanged(evt);
            }
        });
        
        combo_delivery.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboDeliveryItemStateChanged(evt);
            }
        });
        
        txt_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_quantityActionPerformed(evt);
            }
        });
        txt_id_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_pelangganActionPerformed(evt);
            }
    });
    }
    
    private void emptyField() {
        txt_id_transaksi.setText("");
        chooser_tanggal_transaksi.setCalendar(null);
        txt_id_pelanggan.setText("");
        txt_nama_pelanggan.setText("");
        txt_id_layanan.setText("");
        combo_layanan.setSelectedIndex(0);
        txt_harga.setText("");
        txt_quantity.setText("");
        txt_total_cucian.setText("");
        combo_durasi_cuci.setSelectedIndex(0);
        combo_delivery.setSelectedIndex(0);
        txt_total_harga.setText("");
    }

    private void getData() {
        DefaultTableModel dtm = (DefaultTableModel) tabelTransaksi.getModel();
        dtm.setRowCount(0);

        List<Transaksi> listTransaksi = transaksiService.findAll();

        for (Transaksi transaksi : listTransaksi) {
            Object[] data = {
                    transaksi.getIdTransaksi(),
                    transaksi.getTanggal_transaksi(),
                    transaksi.getPelanggan().getId(),
                    transaksi.getPelanggan().getNama(),
                    transaksi.getLayanan().getId(),
                    transaksi.getLayanan().getNama_layanan(),
                    transaksi.getHarga(),
                    transaksi.getOrderQuantity().getQuantity(),
                    transaksi.getHarga_cucian(),
                    transaksi.getDurasiCucian(),
                    transaksi.getDelivery(),
                    transaksi.getTotalHarga()
            };
            dtm.addRow(data);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearch6 = new com.itenas.oop.view.swing.Rounded();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        rounded1 = new com.itenas.oop.view.swing.Rounded();
        jLabel7 = new javax.swing.JLabel();
        txt_search_id = new javax.swing.JTextField();
        btnSearch = new com.itenas.oop.view.swing.Rounded();
        btnTextSearch = new javax.swing.JLabel();
        btnRefresh = new com.itenas.oop.view.swing.Rounded();
        btnTextRefresh = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txt_search_idPelanggan = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelPelanggan = new javax.swing.JTable();
        btnSearchPelanggan = new com.itenas.oop.view.swing.Rounded();
        btnTextSearchPelanggan = new javax.swing.JLabel();
        btnRefreshPelanggan = new com.itenas.oop.view.swing.Rounded();
        btnTextRefreshPelanggan = new javax.swing.JLabel();
        rounded2 = new com.itenas.oop.view.swing.Rounded();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_id_transaksi = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_id_pelanggan = new javax.swing.JTextField();
        rounded3 = new com.itenas.oop.view.swing.Rounded();
        btnSave = new com.itenas.oop.view.swing.Rounded();
        btnTextSave = new javax.swing.JLabel();
        btnClear = new com.itenas.oop.view.swing.Rounded();
        btnTextClear = new javax.swing.JLabel();
        btnDelete = new com.itenas.oop.view.swing.Rounded();
        btnTextDelete = new javax.swing.JLabel();
        btnPrint = new com.itenas.oop.view.swing.Rounded();
        btnTextPrint = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_nama_pelanggan = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        combo_delivery = new javax.swing.JComboBox<>();
        combo_durasi_cuci = new javax.swing.JComboBox<>();
        txt_id_layanan = new javax.swing.JTextField();
        combo_layanan = new javax.swing.JComboBox<>();
        txt_harga = new javax.swing.JTextField();
        txt_quantity = new javax.swing.JTextField();
        txt_total_cucian = new javax.swing.JTextField();
        txt_total_harga = new javax.swing.JTextField();
        chooser_tanggal_transaksi = new com.toedter.calendar.JDateChooser();

        btnSearch6.setBackground(new java.awt.Color(204, 204, 255));
        btnSearch6.setRoundBottomLeft(25);
        btnSearch6.setRoundBottomRight(25);
        btnSearch6.setRoundTopLeft(25);
        btnSearch6.setRoundTopRight(25);
        btnSearch6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearch6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSearch6Layout = new javax.swing.GroupLayout(btnSearch6);
        btnSearch6.setLayout(btnSearch6Layout);
        btnSearch6Layout.setHorizontalGroup(
            btnSearch6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        btnSearch6Layout.setVerticalGroup(
            btnSearch6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(700, 630));
        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(963, 678));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\renet\\Downloads\\foto\\computer.png")); // NOI18N
        jLabel8.setText("Master Data > Kelola Transaksi");
        jLabel8.setToolTipText("");

        rounded1.setBackground(new java.awt.Color(255, 255, 255));
        rounded1.setRoundBottomLeft(30);
        rounded1.setRoundBottomRight(30);
        rounded1.setRoundTopLeft(30);
        rounded1.setRoundTopRight(30);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Daftar Transaksi");
        jLabel7.setToolTipText("");

        txt_search_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_search_id.setForeground(new java.awt.Color(204, 204, 204));
        txt_search_id.setText("Search by ID");
        txt_search_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_search_idMouseClicked(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(204, 204, 255));
        btnSearch.setRoundBottomLeft(25);
        btnSearch.setRoundBottomRight(25);
        btnSearch.setRoundTopLeft(25);
        btnSearch.setRoundTopRight(25);
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchMouseExited(evt);
            }
        });

        btnTextSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnTextSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTextSearch.setText("SEARCH");
        btnTextSearch.setToolTipText("");
        btnTextSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTextSearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSearchLayout = new javax.swing.GroupLayout(btnSearch);
        btnSearch.setLayout(btnSearchLayout);
        btnSearchLayout.setHorizontalGroup(
            btnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSearchLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnTextSearch)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btnSearchLayout.setVerticalGroup(
            btnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTextSearch)
                .addContainerGap())
        );

        btnRefresh.setBackground(new java.awt.Color(204, 204, 255));
        btnRefresh.setRoundBottomLeft(25);
        btnRefresh.setRoundBottomRight(25);
        btnRefresh.setRoundTopLeft(25);
        btnRefresh.setRoundTopRight(25);
        btnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRefreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRefreshMouseExited(evt);
            }
        });

        btnTextRefresh.setBackground(new java.awt.Color(0, 0, 0));
        btnTextRefresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTextRefresh.setText("REFRESH");
        btnTextRefresh.setToolTipText("");
        btnTextRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTextRefreshMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnRefreshLayout = new javax.swing.GroupLayout(btnRefresh);
        btnRefresh.setLayout(btnRefreshLayout);
        btnRefreshLayout.setHorizontalGroup(
            btnRefreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRefreshLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(btnTextRefresh)
                .addGap(15, 15, 15))
        );
        btnRefreshLayout.setVerticalGroup(
            btnRefreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRefreshLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTextRefresh)
                .addContainerGap())
        );

        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID TRANSAKSI", "TANGGAL TRANSAKSI", "ID PELANGGAN", "NAMA PELANGGAN", "ID LAYANAN", "HARGA", "QUANTITY", "HARGA CUCIAN", "DURASI CUCI", "DELIVERY", "TOTAL HARGA"
            }
        ));
        tabelTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelTransaksi);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Daftar Pelanggan");
        jLabel9.setToolTipText("");

        txt_search_idPelanggan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_search_idPelanggan.setForeground(new java.awt.Color(204, 204, 204));
        txt_search_idPelanggan.setText("Search by ID");
        txt_search_idPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_search_idPelangganMouseClicked(evt);
            }
        });

        tabelPelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID PELANGGAN", "NAMA"
            }
        ));
        tabelPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPelangganMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelPelanggan);

        btnSearchPelanggan.setBackground(new java.awt.Color(204, 204, 255));
        btnSearchPelanggan.setRoundBottomLeft(25);
        btnSearchPelanggan.setRoundBottomRight(25);
        btnSearchPelanggan.setRoundTopLeft(25);
        btnSearchPelanggan.setRoundTopRight(25);
        btnSearchPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchPelangganMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchPelangganMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchPelangganMouseExited(evt);
            }
        });

        btnTextSearchPelanggan.setBackground(new java.awt.Color(0, 0, 0));
        btnTextSearchPelanggan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTextSearchPelanggan.setText("   SEARCH");
        btnTextSearchPelanggan.setToolTipText("");
        btnTextSearchPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTextSearchPelangganMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSearchPelangganLayout = new javax.swing.GroupLayout(btnSearchPelanggan);
        btnSearchPelanggan.setLayout(btnSearchPelangganLayout);
        btnSearchPelangganLayout.setHorizontalGroup(
            btnSearchPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSearchPelangganLayout.createSequentialGroup()
                .addComponent(btnTextSearchPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnSearchPelangganLayout.setVerticalGroup(
            btnSearchPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSearchPelangganLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTextSearchPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnRefreshPelanggan.setBackground(new java.awt.Color(204, 204, 255));
        btnRefreshPelanggan.setRoundBottomLeft(25);
        btnRefreshPelanggan.setRoundBottomRight(25);
        btnRefreshPelanggan.setRoundTopLeft(25);
        btnRefreshPelanggan.setRoundTopRight(25);
        btnRefreshPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshPelangganMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRefreshPelangganMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRefreshPelangganMouseExited(evt);
            }
        });

        btnTextRefreshPelanggan.setBackground(new java.awt.Color(0, 0, 0));
        btnTextRefreshPelanggan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTextRefreshPelanggan.setText("REFRESH");
        btnTextRefreshPelanggan.setToolTipText("");
        btnTextRefreshPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTextRefreshPelangganMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnRefreshPelangganLayout = new javax.swing.GroupLayout(btnRefreshPelanggan);
        btnRefreshPelanggan.setLayout(btnRefreshPelangganLayout);
        btnRefreshPelangganLayout.setHorizontalGroup(
            btnRefreshPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRefreshPelangganLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnTextRefreshPelanggan)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btnRefreshPelangganLayout.setVerticalGroup(
            btnRefreshPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRefreshPelangganLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTextRefreshPelanggan)
                .addContainerGap())
        );

        javax.swing.GroupLayout rounded1Layout = new javax.swing.GroupLayout(rounded1);
        rounded1.setLayout(rounded1Layout);
        rounded1Layout.setHorizontalGroup(
            rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rounded1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rounded1Layout.createSequentialGroup()
                        .addComponent(txt_search_id, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rounded1Layout.createSequentialGroup()
                            .addComponent(txt_search_idPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSearchPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRefreshPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        rounded1Layout.setVerticalGroup(
            rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rounded1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(13, 13, 13)
                .addGroup(rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(rounded1Layout.createSequentialGroup()
                        .addGroup(rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_search_id)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(rounded1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_search_idPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRefreshPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        rounded2.setBackground(new java.awt.Color(255, 255, 255));
        rounded2.setRoundBottomLeft(30);
        rounded2.setRoundBottomRight(30);
        rounded2.setRoundTopLeft(30);
        rounded2.setRoundTopRight(30);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Manage Transaksi");
        jLabel12.setToolTipText("");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("ID Transaksi");
        jLabel11.setToolTipText("");

        txt_id_transaksi.setEditable(false);
        txt_id_transaksi.setBackground(new java.awt.Color(204, 204, 255));
        txt_id_transaksi.setText("Tidak Usah Disi");

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Tanggal Transaksi");
        jLabel16.setToolTipText("");

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("ID Pelanggan");
        jLabel17.setToolTipText("");

        txt_id_pelanggan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_id_pelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_id_pelangganMouseClicked(evt);
            }
        });
        txt_id_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_pelangganActionPerformed(evt);
            }
        });

        rounded3.setBackground(new java.awt.Color(250, 250, 250));
        rounded3.setRoundBottomLeft(50);
        rounded3.setRoundBottomRight(50);
        rounded3.setRoundTopLeft(50);
        rounded3.setRoundTopRight(50);

        btnSave.setBackground(new java.awt.Color(204, 204, 255));
        btnSave.setRoundBottomLeft(25);
        btnSave.setRoundBottomRight(25);
        btnSave.setRoundTopLeft(25);
        btnSave.setRoundTopRight(25);
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
        });

        btnTextSave.setBackground(new java.awt.Color(0, 0, 0));
        btnTextSave.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnTextSave.setText("SAVE");
        btnTextSave.setToolTipText("");
        btnTextSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTextSaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSaveLayout = new javax.swing.GroupLayout(btnSave);
        btnSave.setLayout(btnSaveLayout);
        btnSaveLayout.setHorizontalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSaveLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTextSave)
                .addGap(44, 44, 44))
        );
        btnSaveLayout.setVerticalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTextSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        btnClear.setBackground(new java.awt.Color(204, 204, 255));
        btnClear.setRoundBottomLeft(25);
        btnClear.setRoundBottomRight(25);
        btnClear.setRoundTopLeft(25);
        btnClear.setRoundTopRight(25);
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearMouseExited(evt);
            }
        });

        btnTextClear.setBackground(new java.awt.Color(0, 0, 0));
        btnTextClear.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnTextClear.setText("CLEAR");
        btnTextClear.setToolTipText("");
        btnTextClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTextClearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnClearLayout = new javax.swing.GroupLayout(btnClear);
        btnClear.setLayout(btnClearLayout);
        btnClearLayout.setHorizontalGroup(
            btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnClearLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTextClear)
                .addGap(37, 37, 37))
        );
        btnClearLayout.setVerticalGroup(
            btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTextClear)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        btnDelete.setBackground(new java.awt.Color(204, 204, 255));
        btnDelete.setRoundBottomLeft(25);
        btnDelete.setRoundBottomRight(25);
        btnDelete.setRoundTopLeft(25);
        btnDelete.setRoundTopRight(25);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });

        btnTextDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnTextDelete.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnTextDelete.setText("DELETE");
        btnTextDelete.setToolTipText("");
        btnTextDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTextDeleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnDeleteLayout = new javax.swing.GroupLayout(btnDelete);
        btnDelete.setLayout(btnDeleteLayout);
        btnDeleteLayout.setHorizontalGroup(
            btnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDeleteLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnTextDelete)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        btnDeleteLayout.setVerticalGroup(
            btnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTextDelete)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        btnPrint.setBackground(new java.awt.Color(204, 204, 255));
        btnPrint.setRoundBottomLeft(25);
        btnPrint.setRoundBottomRight(25);
        btnPrint.setRoundTopLeft(25);
        btnPrint.setRoundTopRight(25);
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrintMouseExited(evt);
            }
        });

        btnTextPrint.setBackground(new java.awt.Color(0, 0, 0));
        btnTextPrint.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnTextPrint.setText("PRINT");
        btnTextPrint.setToolTipText("");
        btnTextPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTextPrintMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnPrintLayout = new javax.swing.GroupLayout(btnPrint);
        btnPrint.setLayout(btnPrintLayout);
        btnPrintLayout.setHorizontalGroup(
            btnPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPrintLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTextPrint)
                .addGap(36, 36, 36))
        );
        btnPrintLayout.setVerticalGroup(
            btnPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPrintLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTextPrint)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rounded3Layout = new javax.swing.GroupLayout(rounded3);
        rounded3.setLayout(rounded3Layout);
        rounded3Layout.setHorizontalGroup(
            rounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rounded3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(rounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        rounded3Layout.setVerticalGroup(
            rounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rounded3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Nama Pelanggan");
        jLabel18.setToolTipText("");

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("ID Layanan");
        jLabel19.setToolTipText("");

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Nama Layanan");
        jLabel20.setToolTipText("");

        txt_nama_pelanggan.setEditable(false);
        txt_nama_pelanggan.setBackground(new java.awt.Color(204, 204, 255));
        txt_nama_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_pelangganActionPerformed(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Harga");
        jLabel21.setToolTipText("");

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Quantity");
        jLabel22.setToolTipText("");

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Harga Cucian");
        jLabel23.setToolTipText("");

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Durasi Cuci");
        jLabel24.setToolTipText("");

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Total Harga");
        jLabel25.setToolTipText("");

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Delivery");
        jLabel26.setToolTipText("");

        combo_delivery.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combo_delivery.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Delivery", "YES", "NO" }));

        combo_durasi_cuci.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combo_durasi_cuci.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Durasi", "EXPRESS", "REGULER" }));
        combo_durasi_cuci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_durasi_cuciActionPerformed(evt);
            }
        });

        txt_id_layanan.setEditable(false);
        txt_id_layanan.setBackground(new java.awt.Color(204, 204, 255));
        txt_id_layanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_layananActionPerformed(evt);
            }
        });

        combo_layanan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combo_layanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Layanan", "Kiloan - Cuci Kering (TANPA SETRIKA)", "Kiloan - Cuci Setrika", "Satuan - Cuci Selimut", "Satuan - Cuci Jaket", "Satuan - Cuci Jas", "Satuan - Cuci Sepatu" }));
        combo_layanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_layananMouseClicked(evt);
            }
        });

        txt_harga.setEditable(false);
        txt_harga.setBackground(new java.awt.Color(204, 204, 255));
        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });

        txt_quantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_quantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_quantityMouseClicked(evt);
            }
        });
        txt_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_quantityActionPerformed(evt);
            }
        });

        txt_total_cucian.setEditable(false);
        txt_total_cucian.setBackground(new java.awt.Color(204, 204, 255));
        txt_total_cucian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_total_cucianActionPerformed(evt);
            }
        });

        txt_total_harga.setEditable(false);
        txt_total_harga.setBackground(new java.awt.Color(204, 204, 255));
        txt_total_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_total_hargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rounded2Layout = new javax.swing.GroupLayout(rounded2);
        rounded2.setLayout(rounded2Layout);
        rounded2Layout.setHorizontalGroup(
            rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rounded2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rounded2Layout.createSequentialGroup()
                        .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(25, 25, 25)
                        .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_nama_pelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txt_id_transaksi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_id_pelanggan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chooser_tanggal_transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rounded2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel19)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rounded2Layout.createSequentialGroup()
                                .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel22))
                                .addGap(18, 18, 18)))
                        .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_id_layanan)
                            .addComponent(txt_harga)
                            .addComponent(combo_layanan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_quantity))
                        .addGap(18, 18, 18)
                        .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_total_cucian)
                            .addComponent(combo_durasi_cuci, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo_delivery, 0, 150, Short.MAX_VALUE)
                            .addComponent(txt_total_harga, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(rounded3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        rounded2Layout.setVerticalGroup(
            rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rounded2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rounded2Layout.createSequentialGroup()
                        .addComponent(rounded3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(rounded2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_id_layanan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel23)
                                .addComponent(txt_total_cucian, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_id_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rounded2Layout.createSequentialGroup()
                                .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chooser_tanggal_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_id_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)))
                            .addGroup(rounded2Layout.createSequentialGroup()
                                .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(combo_layanan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_durasi_cuci, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel26)
                                    .addComponent(combo_delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_nama_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel22)
                                        .addComponent(txt_total_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel25)))))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rounded1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rounded2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 104, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rounded1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(rounded2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void txt_search_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_search_idMouseClicked
        txt_search_id.setText("");
    }//GEN-LAST:event_txt_search_idMouseClicked

    private Transaksi findTransaksi(int id) {
        Transaksi transaksi = new Transaksi();
        transaksiService = new TransaksiServiceImpl();
        transaksi = transaksiService.findById(id);
    
        return transaksi;
    }
    
    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        // TODO add your handling code here:
        int id;
        Transaksi searchedTransaksi = new Transaksi();

        id = Integer.parseInt(txt_search_id.getText());
        searchedTransaksi = findTransaksi(id);
        if (searchedTransaksi != null) {
            loadData(searchedTransaksi);
        } else {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
        }
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnTextSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextSearchMouseClicked
        // TODO add your handling code here:
        int id;
        Transaksi searchedTransaksi = new Transaksi();

        id = Integer.parseInt(txt_search_id.getText());
        searchedTransaksi = findTransaksi(id);
        if (searchedTransaksi != null) {
            loadData(searchedTransaksi);
        } else {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
        }
    }//GEN-LAST:event_btnTextSearchMouseClicked

    private void btnTextSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextSaveMouseClicked
        // TODO add your handling code here:
        String namaPelanggan, namaLayanan, durasiCuci, delivery, tanggalTransaksi;
        int idPelanggan, idLayanan, harga, quantity, hargaCucian, totalHarga;
        transaksi = new Transaksi();
        transaksiService = new TransaksiServiceImpl();
        orderQuantity = new OrderQuantity();
        
        Date date = chooser_tanggal_transaksi.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        tanggalTransaksi = dateFormat.format(date);
        
        idPelanggan = Integer.parseInt(txt_id_pelanggan.getText());
        namaPelanggan = txt_nama_pelanggan.getText();
        idLayanan = Integer.parseInt(txt_id_layanan.getText());
        namaLayanan = combo_layanan.getSelectedItem().toString();
        harga = Integer.parseInt(txt_harga.getText());
        quantity = Integer.parseInt(txt_quantity.getText());
        hargaCucian = Integer.parseInt(txt_total_cucian.getText());
        durasiCuci = combo_durasi_cuci.getSelectedItem().toString();
        delivery = combo_delivery.getSelectedItem().toString();
        totalHarga = Integer.parseInt(txt_total_harga.getText());
        
        int orderId = insertOrder(idPelanggan, tanggalTransaksi);
        insertOrderQuantity(orderQuantity, orderId, idLayanan, quantity);
        
        order = new Order();
        order.setIdOrder(orderId);
        order.setTanggalTransaksi(tanggalTransaksi);
        transaksi.setTanggal_transaksi(tanggalTransaksi);

        pelanggan = new Pelanggan();
        pelanggan.setId(idPelanggan);
        pelanggan.setNama(namaPelanggan);

        layanan = new Layanan();
        layanan.setId(idLayanan);
        layanan.setNama_layanan(namaLayanan);

        transaksi.setHarga(harga);
        
        orderQuantity.setQuantity(quantity);
        
        transaksi.setHarga_cucian(hargaCucian);
        transaksi.setDurasiCucian(durasiCuci);
        transaksi.setDelivery(delivery);
        transaksi.setTotalHarga(totalHarga);

        transaksi.setOrder(order);
        transaksi.setPelanggan(pelanggan);
        transaksi.setLayanan(layanan);
        transaksi.setOrderQuantity(orderQuantity);
        
        transaksiService.create(transaksi);
        JOptionPane.showMessageDialog(null, "Data transaksi created successfully");
        loadData2();
        emptyField();
    }//GEN-LAST:event_btnTextSaveMouseClicked

    public int insertOrder(int idPelanggan, String tanggalTransaksi){
        Order order = new Order();
        OrderService orderService = new OrderServiceImpl();
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setId(idPelanggan);

        order.setTanggalTransaksi(tanggalTransaksi);
        order.setPelanggan(pelanggan);
        int orderId = orderService.create(order);

        return orderId;
    }
    
    public void insertOrderQuantity(OrderQuantity orderQuantity, int orderId, int idLayanan, int quantity){
        OrderQuantityService orderQuantityService = new OrderQuantityServiceImpl();
        Order order = new Order();
        order.setIdOrder(orderId); 

        Layanan layanan = new Layanan();
        layanan.setId(idLayanan);

        orderQuantity.setQuantity(quantity);

        orderQuantity.setOrder(order);
        orderQuantity.setLayanan(layanan);

        int result = orderQuantityService.create(orderQuantity);
    }
    
    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        // TODO add your handling code here:
        String namaPelanggan, namaLayanan, durasiCuci, delivery, tanggalTransaksi;
        int idPelanggan, idLayanan, harga, quantity, hargaCucian, totalHarga;
        transaksi = new Transaksi();
        transaksiService = new TransaksiServiceImpl();
        orderQuantity = new OrderQuantity();
        
        Date date = chooser_tanggal_transaksi.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        tanggalTransaksi = dateFormat.format(date);
        
        idPelanggan = Integer.parseInt(txt_id_pelanggan.getText());
        namaPelanggan = txt_nama_pelanggan.getText();
        idLayanan = Integer.parseInt(txt_id_layanan.getText());
        namaLayanan = combo_layanan.getSelectedItem().toString();
        harga = Integer.parseInt(txt_harga.getText());
        quantity = Integer.parseInt(txt_quantity.getText());
        hargaCucian = Integer.parseInt(txt_total_cucian.getText());
        durasiCuci = combo_durasi_cuci.getSelectedItem().toString();
        delivery = combo_delivery.getSelectedItem().toString();
        totalHarga = Integer.parseInt(txt_total_harga.getText());
        
        int orderId = insertOrder(idPelanggan, tanggalTransaksi);
        insertOrderQuantity(orderQuantity, orderId, idLayanan, quantity);
        
        order = new Order();
        order.setIdOrder(orderId);
        order.setTanggalTransaksi(tanggalTransaksi);
        transaksi.setTanggal_transaksi(tanggalTransaksi);
        
        pelanggan = new Pelanggan();
        pelanggan.setId(idPelanggan);
        pelanggan.setNama(namaPelanggan);

        layanan = new Layanan();
        layanan.setId(idLayanan);
        layanan.setNama_layanan(namaLayanan);

        transaksi.setHarga(harga);
        
        orderQuantity.setQuantity(quantity);
        
        transaksi.setHarga_cucian(hargaCucian);
        transaksi.setDurasiCucian(durasiCuci);
        transaksi.setDelivery(delivery);
        transaksi.setTotalHarga(totalHarga);

        transaksi.setOrder(order);
        transaksi.setPelanggan(pelanggan);
        transaksi.setLayanan(layanan);
        transaksi.setOrderQuantity(orderQuantity);
        
        transaksiService.create(transaksi);
        JOptionPane.showMessageDialog(null, "Data transaksi created successfully");
        loadData2();
        emptyField();
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        // TODO add your handling code here:
        emptyField();
    }//GEN-LAST:event_btnClearMouseClicked

    private void btnSearch6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearch6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearch6MouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
        int id;
        transaksiService = new TransaksiServiceImpl();
        OrderQuantityService orderQuantityService = new OrderQuantityServiceImpl();
        OrderService orderService = new OrderServiceImpl();
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        
        id = Integer.parseInt(txt_id_transaksi.getText());
        
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure to delete it?", "Warning", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            Transaksi searchedTransaksi = findTransaksi(id);
            if (searchedTransaksi != null) {
                transaksiService.delete(searchedTransaksi.getIdTransaksi());
            } else {
                System.out.println("Data Transaksi tidak ditemukan!");
                return;
            }

            OrderQuantity searchedOrderQuantity = findOrderQuantity(id);
            if (searchedOrderQuantity != null) {
                orderQuantityService.delete(searchedOrderQuantity.getId());
            } else {
                System.out.println("Data Order Quantity tidak ditemukan!");
                return;
            }

            Order searchedOrder = findOrder(id);
            if (searchedOrder != null) {
                orderService.delete(searchedOrder.getIdOrder());
            } else {
                System.out.println("Data Order tidak ditemukan!");
                return;
            }

            loadData2();
            emptyField();
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private OrderQuantity findOrderQuantity(int updatedId) {
        orderQuantity = new OrderQuantity();
        OrderQuantityService orderQuantityService = new OrderQuantityServiceImpl();
        orderQuantity = orderQuantityService.findById(updatedId);
    
        return orderQuantity;
    }
    
    private Order findOrder(int updatedId) {
        order = new Order();
        OrderService orderService = new OrderServiceImpl();
        orderService = new OrderServiceImpl();
        order = orderService.findById(updatedId);
    
        return order;
    }
    private void btnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseClicked
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("List Transaksi");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        try {
            tabelTransaksi.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_btnPrintMouseClicked

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        // TODO add your handling code here:
        btnSearch.setBackground(new Color(54,1,151));
        btnTextSearch.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        // TODO add your handling code here:
        btnSearch.setBackground(new Color(204,204,255));
        btnTextSearch.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnSearchMouseExited

    private void btnTextPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextPrintMouseClicked
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("List Transaksi");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        try {
            tabelTransaksi.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_btnTextPrintMouseClicked

    private void btnTextDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextDeleteMouseClicked
        // TODO add your handling code here:
        int id;
        transaksiService = new TransaksiServiceImpl();
        OrderQuantityService orderQuantityService = new OrderQuantityServiceImpl();
        OrderService orderService = new OrderServiceImpl();
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        
        id = Integer.parseInt(txt_id_transaksi.getText());
        
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure to delete it?", "Warning", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            Transaksi searchedTransaksi = findTransaksi(id);
            if (searchedTransaksi != null) {
                transaksiService.delete(searchedTransaksi.getIdTransaksi());
            } else {
                System.out.println("Data Transaksi tidak ditemukan!");
                return;
            }

            OrderQuantity searchedOrderQuantity = findOrderQuantity(id);
            if (searchedOrderQuantity != null) {
                orderQuantityService.delete(searchedOrderQuantity.getId());
            } else {
                System.out.println("Data Order Quantity tidak ditemukan!");
                return;
            }

            Order searchedOrder = findOrder(id);
            if (searchedOrder != null) {
                orderService.delete(searchedOrder.getIdOrder());
            } else {
                System.out.println("Data Order tidak ditemukan!");
                return;
            }

            loadData2();
            emptyField();
        }
    }//GEN-LAST:event_btnTextDeleteMouseClicked

    private void btnTextClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextClearMouseClicked
        // TODO add your handling code here:
        emptyField();
    }//GEN-LAST:event_btnTextClearMouseClicked

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        // TODO add your handling code here:
        btnSave.setBackground(new Color(54,1,151));
        btnTextSave.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        // TODO add your handling code here:
        btnDelete.setBackground(new Color(54,1,151));
        btnTextDelete.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        // TODO add your handling code here:
        btnClear.setBackground(new Color(54,1,151));
        btnTextClear.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnPrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseEntered
        // TODO add your handling code here:
        btnPrint.setBackground(new Color(54,1,151));
        btnTextPrint.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnPrintMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        // TODO add your handling code here:
        btnSave.setBackground(new Color(204,204,255));
        btnTextSave.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        // TODO add your handling code here:
        btnDelete.setBackground(new Color(204,204,255));
        btnTextDelete.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        // TODO add your handling code here:
        btnClear.setBackground(new Color(204,204,255));
        btnTextClear.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnClearMouseExited

    private void btnPrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseExited
        // TODO add your handling code here:
        btnPrint.setBackground(new Color(204,204,255));
        btnTextPrint.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnPrintMouseExited

    private void btnTextRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextRefreshMouseClicked
        // TODO add your handling code here:
        loadData2();
    }//GEN-LAST:event_btnTextRefreshMouseClicked

    private void btnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseClicked
        // TODO add your handling code here:
        loadData2();
    }//GEN-LAST:event_btnRefreshMouseClicked

    private void btnRefreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseEntered
        // TODO add your handling code here:
        btnRefresh.setBackground(new Color(54,1,151));
        btnTextRefresh.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnRefreshMouseEntered

    private void btnRefreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseExited
        // TODO add your handling code here:
        btnRefresh.setBackground(new Color(204,204,255));
        btnTextRefresh.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnRefreshMouseExited

    private void tabelTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTransaksiMouseClicked
        String namaPelanggan, namaLayanan, durasiCuci, delivery;
        int idTransaksi, idPelanggan, idLayanan, harga, quantity, hargaCucian, totalHarga;
        
        int row = tabelTransaksi.getSelectedRow();
        idTransaksi = Integer.parseInt(tabelTransaksi.getValueAt(row, 0).toString());
        idPelanggan = Integer.parseInt(tabelTransaksi.getValueAt(row, 2).toString());
        namaPelanggan = tabelTransaksi.getValueAt(row, 3).toString();
        idLayanan = Integer.parseInt(tabelTransaksi.getValueAt(row, 4).toString());
        namaLayanan = tabelTransaksi.getValueAt(row, 5).toString();
        harga = Integer.parseInt(tabelTransaksi.getValueAt(row, 6).toString());
        quantity = Integer.parseInt(tabelTransaksi.getValueAt(row, 7).toString());
        hargaCucian = Integer.parseInt(tabelTransaksi.getValueAt(row, 8).toString());
        durasiCuci = tabelTransaksi.getValueAt(row, 9).toString();
        delivery = tabelTransaksi.getValueAt(row, 10).toString();
        totalHarga = Integer.parseInt(tabelTransaksi.getValueAt(row, 11).toString());
        
        txt_id_transaksi.setText(idTransaksi+"");
        txt_id_pelanggan.setText(idPelanggan+"");
        txt_nama_pelanggan.setText(namaPelanggan);
        txt_id_layanan.setText(idLayanan+"");
        combo_layanan.setSelectedItem(namaLayanan);
        txt_harga.setText(harga+"");
        txt_quantity.setText(quantity+"");
        txt_total_cucian.setText(hargaCucian+"");
        combo_durasi_cuci.setSelectedItem(durasiCuci);
        combo_delivery.setSelectedItem(delivery);
        txt_total_harga.setText(totalHarga+"");
        
    }//GEN-LAST:event_tabelTransaksiMouseClicked

    private void txt_nama_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_pelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_pelangganActionPerformed

    private void txt_id_layananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_layananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_layananActionPerformed

    private void txt_search_idPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_search_idPelangganMouseClicked
        // TODO add your handling code here:
        txt_search_idPelanggan.setText("");
    }//GEN-LAST:event_txt_search_idPelangganMouseClicked

    private void tabelPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPelangganMouseClicked
        
    }//GEN-LAST:event_tabelPelangganMouseClicked

    private void btnTextSearchPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextSearchPelangganMouseClicked
        // TODO add your handling code here:
        int id;
        Pelanggan searchedPelanggan = new Pelanggan();

        id = Integer.parseInt(txt_search_idPelanggan.getText());
        searchedPelanggan = findPelanggan(id);
        if (searchedPelanggan != null) {
            loadDataPelanggan(searchedPelanggan);
        } else {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
        }
    }//GEN-LAST:event_btnTextSearchPelangganMouseClicked

    private Pelanggan findPelanggan(int id) {
        Pelanggan pelanggan = new Pelanggan();
        pelangganService = new PelangganServiceImpl();
        pelanggan = pelangganService.findById(id);
    
        return pelanggan;
    }
    
    private void btnSearchPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchPelangganMouseClicked
        // TODO add your handling code here:
        int id;
        Pelanggan searchedPelanggan = new Pelanggan();

        id = Integer.parseInt(txt_search_idPelanggan.getText());
        searchedPelanggan = findPelanggan(id);
        if (searchedPelanggan != null) {
            loadDataPelanggan(searchedPelanggan);
        } else {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
        }
    }//GEN-LAST:event_btnSearchPelangganMouseClicked

    private void btnSearchPelangganMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchPelangganMouseEntered
        // TODO add your handling code here:
        btnSearch.setBackground(new Color(54,1,151));
        btnTextSearch.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnSearchPelangganMouseEntered

    private void btnSearchPelangganMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchPelangganMouseExited
        // TODO add your handling code here:
        btnSearch.setBackground(new Color(204,204,255));
        btnTextSearch.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnSearchPelangganMouseExited

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void txt_total_cucianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_total_cucianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_total_cucianActionPerformed

    private void txt_total_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_total_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_total_hargaActionPerformed

    private void btnTextRefreshPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextRefreshPelangganMouseClicked
        // TODO add your handling code here:
        loadPelanggan();
    }//GEN-LAST:event_btnTextRefreshPelangganMouseClicked

    private void btnRefreshPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshPelangganMouseClicked
        // TODO add your handling code here:
        loadPelanggan();
    }//GEN-LAST:event_btnRefreshPelangganMouseClicked

    private void btnRefreshPelangganMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshPelangganMouseEntered
        // TODO add your handling code here:
        btnSearch.setBackground(new Color(54,1,151));
        btnTextSearch.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnRefreshPelangganMouseEntered

    private void btnRefreshPelangganMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshPelangganMouseExited
        // TODO add your handling code here:
        btnSearch.setBackground(new Color(204,204,255));
        btnTextSearch.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnRefreshPelangganMouseExited

    private void txt_id_pelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_id_pelangganMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_pelangganMouseClicked

    private void combo_layananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_layananMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_layananMouseClicked

    private void txt_quantityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_quantityMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_quantityMouseClicked

    private void txt_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_quantityActionPerformed
        // TODO add your handling code here:
        hitungTotalCucian();
    }//GEN-LAST:event_txt_quantityActionPerformed

    private void txt_id_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_pelangganActionPerformed
        // TODO add your handling code here:
        String idPelangganInput = txt_id_pelanggan.getText();

        try {
            int idPelanggan = Integer.parseInt(idPelangganInput);

            Pelanggan pelanggan = pelangganService.findById(idPelanggan);

            if (pelanggan != null) {
                txt_nama_pelanggan.setText(pelanggan.getNama());
            } else {
                txt_nama_pelanggan.setText("Not found");
            }

        } catch (NumberFormatException e) {
            txt_nama_pelanggan.setText("Please input a number");
        }
    }//GEN-LAST:event_txt_id_pelangganActionPerformed

    private void combo_durasi_cuciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_durasi_cuciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_durasi_cuciActionPerformed

    private void loadData(Transaksi transaksi) {
        Object[][] objectTransaksi = new Object[1][12];
        
        objectTransaksi[0][0] = transaksi.getIdTransaksi();
        objectTransaksi[0][1] = transaksi.getTanggal_transaksi();
        objectTransaksi[0][2] = transaksi.getPelanggan().getId();
        objectTransaksi[0][3] = transaksi.getPelanggan().getNama();
        objectTransaksi[0][4] = transaksi.getLayanan().getId();
        objectTransaksi[0][5] = transaksi.getLayanan().getNama_layanan();
        objectTransaksi[0][6] = transaksi.getHarga();
        objectTransaksi[0][7] = transaksi.getOrderQuantity().getQuantity();
        objectTransaksi[0][8] = transaksi.getHarga_cucian();
        objectTransaksi[0][9] = transaksi.getDurasiCucian();
        objectTransaksi[0][10] = transaksi.getDelivery();
        objectTransaksi[0][11] = transaksi.getTotalHarga();
        
            
        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            objectTransaksi,
            new String [] {
                "ID Transaksi", "Tanggal Transaksi", "ID Pelanggan", "Nama Pelanggan", "ID Layanan", "Nama Layanan",
                "Harga", "Quantity", "Harga Cucian", "Durasi Cuci", "Delivery", "Total Harga"
            }
        ));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.itenas.oop.view.swing.Rounded btnClear;
    private com.itenas.oop.view.swing.Rounded btnDelete;
    private com.itenas.oop.view.swing.Rounded btnPrint;
    private com.itenas.oop.view.swing.Rounded btnRefresh;
    private com.itenas.oop.view.swing.Rounded btnRefreshPelanggan;
    private com.itenas.oop.view.swing.Rounded btnSave;
    private com.itenas.oop.view.swing.Rounded btnSearch;
    private com.itenas.oop.view.swing.Rounded btnSearch6;
    private com.itenas.oop.view.swing.Rounded btnSearchPelanggan;
    private javax.swing.JLabel btnTextClear;
    private javax.swing.JLabel btnTextDelete;
    private javax.swing.JLabel btnTextPrint;
    private javax.swing.JLabel btnTextRefresh;
    private javax.swing.JLabel btnTextRefreshPelanggan;
    private javax.swing.JLabel btnTextSave;
    private javax.swing.JLabel btnTextSearch;
    private javax.swing.JLabel btnTextSearchPelanggan;
    private com.toedter.calendar.JDateChooser chooser_tanggal_transaksi;
    private javax.swing.JComboBox<String> combo_delivery;
    private javax.swing.JComboBox<String> combo_durasi_cuci;
    private javax.swing.JComboBox<String> combo_layanan;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.itenas.oop.view.swing.Rounded rounded1;
    private com.itenas.oop.view.swing.Rounded rounded2;
    private com.itenas.oop.view.swing.Rounded rounded3;
    private javax.swing.JTable tabelPelanggan;
    private javax.swing.JTable tabelTransaksi;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_id_layanan;
    private javax.swing.JTextField txt_id_pelanggan;
    private javax.swing.JTextField txt_id_transaksi;
    private javax.swing.JTextField txt_nama_pelanggan;
    private javax.swing.JTextField txt_quantity;
    private javax.swing.JTextField txt_search_id;
    private javax.swing.JTextField txt_search_idPelanggan;
    private javax.swing.JTextField txt_total_cucian;
    private javax.swing.JTextField txt_total_harga;
    // End of variables declaration//GEN-END:variables

    private void loadData2() {
        transaksiService = new TransaksiServiceImpl();
        List<Transaksi> listTransaksi = new ArrayList<>();
        listTransaksi = transaksiService.findAll();
        Object[][] objectTransaksi = new Object[listTransaksi.size()][12];
        
        int counter = 0;
        
        for (Transaksi transaksi : listTransaksi) {
            objectTransaksi[counter][0] = transaksi.getIdTransaksi();
            objectTransaksi[counter][1] = transaksi.getTanggal_transaksi();
            objectTransaksi[counter][2] = transaksi.getPelanggan().getId();
            objectTransaksi[counter][3] = transaksi.getPelanggan().getNama();
            objectTransaksi[counter][4] = transaksi.getLayanan().getId();
            objectTransaksi[counter][5] = transaksi.getLayanan().getNama_layanan();
            objectTransaksi[counter][6] = transaksi.getHarga();
            objectTransaksi[counter][7] = transaksi.getOrderQuantity().getQuantity();
            objectTransaksi[counter][8] = transaksi.getHarga_cucian();
            objectTransaksi[counter][9] = transaksi.getDurasiCucian();
            objectTransaksi[counter][10] = transaksi.getDelivery();
            objectTransaksi[counter][11] = transaksi.getTotalHarga();
            counter++;
        }
        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            objectTransaksi,
            new String [] {
                "ID Transaksi", "Tanggal Transaksi", "ID Pelanggan", "Nama Pelanggan", "ID Layanan", "Nama Layanan",
                "Harga", "Quantity", "Harga Cucian", "Durasi Cuci", "Delivery", "Total Harga"
            }
        ));
    }

    private void getDataPelanggan() {
        DefaultTableModel dtm = (DefaultTableModel) tabelPelanggan.getModel();
        dtm.setRowCount(0);

        List<Pelanggan> listPelanggan = pelangganService.findAll();

        for (Pelanggan pelanggan : listPelanggan) {
            Object[] data = {
                    pelanggan.getId(),
                    pelanggan.getNama()
            };
            dtm.addRow(data);
        }
    }

    private void loadDataPelanggan(Pelanggan pelanggan) {
        Object[][] objectPelanggan = new Object[1][2];
        
        objectPelanggan[0][0] = pelanggan.getId();
        objectPelanggan[0][1] = pelanggan.getNama();
            
        tabelPelanggan.setModel(new javax.swing.table.DefaultTableModel(
            objectPelanggan,
            new String [] {
                "ID Pelanggan", "Nama"
            }
        ));
    }

    private void loadPelanggan() {
        pelangganService = new PelangganServiceImpl();
        List<Pelanggan> listPelanggan = new ArrayList<>();
        listPelanggan = pelangganService.findAll();
        Object[][] objectPelanggan = new Object[listPelanggan.size()][2];
        
        int counter = 0;
        
        for (Pelanggan pelanggan : listPelanggan) {
            objectPelanggan[counter][0] = pelanggan.getId();
            objectPelanggan[counter][1] = pelanggan.getNama();
            counter++;
        }
        tabelPelanggan.setModel(new javax.swing.table.DefaultTableModel(
            objectPelanggan,
            new String [] {
                "ID Pelanggan", "Nama"
            }
        ));
    }

    private void comboLayananItemStateChanged(java.awt.event.ItemEvent evt) {
        LayananService layananService = new LayananServiceImpl();
        Layanan selectedLayanan = layananService.findByName((String) combo_layanan.getSelectedItem());

        if (selectedLayanan != null) {
            txt_id_layanan.setText(String.valueOf(selectedLayanan.getId()));
            txt_harga.setText(String.valueOf(selectedLayanan.getHarga()));
        } else {
            txt_id_layanan.setText("Not found");
            txt_harga.setText("");
        }
    }  

    private void hitungTotalCucian() {
            try {
            int quantity = Integer.parseInt(txt_quantity.getText());
            int harga = Integer.parseInt(txt_harga.getText());

            OrderQuantity orderQuantity = new OrderQuantity();
            orderQuantity.setQuantity(quantity);

            int totalCucian = transaksiService.hargaCucian(orderQuantity, harga);
            txt_total_cucian.setText(String.valueOf(totalCucian));
        } catch (NumberFormatException e) {
            txt_total_cucian.setText("Invalid input");
        }
    }
    
    
    private void comboDeliveryItemStateChanged(java.awt.event.ItemEvent evt) {
        TransaksiService transaksiService = new TransaksiServiceImpl();
        Transaksi transaksi = new Transaksi();
        
        int harga = Integer.parseInt(txt_harga.getText());
        transaksi.setHarga(harga);
        
        int quantity = Integer.parseInt(txt_quantity.getText());
        OrderQuantity orderQuantity = new OrderQuantity();
        orderQuantity.setQuantity(quantity);

        transaksi.setOrderQuantity(orderQuantity);

        int hargaCucian = Integer.parseInt(txt_total_cucian.getText());
        transaksi.setHarga_cucian(hargaCucian);

        String durasiCuci = combo_durasi_cuci.getSelectedItem().toString();
        String delivery = combo_delivery.getSelectedItem().toString();

        transaksi.setDurasiCucian(durasiCuci);
        transaksi.setDelivery(delivery);

        int totalHarga = transaksiService.totalHarga(transaksi);

        txt_total_harga.setText(String.valueOf(totalHarga));
    }
}
