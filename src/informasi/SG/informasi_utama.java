/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informasi.SG;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import static informasi.SG.konek.konekDB;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pungki
 */
public class informasi_utama extends javax.swing.JFrame {
    //private Object tabelInformasi;
    
    private void kosongkan_form () {
        isi_idSG.setEditable(true);
        isi_tgl.setText(null);
        isi_waktu.setText(null);
        isi_tempat.setText(null);
        isi_pemateri.setText(null);
        isi_korum.setText(null);
        
    }
    
    private  void tampilkan_data (){
        DefaultTableModel model = new DefaultTableModel ();
        model.addColumn ("ID SG");
        model.addColumn ("Tanggal");
        model.addColumn ("Waktu");
        model.addColumn ("Tempat");
        model.addColumn ("Pemateri");
        model.addColumn ("Kuota Forum");
    
        try { 
            int no = 1;
            String sql = "SELECT * FROM info_sg";
            java.sql.Connection conn = (Connection)konek.konekDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery (sql);
            
            while(res.next()){
            model.addRow(new Object [] {res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});        
        }
      //  tabelInformasi.setModel (model);
            
        }catch (SQLException e ){
            System.out.println("ERROR " + e.getMessage());
        }
    }
    
    

    /**
     * Creates new form informasi_utama
     */
    public informasi_utama() {
        initComponents();
        tampilkan_data ();
        kosongkan_form ();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        kolom_idSG = new javax.swing.JLabel();
        kolom_tgl = new javax.swing.JLabel();
        kolom_waktu = new javax.swing.JLabel();
        kolom_tempat = new javax.swing.JLabel();
        kolom_pemateri = new javax.swing.JLabel();
        kolom_korum = new javax.swing.JLabel();
        isi_idSG = new javax.swing.JTextField();
        isi_tgl = new javax.swing.JTextField();
        isi_waktu = new javax.swing.JTextField();
        isi_tempat = new javax.swing.JTextField();
        isi_pemateri = new javax.swing.JTextField();
        isi_korum = new javax.swing.JTextField();
        tb_tambah = new javax.swing.JButton();
        tb_Hapus = new javax.swing.JButton();
        tb_Edit = new javax.swing.JButton();
        tb_Simpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        info_sg = new javax.swing.JTable();
        tb_Keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("INFORMASI STADIUM GENERAL");

        kolom_idSG.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        kolom_idSG.setText("ID Stadium General");

        kolom_tgl.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        kolom_tgl.setText("Tanggal");

        kolom_waktu.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        kolom_waktu.setText("Waktu");

        kolom_tempat.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        kolom_tempat.setText("Tempat");

        kolom_pemateri.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        kolom_pemateri.setText("Pemateri");

        kolom_korum.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        kolom_korum.setText("Kuota Forum");

        isi_idSG.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        isi_idSG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isi_idSGActionPerformed(evt);
            }
        });

        isi_tgl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        isi_waktu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        isi_waktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isi_waktuActionPerformed(evt);
            }
        });

        isi_tempat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        isi_tempat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isi_tempatActionPerformed(evt);
            }
        });

        isi_pemateri.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        isi_korum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tb_tambah.setFont(new java.awt.Font("Myriad Pro Light", 1, 12)); // NOI18N
        tb_tambah.setText("Tambah Data");
        tb_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_tambahActionPerformed(evt);
            }
        });

        tb_Hapus.setFont(new java.awt.Font("Myriad Pro Light", 1, 12)); // NOI18N
        tb_Hapus.setText("Hapus");
        tb_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_HapusActionPerformed(evt);
            }
        });

        tb_Edit.setFont(new java.awt.Font("Myriad Pro Light", 1, 12)); // NOI18N
        tb_Edit.setText("Edit");
        tb_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_EditActionPerformed(evt);
            }
        });

        tb_Simpan.setFont(new java.awt.Font("Myriad Pro Light", 1, 12)); // NOI18N
        tb_Simpan.setText("Simpan");
        tb_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_SimpanActionPerformed(evt);
            }
        });

        info_sg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID SG", "Tanggal", "Waktu", "Tempat", "Pemateri", "Kuota Forum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        info_sg.setToolTipText("");
        jScrollPane1.setViewportView(info_sg);

        tb_Keluar.setFont(new java.awt.Font("Myriad Pro Light", 1, 12)); // NOI18N
        tb_Keluar.setText("Keluar");
        tb_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_KeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kolom_pemateri)
                                    .addComponent(kolom_korum)
                                    .addComponent(kolom_tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(kolom_waktu)
                                        .addComponent(kolom_tempat))))
                            .addComponent(kolom_idSG, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(isi_korum)
                            .addComponent(isi_pemateri)
                            .addComponent(isi_tempat)
                            .addComponent(isi_waktu)
                            .addComponent(isi_tgl)
                            .addComponent(isi_idSG, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(168, 168, 168))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(tb_tambah)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tb_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(tb_Simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(tb_Keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(tb_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(564, 564, 564))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isi_idSG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(isi_tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(isi_waktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kolom_idSG, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(kolom_tgl)
                                .addGap(28, 28, 28)
                                .addComponent(kolom_waktu)
                                .addGap(18, 18, 18)
                                .addComponent(kolom_tempat)))
                        .addGap(24, 24, 24)
                        .addComponent(kolom_pemateri, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(isi_tempat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(isi_pemateri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isi_korum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kolom_korum))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_Simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_Keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_tambahActionPerformed
        // TODO add your handling code here:
        kosongkan_form ();
    }//GEN-LAST:event_tb_tambahActionPerformed

    private void tb_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_HapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_HapusActionPerformed

    private void isi_idSGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isi_idSGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isi_idSGActionPerformed

    private void isi_waktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isi_waktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isi_waktuActionPerformed

    private void isi_tempatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isi_tempatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isi_tempatActionPerformed

    private void tb_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_KeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tb_KeluarActionPerformed

    private void tb_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_EditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_EditActionPerformed

    private void tb_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_SimpanActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "INSERT INTO info_sg VALUES ('" + isi_idSG.getText()+"','"+isi_tgl.getText()+"','"+
                    isi_waktu.getText()+"','"+isi_tempat.getText()+"','"+isi_tempat.getText()+"','"+
                    isi_pemateri.getText()+"','"+isi_korum.getText()+"')";
        java.sql.Connection conn = (Connection)konek.konekDB();
        java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.execute ();
        JOptionPane.showMessageDialog(null, "Proses simpan Data Berhasil..");
        tampilkan_data();
        kosongkan_form();
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_tb_SimpanActionPerformed

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
            java.util.logging.Logger.getLogger(informasi_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(informasi_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(informasi_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(informasi_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new informasi_utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable info_sg;
    private javax.swing.JTextField isi_idSG;
    private javax.swing.JTextField isi_korum;
    private javax.swing.JTextField isi_pemateri;
    private javax.swing.JTextField isi_tempat;
    private javax.swing.JTextField isi_tgl;
    private javax.swing.JTextField isi_waktu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kolom_idSG;
    private javax.swing.JLabel kolom_korum;
    private javax.swing.JLabel kolom_pemateri;
    private javax.swing.JLabel kolom_tempat;
    private javax.swing.JLabel kolom_tgl;
    private javax.swing.JLabel kolom_waktu;
    private javax.swing.JButton tb_Edit;
    private javax.swing.JButton tb_Hapus;
    private javax.swing.JButton tb_Keluar;
    private javax.swing.JButton tb_Simpan;
    private javax.swing.JButton tb_tambah;
    // End of variables declaration//GEN-END:variables
}