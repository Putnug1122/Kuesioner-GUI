/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kuesionerfix;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
        scaleImage();
    }

    public void scaleImage() {
        ImageIcon icon = new ImageIcon("D:\\Java Project\\KuesionerFix\\src\\kuesionerfix\\icon\\PngItem_786293.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(avatar.getWidth(), avatar.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        avatar.setIcon(scaledIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        masterDPPPanel = new javax.swing.JPanel();
        masterDPPText = new javax.swing.JLabel();
        laporanKerjaPanel = new javax.swing.JPanel();
        laporanKerjaText = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebarPanel.setBackground(new java.awt.Color(0, 102, 255));
        sidebarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        sidebarPanel.add(avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 210, 190));

        greetings.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        greetings.setForeground(new java.awt.Color(255, 255, 255));
        greetings.setText("Selamat Datang, Admin");
        sidebarPanel.add(greetings, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 210, 40));

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
        berandaText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kuesionerfix/icon/1.png"))); // NOI18N
        berandaText.setText("Beranda");
        berandaText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                berandaTextMouseClicked(evt);
            }
        });
        berandaPanel.add(berandaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 4, 340, 40));

        sidebarPanel.add(berandaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 340, 50));

        entriDataPanel.setBackground(new java.awt.Color(102, 153, 255));
        entriDataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        entriDataText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entriDataText.setForeground(new java.awt.Color(255, 255, 255));
        entriDataText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entriDataText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kuesionerfix/icon/4.png"))); // NOI18N
        entriDataText.setText("Entri Data");
        entriDataText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entriDataTextMouseClicked(evt);
            }
        });
        entriDataPanel.add(entriDataText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 340, 40));

        sidebarPanel.add(entriDataPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 340, 50));

        logoutPanel.setBackground(new java.awt.Color(255, 102, 102));
        logoutPanel.setForeground(new java.awt.Color(255, 102, 102));

        logoutText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutText.setForeground(new java.awt.Color(255, 255, 255));
        logoutText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kuesionerfix/icon/logout.png"))); // NOI18N
        logoutText.setText("Logout");

        javax.swing.GroupLayout logoutPanelLayout = new javax.swing.GroupLayout(logoutPanel);
        logoutPanel.setLayout(logoutPanelLayout);
        logoutPanelLayout.setHorizontalGroup(
            logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoutText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        logoutPanelLayout.setVerticalGroup(
            logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoutText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sidebarPanel.add(logoutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 720, 110, 50));

        masterDPPPanel.setBackground(new java.awt.Color(102, 153, 255));
        masterDPPPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        masterDPPText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        masterDPPText.setForeground(new java.awt.Color(255, 255, 255));
        masterDPPText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        masterDPPText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kuesionerfix/icon/8.png"))); // NOI18N
        masterDPPText.setText("Master DPP");
        masterDPPText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masterDPPTextMouseClicked(evt);
            }
        });
        masterDPPPanel.add(masterDPPText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 50));

        sidebarPanel.add(masterDPPPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 340, 50));

        laporanKerjaPanel.setBackground(new java.awt.Color(102, 153, 255));
        laporanKerjaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        laporanKerjaText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        laporanKerjaText.setForeground(new java.awt.Color(255, 255, 255));
        laporanKerjaText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laporanKerjaText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kuesionerfix/icon/6.png"))); // NOI18N
        laporanKerjaText.setText("Laporan Kerja");
        laporanKerjaText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laporanKerjaTextMouseClicked(evt);
            }
        });
        laporanKerjaPanel.add(laporanKerjaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 50));

        sidebarPanel.add(laporanKerjaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 340, 50));

        getContentPane().add(sidebarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 790));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Beranda");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(416, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(426, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Entri Data");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(414, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Master DPP");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(398, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(396, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Laporan Kerja");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, -40, 1090, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void berandaPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_berandaPanelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_berandaPanelMousePressed

    private void berandaTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_berandaTextMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_berandaTextMouseClicked

    private void entriDataTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entriDataTextMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_entriDataTextMouseClicked

    private void masterDPPTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterDPPTextMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_masterDPPTextMouseClicked

    private void laporanKerjaTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laporanKerjaTextMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_laporanKerjaTextMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avatar;
    private javax.swing.JPanel berandaPanel;
    private javax.swing.JLabel berandaText;
    private javax.swing.JPanel entriDataPanel;
    private javax.swing.JLabel entriDataText;
    private javax.swing.JLabel greetings;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel laporanKerjaPanel;
    private javax.swing.JLabel laporanKerjaText;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JLabel logoutText;
    private javax.swing.JPanel masterDPPPanel;
    private javax.swing.JLabel masterDPPText;
    private javax.swing.JPanel sidebarPanel;
    // End of variables declaration//GEN-END:variables
}
