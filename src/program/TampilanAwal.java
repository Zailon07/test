/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class TampilanAwal extends javax.swing.JFrame {
    
    
    //Mengosongkan Form
    private void kosongkan_form(){
        
        txtNama.setEditable(true);
        txtNama.setText(null);
        txtIdPembeli.setText(null);
        txtAlamat.setText(null);
        txtNoHp.setText(null);
        txtEmail.setText(null);
        
    }
    
    //Menampilkan data
    private void tampilkan_data(){
        
        DefaultTableModel model = new DefaultTableModel ();
        model.addColumn("No ");
        model.addColumn("Nama ");
        model.addColumn("Id Pembeli");
        model.addColumn("Alamat ");
        model.addColumn("No. Hp ");
        model.addColumn("Email ");
        
        try {
            
            int no = 1;
            String sql = "SELECT * from Pembeli";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{no++, res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5)} );
                
            }
            
            //TabelPembeli.setModel(model);
                
            
            }
        
            catch (SQLException e){
                System.out.println("Error : " + e.getMessage());
            }
    }
    /**
     * Creates new form Pembeli
     */
    public TampilanAwal() {
        initComponents();
        //tampilkan_data();//
        kosongkan_form();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pendaftaran = new javax.swing.JPanel();
        btnSelanjutnya = new javax.swing.JButton();
        judul = new javax.swing.JLabel();
        MohonMasukanData = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtIdPembeli = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtNoHp = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnTambahkanData = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btnSimpanData = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aplikasi Pembelian Laptop");
        setBackground(new java.awt.Color(255, 153, 0));

        Pendaftaran.setBackground(new java.awt.Color(255, 153, 0));

        btnSelanjutnya.setBackground(new java.awt.Color(51, 255, 0));
        btnSelanjutnya.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSelanjutnya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-fast-forward-30.png"))); // NOI18N
        btnSelanjutnya.setText("Selanjutnya");
        btnSelanjutnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelanjutnyaActionPerformed(evt);
            }
        });

        judul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        judul.setText("Aplikasi Pembelian Laptop");

        MohonMasukanData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MohonMasukanData.setText("Jika anda belum punya akun, harap daftarkan diri anda terlebih dahulu");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nama :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Id_Pembeli :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Alamat :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("No. Hp :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Email :");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        btnTambahkanData.setBackground(new java.awt.Color(51, 153, 255));
        btnTambahkanData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-file-30.png"))); // NOI18N
        btnTambahkanData.setText("Buat Data baru");
        btnTambahkanData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahkanDataActionPerformed(evt);
            }
        });

        btnKeluar.setBackground(new java.awt.Color(255, 0, 0));
        btnKeluar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-shutdown-30.png"))); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        btnSimpanData.setBackground(new java.awt.Color(0, 255, 0));
        btnSimpanData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-upload-document-30.png"))); // NOI18N
        btnSimpanData.setText("Simpan Data");
        btnSimpanData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanDataActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel7.setText("*Pastikan Id_Pembeli dapat di ingat");

        jToggleButton1.setBackground(new java.awt.Color(51, 153, 255));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-home-20.png"))); // NOI18N
        jToggleButton1.setText("Login sebagai ADMIN");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PendaftaranLayout = new javax.swing.GroupLayout(Pendaftaran);
        Pendaftaran.setLayout(PendaftaranLayout);
        PendaftaranLayout.setHorizontalGroup(
            PendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PendaftaranLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(PendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PendaftaranLayout.createSequentialGroup()
                            .addGroup(PendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PendaftaranLayout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PendaftaranLayout.createSequentialGroup()
                                    .addGap(158, 158, 158)
                                    .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnTambahkanData)
                                    .addGroup(PendaftaranLayout.createSequentialGroup()
                                        .addGroup(PendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(PendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(PendaftaranLayout.createSequentialGroup()
                                                .addComponent(txtIdPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addComponent(MohonMasukanData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(180, 180, 180))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PendaftaranLayout.createSequentialGroup()
                            .addComponent(btnSimpanData)
                            .addGap(275, 278, Short.MAX_VALUE)
                            .addComponent(btnSelanjutnya)
                            .addGap(72, 72, 72)))
                    .addGroup(PendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnKeluar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PendaftaranLayout.setVerticalGroup(
            PendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PendaftaranLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(judul)
                .addGap(52, 52, 52)
                .addComponent(MohonMasukanData)
                .addGap(18, 18, 18)
                .addGroup(PendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(PendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpanData)
                    .addComponent(btnTambahkanData))
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSelanjutnya)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKeluar)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pendaftaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pendaftaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanDataActionPerformed
        // TODO add your handling code here:

        try {

            String sql = "INSERT INTO Pembeli VALUES ('"+txtNama.getText()+"','"+txtIdPembeli.getText()+"','"+txtAlamat.getText()+"','"+txtNoHp.getText()+"','"+txtEmail.getText()+"')";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Proses Simpan Data Berhasil..:");
            

        }
        catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, "Daftar gagal, karena data tidak terisi semua atau Id_Pembeli sudah digunakan. Harap masukan lagi !");
        }
    }//GEN-LAST:event_btnSimpanDataActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnTambahkanDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahkanDataActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
        txtNama.setFocusable(true);

    }//GEN-LAST:event_btnTambahkanDataActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void btnSelanjutnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelanjutnyaActionPerformed
        // TODO add your handling code here:
        //Hapus tampilan login
        
        Pendaftaran.removeAll();
        Pendaftaran.repaint();
        Pendaftaran.revalidate();
        
        this.dispose(); // mengeluarkan tampilan
        
        TampilanLogin tampilanlogin = new TampilanLogin ();
        tampilanlogin.setVisible(true);
        
    }//GEN-LAST:event_btnSelanjutnyaActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        
        Pendaftaran.removeAll();
        Pendaftaran.repaint();
        Pendaftaran.revalidate();
        
        this.dispose(); // mengeluarkan tampilan
        
        TampilanLoginAdmin tampilanloginadmin = new TampilanLoginAdmin ();
        tampilanloginadmin.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TampilanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilanAwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MohonMasukanData;
    private javax.swing.JPanel Pendaftaran;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSelanjutnya;
    private javax.swing.JButton btnSimpanData;
    private javax.swing.JButton btnTambahkanData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel judul;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdPembeli;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoHp;
    // End of variables declaration//GEN-END:variables
}
