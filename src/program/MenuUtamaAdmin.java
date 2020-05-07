/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author HP
 */
public class MenuUtamaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtamaAdmin
     */
    public MenuUtamaAdmin() {
        initComponents();
    }

    private void tampilkan_datasaran(){
        
        DefaultTableModel mdl = new DefaultTableModel ();
        mdl.addColumn("Id_Pembeli ");
        mdl.addColumn("Nama ");
        mdl.addColumn("Saran ");
        
        try {
            
            int no = 1;
            String sql = "SELECT * from Saran";
            java.sql.Connection con = (Connection) Config.configDB();
            java.sql.Statement stm1 = con.createStatement();
            java.sql.ResultSet res = stm1.executeQuery(sql);
            
            while(res.next()){
                mdl.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3)});
                
            }
            
            TabelSaranAdmin.setModel(mdl);
                
            }
        
            catch (SQLException e){
                System.out.println("Error : " + e.getMessage());
            }
    }
    
    private void tampilkan_datapembeli(){
        
        DefaultTableModel mdl1 = new DefaultTableModel ();
        mdl1.addColumn("NO ");
        mdl1.addColumn("Nama ");
        mdl1.addColumn("Id_Pembeli ");
        mdl1.addColumn("Alamat ");
        mdl1.addColumn("No Hp ");
        mdl1.addColumn("Email ");
        
        try {
            
            int no = 1;
            String sql = "SELECT * from pembeli";
            java.sql.Connection con = (Connection) Config.configDB();
            java.sql.Statement stm1 = con.createStatement();
            java.sql.ResultSet res = stm1.executeQuery(sql);
            
            while(res.next()){
                mdl1.addRow(new Object[]{no++,res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5)});
                
            }
            
            TabelPembeliAdmin.setModel(mdl1);
                
            }
        
            catch (SQLException e){
                System.out.println("Error : " + e.getMessage());
            }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyPanel = new javax.swing.JPanel();
        MenuUtamaAdmin = new javax.swing.JPanel();
        btnTampilkanDataAdmin = new javax.swing.JToggleButton();
        btnTampilkanDataSaran = new javax.swing.JToggleButton();
        btnKembaliAdmin = new javax.swing.JToggleButton();
        btnKeluarAdmin = new javax.swing.JToggleButton();
        IsiMenuUtamaAdmin = new javax.swing.JPanel();
        IsiDataPembeli = new javax.swing.JPanel();
        TabelPembeli = new javax.swing.JScrollPane();
        TabelPembeliAdmin = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        IsiDataSaran = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelSaranAdmin = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMIN");

        MenuUtamaAdmin.setBackground(new java.awt.Color(255, 153, 0));

        btnTampilkanDataAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-profiles-20.png"))); // NOI18N
        btnTampilkanDataAdmin.setSelected(true);
        btnTampilkanDataAdmin.setText("Data Pembeli");
        btnTampilkanDataAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilkanDataAdminActionPerformed(evt);
            }
        });

        btnTampilkanDataSaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-talk-20.png"))); // NOI18N
        btnTampilkanDataSaran.setText("Data Saran");
        btnTampilkanDataSaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilkanDataSaranActionPerformed(evt);
            }
        });

        btnKembaliAdmin.setText("Kembali");
        btnKembaliAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliAdminActionPerformed(evt);
            }
        });

        btnKeluarAdmin.setBackground(new java.awt.Color(255, 0, 0));
        btnKeluarAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKeluarAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-shutdown-30.png"))); // NOI18N
        btnKeluarAdmin.setText("Keluar");
        btnKeluarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuUtamaAdminLayout = new javax.swing.GroupLayout(MenuUtamaAdmin);
        MenuUtamaAdmin.setLayout(MenuUtamaAdminLayout);
        MenuUtamaAdminLayout.setHorizontalGroup(
            MenuUtamaAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuUtamaAdminLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(MenuUtamaAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTampilkanDataAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTampilkanDataSaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKembaliAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKeluarAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        MenuUtamaAdminLayout.setVerticalGroup(
            MenuUtamaAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuUtamaAdminLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnTampilkanDataAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTampilkanDataSaran, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKembaliAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnKeluarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        IsiMenuUtamaAdmin.setLayout(new java.awt.CardLayout());

        TabelPembeliAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabelPembeli.setViewportView(TabelPembeliAdmin);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Data Pembeli");

        javax.swing.GroupLayout IsiDataPembeliLayout = new javax.swing.GroupLayout(IsiDataPembeli);
        IsiDataPembeli.setLayout(IsiDataPembeliLayout);
        IsiDataPembeliLayout.setHorizontalGroup(
            IsiDataPembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IsiDataPembeliLayout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(IsiDataPembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TabelPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );
        IsiDataPembeliLayout.setVerticalGroup(
            IsiDataPembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IsiDataPembeliLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TabelPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        IsiMenuUtamaAdmin.add(IsiDataPembeli, "card2");

        TabelSaranAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TabelSaranAdmin);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Data Saran");

        javax.swing.GroupLayout IsiDataSaranLayout = new javax.swing.GroupLayout(IsiDataSaran);
        IsiDataSaran.setLayout(IsiDataSaranLayout);
        IsiDataSaranLayout.setHorizontalGroup(
            IsiDataSaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IsiDataSaranLayout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(IsiDataSaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );
        IsiDataSaranLayout.setVerticalGroup(
            IsiDataSaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IsiDataSaranLayout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );

        IsiMenuUtamaAdmin.add(IsiDataSaran, "card3");

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(MenuUtamaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IsiMenuUtamaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuUtamaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(IsiMenuUtamaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTampilkanDataSaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilkanDataSaranActionPerformed
        // TODO add your handling code here:
        
        //Menghapus
        IsiMenuUtamaAdmin.removeAll();
        IsiMenuUtamaAdmin.repaint();
        IsiMenuUtamaAdmin.revalidate();
        
        //Menampilkan isi Home
        IsiMenuUtamaAdmin.add(IsiDataSaran);
        IsiMenuUtamaAdmin.repaint();
        IsiMenuUtamaAdmin.revalidate();
        
        tampilkan_datasaran();
        
    }//GEN-LAST:event_btnTampilkanDataSaranActionPerformed

    private void btnTampilkanDataAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilkanDataAdminActionPerformed
        // TODO add your handling code here:
        
        IsiMenuUtamaAdmin.removeAll();
        IsiMenuUtamaAdmin.repaint();
        IsiMenuUtamaAdmin.revalidate();
        
        //Menampilkan isi Home
        IsiMenuUtamaAdmin.add(IsiDataPembeli);
        IsiMenuUtamaAdmin.repaint();
        IsiMenuUtamaAdmin.revalidate();
        
        tampilkan_datapembeli();
    }//GEN-LAST:event_btnTampilkanDataAdminActionPerformed

    private void btnKembaliAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliAdminActionPerformed
        // TODO add your handling code here:
        
        MenuUtamaAdmin.removeAll();
        MenuUtamaAdmin.repaint();
        MenuUtamaAdmin.revalidate();
        
        this.dispose(); // mengeluarkan tampilan
        
        TampilanAwal tampilanawal = new TampilanAwal ();
        tampilanawal.setVisible(true);
        
    }//GEN-LAST:event_btnKembaliAdminActionPerformed

    private void btnKeluarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarAdminActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_btnKeluarAdminActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtamaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtamaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IsiDataPembeli;
    private javax.swing.JPanel IsiDataSaran;
    private javax.swing.JPanel IsiMenuUtamaAdmin;
    private javax.swing.JPanel MenuUtamaAdmin;
    private javax.swing.JScrollPane TabelPembeli;
    private javax.swing.JTable TabelPembeliAdmin;
    private javax.swing.JTable TabelSaranAdmin;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JToggleButton btnKeluarAdmin;
    private javax.swing.JToggleButton btnKembaliAdmin;
    private javax.swing.JToggleButton btnTampilkanDataAdmin;
    private javax.swing.JToggleButton btnTampilkanDataSaran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
