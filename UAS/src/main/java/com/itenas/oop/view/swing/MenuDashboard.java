package com.itenas.oop.view.swing;

import com.itenas.oop.uas.pojo.Transaksi;
import com.itenas.oop.uas.service.DeliveryService;
import com.itenas.oop.uas.service.PelangganService;
import com.itenas.oop.uas.service.TransaksiService;
import com.itenas.oop.uas.serviceimpl.DeliveryServiceImpl;
import com.itenas.oop.uas.serviceimpl.PelangganServiceImpl;
import com.itenas.oop.uas.serviceimpl.TransaksiServiceImpl;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class MenuDashboard extends javax.swing.JPanel {
    Boolean hasil;
    TransaksiService transaksiService = new TransaksiServiceImpl();
    PelangganService pelangganService = new PelangganServiceImpl();
    DeliveryService deliveryService = new DeliveryServiceImpl();
    private DefaultTableModel model;

    public MenuDashboard() {
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
        getJumlah();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rounded1 = new com.itenas.oop.view.swing.Rounded();
        lb_iconPelanggan6 = new javax.swing.JLabel();
        lb_jumlah_pelanggan = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rounded2 = new com.itenas.oop.view.swing.Rounded();
        lb_jumlah_transaksi = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lb_iconPelanggan4 = new javax.swing.JLabel();
        rounded3 = new com.itenas.oop.view.swing.Rounded();
        lb_jumlah_delivery = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lb_iconPelanggan7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(700, 630));
        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Riwayat Transaksi");
        jLabel7.setToolTipText("");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\renet\\Downloads\\foto\\computer.png")); // NOI18N
        jLabel8.setText("Master Data > Dashboard");
        jLabel8.setToolTipText("");

        rounded1.setBackground(new java.awt.Color(204, 204, 255));
        rounded1.setPreferredSize(new java.awt.Dimension(223, 97));
        rounded1.setRoundBottomLeft(50);
        rounded1.setRoundBottomRight(50);
        rounded1.setRoundTopLeft(50);
        rounded1.setRoundTopRight(50);

        lb_iconPelanggan6.setBackground(new java.awt.Color(0, 0, 0));
        lb_iconPelanggan6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lb_iconPelanggan6.setForeground(new java.awt.Color(54, 1, 151));
        lb_iconPelanggan6.setIcon(new javax.swing.ImageIcon("C:\\Users\\renet\\Downloads\\foto\\people.png")); // NOI18N
        lb_iconPelanggan6.setToolTipText("");

        lb_jumlah_pelanggan.setBackground(new java.awt.Color(0, 0, 0));
        lb_jumlah_pelanggan.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lb_jumlah_pelanggan.setForeground(new java.awt.Color(54, 1, 151));
        lb_jumlah_pelanggan.setText("111");
        lb_jumlah_pelanggan.setToolTipText("");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("PELANGGAN");
        jLabel11.setToolTipText("");

        javax.swing.GroupLayout rounded1Layout = new javax.swing.GroupLayout(rounded1);
        rounded1.setLayout(rounded1Layout);
        rounded1Layout.setHorizontalGroup(
            rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rounded1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(rounded1Layout.createSequentialGroup()
                        .addComponent(lb_jumlah_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_iconPelanggan6)))
                .addGap(20, 20, 20))
        );
        rounded1Layout.setVerticalGroup(
            rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rounded1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_jumlah_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_iconPelanggan6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        rounded2.setBackground(new java.awt.Color(204, 204, 255));
        rounded2.setPreferredSize(new java.awt.Dimension(223, 97));
        rounded2.setRoundBottomLeft(50);
        rounded2.setRoundBottomRight(50);
        rounded2.setRoundTopLeft(50);
        rounded2.setRoundTopRight(50);

        lb_jumlah_transaksi.setBackground(new java.awt.Color(0, 0, 0));
        lb_jumlah_transaksi.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lb_jumlah_transaksi.setForeground(new java.awt.Color(54, 1, 151));
        lb_jumlah_transaksi.setText("111");
        lb_jumlah_transaksi.setToolTipText("");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("TRANSAKSI");
        jLabel9.setToolTipText("");

        lb_iconPelanggan4.setBackground(new java.awt.Color(0, 0, 0));
        lb_iconPelanggan4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lb_iconPelanggan4.setForeground(new java.awt.Color(54, 1, 151));
        lb_iconPelanggan4.setIcon(new javax.swing.ImageIcon("C:\\Users\\renet\\Downloads\\foto\\save-money.png")); // NOI18N
        lb_iconPelanggan4.setToolTipText("");

        javax.swing.GroupLayout rounded2Layout = new javax.swing.GroupLayout(rounded2);
        rounded2.setLayout(rounded2Layout);
        rounded2Layout.setHorizontalGroup(
            rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rounded2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(lb_jumlah_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lb_iconPelanggan4)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        rounded2Layout.setVerticalGroup(
            rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rounded2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(rounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_iconPelanggan4)
                    .addGroup(rounded2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_jumlah_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        rounded3.setBackground(new java.awt.Color(204, 204, 255));
        rounded3.setPreferredSize(new java.awt.Dimension(223, 97));
        rounded3.setRoundBottomLeft(50);
        rounded3.setRoundBottomRight(50);
        rounded3.setRoundTopLeft(50);
        rounded3.setRoundTopRight(50);

        lb_jumlah_delivery.setBackground(new java.awt.Color(0, 0, 0));
        lb_jumlah_delivery.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lb_jumlah_delivery.setForeground(new java.awt.Color(54, 1, 151));
        lb_jumlah_delivery.setText("111");
        lb_jumlah_delivery.setToolTipText("");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("DELIVERY");
        jLabel12.setToolTipText("");

        lb_iconPelanggan7.setBackground(new java.awt.Color(0, 0, 0));
        lb_iconPelanggan7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lb_iconPelanggan7.setForeground(new java.awt.Color(54, 1, 151));
        lb_iconPelanggan7.setIcon(new javax.swing.ImageIcon("C:\\Users\\renet\\Downloads\\foto\\truck.png")); // NOI18N
        lb_iconPelanggan7.setToolTipText("");

        javax.swing.GroupLayout rounded3Layout = new javax.swing.GroupLayout(rounded3);
        rounded3.setLayout(rounded3Layout);
        rounded3Layout.setHorizontalGroup(
            rounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rounded3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(rounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(lb_jumlah_delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_iconPelanggan7)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        rounded3Layout.setVerticalGroup(
            rounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rounded3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(rounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rounded3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_jumlah_delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rounded3Layout.createSequentialGroup()
                        .addComponent(lb_iconPelanggan7)
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(rounded1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(rounded2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(rounded3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 51, Short.MAX_VALUE)))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rounded2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(rounded3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(rounded1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void tabelTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTransaksiMouseClicked
        
    }//GEN-LAST:event_tabelTransaksiMouseClicked

    public final void getData(){
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
    
    public void getJumlah(){
       
        int jumlahPelanggan = pelangganService.getPelangganCount();
        int jumlahTransaksi = transaksiService.getTransaksiCount();
        int jumlahDelivery = deliveryService.getDeliveryCount();

        lb_jumlah_pelanggan.setText(String.valueOf(jumlahPelanggan));
        lb_jumlah_transaksi.setText(String.valueOf(jumlahTransaksi));
        lb_jumlah_delivery.setText(String.valueOf(jumlahDelivery));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_iconPelanggan4;
    private javax.swing.JLabel lb_iconPelanggan6;
    private javax.swing.JLabel lb_iconPelanggan7;
    private javax.swing.JLabel lb_jumlah_delivery;
    private javax.swing.JLabel lb_jumlah_pelanggan;
    private javax.swing.JLabel lb_jumlah_transaksi;
    private com.itenas.oop.view.swing.Rounded rounded1;
    private com.itenas.oop.view.swing.Rounded rounded2;
    private com.itenas.oop.view.swing.Rounded rounded3;
    private javax.swing.JTable tabelTransaksi;
    // End of variables declaration//GEN-END:variables
}
