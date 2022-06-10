/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kuesionerfix;

import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import kuesionerfix.entity.User;
import kuesionerfix.entity.UserLogin;
import kuesionerfix.repository.PerusahaanRepository;
import kuesionerfix.repository.UserRepo;

/**
 *
 * @author ASUS
 */
public class MenuUtama extends javax.swing.JFrame {

    private Map<String, String> provinsi = new HashMap<String, String>();
    private Map<String, String> kabupaten = new HashMap<String, String>();

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
        scaleImage();

        if (!UserLogin.getRole().equals("admin")) {
            editRegisBtn.setVisible(false);
            addRegisBtn.setVisible(false);
            deleteRegisBtn.setVisible(false);
            approveBtn.setVisible(false);
            addOperatorPanel.setVisible(false);
            addOperatorText.setVisible(false);
        }
        // else {
        // addPerusahaanBtn.setVisible(false);
        // editPerusahaanBtn.setVisible(false);
        // deletePerusahaanBtn.setVisible(false);
        // }
    }

    public void scaleImage() {

        ImageIcon icon = new ImageIcon("./src/kuesionerfix/icon/PngItem_786293.png");

        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(avatar.getWidth(), avatar.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        avatar.setIcon(scaledIcon);
    }

    public void loadComboboxProv() {
        String sql = "SELECT p.*, k.* FROM provinsi p, kabupaten k";
        Connection connection = DBConnection.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                comboBoxProv.addItem(rs.getString("p.nama"));
                provinsi.put(rs.getString("p.nama"), rs.getString("p.id"));
                kabupaten.put(rs.getString("k.nama"), rs.getString("k.id_kab"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
        }
    }

    public void loadComboboxKabupaten() {
        String kodeProv = provinsi.get(comboBoxProv.getSelectedItem());
        comboBoxKabupaten.removeAllItems();
        String sql = "SELECT * FROM kabupaten WHERE id_prov = " + kodeProv;
        Connection connection = DBConnection.getConnection();
        comboBoxKabupaten.addItem("-- Pilih Kabupaten --");
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                comboBoxKabupaten.addItem(rs.getString("nama"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
        }
    }

    public void loadComboboxKecamatan() {

        String kodeKab = kabupaten.get(tabelRegistrasi.getKabupaten());

        String sql = "SELECT * FROM kecamatan WHERE id_kab = '" + kodeKab + "'";
        Connection connection = DBConnection.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                comboBoxKecamatan.addItem(rs.getString("nama"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
        }
    }

    // public void loadComboboxKabupaten1() {
    // String kodeProv = provinsi.get(comboBoxProv1.getSelectedItem());
    // comboBoxKabupaten1.removeAllItems();
    // String sql = "SELECT * FROM kabupaten WHERE id_prov = " + kodeProv;
    // Connection connection = DBConnection.getConnection();
    // comboBoxKabupaten1.addItem("-- Pilih Kabupaten --");
    // try {
    // Statement stmt = connection.createStatement();
    // ResultSet rs = stmt.executeQuery(sql);
    // rs = stmt.executeQuery(sql);
    // while (rs.next()) {
    // comboBoxKabupaten1.addItem(rs.getString("nama"));
    // }
    // } catch (SQLException ex) {
    // JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
    // }
    // }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebarPanel = new javax.swing.JPanel();
        avatar = new javax.swing.JLabel();
        greetings = new javax.swing.JLabel();
        berandaPanel = new javax.swing.JPanel();
        berandaText = new javax.swing.JLabel();
        entriDataPanel = new javax.swing.JPanel();
        entriDataText = new javax.swing.JLabel();
        logoutPanel = new javax.swing.JPanel();
        logoutText = new javax.swing.JLabel();
        addOperatorPanel = new javax.swing.JPanel();
        addOperatorText = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        berandaTab = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        registrasiTab = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        greetings1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboBoxTahun = new javax.swing.JComboBox<>();
        comboBoxProv = new javax.swing.JComboBox<>();
        comboBoxKabupaten = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        tabelRegistrasi = new kuesionerfix.components.table();
        readRegisBtn = new javax.swing.JButton();
        addRegisBtn = new javax.swing.JButton();
        editRegisBtn = new javax.swing.JButton();
        deleteRegisBtn = new javax.swing.JButton();
        perusahaanTab = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        greetings2 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        comboBoxKecamatan = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        addPerusahaanBtn = new javax.swing.JButton();
        editPerusahaanBtn = new javax.swing.JButton();
        deletePerusahaanBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPerusahaan = new kuesionerfix.components.table2();
        exportCSVBtn = new javax.swing.JButton();
        approveBtn = new javax.swing.JButton();
        addOperatorTab = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        operatorNameLabel = new javax.swing.JLabel();
        operatorNameTF = new javax.swing.JTextField();
        usernameOperatorLabel = new javax.swing.JLabel();
        usernameOperatorTF = new javax.swing.JTextField();
        passwordOperatorLabel = new javax.swing.JLabel();
        passwordOperatorTF = new javax.swing.JTextField();
        addOperatorBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebarPanel.setBackground(new java.awt.Color(0, 102, 255));
        sidebarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        sidebarPanel.add(avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 210, 190));

        greetings.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        greetings.setForeground(new java.awt.Color(255, 255, 255));
        greetings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        greetings.setText("<html><p align='center'>Selamat Datang, " + UserLogin.getName() + "</p></html>");
        greetings.setName(""); // NOI18N
        sidebarPanel.add(greetings, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 210, 70));

        berandaPanel.setBackground(new java.awt.Color(102, 153, 255));
        berandaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                berandaPanelMousePressed(evt);
            }
        });
        berandaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        berandaText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        berandaText.setForeground(new java.awt.Color(255, 255, 255));
        berandaText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        berandaText.setText("Beranda");
        berandaText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                berandaTextMouseClicked(evt);
            }
        });
        berandaPanel.add(berandaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 40));

        sidebarPanel.add(berandaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 320, 40));

        entriDataPanel.setBackground(new java.awt.Color(102, 153, 255));
        entriDataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        entriDataText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entriDataText.setForeground(new java.awt.Color(255, 255, 255));
        entriDataText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entriDataText.setText("Entri Data");
        entriDataText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entriDataTextMouseClicked(evt);
            }
        });
        entriDataPanel.add(entriDataText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 40));

        sidebarPanel.add(entriDataPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 320, 40));

        logoutPanel.setBackground(new java.awt.Color(255, 102, 102));
        logoutPanel.setForeground(new java.awt.Color(255, 102, 102));
        logoutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutPanelMouseClicked(evt);
            }
        });

        logoutText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutText.setForeground(new java.awt.Color(255, 255, 255));
        logoutText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutText.setText("Logout");

        javax.swing.GroupLayout logoutPanelLayout = new javax.swing.GroupLayout(logoutPanel);
        logoutPanel.setLayout(logoutPanelLayout);
        logoutPanelLayout.setHorizontalGroup(
                logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(logoutText, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));
        logoutPanelLayout.setVerticalGroup(
                logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(logoutText, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));

        sidebarPanel.add(logoutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, 110, 50));

        addOperatorPanel.setBackground(new java.awt.Color(102, 153, 255));
        addOperatorPanel.setForeground(new java.awt.Color(102, 153, 255));

        addOperatorText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addOperatorText.setForeground(new java.awt.Color(255, 255, 255));
        addOperatorText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addOperatorText.setText("Tambah Operator");
        addOperatorText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addOperatorTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addOperatorPanelLayout = new javax.swing.GroupLayout(addOperatorPanel);
        addOperatorPanel.setLayout(addOperatorPanelLayout);
        addOperatorPanelLayout.setHorizontalGroup(
                addOperatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addOperatorText, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE));
        addOperatorPanelLayout.setVerticalGroup(
                addOperatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addOperatorText, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE));

        sidebarPanel.add(addOperatorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 310, 40));

        getContentPane().add(sidebarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 720));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        berandaTab.setBackground(new java.awt.Color(255, 255, 255));
        berandaTab.setMaximumSize(new java.awt.Dimension(1280, 720));
        berandaTab.setPreferredSize(new java.awt.Dimension(1280, 900));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("0");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Belum Entri");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 55, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(59, 59, 59))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addGap(44, 44, 44)))));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));

        jPanel7.setBackground(new java.awt.Color(255, 102, 102));
        jPanel7.setPreferredSize(new java.awt.Dimension(258, 125));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("0");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Error");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap(63, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel7Layout.createSequentialGroup()
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(66, 66, 66))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel7Layout.createSequentialGroup()
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(48, 48, 48)))));
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE)));

        jPanel6.setBackground(new java.awt.Color(51, 153, 0));
        jPanel6.setPreferredSize(new java.awt.Dimension(230, 105));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("0");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Clean");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap(70, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)));
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        javax.swing.GroupLayout berandaTabLayout = new javax.swing.GroupLayout(berandaTab);
        berandaTab.setLayout(berandaTabLayout);
        berandaTabLayout.setHorizontalGroup(
                berandaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, berandaTabLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 229,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(99, Short.MAX_VALUE)));
        berandaTabLayout.setVerticalGroup(
                berandaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(berandaTabLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(berandaTabLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 115,
                                                Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 115,
                                                Short.MAX_VALUE))
                                .addContainerGap(538, Short.MAX_VALUE)));

        jTabbedPane1.addTab("tab1", berandaTab);

        registrasiTab.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(0, 102, 255));

        greetings1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        greetings1.setForeground(new java.awt.Color(255, 255, 255));
        greetings1.setText("Daftar Registrasi");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(44, Short.MAX_VALUE)
                                .addComponent(greetings1, javax.swing.GroupLayout.PREFERRED_SIZE, 194,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(greetings1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE));

        jPanel10.setBackground(new java.awt.Color(255, 204, 102));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Tahun");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Provinsi");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Kabupaten");

        comboBoxTahun.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "-- Pilih Tahun --", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));

        comboBoxProv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Provinsi --" }));
        loadComboboxProv();
        comboBoxProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxProvActionPerformed(evt);
            }
        });

        comboBoxKabupaten.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Kabupaten --" }));

        jButton5.setBackground(new java.awt.Color(51, 153, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Cari");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel10Layout.createSequentialGroup()
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 112,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel10Layout.createSequentialGroup()
                                                .addGroup(jPanel10Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel10)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel10Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                67,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel5)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        535, Short.MAX_VALUE)
                                                .addGroup(jPanel10Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(comboBoxProv,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 228,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(comboBoxTahun,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 228,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(comboBoxKabupaten,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 228,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap()));
        jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(comboBoxTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(comboBoxProv, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboBoxKabupaten, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                .addGap(15, 15, 15)
                                .addComponent(jButton5)
                                .addGap(602, 602, 602)));

        tabelRegistrasi.setBackground(new java.awt.Color(255, 255, 255));
        tabelRegistrasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelRegistrasiMouseClicked(evt);
            }
        });

        readRegisBtn.setBackground(new java.awt.Color(247, 195, 37));
        readRegisBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        readRegisBtn.setForeground(new java.awt.Color(255, 255, 255));
        readRegisBtn.setText("Lihat");
        readRegisBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                readRegisBtnMouseClicked(evt);
            }
        });

        addRegisBtn.setBackground(new java.awt.Color(51, 153, 0));
        addRegisBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addRegisBtn.setForeground(new java.awt.Color(255, 255, 255));
        addRegisBtn.setText("Tambah");
        addRegisBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addRegisBtnMouseClicked(evt);
            }
        });

        editRegisBtn.setBackground(new java.awt.Color(51, 153, 255));
        editRegisBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editRegisBtn.setForeground(new java.awt.Color(255, 255, 255));
        editRegisBtn.setText("Edit");
        editRegisBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editRegisBtnMouseClicked(evt);
            }
        });
        editRegisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editRegisBtnActionPerformed(evt);
            }
        });

        deleteRegisBtn.setBackground(new java.awt.Color(255, 102, 102));
        deleteRegisBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteRegisBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteRegisBtn.setText("Hapus");
        deleteRegisBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteRegisBtnMouseClicked(evt);
            }
        });
        deleteRegisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRegisBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registrasiTabLayout = new javax.swing.GroupLayout(registrasiTab);
        registrasiTab.setLayout(registrasiTabLayout);
        registrasiTabLayout.setHorizontalGroup(
                registrasiTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registrasiTabLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(registrasiTabLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrasiTabLayout
                                                .createSequentialGroup()
                                                .addComponent(deleteRegisBtn)
                                                .addGap(18, 18, 18)
                                                .addComponent(editRegisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(addRegisBtn)
                                                .addGap(18, 18, 18)
                                                .addComponent(readRegisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tabelRegistrasi, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap(80, Short.MAX_VALUE)));
        registrasiTabLayout.setVerticalGroup(
                registrasiTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registrasiTabLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(registrasiTabLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(deleteRegisBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(editRegisBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addRegisBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(readRegisBtn))
                                .addGap(18, 18, 18)
                                .addComponent(tabelRegistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 274,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)));

        tabelRegistrasi.loadTableRegistrasi();

        jTabbedPane1.addTab("tab1", registrasiTab);

        perusahaanTab.setBackground(new java.awt.Color(255, 255, 255));

        jPanel18.setBackground(new java.awt.Color(0, 102, 255));
        jPanel18.setForeground(new java.awt.Color(255, 255, 255));

        greetings2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        greetings2.setForeground(new java.awt.Color(255, 255, 255));
        greetings2.setText("Daftar Perusahaan");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addContainerGap(44, Short.MAX_VALUE)
                                .addComponent(greetings2, javax.swing.GroupLayout.PREFERRED_SIZE, 194,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        jPanel18Layout.setVerticalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(greetings2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE));

        jPanel19.setBackground(new java.awt.Color(255, 204, 102));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Kecamatan");

        comboBoxKecamatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Kecamatan --" }));

        jButton6.setBackground(new java.awt.Color(51, 153, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Cari");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
                jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel19Layout.createSequentialGroup()
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 106,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel19Layout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        541, Short.MAX_VALUE)
                                                .addComponent(comboBoxKecamatan, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap()));
        jPanel19Layout.setVerticalGroup(
                jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(comboBoxKecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel20))
                                .addGap(18, 18, 18)
                                .addComponent(jButton6)
                                .addGap(90, 90, 90)));

        addPerusahaanBtn.setBackground(new java.awt.Color(51, 153, 0));
        addPerusahaanBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addPerusahaanBtn.setForeground(new java.awt.Color(255, 255, 255));
        addPerusahaanBtn.setText("Tambah");
        addPerusahaanBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPerusahaanBtnMouseClicked(evt);
            }
        });

        editPerusahaanBtn.setBackground(new java.awt.Color(204, 204, 0));
        editPerusahaanBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editPerusahaanBtn.setForeground(new java.awt.Color(255, 255, 255));
        editPerusahaanBtn.setText("Edit");
        editPerusahaanBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editPerusahaanBtnMouseClicked(evt);
            }
        });

        deletePerusahaanBtn.setBackground(new java.awt.Color(255, 102, 102));
        deletePerusahaanBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deletePerusahaanBtn.setForeground(new java.awt.Color(255, 255, 255));
        deletePerusahaanBtn.setText("Hapus");
        deletePerusahaanBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletePerusahaanBtnMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(tabelPerusahaan);

        exportCSVBtn.setBackground(new java.awt.Color(51, 102, 255));
        exportCSVBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exportCSVBtn.setForeground(new java.awt.Color(255, 255, 255));
        exportCSVBtn.setText("Export");
        exportCSVBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportCSVBtnActionPerformed(evt);
            }
        });

        approveBtn.setBackground(new java.awt.Color(51, 153, 0));
        approveBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        approveBtn.setForeground(new java.awt.Color(255, 255, 255));
        approveBtn.setText("Approve");

        javax.swing.GroupLayout perusahaanTabLayout = new javax.swing.GroupLayout(perusahaanTab);
        perusahaanTab.setLayout(perusahaanTabLayout);
        perusahaanTabLayout.setHorizontalGroup(
                perusahaanTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(perusahaanTabLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(perusahaanTabLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(perusahaanTabLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(perusahaanTabLayout.createSequentialGroup()
                                                        .addComponent(exportCSVBtn,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 96,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(deletePerusahaanBtn,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(editPerusahaanBtn,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(addPerusahaanBtn)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(approveBtn,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 102,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(perusahaanTabLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                                Short.MAX_VALUE))))
                                .addContainerGap(69, Short.MAX_VALUE)));
        perusahaanTabLayout.setVerticalGroup(
                perusahaanTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(perusahaanTabLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(perusahaanTabLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(approveBtn, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(perusahaanTabLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(addPerusahaanBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(editPerusahaanBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(deletePerusahaanBtn,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(exportCSVBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(244, 244, 244)));

        jTabbedPane1.addTab("tab1", perusahaanTab);

        addOperatorTab.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tambah Operator");

        operatorNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        operatorNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        operatorNameLabel.setText("Nama");

        usernameOperatorLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usernameOperatorLabel.setForeground(new java.awt.Color(0, 0, 0));
        usernameOperatorLabel.setText("Username");

        passwordOperatorLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordOperatorLabel.setForeground(new java.awt.Color(0, 0, 0));
        passwordOperatorLabel.setText("Password");

        addOperatorBtn.setBackground(new java.awt.Color(102, 102, 255));
        addOperatorBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addOperatorBtn.setForeground(new java.awt.Color(255, 255, 255));
        addOperatorBtn.setText("Add Operator");
        addOperatorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOperatorBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addOperatorTabLayout = new javax.swing.GroupLayout(addOperatorTab);
        addOperatorTab.setLayout(addOperatorTabLayout);
        addOperatorTabLayout.setHorizontalGroup(
                addOperatorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addOperatorTabLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(addOperatorTabLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addOperatorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(addOperatorTabLayout.createSequentialGroup()
                                                .addComponent(operatorNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(operatorNameTF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        374, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 326,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(addOperatorTabLayout.createSequentialGroup()
                                                .addComponent(usernameOperatorLabel,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 139,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(usernameOperatorTF,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 374,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(addOperatorTabLayout.createSequentialGroup()
                                                .addComponent(passwordOperatorLabel,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 139,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(passwordOperatorTF,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 374,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(399, Short.MAX_VALUE)));
        addOperatorTabLayout.setVerticalGroup(
                addOperatorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addOperatorTabLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(addOperatorTabLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(operatorNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(operatorNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(addOperatorTabLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(usernameOperatorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernameOperatorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(addOperatorTabLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordOperatorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordOperatorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addComponent(addOperatorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(296, Short.MAX_VALUE)));

        jTabbedPane1.addTab("tab4", addOperatorTab);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, -40, 990, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addOperatorTextMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_addOperatorTextMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }// GEN-LAST:event_addOperatorTextMouseClicked

    private void addOperatorBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addOperatorBtnActionPerformed
        // TODO add your handling code here:
        User user = new User();
        Connection connection = DBConnection.getConnection();
        user.setUsername(usernameOperatorTF.getText());
        user.setPassword(passwordOperatorTF.getText());
        user.setName(operatorNameTF.getText());
        user.setRole("operator");

        UserRepo userRepo = new UserRepo(connection);
        userRepo.addOperator(user);
    }// GEN-LAST:event_addOperatorBtnActionPerformed

    private void exportCSVBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exportCSVBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Save File");
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try {
                FileWriter writer = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(writer);
                for (int i = 0; i < tabelPerusahaan.getjTable1().getRowCount(); i++) {
                    for (int j = 0; j < tabelPerusahaan.getjTable1().getColumnCount(); j++) {
                        if (tabelPerusahaan.getjTable1().getValueAt(i, j) != null) {
                            bw.write(tabelPerusahaan.getjTable1().getValueAt(i, j).toString() + ",");
                        } else {
                            bw.write("");
                        }
                    }
                    bw.newLine();
                }
                bw.close();
                writer.close();
                JOptionPane.showMessageDialog(null, "File saved successfully");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }// GEN-LAST:event_exportCSVBtnActionPerformed

    private void berandaPanelMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_berandaPanelMousePressed
        // TODO add your handling code here:
    }// GEN-LAST:event_berandaPanelMousePressed

    private void berandaTextMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_berandaTextMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }// GEN-LAST:event_berandaTextMouseClicked

    private void entriDataTextMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_entriDataTextMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }// GEN-LAST:event_entriDataTextMouseClicked

    private void comboBoxProvActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_comboBoxProvActionPerformed
        // TODO add your handling code here:
        loadComboboxKabupaten();
    }// GEN-LAST:event_comboBoxProvActionPerformed

    private void logoutPanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_logoutPanelMouseClicked
        // TODO add your handling code here:
        UserLogin.destroyUserLogin();
        if (JOptionPane.showConfirmDialog(null, "Apa Anda yakin ingin logout?", "Logout",
                JOptionPane.YES_NO_OPTION) == 0) {
            Login login = new Login();
            login.setVisible(true);
            this.dispose();
            login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }// GEN-LAST:event_logoutPanelMouseClicked

    private void tabelRegistrasiMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tabelRegistrasiMouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_tabelRegistrasiMouseClicked

    private void readRegisBtnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_readRegisBtnMouseClicked
        // TODO add your handling code here:
        int idRegistrasi = tabelRegistrasi.getIdRegisterSelected();
        if (idRegistrasi != 0) {
            jTabbedPane1.setSelectedIndex(2);
            tabelPerusahaan.setIdRegistrasi(idRegistrasi);
            tabelPerusahaan.loadTablePerusahaan();
            loadComboboxKecamatan();
        } else {
            JOptionPane.showMessageDialog(this, "Pilih registrasi terlebih dahulu");
        }
    }// GEN-LAST:event_readRegisBtnMouseClicked

    private void addRegisBtnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_addRegisBtnMouseClicked
        // TODO add your handling code here:
        EntriNewRegistrasi entriNewRegistrasi = new EntriNewRegistrasi();
        entriNewRegistrasi.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        entriNewRegistrasi.setVisible(true);
    }// GEN-LAST:event_addRegisBtnMouseClicked

    private void editRegisBtnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_editRegisBtnMouseClicked
        // TODO add your handling code here:
        if (tabelRegistrasi.getIdRegisterSelected() == 0) {
            JOptionPane.showMessageDialog(this, "Pilih registrasi terlebih dahulu");
            return;
        }
        EditDataRegistrasi editDataRegistrasi = new EditDataRegistrasi(tabelRegistrasi.getIdRegisterSelected());
        editDataRegistrasi.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        editDataRegistrasi.setVisible(true);
    }// GEN-LAST:event_editRegisBtnMouseClicked

    private void deleteRegisBtnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_deleteRegisBtnMouseClicked
        // TODO add your handling code here:
        int idSelected = tabelRegistrasi.getIdRegisterSelected();
        if (idSelected == 0) {
            JOptionPane.showMessageDialog(this, "Pilih registrasi terlebih dahulu");
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus registrasi ini?",
                "Hapus Registrasi",
                JOptionPane.YES_NO_OPTION) == 0) {
            String sql = "DELETE FROM registrasi WHERE id = '" + idSelected + "'";
            try {
                Connection connection = DBConnection.getConnection();
                Statement stmt = connection.createStatement();
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Data registrasi berhasil dihapus");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }// GEN-LAST:event_deleteRegisBtnMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        int periodeData;
        String provinsi = comboBoxProv.getSelectedItem().toString();
        String kabupaten = comboBoxKabupaten.getSelectedItem().toString();
        try {
            periodeData = Integer.parseInt(comboBoxTahun.getSelectedItem().toString());
            if (provinsi.contains("--") && kabupaten.contains("--"))
                tabelRegistrasi.searchTabelRegistrasiByYear(periodeData);
            else if (!provinsi.contains("--") && kabupaten.contains("--"))
                tabelRegistrasi.searchTabelRegistrasiByYearProv(periodeData, provinsi);
            else
                tabelRegistrasi.searchTabelRegistrasi(periodeData, provinsi, kabupaten);
        } catch (Exception e) {
            if (!provinsi.contains("--") && !kabupaten.contains("--")) {
                tabelRegistrasi.searchTabelRegistrasiByProvKab(provinsi, kabupaten);
            } else if (!provinsi.contains("--")) {
                tabelRegistrasi.searchTabelRegistrasiByProv(provinsi);
            } else if (!kabupaten.contains("--")) {
                tabelRegistrasi.searchTabelRegistrasiByKab(kabupaten);
            } else {
                tabelRegistrasi.loadTableRegistrasi();
            }
        }
    }// GEN-LAST:event_jButton5MouseClicked

    private void editRegisBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editRegisBtnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_editRegisBtnActionPerformed

    private void addPerusahaanBtnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_addPerusahaanBtnMouseClicked
        // TODO add your handling code here:
        EntriPerusahaan perusahaan = new EntriPerusahaan();
        perusahaan.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        perusahaan.setVisible(true);
    }// GEN-LAST:event_addPerusahaanBtnMouseClicked

    private void deleteRegisBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteRegisBtnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_deleteRegisBtnActionPerformed

    private void editPerusahaanBtnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_editPerusahaanBtnMouseClicked
        // TODO add your handling code here:
        if (tabelPerusahaan.getIdSelectedPerusahaan() == 0) {
            JOptionPane.showMessageDialog(this, "Pilih registrasi terlebih dahulu");
            return;
        }
        EditPerusahaan editPerusahaan = new EditPerusahaan(tabelPerusahaan.getIdSelectedPerusahaan());
        editPerusahaan.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        editPerusahaan.setVisible(true);
    }// GEN-LAST:event_editPerusahaanBtnMouseClicked

    private void deletePerusahaanBtnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_deletePerusahaanBtnMouseClicked
        // TODO add your handling code here:
        int idPerusahaan = tabelPerusahaan.getIdSelectedPerusahaan();
        if (idPerusahaan == 0) {
            JOptionPane.showMessageDialog(this, "Pilih registrasi terlebih dahulu");
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data perusahaan ini?",
                "Hapus Perusahaan",
                JOptionPane.YES_NO_OPTION) == 0) {
            Connection connection = DBConnection.getConnection();
            PerusahaanRepository repository = new PerusahaanRepository(connection);
            repository.delete(idPerusahaan);
        }
    }

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        tabelPerusahaan.searchByKecamatan(comboBoxKecamatan.getSelectedItem().toString());
    }// GEN-LAST:event_jButton6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOperatorBtn;
    private javax.swing.JPanel addOperatorPanel;
    private javax.swing.JPanel addOperatorTab;
    private javax.swing.JLabel addOperatorText;
    private javax.swing.JButton addPerusahaanBtn;
    private javax.swing.JButton addRegisBtn;
    private javax.swing.JButton approveBtn;
    private javax.swing.JLabel avatar;
    private javax.swing.JPanel berandaPanel;
    private javax.swing.JPanel berandaTab;
    private javax.swing.JLabel berandaText;
    private javax.swing.JComboBox<String> comboBoxKabupaten;
    private javax.swing.JComboBox<String> comboBoxKecamatan;
    private javax.swing.JComboBox<String> comboBoxProv;
    private javax.swing.JComboBox<String> comboBoxTahun;
    private javax.swing.JButton deletePerusahaanBtn;
    private javax.swing.JButton deleteRegisBtn;
    private javax.swing.JButton editPerusahaanBtn;
    private javax.swing.JButton editRegisBtn;
    private javax.swing.JPanel entriDataPanel;
    private javax.swing.JLabel entriDataText;
    private javax.swing.JButton exportCSVBtn;
    private javax.swing.JLabel greetings;
    private javax.swing.JLabel greetings1;
    private javax.swing.JLabel greetings2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JLabel logoutText;
    private javax.swing.JLabel operatorNameLabel;
    private javax.swing.JTextField operatorNameTF;
    private javax.swing.JLabel passwordOperatorLabel;
    private javax.swing.JTextField passwordOperatorTF;
    private javax.swing.JPanel perusahaanTab;
    private javax.swing.JButton readRegisBtn;
    private javax.swing.JPanel registrasiTab;
    private javax.swing.JPanel sidebarPanel;
    private kuesionerfix.components.table2 tabelPerusahaan;
    private kuesionerfix.components.table tabelRegistrasi;
    private javax.swing.JLabel usernameOperatorLabel;
    private javax.swing.JTextField usernameOperatorTF;
    // End of variables declaration//GEN-END:variables
}
