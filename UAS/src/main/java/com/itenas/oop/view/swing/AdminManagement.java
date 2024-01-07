package com.itenas.oop.view.swing;

import com.itenas.oop.uas.pojo.Admin;
import com.itenas.oop.uas.pojo.Transaksi;
import com.itenas.oop.uas.service.AdminService;
import com.itenas.oop.uas.serviceimpl.AdminServiceImpl;
import java.awt.Color;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AdminManagement extends javax.swing.JPanel {
    Boolean hasil;
    AdminService adminService = new AdminServiceImpl();
    private DefaultTableModel model;
    
    public AdminManagement() {
        initComponents();
        model = new DefaultTableModel();
        tabelAdmin.setModel(model);
        model.addColumn("ID Admin");
        model.addColumn("Email");
        model.addColumn("Username");
        model.addColumn("Password");
        model.addColumn("Nama");
        model.addColumn("Nomor Telepon");
        model.addColumn("Alamat");
        getData();
    }
    
    private void emptyField() {
        txt_email.setText("");
        txt_username.setText("");
        txt_password.setText("");
        txt_nama.setText("");
        txt_nomor_telepon.setText("");
        txt_alamat.setText("");
    }

    private void getData() {
        DefaultTableModel dtm = (DefaultTableModel) tabelAdmin.getModel();
        dtm.setRowCount(0);

        List<Admin> listAdmin = adminService.findAll();

        for (Admin admin : listAdmin) {
            Object[] data = {
                    admin.getId(),
                    admin.getEmail(),
                    admin.getUsername(),
                    admin.getPassword(),
                    admin.getNama(),
                    admin.getNomorTelepon(),
                    admin.getAlamat()
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
        tabelAdmin = new javax.swing.JTable();
        txt_search_id = new javax.swing.JTextField();
        btnSearch = new com.itenas.oop.view.swing.Rounded();
        btnTextSearch = new javax.swing.JLabel();
        btnRefresh = new com.itenas.oop.view.swing.Rounded();
        btnTextRefresh = new javax.swing.JLabel();
        rounded2 = new com.itenas.oop.view.swing.Rounded();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_nomor_telepon = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_alamat = new javax.swing.JTextArea();
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
        jLabel19 = new javax.swing.JLabel();

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
        jLabel8.setText("Master Data > Kelola Admin");
        jLabel8.setToolTipText("");

        rounded1.setBackground(new java.awt.Color(255, 255, 255));
        rounded1.setRoundBottomLeft(30);
        rounded1.setRoundBottomRight(30);
        rounded1.setRoundTopLeft(30);
        rounded1.setRoundTopRight(30);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Daftar Admin");
        jLabel7.setToolTipText("");

        tabelAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID ADMIN", "EMAIL", "USERNAME", "PASSWORD", "NAMA", "NOMOR TELEPON", "ALAMAT"
            }
        ));
        tabelAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelAdmin);

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTextRefreshMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout btnRefreshLayout = new javax.swing.GroupLayout(btnRefresh);
        btnRefresh.setLayout(btnRefreshLayout);
        btnRefreshLayout.setHorizontalGroup(
            btnRefreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRefreshLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnTextRefresh)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btnRefreshLayout.setVerticalGroup(
            btnRefreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRefreshLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTextRefresh)
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        rounded1Layout.setVerticalGroup(
            rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rounded1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_search_id)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        rounded2.setBackground(new java.awt.Color(255, 255, 255));
        rounded2.setRoundBottomLeft(30);
        rounded2.setRoundBottomRight(30);
        rounded2.setRoundTopLeft(30);
        rounded2.setRoundTopRight(30);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Manage Admin");
        jLabel12.setToolTipText("");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("ID Admin");
        jLabel11.setToolTipText("");

        txt_id.setEditable(false);
        txt_id.setBackground(new java.awt.Color(204, 204, 255));
        txt_id.setText("Tidak Usah Disi");

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Email");
        jLabel13.setToolTipText("");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Username");
        jLabel14.setToolTipText("");

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Password");
        jLabel15.setToolTipText("");

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Nama");
        jLabel16.setToolTipText("");

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Alamat");
        jLabel18.setToolTipText("");

        txt_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_nomor_telepon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_nama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_alamat.setColumns(20);
        txt_alamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_alamat.setRows(5);
        jScrollPane2.setViewportView(txt_alamat);

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

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Nomor Telepon");
        jLabel19.setToolTipText("");

        javax.swing.GroupLayout rounded2Layout = new javax.swing.GroupLayout(rounded2);
        rounded2.setLayout(rounded2Layout);
        rounded2Layout.setHorizontalGroup(
            rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rounded2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rounded2Layout.createSequentialGroup()
                        .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rounded2Layout.createSequentialGroup()
                                .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rounded2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)))
                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_nomor_telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12)
                    .addGroup(rounded2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(24, 24, 24)
                        .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(rounded2Layout.createSequentialGroup()
                                .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(rounded2Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(89, 89, 89)
                                        .addComponent(jScrollPane2))
                                    .addGroup(rounded2Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(rounded2Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(60, 60, 60)
                .addComponent(rounded3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        rounded2Layout.setVerticalGroup(
            rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rounded2Layout.createSequentialGroup()
                .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(rounded2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(rounded3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(rounded2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(txt_nomor_telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(19, 19, 19)
                        .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
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
                        .addGap(0, 26, Short.MAX_VALUE))))
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
                .addContainerGap(19, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void tabelAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelAdminMouseClicked
        String email, username, password, nama, nomorTelepon, alamat;
        int id;
        
        int row = tabelAdmin.getSelectedRow();
        id = Integer.parseInt(tabelAdmin.getValueAt(row, 0).toString());
        email = tabelAdmin.getValueAt(row, 1).toString();
        username = tabelAdmin.getValueAt(row, 2).toString();
        password = tabelAdmin.getValueAt(row, 3).toString();
        nama = tabelAdmin.getValueAt(row, 4).toString();
        nomorTelepon = tabelAdmin.getValueAt(row, 5).toString();
        alamat = tabelAdmin.getValueAt(row, 6).toString();
        
        txt_id.setText(id+"");
        txt_email.setText(email);
        txt_username.setText(username);
        txt_password.setText(password);
        txt_nama.setText(nama);
        txt_nomor_telepon.setText(nomorTelepon);
        txt_alamat.setText(alamat);
    }//GEN-LAST:event_tabelAdminMouseClicked

    private void txt_search_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_search_idMouseClicked
        txt_search_id.setText("");
    }//GEN-LAST:event_txt_search_idMouseClicked

    private Admin findAdmin(int id) {
        Admin admin = new Admin();
        adminService = new AdminServiceImpl();
        admin = adminService.findById(id);
    
        return admin;
    }
    
    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        // TODO add your handling code here:
        int id;
        Admin searchedAdmin = new Admin();

        id = Integer.parseInt(txt_search_id.getText());
        searchedAdmin = findAdmin(id);
        if (searchedAdmin != null) {
            loadData(searchedAdmin);
        } else {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
        }
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnTextSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextSearchMouseClicked
        // TODO add your handling code here:
        int id;
        Admin searchedAdmin = new Admin();

        id = Integer.parseInt(txt_search_id.getText());
        searchedAdmin = findAdmin(id);
        if (searchedAdmin != null) {
            loadData(searchedAdmin);
        } else {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
        }
    }//GEN-LAST:event_btnTextSearchMouseClicked

    private void btnTextSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextSaveMouseClicked
        // TODO add your handling code here:
        String email, username, password, nama, nomorTelepon, alamat;
        int id;
        adminService = new AdminServiceImpl();
        
        email = txt_email.getText();
        username = txt_username.getText();
        password = txt_password.getText();
        nama = txt_nama.getText();
        nomorTelepon = txt_nomor_telepon.getText();
        alamat = txt_alamat.getText();
        
        if (adminService.isUsernameExists(username)) {
        JOptionPane.showMessageDialog(null, "Username telah terdaftar. Mohon input username lain.");
        return; 
        }
        
        Admin admin = new Admin();
        admin.setEmail(email);
        admin.setUsername(username);
        admin.setPassword(password);
        admin.setNama(nama);
        admin.setNomorTelepon(nomorTelepon);
        admin.setAlamat(alamat);
        
        adminService.create(admin);
        JOptionPane.showMessageDialog(null, "Data admin created successfully");
        loadData2();
        emptyField();
    }//GEN-LAST:event_btnTextSaveMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        // TODO add your handling code here:
        String email, username, password, nama, nomorTelepon, alamat;
        int id;
        adminService = new AdminServiceImpl();
        
        email = txt_email.getText();
        username = txt_username.getText();
        password = txt_password.getText();
        nama = txt_nama.getText();
        nomorTelepon = txt_nomor_telepon.getText();
        alamat = txt_alamat.getText();
        
        if (adminService.isUsernameExists(username)) {
        JOptionPane.showMessageDialog(null, "Username telah terdaftar. Mohon input username lain.");
        return; 
        }
        
        Admin admin = new Admin();
        admin.setEmail(email);
        admin.setUsername(username);
        admin.setPassword(password);
        admin.setNama(nama);
        admin.setNomorTelepon(nomorTelepon);
        admin.setAlamat(alamat);
        
        adminService.create(admin);
        JOptionPane.showMessageDialog(null, "Data admin created successfully");
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

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
        String email, username, password, nama, nomorTelepon, alamat;
        int id;
        adminService = new AdminServiceImpl();
        
        id = Integer.parseInt(txt_id.getText());
        email = txt_email.getText();
        username = txt_username.getText();
        password = txt_password.getText();
        nama = txt_nama.getText();
        nomorTelepon = txt_nomor_telepon.getText();
        alamat = txt_alamat.getText();
        
        if (adminService.isUsernameExists(username)) {
        JOptionPane.showMessageDialog(null, "Username telah terdaftar. Mohon input username lain.");
        return; 
        }
        
        Admin admin = new Admin();
        admin.setId(id);
        admin.setEmail(email);
        admin.setUsername(username);
        admin.setPassword(password);
        admin.setNama(nama);
        admin.setNomorTelepon(nomorTelepon);
        admin.setAlamat(alamat);
        
        adminService.update(admin);
        JOptionPane.showMessageDialog(null, "Data admin updated successfully");
        loadData2();
        emptyField();
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
        int id;
        adminService = new AdminServiceImpl();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        
        id = Integer.parseInt(txt_id.getText());
        
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure to delete it?", "Warning", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            adminService.delete(id);
            loadData2();
            emptyField();
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseClicked
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("List Admin");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        try {
            tabelAdmin.print(JTable.PrintMode.FIT_WIDTH, header, footer);
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
        MessageFormat header = new MessageFormat("List Admin");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        try {
            tabelAdmin.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_btnTextPrintMouseClicked

    private void btnTextUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextUpdateMouseClicked
        // TODO add your handling code here:
        String email, username, password, nama, nomorTelepon, alamat;
        int id;
        adminService = new AdminServiceImpl();
        
        email = txt_email.getText();
        username = txt_username.getText();
        password = txt_password.getText();
        nama = txt_nama.getText();
        nomorTelepon = txt_nomor_telepon.getText();
        alamat = txt_alamat.getText();
        
        if (adminService.isUsernameExists(username)) {
        JOptionPane.showMessageDialog(null, "Username telah terdaftar. Mohon input username lain.");
        return; 
        }
        
        Admin admin = new Admin();
        admin.setEmail(email);
        admin.setUsername(username);
        admin.setPassword(password);
        admin.setNama(nama);
        admin.setNomorTelepon(nomorTelepon);
        admin.setAlamat(alamat);
        
        adminService.update(admin);
        JOptionPane.showMessageDialog(null, "Data admin updated successfully");
        loadData2();
        emptyField();
    }//GEN-LAST:event_btnTextUpdateMouseClicked

    private void btnTextDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextDeleteMouseClicked
        // TODO add your handling code here:
        int id;
        adminService = new AdminServiceImpl();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        
        id = Integer.parseInt(txt_id.getText());
        
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure to delete it?", "Warning", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            adminService.delete(id);
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

    private void btnTextRefreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextRefreshMouseEntered
        // TODO add your handling code here:
        loadData2();
    }//GEN-LAST:event_btnTextRefreshMouseEntered

    private void loadData(Admin admin) {
        Object[][] objectAdmin = new Object[1][7];
        
        objectAdmin[0][0] = admin.getId();
        objectAdmin[0][1] = admin.getEmail();
        objectAdmin[0][2] = admin.getUsername();
        objectAdmin[0][3] = admin.getPassword();
        objectAdmin[0][4] = admin.getNama();
        objectAdmin[0][5] = admin.getNomorTelepon();
        objectAdmin[0][6] = admin.getAlamat();
            
        tabelAdmin.setModel(new javax.swing.table.DefaultTableModel(
            objectAdmin,
            new String [] {
                "ID Admin", "Email", "Username", "Password", "Nama", "Nomor Telepon", "Alamat"
            }
        ));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.itenas.oop.view.swing.Rounded btnClear;
    private com.itenas.oop.view.swing.Rounded btnDelete;
    private com.itenas.oop.view.swing.Rounded btnPrint;
    private com.itenas.oop.view.swing.Rounded btnRefresh;
    private com.itenas.oop.view.swing.Rounded btnSave;
    private com.itenas.oop.view.swing.Rounded btnSearch;
    private com.itenas.oop.view.swing.Rounded btnSearch6;
    private javax.swing.JLabel btnTextClear;
    private javax.swing.JLabel btnTextDelete;
    private javax.swing.JLabel btnTextPrint;
    private javax.swing.JLabel btnTextRefresh;
    private javax.swing.JLabel btnTextSave;
    private javax.swing.JLabel btnTextSearch;
    private javax.swing.JLabel btnTextUpdate;
    private com.itenas.oop.view.swing.Rounded btnUpdate;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.itenas.oop.view.swing.Rounded rounded1;
    private com.itenas.oop.view.swing.Rounded rounded2;
    private com.itenas.oop.view.swing.Rounded rounded3;
    private javax.swing.JTable tabelAdmin;
    private javax.swing.JTextArea txt_alamat;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nomor_telepon;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_search_id;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    private void loadData2() {
        adminService = new AdminServiceImpl();
        List<Admin> listAdmin = new ArrayList<>();
        listAdmin = adminService.findAll();
        Object[][] objectAdmin = new Object[listAdmin.size()][7];
        
        int counter = 0;
        
        for (Admin admin : listAdmin) {
            objectAdmin[counter][0] = admin.getId();
            objectAdmin[counter][1] = admin.getEmail();
            objectAdmin[counter][2] = admin.getUsername();
            objectAdmin[counter][3] = admin.getPassword();
            objectAdmin[counter][4] = admin.getNama();
            objectAdmin[counter][5] = admin.getNomorTelepon();
            objectAdmin[counter][6] = admin.getAlamat();
            counter++;
        }
        tabelAdmin.setModel(new javax.swing.table.DefaultTableModel(
            objectAdmin,
            new String [] {
                "ID Admin", "Email", "Username", "Password", "Nama", "Nomor Telepon", "Alamat"
            }
        ));
    }

    
}
