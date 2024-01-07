package com.itenas.oop.view.swing;
import com.itenas.oop.uas.pojo.Admin;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {

    
    public Dashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    Dashboard(Admin admin) {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        pn_kiri = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pn_dashboard = new javax.swing.JPanel();
        pn_line_dashboard = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_dashboard = new javax.swing.JLabel();
        pn_pelanggan = new javax.swing.JPanel();
        pn_line_pelanggan = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btn_pelanggan = new javax.swing.JLabel();
        pn_admin = new javax.swing.JPanel();
        pn_line_admin = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_admin = new javax.swing.JLabel();
        pn_layanan = new javax.swing.JPanel();
        pn_line_layanan = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btn_layanan = new javax.swing.JLabel();
        pn_karyawann = new javax.swing.JPanel();
        pn_line_karyawann = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btn_karyawann = new javax.swing.JLabel();
        pn_transaksi = new javax.swing.JPanel();
        pn_line_transaksi = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btn_transaksi = new javax.swing.JLabel();
        pn_delivery = new javax.swing.JPanel();
        pn_line_delivery = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btn_delivery = new javax.swing.JLabel();
        pn_logout = new javax.swing.JPanel();
        pn_line_logout = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();
        pn_kanan = new javax.swing.JPanel();
        pn_dasar = new javax.swing.JPanel();
        pn_konten = new javax.swing.JPanel();
        jPanelGradient1 = new com.itenas.oop.view.swing.JPanelGradient();

        jButton3.setText("MANAGE KARYAWAN");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_kiri.setBackground(new java.awt.Color(255, 255, 255));
        pn_kiri.setPreferredSize(new java.awt.Dimension(300, 768));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\renet\\Downloads\\foto\\Screenshot 2023-12-27 105656.png")); // NOI18N
        jLabel4.setText("Laundry Dee Kilos");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("MASTER DATA");
        jLabel3.setToolTipText("");

        pn_dashboard.setBackground(new java.awt.Color(255, 255, 255));

        pn_line_dashboard.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line_dashboardLayout = new javax.swing.GroupLayout(pn_line_dashboard);
        pn_line_dashboard.setLayout(pn_line_dashboardLayout);
        pn_line_dashboardLayout.setHorizontalGroup(
            pn_line_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        pn_line_dashboardLayout.setVerticalGroup(
            pn_line_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\renet\\Downloads\\foto\\computer.png")); // NOI18N

        btn_dashboard.setBackground(new java.awt.Color(204, 204, 204));
        btn_dashboard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_dashboard.setText("DASHBOARD");
        btn_dashboard.setToolTipText("");
        btn_dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_dashboardLayout = new javax.swing.GroupLayout(pn_dashboard);
        pn_dashboard.setLayout(pn_dashboardLayout);
        pn_dashboardLayout.setHorizontalGroup(
            pn_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dashboardLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(btn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(pn_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_dashboardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(236, Short.MAX_VALUE)))
        );
        pn_dashboardLayout.setVerticalGroup(
            pn_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_dashboardLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(pn_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_dashboardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pn_pelanggan.setBackground(new java.awt.Color(255, 255, 255));

        pn_line_pelanggan.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line_pelangganLayout = new javax.swing.GroupLayout(pn_line_pelanggan);
        pn_line_pelanggan.setLayout(pn_line_pelangganLayout);
        pn_line_pelangganLayout.setHorizontalGroup(
            pn_line_pelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        pn_line_pelangganLayout.setVerticalGroup(
            pn_line_pelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\renet\\Downloads\\foto\\customer.png")); // NOI18N

        btn_pelanggan.setBackground(new java.awt.Color(204, 204, 204));
        btn_pelanggan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_pelanggan.setText("KELOLA PELANGGAN");
        btn_pelanggan.setToolTipText("");
        btn_pelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pelangganMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pelangganMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pelangganMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_pelangganLayout = new javax.swing.GroupLayout(pn_pelanggan);
        pn_pelanggan.setLayout(pn_pelangganLayout);
        pn_pelangganLayout.setHorizontalGroup(
            pn_pelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_pelangganLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(btn_pelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_pelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_pelangganLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(248, Short.MAX_VALUE)))
        );
        pn_pelangganLayout.setVerticalGroup(
            pn_pelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_pelangganLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_pelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btn_pelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_pelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_pelangganLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line_pelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pn_admin.setBackground(new java.awt.Color(255, 255, 255));

        pn_line_admin.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line_adminLayout = new javax.swing.GroupLayout(pn_line_admin);
        pn_line_admin.setLayout(pn_line_adminLayout);
        pn_line_adminLayout.setHorizontalGroup(
            pn_line_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        pn_line_adminLayout.setVerticalGroup(
            pn_line_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\renet\\Downloads\\foto\\admin.png")); // NOI18N

        btn_admin.setBackground(new java.awt.Color(204, 204, 204));
        btn_admin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_admin.setText("KELOLA ADMIN");
        btn_admin.setToolTipText("");
        btn_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_adminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_adminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_adminMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_adminLayout = new javax.swing.GroupLayout(pn_admin);
        pn_admin.setLayout(pn_adminLayout);
        pn_adminLayout.setHorizontalGroup(
            pn_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_adminLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(btn_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_adminLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(236, Short.MAX_VALUE)))
        );
        pn_adminLayout.setVerticalGroup(
            pn_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_adminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btn_admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
            .addGroup(pn_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_adminLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line_admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pn_layanan.setBackground(new java.awt.Color(255, 255, 255));

        pn_line_layanan.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line_layananLayout = new javax.swing.GroupLayout(pn_line_layanan);
        pn_line_layanan.setLayout(pn_line_layananLayout);
        pn_line_layananLayout.setHorizontalGroup(
            pn_line_layananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        pn_line_layananLayout.setVerticalGroup(
            pn_line_layananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\renet\\Downloads\\foto\\washer.png")); // NOI18N

        btn_layanan.setBackground(new java.awt.Color(204, 204, 204));
        btn_layanan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_layanan.setText("KELOLA LAYANAN");
        btn_layanan.setToolTipText("");
        btn_layanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_layananMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_layananMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_layananMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_layananLayout = new javax.swing.GroupLayout(pn_layanan);
        pn_layanan.setLayout(pn_layananLayout);
        pn_layananLayout.setHorizontalGroup(
            pn_layananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_layananLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(btn_layanan, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_layananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_layananLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line_layanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(236, Short.MAX_VALUE)))
        );
        pn_layananLayout.setVerticalGroup(
            pn_layananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_layananLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_layananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btn_layanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_layananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_layananLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line_layanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pn_karyawann.setBackground(new java.awt.Color(255, 255, 255));

        pn_line_karyawann.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line_karyawannLayout = new javax.swing.GroupLayout(pn_line_karyawann);
        pn_line_karyawann.setLayout(pn_line_karyawannLayout);
        pn_line_karyawannLayout.setHorizontalGroup(
            pn_line_karyawannLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        pn_line_karyawannLayout.setVerticalGroup(
            pn_line_karyawannLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\renet\\Downloads\\foto\\employees.png")); // NOI18N

        btn_karyawann.setBackground(new java.awt.Color(204, 204, 204));
        btn_karyawann.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_karyawann.setText("KELOLA KARYAWAN");
        btn_karyawann.setToolTipText("");
        btn_karyawann.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_karyawannMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_karyawannMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_karyawannMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_karyawannLayout = new javax.swing.GroupLayout(pn_karyawann);
        pn_karyawann.setLayout(pn_karyawannLayout);
        pn_karyawannLayout.setHorizontalGroup(
            pn_karyawannLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_karyawannLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(btn_karyawann, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_karyawannLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_karyawannLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line_karyawann, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(236, Short.MAX_VALUE)))
        );
        pn_karyawannLayout.setVerticalGroup(
            pn_karyawannLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_karyawannLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_karyawannLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btn_karyawann, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_karyawannLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_karyawannLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line_karyawann, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pn_transaksi.setBackground(new java.awt.Color(255, 255, 255));

        pn_line_transaksi.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line_transaksiLayout = new javax.swing.GroupLayout(pn_line_transaksi);
        pn_line_transaksi.setLayout(pn_line_transaksiLayout);
        pn_line_transaksiLayout.setHorizontalGroup(
            pn_line_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        pn_line_transaksiLayout.setVerticalGroup(
            pn_line_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\renet\\Downloads\\foto\\bill.png")); // NOI18N

        btn_transaksi.setBackground(new java.awt.Color(204, 204, 204));
        btn_transaksi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_transaksi.setText("KELOLA TRANSAKSI");
        btn_transaksi.setToolTipText("");
        btn_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_transaksiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_transaksiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_transaksiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_transaksiLayout = new javax.swing.GroupLayout(pn_transaksi);
        pn_transaksi.setLayout(pn_transaksiLayout);
        pn_transaksiLayout.setHorizontalGroup(
            pn_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_transaksiLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(btn_transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_transaksiLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(236, Short.MAX_VALUE)))
        );
        pn_transaksiLayout.setVerticalGroup(
            pn_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_transaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btn_transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_transaksiLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line_transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pn_delivery.setBackground(new java.awt.Color(255, 255, 255));

        pn_line_delivery.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line_deliveryLayout = new javax.swing.GroupLayout(pn_line_delivery);
        pn_line_delivery.setLayout(pn_line_deliveryLayout);
        pn_line_deliveryLayout.setHorizontalGroup(
            pn_line_deliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        pn_line_deliveryLayout.setVerticalGroup(
            pn_line_deliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\renet\\Downloads\\foto\\delivery.png")); // NOI18N

        btn_delivery.setBackground(new java.awt.Color(204, 204, 204));
        btn_delivery.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_delivery.setText("KELOLA DELIVERY");
        btn_delivery.setToolTipText("");
        btn_delivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_deliveryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_deliveryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_deliveryMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_deliveryLayout = new javax.swing.GroupLayout(pn_delivery);
        pn_delivery.setLayout(pn_deliveryLayout);
        pn_deliveryLayout.setHorizontalGroup(
            pn_deliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_deliveryLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(btn_delivery, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_deliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_deliveryLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line_delivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(236, Short.MAX_VALUE)))
        );
        pn_deliveryLayout.setVerticalGroup(
            pn_deliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_deliveryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_deliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btn_delivery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
            .addGroup(pn_deliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_deliveryLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line_delivery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pn_logout.setBackground(new java.awt.Color(255, 255, 255));

        pn_line_logout.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line_logoutLayout = new javax.swing.GroupLayout(pn_line_logout);
        pn_line_logout.setLayout(pn_line_logoutLayout);
        pn_line_logoutLayout.setHorizontalGroup(
            pn_line_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        pn_line_logoutLayout.setVerticalGroup(
            pn_line_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\renet\\Downloads\\foto\\logout.png")); // NOI18N

        btn_logout.setBackground(new java.awt.Color(204, 204, 204));
        btn_logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_logout.setText("LOGOUT");
        btn_logout.setToolTipText("");
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_logoutLayout = new javax.swing.GroupLayout(pn_logout);
        pn_logout.setLayout(pn_logoutLayout);
        pn_logoutLayout.setHorizontalGroup(
            pn_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_logoutLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel18)
                .addGap(13, 13, 13)
                .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_logoutLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line_logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(236, Short.MAX_VALUE)))
        );
        pn_logoutLayout.setVerticalGroup(
            pn_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_logoutLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pn_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_logoutLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout pn_kiriLayout = new javax.swing.GroupLayout(pn_kiri);
        pn_kiri.setLayout(pn_kiriLayout);
        pn_kiriLayout.setHorizontalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_kiriLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_kiriLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pn_delivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pn_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pn_karyawann, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pn_layanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pn_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_kiriLayout.createSequentialGroup()
                                .addComponent(pn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_kiriLayout.createSequentialGroup()
                                .addComponent(pn_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_kiriLayout.createSequentialGroup()
                        .addComponent(pn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pn_kiriLayout.setVerticalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(pn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_karyawann, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_layanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_delivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        getContentPane().add(pn_kiri, java.awt.BorderLayout.LINE_START);

        pn_kanan.setLayout(new java.awt.BorderLayout());

        pn_dasar.setBackground(new java.awt.Color(250, 250, 250));

        pn_konten.setBackground(new java.awt.Color(255, 255, 255));
        pn_konten.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_dasarLayout = new javax.swing.GroupLayout(pn_dasar);
        pn_dasar.setLayout(pn_dasarLayout);
        pn_dasarLayout.setHorizontalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_konten, javax.swing.GroupLayout.DEFAULT_SIZE, 1088, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_dasarLayout.setVerticalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_konten, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE))
        );

        pn_kanan.add(pn_dasar, java.awt.BorderLayout.CENTER);

        jPanelGradient1.setColorEnd(new java.awt.Color(204, 204, 255));
        jPanelGradient1.setColorStart(new java.awt.Color(54, 1, 151));
        jPanelGradient1.setPreferredSize(new java.awt.Dimension(867, 70));

        javax.swing.GroupLayout jPanelGradient1Layout = new javax.swing.GroupLayout(jPanelGradient1);
        jPanelGradient1.setLayout(jPanelGradient1Layout);
        jPanelGradient1Layout.setHorizontalGroup(
            jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        jPanelGradient1Layout.setVerticalGroup(
            jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        pn_kanan.add(jPanelGradient1, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(pn_kanan, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1414, 776));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseEntered
        pn_dashboard.setBackground(new Color(250,250,250));
        pn_line_dashboard.setBackground(new Color(54,1,151));
    }//GEN-LAST:event_btn_dashboardMouseEntered

    private void btn_dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseExited
        pn_dashboard.setBackground(new Color(255,255,255));
        pn_line_dashboard.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_dashboardMouseExited

    private void btn_dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseClicked
        // TODO add your handling code here:
        pn_dashboard.setBackground(new Color(240,240,240));
        pn_line_dashboard.setBackground(new Color(54,1,151));
        pn_konten.removeAll();
        pn_konten.add(new MenuDashboard());
        pn_konten.repaint();
        pn_konten.revalidate();
    }//GEN-LAST:event_btn_dashboardMouseClicked

    private void btn_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_adminMouseClicked
        // TODO add your handling code here:
        pn_admin.setBackground(new Color(240,240,240));
        pn_line_admin.setBackground(new Color(54,1,151));
        pn_konten.removeAll();
        pn_konten.add(new AdminManagement());
        pn_konten.repaint();
        pn_konten.revalidate();
    }//GEN-LAST:event_btn_adminMouseClicked

    private void btn_adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_adminMouseEntered
        // TODO add your handling code here:
        pn_admin.setBackground(new Color(250,250,250));
        pn_line_admin.setBackground(new Color(54,1,151));
    }//GEN-LAST:event_btn_adminMouseEntered

    private void btn_adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_adminMouseExited
        // TODO add your handling code here:
        pn_admin.setBackground(new Color(255,255,255));
        pn_line_admin.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_adminMouseExited

    private void btn_pelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pelangganMouseClicked
        // TODO add your handling code here:
        pn_pelanggan.setBackground(new Color(240,240,240));
        pn_line_pelanggan.setBackground(new Color(54,1,151));
        pn_konten.removeAll();
        pn_konten.add(new PelangganManagement());
        pn_konten.repaint();
        pn_konten.revalidate();
    }//GEN-LAST:event_btn_pelangganMouseClicked

    private void btn_pelangganMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pelangganMouseEntered
        // TODO add your handling code here:
        pn_pelanggan.setBackground(new Color(250,250,250));
        pn_line_pelanggan.setBackground(new Color(54,1,151));
        
    }//GEN-LAST:event_btn_pelangganMouseEntered

    private void btn_pelangganMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pelangganMouseExited
        // TODO add your handling code here:
        pn_pelanggan.setBackground(new Color(255,255,255));
        pn_line_pelanggan.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_pelangganMouseExited

    private void btn_layananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_layananMouseClicked
        // TODO add your handling code here:
        pn_layanan.setBackground(new Color(240,240,240));
        pn_line_layanan.setBackground(new Color(54,1,151));
        pn_konten.removeAll();
        pn_konten.add(new LayananManagement());
        pn_konten.repaint();
        pn_konten.revalidate();
    }//GEN-LAST:event_btn_layananMouseClicked

    private void btn_layananMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_layananMouseEntered
        // TODO add your handling code here:
        pn_layanan.setBackground(new Color(250,250,250));
        pn_line_layanan.setBackground(new Color(54,1,151));
    }//GEN-LAST:event_btn_layananMouseEntered

    private void btn_layananMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_layananMouseExited
        // TODO add your handling code here:
        pn_layanan.setBackground(new Color(255,255,255));
        pn_line_layanan.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_layananMouseExited

    private void btn_karyawannMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_karyawannMouseClicked
        // TODO add your handling code here:
        pn_karyawann.setBackground(new Color(240,240,240));
        pn_line_karyawann.setBackground(new Color(54,1,151));
        pn_konten.removeAll();
        pn_konten.add(new KaryawanManagement());
        pn_konten.repaint();
        pn_konten.revalidate();
    }//GEN-LAST:event_btn_karyawannMouseClicked

    private void btn_karyawannMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_karyawannMouseEntered
        // TODO add your handling code here:
        pn_karyawann.setBackground(new Color(250,250,250));
        pn_line_karyawann.setBackground(new Color(54,1,151));
    }//GEN-LAST:event_btn_karyawannMouseEntered

    private void btn_karyawannMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_karyawannMouseExited
        // TODO add your handling code here:
        pn_karyawann.setBackground(new Color(255,255,255));
        pn_line_karyawann.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_karyawannMouseExited

    private void btn_transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksiMouseClicked
        // TODO add your handling code here:
        pn_transaksi.setBackground(new Color(240,240,240));
        pn_line_transaksi.setBackground(new Color(54,1,151));
        pn_konten.removeAll();
        pn_konten.add(new TransaksiManagement());
        pn_konten.repaint();
        pn_konten.revalidate();
    }//GEN-LAST:event_btn_transaksiMouseClicked

    private void btn_transaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksiMouseEntered
        // TODO add your handling code here:
        pn_transaksi.setBackground(new Color(250,250,250));
        pn_line_transaksi.setBackground(new Color(54,1,151));
    }//GEN-LAST:event_btn_transaksiMouseEntered

    private void btn_transaksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksiMouseExited
        // TODO add your handling code here:
        pn_transaksi.setBackground(new Color(255,255,255));
        pn_line_transaksi.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_transaksiMouseExited

    private void btn_deliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deliveryMouseClicked
        // TODO add your handling code here:
        pn_delivery.setBackground(new Color(240,240,240));
        pn_line_delivery.setBackground(new Color(54,1,151));
        pn_konten.removeAll();
        pn_konten.add(new DeliveryManagement());
        pn_konten.repaint();
        pn_konten.revalidate();
    }//GEN-LAST:event_btn_deliveryMouseClicked

    private void btn_deliveryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deliveryMouseEntered
        // TODO add your handling code here:
        pn_delivery.setBackground(new Color(250,250,250));
        pn_line_delivery.setBackground(new Color(54,1,151));
    }//GEN-LAST:event_btn_deliveryMouseEntered

    private void btn_deliveryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deliveryMouseExited
        // TODO add your handling code here:
        pn_delivery.setBackground(new Color(255,255,255));
        pn_line_delivery.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_deliveryMouseExited

    private void btn_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseExited
        // TODO add your handling code here:
        pn_logout.setBackground(new Color(255,255,255));
        pn_line_logout.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_logoutMouseExited

    private void btn_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseEntered
        // TODO add your handling code here:
        pn_logout.setBackground(new Color(250,250,250));
        pn_line_logout.setBackground(new Color(54,1,151));
    }//GEN-LAST:event_btn_logoutMouseEntered

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure to logout?", "Warning", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            dispose();
            new HomePage().setVisible(true);
        }
    }//GEN-LAST:event_btn_logoutMouseClicked

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_admin;
    private javax.swing.JLabel btn_dashboard;
    private javax.swing.JLabel btn_delivery;
    private javax.swing.JLabel btn_karyawann;
    private javax.swing.JLabel btn_layanan;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JLabel btn_pelanggan;
    private javax.swing.JLabel btn_transaksi;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private com.itenas.oop.view.swing.JPanelGradient jPanelGradient1;
    private javax.swing.JPanel pn_admin;
    private javax.swing.JPanel pn_dasar;
    private javax.swing.JPanel pn_dashboard;
    private javax.swing.JPanel pn_delivery;
    private javax.swing.JPanel pn_kanan;
    private javax.swing.JPanel pn_karyawann;
    private javax.swing.JPanel pn_kiri;
    private javax.swing.JPanel pn_konten;
    private javax.swing.JPanel pn_layanan;
    private javax.swing.JPanel pn_line_admin;
    private javax.swing.JPanel pn_line_dashboard;
    private javax.swing.JPanel pn_line_delivery;
    private javax.swing.JPanel pn_line_karyawann;
    private javax.swing.JPanel pn_line_layanan;
    private javax.swing.JPanel pn_line_logout;
    private javax.swing.JPanel pn_line_pelanggan;
    private javax.swing.JPanel pn_line_transaksi;
    private javax.swing.JPanel pn_logout;
    private javax.swing.JPanel pn_pelanggan;
    private javax.swing.JPanel pn_transaksi;
    // End of variables declaration//GEN-END:variables

    
}
