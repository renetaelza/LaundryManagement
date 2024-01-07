package com.itenas.oop.view.swing;

import com.itenas.oop.uas.pojo.Delivery;
import com.itenas.oop.uas.pojo.Karyawan;
import com.itenas.oop.uas.pojo.Order;
import com.itenas.oop.uas.pojo.Pelanggan;
import com.itenas.oop.uas.pojo.Transaksi;
import com.itenas.oop.uas.service.DeliveryService;
import com.itenas.oop.uas.service.KaryawanService;
import com.itenas.oop.uas.service.OrderService;
import com.itenas.oop.uas.service.PelangganService;
import com.itenas.oop.uas.service.TransaksiService;
import com.itenas.oop.uas.serviceimpl.DeliveryServiceImpl;
import com.itenas.oop.uas.serviceimpl.KaryawanServiceImpl;
import com.itenas.oop.uas.serviceimpl.OrderServiceImpl;
import com.itenas.oop.uas.serviceimpl.PelangganServiceImpl;
import com.itenas.oop.uas.serviceimpl.TransaksiServiceImpl;
import java.awt.Color;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DeliveryManagement extends javax.swing.JPanel {
    Boolean hasil;
    TransaksiService transaksiService = new TransaksiServiceImpl();
    PelangganService pelangganService = new PelangganServiceImpl();
    KaryawanService karyawanService = new KaryawanServiceImpl();
    DeliveryService deliveryService = new DeliveryServiceImpl();
    OrderService orderService = new OrderServiceImpl();
    Delivery delivery;
    Pelanggan pelanggan;
    Karyawan karyawan;
    Transaksi transaksi;
    private DefaultTableModel model;
    private DefaultTableModel modelTransaksi;
    
    public DeliveryManagement() {
        initComponents();
        model = new DefaultTableModel();
        tabelDelivery.setModel(model);
        model.addColumn("ID Delivery");
        model.addColumn("Tanggal Pengiriman");
        model.addColumn("ID Transaksi");
        model.addColumn("ID Karyawan");
        model.addColumn("Nama Karyawan");
        model.addColumn("ID Pelanggan");
        model.addColumn("Nama Pelanggan");
        model.addColumn("Alamat Pelanggan");
        getData();
        
        modelTransaksi = new DefaultTableModel();
        tabelTransaksi.setModel(modelTransaksi);
        modelTransaksi.addColumn("ID Order");
        modelTransaksi.addColumn("Tanggal Transaksi");
        modelTransaksi.addColumn("ID Pelanggan");
        modelTransaksi.addColumn("Delivery");
        getDataTransaksi();
        
        txt_id_karyawan.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_id_karyawanActionPerformed(evt);
        }
    });
        
        txt_id_transaksi.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_id_transaksiActionPerformed(evt);
        }
    });
        
    }
    
    private void emptyField() {
        txt_id_delivery.setText("");
        chooser_tanggal_pengiriman.setCalendar(null);
        txt_id_karyawan.setText("");
        txt_nama_karyawan.setText("");
        txt_id_pelanggan.setText("");
        txt_nama_pelanggan.setText("");
        txt_alamat_pelanggan.setText("");
    }

    private void getData() {
        DefaultTableModel dtm = (DefaultTableModel) tabelDelivery.getModel();
        dtm.setRowCount(0);

        List<Delivery> listDelivery = deliveryService.findAll();

        for (Delivery delivery : listDelivery) {
            Object[] data = {
                    delivery.getId(),
                    delivery.getTanggalKirim(),
                    delivery.getOrder().getIdOrder(),
                    delivery.getKaryawan().getId(),
                    delivery.getKaryawan().getNama(),
                    delivery.getPelanggan().getId(),
                    delivery.getPelanggan().getNama(),
                    delivery.getPelanggan().getAlamat()
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDelivery = new javax.swing.JTable();
        txt_search_id = new javax.swing.JTextField();
        btnSearch = new com.itenas.oop.view.swing.Rounded();
        btnTextSearch = new javax.swing.JLabel();
        btnRefresh = new com.itenas.oop.view.swing.Rounded();
        btnTextRefresh = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txt_search_idTransaksi = new javax.swing.JTextField();
        btnSearchTransaksi = new com.itenas.oop.view.swing.Rounded();
        btnTextSearchTransaksi = new javax.swing.JLabel();
        btnRefreshTransaksi = new com.itenas.oop.view.swing.Rounded();
        btnTextRefreshTransaksi = new javax.swing.JLabel();
        rounded2 = new com.itenas.oop.view.swing.Rounded();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_id_delivery = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        rounded3 = new com.itenas.oop.view.swing.Rounded();
        btnSave = new com.itenas.oop.view.swing.Rounded();
        btnTextSave = new javax.swing.JLabel();
        btnClear = new com.itenas.oop.view.swing.Rounded();
        btnTextClear = new javax.swing.JLabel();
        btnUpdate = new com.itenas.oop.view.swing.Rounded();
        btnTextUpdate = new javax.swing.JLabel();
        btnDelete = new com.itenas.oop.view.swing.Rounded();
        btnTextDelete = new javax.swing.JLabel();
        btnPrint = new com.itenas.oop.view.swing.Rounded();
        btnTextPrint = new javax.swing.JLabel();
        chooser_tanggal_pengiriman = new com.toedter.calendar.JDateChooser();
        txt_alamat_pelanggan = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_id_karyawan = new javax.swing.JTextField();
        txt_nama_karyawan = new javax.swing.JTextField();
        txt_nama_pelanggan = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_id_transaksi = new javax.swing.JTextField();
        txt_id_pelanggan = new javax.swing.JTextField();

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
        jLabel8.setText("Master Data > Kelola Delivery");
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

        tabelDelivery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID DELIVERY", "TANGGAL PENGIRIMAN", "ID KARYAWAN", "NAMA KARYAWAN", "ID PELANGGAN", "NAMA PELANGGAN", "ALAMAT PELANGGAN"
            }
        ));
        tabelDelivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDeliveryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDelivery);
        if (tabelDelivery.getColumnModel().getColumnCount() > 0) {
            tabelDelivery.getColumnModel().getColumn(2).setHeaderValue("ID KARYAWAN");
            tabelDelivery.getColumnModel().getColumn(3).setHeaderValue("NAMA KARYAWAN");
            tabelDelivery.getColumnModel().getColumn(4).setHeaderValue("ID PELANGGAN");
            tabelDelivery.getColumnModel().getColumn(6).setHeaderValue("ALAMAT PELANGGAN");
        }

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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID TRANSAKSI", "TANGGAL TRANSAKSI", "ID PELANGGAN", "DELIVERY"
            }
        ));
        tabelTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelTransaksiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelTransaksi);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Daftar Delivery");
        jLabel9.setToolTipText("");

        txt_search_idTransaksi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_search_idTransaksi.setForeground(new java.awt.Color(204, 204, 204));
        txt_search_idTransaksi.setText("Search by ID");
        txt_search_idTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_search_idTransaksiMouseClicked(evt);
            }
        });

        btnSearchTransaksi.setBackground(new java.awt.Color(204, 204, 255));
        btnSearchTransaksi.setRoundBottomLeft(25);
        btnSearchTransaksi.setRoundBottomRight(25);
        btnSearchTransaksi.setRoundTopLeft(25);
        btnSearchTransaksi.setRoundTopRight(25);
        btnSearchTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchTransaksiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchTransaksiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchTransaksiMouseExited(evt);
            }
        });

        btnTextSearchTransaksi.setBackground(new java.awt.Color(0, 0, 0));
        btnTextSearchTransaksi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTextSearchTransaksi.setText("   SEARCH");
        btnTextSearchTransaksi.setToolTipText("");
        btnTextSearchTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTextSearchTransaksiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSearchTransaksiLayout = new javax.swing.GroupLayout(btnSearchTransaksi);
        btnSearchTransaksi.setLayout(btnSearchTransaksiLayout);
        btnSearchTransaksiLayout.setHorizontalGroup(
            btnSearchTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSearchTransaksiLayout.createSequentialGroup()
                .addComponent(btnTextSearchTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnSearchTransaksiLayout.setVerticalGroup(
            btnSearchTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSearchTransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTextSearchTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnRefreshTransaksi.setBackground(new java.awt.Color(204, 204, 255));
        btnRefreshTransaksi.setRoundBottomLeft(25);
        btnRefreshTransaksi.setRoundBottomRight(25);
        btnRefreshTransaksi.setRoundTopLeft(25);
        btnRefreshTransaksi.setRoundTopRight(25);
        btnRefreshTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshTransaksiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRefreshTransaksiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRefreshTransaksiMouseExited(evt);
            }
        });

        btnTextRefreshTransaksi.setBackground(new java.awt.Color(0, 0, 0));
        btnTextRefreshTransaksi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTextRefreshTransaksi.setText("REFRESH");
        btnTextRefreshTransaksi.setToolTipText("");
        btnTextRefreshTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTextRefreshTransaksiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnRefreshTransaksiLayout = new javax.swing.GroupLayout(btnRefreshTransaksi);
        btnRefreshTransaksi.setLayout(btnRefreshTransaksiLayout);
        btnRefreshTransaksiLayout.setHorizontalGroup(
            btnRefreshTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRefreshTransaksiLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnTextRefreshTransaksi)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btnRefreshTransaksiLayout.setVerticalGroup(
            btnRefreshTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRefreshTransaksiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTextRefreshTransaksi)
                .addContainerGap())
        );

        javax.swing.GroupLayout rounded1Layout = new javax.swing.GroupLayout(rounded1);
        rounded1.setLayout(rounded1Layout);
        rounded1Layout.setHorizontalGroup(
            rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rounded1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addGroup(rounded1Layout.createSequentialGroup()
                        .addComponent(txt_search_id, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(rounded1Layout.createSequentialGroup()
                        .addGroup(rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(rounded1Layout.createSequentialGroup()
                                .addComponent(txt_search_idTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRefreshTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 101, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        rounded1Layout.setVerticalGroup(
            rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rounded1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(rounded1Layout.createSequentialGroup()
                        .addGroup(rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_search_idTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(btnSearchTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRefreshTransaksi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rounded1Layout.createSequentialGroup()
                        .addGroup(rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_search_id)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        rounded2.setBackground(new java.awt.Color(255, 255, 255));
        rounded2.setRoundBottomLeft(30);
        rounded2.setRoundBottomRight(30);
        rounded2.setRoundTopLeft(30);
        rounded2.setRoundTopRight(30);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Manage Delivery");
        jLabel12.setToolTipText("");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("ID Delivery");
        jLabel11.setToolTipText("");

        txt_id_delivery.setEditable(false);
        txt_id_delivery.setBackground(new java.awt.Color(204, 204, 255));
        txt_id_delivery.setText("Tidak Usah Disi");

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Tanggal Pengiriman");
        jLabel16.setToolTipText("");

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("ID Karyawan");
        jLabel17.setToolTipText("");

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
            .addGroup(btnSaveLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnTextSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnSaveLayout.setVerticalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTextSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
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
            .addGroup(btnClearLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnTextClear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnClearLayout.setVerticalGroup(
            btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTextClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        btnUpdate.setBackground(new java.awt.Color(204, 204, 255));
        btnUpdate.setRoundBottomLeft(25);
        btnUpdate.setRoundBottomRight(25);
        btnUpdate.setRoundTopLeft(25);
        btnUpdate.setRoundTopRight(25);
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });

        btnTextUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnTextUpdate.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnTextUpdate.setText("UPDATE");
        btnTextUpdate.setToolTipText("");
        btnTextUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTextUpdateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnUpdateLayout = new javax.swing.GroupLayout(btnUpdate);
        btnUpdate.setLayout(btnUpdateLayout);
        btnUpdateLayout.setHorizontalGroup(
            btnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnUpdateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTextUpdate)
                .addGap(42, 42, 42))
        );
        btnUpdateLayout.setVerticalGroup(
            btnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTextUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
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
                .addGap(47, 47, 47)
                .addComponent(btnTextDelete)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        btnDeleteLayout.setVerticalGroup(
            btnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTextDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
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
            .addGroup(btnPrintLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnTextPrint)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnPrintLayout.setVerticalGroup(
            btnPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTextPrint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout rounded3Layout = new javax.swing.GroupLayout(rounded3);
        rounded3.setLayout(rounded3Layout);
        rounded3Layout.setHorizontalGroup(
            rounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rounded3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(rounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        rounded3Layout.setVerticalGroup(
            rounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rounded3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        txt_alamat_pelanggan.setEditable(false);
        txt_alamat_pelanggan.setBackground(new java.awt.Color(204, 204, 255));
        txt_alamat_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alamat_pelangganActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Nama Karyawan");
        jLabel18.setToolTipText("");

        txt_id_karyawan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_id_karyawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_id_karyawanMouseClicked(evt);
            }
        });
        txt_id_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_karyawanActionPerformed(evt);
            }
        });

        txt_nama_karyawan.setEditable(false);
        txt_nama_karyawan.setBackground(new java.awt.Color(204, 204, 255));
        txt_nama_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_karyawanActionPerformed(evt);
            }
        });

        txt_nama_pelanggan.setEditable(false);
        txt_nama_pelanggan.setBackground(new java.awt.Color(204, 204, 255));
        txt_nama_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_pelangganActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("ID Pelanggan");
        jLabel19.setToolTipText("");

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Nama Pelanggan");
        jLabel20.setToolTipText("");

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Alamat Pelanggan");
        jLabel21.setToolTipText("");

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("ID Transaksi");
        jLabel22.setToolTipText("");

        txt_id_transaksi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_id_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_id_transaksiMouseClicked(evt);
            }
        });
        txt_id_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_transaksiActionPerformed(evt);
            }
        });

        txt_id_pelanggan.setEditable(false);
        txt_id_pelanggan.setBackground(new java.awt.Color(204, 204, 255));
        txt_id_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_pelangganActionPerformed(evt);
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
                            .addComponent(jLabel11)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel22))
                        .addGap(40, 40, 40)
                        .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_id_delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_id_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nama_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chooser_tanggal_pengiriman, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_id_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(40, 40, 40)
                        .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nama_pelanggan)
                            .addComponent(txt_alamat_pelanggan)
                            .addComponent(txt_id_pelanggan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rounded3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        rounded2Layout.setVerticalGroup(
            rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rounded2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rounded2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_id_delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rounded2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_id_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addGap(18, 18, 18)
                                .addComponent(txt_nama_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(rounded2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(rounded2Layout.createSequentialGroup()
                                        .addComponent(chooser_tanggal_pengiriman, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(rounded2Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(rounded2Layout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addGap(25, 25, 25))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rounded2Layout.createSequentialGroup()
                                                .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel22)
                                                    .addComponent(txt_id_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(11, 11, 11)))))))
                        .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rounded2Layout.createSequentialGroup()
                                .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_id_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_nama_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)))
                            .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_alamat_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(rounded2Layout.createSequentialGroup()
                        .addComponent(rounded3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
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
                        .addGap(0, 88, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(rounded1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rounded2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void tabelDeliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDeliveryMouseClicked
        String namaKaryawan, namaPelanggan, alamatPelanggan;
        int idDelivery, idKaryawan, idPelanggan, idTransaksi;
        
        int row = tabelDelivery.getSelectedRow();
        idDelivery = Integer.parseInt(tabelDelivery.getValueAt(row, 0).toString());
        idTransaksi = Integer.parseInt(tabelDelivery.getValueAt(row, 2).toString());
        idKaryawan= Integer.parseInt(tabelDelivery.getValueAt(row, 3).toString());
        namaKaryawan = tabelDelivery.getValueAt(row, 4).toString();
        idPelanggan = Integer.parseInt(tabelDelivery.getValueAt(row, 5).toString());
        namaPelanggan = tabelDelivery.getValueAt(row, 6).toString();
        alamatPelanggan = tabelDelivery.getValueAt(row, 7).toString();
        
        txt_id_delivery.setText(idDelivery+"");
        txt_id_transaksi.setText(idTransaksi+"");
        txt_id_karyawan.setText(idKaryawan+"");
        txt_nama_karyawan.setText(namaKaryawan);
        txt_id_pelanggan.setText(idPelanggan+"");
        txt_nama_pelanggan.setText(namaPelanggan);
        txt_alamat_pelanggan.setText(alamatPelanggan);
    }//GEN-LAST:event_tabelDeliveryMouseClicked

    private void txt_search_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_search_idMouseClicked
        txt_search_id.setText("");
    }//GEN-LAST:event_txt_search_idMouseClicked

    private Delivery findDelivery(int id) {
        Delivery delivery = new Delivery();
        deliveryService = new DeliveryServiceImpl();
        delivery = deliveryService.findById(id);
    
        return delivery;
    }
    
    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        // TODO add your handling code here:
        int id;
        Delivery searchedDelivery = new Delivery();

        id = Integer.parseInt(txt_search_id.getText());
        searchedDelivery = findDelivery(id);
        if (searchedDelivery != null) {
            loadData(searchedDelivery);
        } else {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
        }
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnTextSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextSearchMouseClicked
        // TODO add your handling code here:
        int id;
        Delivery searchedDelivery = new Delivery();

        id = Integer.parseInt(txt_search_id.getText());
        searchedDelivery = findDelivery(id);
        if (searchedDelivery != null) {
            loadData(searchedDelivery);
        } else {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
        }
    }//GEN-LAST:event_btnTextSearchMouseClicked

    private void btnTextSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextSaveMouseClicked
        // TODO add your handling code here:
        delivery = new Delivery();
        Order order = new Order();
        String namaKaryawan, namaPelanggan, alamatPelanggan, tanggalKirim;
        int idKaryawan, idPelanggan;

        String idTransaksiInput = txt_id_transaksi.getText();
        int idTr = Integer.parseInt(idTransaksiInput);

        Transaksi transaksi = transaksiService.findById(idTr);

        if (transaksi != null) {
            Order orderTransaksi = transaksi.getOrder();
            int idOrderTransaksi = (orderTransaksi != null) ? orderTransaksi.getIdOrder() : 0;

            order.setIdOrder(idOrderTransaksi);

            Date date = chooser_tanggal_pengiriman.getDate();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            tanggalKirim = dateFormat.format(date);

            idKaryawan = Integer.parseInt(txt_id_karyawan.getText());
            namaKaryawan = txt_nama_karyawan.getText();

            idPelanggan = Integer.parseInt(txt_id_pelanggan.getText());
            namaPelanggan = txt_nama_pelanggan.getText();
            alamatPelanggan = txt_alamat_pelanggan.getText();

            delivery.setTanggalKirim(tanggalKirim);

            karyawan = new Karyawan();
            karyawan.setId(idKaryawan);
            karyawan.setNama(namaKaryawan);

            pelanggan = new Pelanggan();
            pelanggan.setId(idPelanggan);
            pelanggan.setNama(namaPelanggan);
            pelanggan.setAlamat(alamatPelanggan);

            delivery.setOrder(order);
            delivery.setKaryawan(karyawan);
            delivery.setPelanggan(pelanggan);

            deliveryService.create(delivery);
            JOptionPane.showMessageDialog(null, "Data transaksi created successfully");
            loadData2();
            emptyField();
        } else {
            // Handle the case where transaksi is null
            JOptionPane.showMessageDialog(null, "Invalid transaction ID");
        }
    }//GEN-LAST:event_btnTextSaveMouseClicked

    
    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        // TODO add your handling code here:
        delivery = new Delivery();
        Order order = new Order();
        String namaKaryawan, namaPelanggan, alamatPelanggan, tanggalKirim;
        int idKaryawan, idPelanggan;

        String idTransaksiInput = txt_id_transaksi.getText();
        int idTr = Integer.parseInt(idTransaksiInput);

        Transaksi transaksi = transaksiService.findById(idTr);

        if (transaksi != null) {
            Order orderTransaksi = transaksi.getOrder();
            int idOrderTransaksi = (orderTransaksi != null) ? orderTransaksi.getIdOrder() : 0;

            order.setIdOrder(idOrderTransaksi);

            Date date = chooser_tanggal_pengiriman.getDate();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            tanggalKirim = dateFormat.format(date);

            idKaryawan = Integer.parseInt(txt_id_karyawan.getText());
            namaKaryawan = txt_nama_karyawan.getText();

            idPelanggan = Integer.parseInt(txt_id_pelanggan.getText());
            namaPelanggan = txt_nama_pelanggan.getText();
            alamatPelanggan = txt_alamat_pelanggan.getText();

            delivery.setTanggalKirim(tanggalKirim);

            karyawan = new Karyawan();
            karyawan.setId(idKaryawan);
            karyawan.setNama(namaKaryawan);

            pelanggan = new Pelanggan();
            pelanggan.setId(idPelanggan);
            pelanggan.setNama(namaPelanggan);
            pelanggan.setAlamat(alamatPelanggan);

            delivery.setOrder(order);
            delivery.setKaryawan(karyawan);
            delivery.setPelanggan(pelanggan);

            deliveryService.create(delivery);
            JOptionPane.showMessageDialog(null, "Data transaksi created successfully");
            loadData2();
            emptyField();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid transaction ID");
        }
        
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        // TODO add your handling code here:
        emptyField();
    }//GEN-LAST:event_btnClearMouseClicked

    private void btnSearch6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearch6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearch6MouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
        delivery = new Delivery();
        Order order = new Order();
        String namaKaryawan, namaPelanggan, alamatPelanggan, tanggalKirim;
        int idKaryawan, idPelanggan;

        String idTransaksiInput = txt_id_transaksi.getText();
        int idTr = Integer.parseInt(idTransaksiInput);

        Transaksi transaksi = transaksiService.findById(idTr);

        if (transaksi != null) {
            Order orderTransaksi = transaksi.getOrder();
            int idOrderTransaksi = (orderTransaksi != null) ? orderTransaksi.getIdOrder() : 0;

            // Mengatur ID Order pada objek Order
            order.setIdOrder(idOrderTransaksi);

            // Lanjutkan dengan logika lainnya
            Date date = chooser_tanggal_pengiriman.getDate();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            tanggalKirim = dateFormat.format(date);

            idKaryawan = Integer.parseInt(txt_id_karyawan.getText());
            namaKaryawan = txt_nama_karyawan.getText();

            idPelanggan = Integer.parseInt(txt_id_pelanggan.getText());
            namaPelanggan = txt_nama_pelanggan.getText();
            alamatPelanggan = txt_alamat_pelanggan.getText();

            delivery.setTanggalKirim(tanggalKirim);

            karyawan = new Karyawan();
            karyawan.setId(idKaryawan);
            karyawan.setNama(namaKaryawan);

            pelanggan = new Pelanggan();
            pelanggan.setId(idPelanggan);
            pelanggan.setNama(namaPelanggan);
            pelanggan.setAlamat(alamatPelanggan);

            delivery.setOrder(order);
            delivery.setKaryawan(karyawan);
            delivery.setPelanggan(pelanggan);

            
            deliveryService.update(delivery);
            JOptionPane.showMessageDialog(null, "Data delivery updated successfully");
            loadData2();
            emptyField();
        } else {
            // Handle the case where transaksi is null
            JOptionPane.showMessageDialog(null, "Invalid transaction ID");
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
        int id;
        deliveryService = new DeliveryServiceImpl();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        
        id = Integer.parseInt(txt_id_delivery.getText());
        
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure to delete it?", "Warning", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            deliveryService.delete(id);
            loadData2();
            emptyField();
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseClicked
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("List Delivery");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        try {
            tabelDelivery.print(JTable.PrintMode.FIT_WIDTH, header, footer);
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
        MessageFormat header = new MessageFormat("List Delivery");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        try {
            tabelDelivery.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_btnTextPrintMouseClicked

    private void btnTextUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextUpdateMouseClicked
        // TODO add your handling code here:
        delivery = new Delivery();
        Order order = new Order();
        String namaKaryawan, namaPelanggan, alamatPelanggan, tanggalKirim;
        int idKaryawan, idPelanggan;

        String idTransaksiInput = txt_id_transaksi.getText();
        int idTr = Integer.parseInt(idTransaksiInput);

        Transaksi transaksi = transaksiService.findById(idTr);

        if (transaksi != null) {
            Order orderTransaksi = transaksi.getOrder();
            int idOrderTransaksi = (orderTransaksi != null) ? orderTransaksi.getIdOrder() : 0;

            order.setIdOrder(idOrderTransaksi);

            Date date = chooser_tanggal_pengiriman.getDate();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            tanggalKirim = dateFormat.format(date);

            idKaryawan = Integer.parseInt(txt_id_karyawan.getText());
            namaKaryawan = txt_nama_karyawan.getText();

            idPelanggan = Integer.parseInt(txt_id_pelanggan.getText());
            namaPelanggan = txt_nama_pelanggan.getText();
            alamatPelanggan = txt_alamat_pelanggan.getText();

            delivery.setTanggalKirim(tanggalKirim);

            karyawan = new Karyawan();
            karyawan.setId(idKaryawan);
            karyawan.setNama(namaKaryawan);

            pelanggan = new Pelanggan();
            pelanggan.setId(idPelanggan);
            pelanggan.setNama(namaPelanggan);
            pelanggan.setAlamat(alamatPelanggan);

            delivery.setOrder(order);
            delivery.setKaryawan(karyawan);
            delivery.setPelanggan(pelanggan);

            deliveryService.update(delivery);
            JOptionPane.showMessageDialog(null, "Data delivery updated successfully");
            loadData2();
            emptyField();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid transaction ID");
        }
    }//GEN-LAST:event_btnTextUpdateMouseClicked

    private void btnTextDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextDeleteMouseClicked
        // TODO add your handling code here:
        int id;
        deliveryService = new DeliveryServiceImpl();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        
        id = Integer.parseInt(txt_id_delivery.getText());
        
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure to delete it?", "Warning", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            deliveryService.delete(id);
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

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        // TODO add your handling code here:
        btnUpdate.setBackground(new Color(54,1,151));
        btnTextUpdate.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnUpdateMouseEntered

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

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        // TODO add your handling code here:
        btnUpdate.setBackground(new Color(204,204,255));
        btnTextUpdate.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnUpdateMouseExited

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

    private void txt_alamat_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alamat_pelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alamat_pelangganActionPerformed

    private void txt_id_karyawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_id_karyawanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_karyawanMouseClicked

    private void txt_id_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_karyawanActionPerformed
        // TODO add your handling code here:
        String idKaryawanInput = txt_id_karyawan.getText();

        try {
            int idKaryawan = Integer.parseInt(idKaryawanInput);

            Karyawan karyawan = karyawanService.findById(idKaryawan);

            if (karyawan != null) {
                txt_nama_karyawan.setText(karyawan.getNama());
            } else {
                txt_nama_karyawan.setText("Not found");
            }

        } catch (NumberFormatException e) {
            txt_nama_karyawan.setText("Please input a number");
        }
    }//GEN-LAST:event_txt_id_karyawanActionPerformed

    private void txt_nama_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_karyawanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_karyawanActionPerformed

    private void txt_nama_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_pelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_pelangganActionPerformed

    private void tabelTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTransaksiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelTransaksiMouseClicked

    private void txt_search_idTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_search_idTransaksiMouseClicked
        // TODO add your handling code here:
        txt_search_idTransaksi.setText("");
    }//GEN-LAST:event_txt_search_idTransaksiMouseClicked

    private void btnTextSearchTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextSearchTransaksiMouseClicked
        // TODO add your handling code here:
        int id;
        Transaksi searchedTransaksi = new Transaksi();

        id = Integer.parseInt(txt_search_idTransaksi.getText());
        searchedTransaksi = findTransaksi(id);
        if (searchedTransaksi != null) {
            loadDataTransaksi(searchedTransaksi);
        } else {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
        }
    }//GEN-LAST:event_btnTextSearchTransaksiMouseClicked

    private void btnSearchTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchTransaksiMouseClicked
        // TODO add your handling code here:
        int id;
        Transaksi searchedTransaksi = new Transaksi();

        id = Integer.parseInt(txt_search_idTransaksi.getText());
        searchedTransaksi = findTransaksi(id);
        if (searchedTransaksi != null) {
            loadDataTransaksi(searchedTransaksi);
        } else {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
        }
    }//GEN-LAST:event_btnSearchTransaksiMouseClicked

    private Transaksi findTransaksi(int id) {
        Transaksi transaksi = new Transaksi();
        transaksiService = new TransaksiServiceImpl();
        transaksi = transaksiService.findById(id);
    
        return transaksi;
    }
    
    private void btnSearchTransaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchTransaksiMouseEntered
        // TODO add your handling code here:
        btnSearchTransaksi.setBackground(new Color(54,1,151));
        btnTextSearchTransaksi.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnSearchTransaksiMouseEntered

    private void btnSearchTransaksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchTransaksiMouseExited
        // TODO add your handling code here:
        btnSearchTransaksi.setBackground(new Color(204,204,255));
        btnTextSearchTransaksi.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnSearchTransaksiMouseExited

    private void btnTextRefreshTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextRefreshTransaksiMouseClicked
        // TODO add your handling code here:
        loadTransaksi();
    }//GEN-LAST:event_btnTextRefreshTransaksiMouseClicked

    private void btnRefreshTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshTransaksiMouseClicked
        // TODO add your handling code here:
        loadTransaksi();
    }//GEN-LAST:event_btnRefreshTransaksiMouseClicked

    private void btnRefreshTransaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshTransaksiMouseEntered
        // TODO add your handling code here:
        btnRefreshTransaksi.setBackground(new Color(54,1,151));
        btnTextRefreshTransaksi.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnRefreshTransaksiMouseEntered

    private void btnRefreshTransaksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshTransaksiMouseExited
        // TODO add your handling code here:
        btnRefreshTransaksi.setBackground(new Color(204,204,255));
        btnTextRefreshTransaksi.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnRefreshTransaksiMouseExited

    private void txt_id_transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_id_transaksiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_transaksiMouseClicked

    private void txt_id_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_transaksiActionPerformed
        // TODO add your handling code here:
         String idTransaksiInput = txt_id_transaksi.getText();

        try {
            int idTransaksi = Integer.parseInt(idTransaksiInput);

            Transaksi transaksi = transaksiService.findById(idTransaksi);

            if (transaksi != null) {
                // Mengambil id pelanggan dari record transaksi
                int idPelangganTransaksi = transaksi.getPelanggan().getId();

                // Mengambil data pelanggan berdasarkan id pelanggan
                Pelanggan pelanggan = pelangganService.findById(idPelangganTransaksi);

                if (pelanggan != null) {
                    txt_id_pelanggan.setText(String.valueOf(pelanggan.getId()));
                    txt_nama_pelanggan.setText(pelanggan.getNama());
                    txt_alamat_pelanggan.setText(pelanggan.getAlamat());
                } else {
                    txt_id_pelanggan.setText("Pelanggan not found");
                    txt_nama_pelanggan.setText("Pelanggan not found");
                    txt_alamat_pelanggan.setText("Pelanggan not found");
                }
            } else {
                txt_id_pelanggan.setText("Transaksi not found");
                txt_nama_pelanggan.setText("Transaksi not found");
                txt_alamat_pelanggan.setText("Transaksi not found");
            }

        } catch (NumberFormatException e) {
            txt_id_pelanggan.setText("Please input a number");
            txt_nama_pelanggan.setText("Please input a number");
            txt_alamat_pelanggan.setText("Please input a number");
        }
    }//GEN-LAST:event_txt_id_transaksiActionPerformed

    private void txt_id_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_pelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_pelangganActionPerformed

    private void loadData(Delivery delivery) {
        Object[][] objectDelivery = new Object[1][7];
        
        objectDelivery[0][0] = delivery.getId();
        objectDelivery[0][1] = delivery.getTanggalKirim();
        objectDelivery[0][2] = delivery.getKaryawan().getId();
        objectDelivery[0][3] = delivery.getKaryawan().getNama();
        objectDelivery[0][4] = delivery.getPelanggan().getId();
        objectDelivery[0][5] = delivery.getPelanggan().getNama();
        objectDelivery[0][6] = delivery.getPelanggan().getAlamat();
            
        tabelDelivery.setModel(new javax.swing.table.DefaultTableModel(
            objectDelivery,
            new String [] {
                "ID Delivery", "Tanggal Pengiriman", "ID Karyawan", "Nama Karyawan",
                    "ID Pelanggan", "Nama Pelanggan", "Alamat Pelanggan"
            }
        ));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.itenas.oop.view.swing.Rounded btnClear;
    private com.itenas.oop.view.swing.Rounded btnDelete;
    private com.itenas.oop.view.swing.Rounded btnPrint;
    private com.itenas.oop.view.swing.Rounded btnRefresh;
    private com.itenas.oop.view.swing.Rounded btnRefreshTransaksi;
    private com.itenas.oop.view.swing.Rounded btnSave;
    private com.itenas.oop.view.swing.Rounded btnSearch;
    private com.itenas.oop.view.swing.Rounded btnSearch6;
    private com.itenas.oop.view.swing.Rounded btnSearchTransaksi;
    private javax.swing.JLabel btnTextClear;
    private javax.swing.JLabel btnTextDelete;
    private javax.swing.JLabel btnTextPrint;
    private javax.swing.JLabel btnTextRefresh;
    private javax.swing.JLabel btnTextRefreshTransaksi;
    private javax.swing.JLabel btnTextSave;
    private javax.swing.JLabel btnTextSearch;
    private javax.swing.JLabel btnTextSearchTransaksi;
    private javax.swing.JLabel btnTextUpdate;
    private com.itenas.oop.view.swing.Rounded btnUpdate;
    private com.toedter.calendar.JDateChooser chooser_tanggal_pengiriman;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.itenas.oop.view.swing.Rounded rounded1;
    private com.itenas.oop.view.swing.Rounded rounded2;
    private com.itenas.oop.view.swing.Rounded rounded3;
    private javax.swing.JTable tabelDelivery;
    private javax.swing.JTable tabelTransaksi;
    private javax.swing.JTextField txt_alamat_pelanggan;
    private javax.swing.JTextField txt_id_delivery;
    private javax.swing.JTextField txt_id_karyawan;
    private javax.swing.JTextField txt_id_pelanggan;
    private javax.swing.JTextField txt_id_transaksi;
    private javax.swing.JTextField txt_nama_karyawan;
    private javax.swing.JTextField txt_nama_pelanggan;
    private javax.swing.JTextField txt_search_id;
    private javax.swing.JTextField txt_search_idTransaksi;
    // End of variables declaration//GEN-END:variables

    private void loadData2() {
        deliveryService = new DeliveryServiceImpl();
        List<Delivery> listDelivery = new ArrayList<>();
        listDelivery = deliveryService.findAll();
        Object[][] objectDelivery = new Object[listDelivery.size()][7];
        
        int counter = 0;
        
        for (Delivery delivery : listDelivery) {
            objectDelivery[counter][0] = delivery.getId();
            objectDelivery[counter][1] = delivery.getTanggalKirim();
            objectDelivery[counter][2] = delivery.getKaryawan().getId();
            objectDelivery[counter][3] = delivery.getKaryawan().getNama();
            objectDelivery[counter][4] = delivery.getPelanggan().getId();
            objectDelivery[counter][5] = delivery.getPelanggan().getId();
            objectDelivery[counter][6] = delivery.getPelanggan().getAlamat();
            counter++;
        }
        tabelDelivery.setModel(new javax.swing.table.DefaultTableModel(
            objectDelivery,
            new String [] {
                "ID Delivery", "Tanggal Pengiriman", "ID Karyawan", "Nama Karyawan",
                    "ID Pelanggan", "Nama Pelanggan", "Alamat Pelanggan"
            }
        ));
    }

    private void getDataTransaksi() {
        DefaultTableModel dtm = (DefaultTableModel) tabelTransaksi.getModel();
        dtm.setRowCount(0);

        List<Transaksi> listTransaksi = transaksiService.findAll();

        for (Transaksi transaksi : listTransaksi) {
            Object[] data = {
                    transaksi.getIdTransaksi(),
                    transaksi.getTanggal_transaksi(),
                    transaksi.getPelanggan().getId(),
                    transaksi.getDelivery()
            };
            dtm.addRow(data);
        }
    }
    
    private void loadDataTransaksi(Transaksi transaksi) {
        Object[][] objectTransaksi = new Object[1][4];
        
        objectTransaksi[0][0] = transaksi.getIdTransaksi();
        objectTransaksi[0][1] = transaksi.getTanggal_transaksi();
        objectTransaksi[0][2] = transaksi.getPelanggan().getId();
        objectTransaksi[0][3] = transaksi.getDelivery();
            
        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            objectTransaksi,
            new String [] {
                "ID Transaksi", "Tanggal Transaksi", "ID Pelanggan", "Delivery"
            }
        ));
    }

    private void loadTransaksi() {
        transaksiService = new TransaksiServiceImpl();
        List<Transaksi> listTransaksi = new ArrayList<>();
        listTransaksi = transaksiService.findAll();
        Object[][] objectTransaksi = new Object[listTransaksi.size()][4];
        
        int counter = 0;
        
        for (Transaksi transaksi : listTransaksi) {
            objectTransaksi[counter][0] = transaksi.getIdTransaksi();
            objectTransaksi[counter][1] = transaksi.getTanggal_transaksi();
            objectTransaksi[counter][2] = transaksi.getPelanggan().getId();
            objectTransaksi[counter][3] = transaksi.getDelivery();
            counter++;
        }
        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            objectTransaksi,
            new String [] {
                "ID Transaksi", "Tanggal Transaksi", "ID Pelanggan", "Delivery"
            }
        ));
    }

    
}
