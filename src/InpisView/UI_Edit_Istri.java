/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InpisView;

import InpisController.ControlMaster;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class UI_Edit_Istri extends javax.swing.JFrame {
    
    ControlMaster controlMaster = new ControlMaster();

    /**
     * Creates new form UI_Ubah_Istri
     */
    public UI_Edit_Istri() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TextField_nama_istri = new javax.swing.JTextField();
        TextField_nrp_istri = new javax.swing.JTextField();
        TextField_hobby_istri = new javax.swing.JTextField();
        TextField_kpi_istri = new javax.swing.JTextField();
        TextField_kta_istri = new javax.swing.JTextField();
        TextField_pendidikan_terakhir_istri = new javax.swing.JTextField();
        TextField_ttl_istri = new javax.swing.JTextField();
        button_simpan_ubah_istri = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        hobi_2 = new javax.swing.JTextField();
        date_tglLahirIstri = new com.toedter.calendar.JDateChooser();
        hapusIstri = new javax.swing.JButton();
        TextField_agama_istri = new javax.swing.JComboBox<>();
        TextField_gol_darah_istri = new javax.swing.JComboBox<>();
        TextField_kb_istri = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1004, 746));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setText("EDIT DATA SUAMI/ISTRI");

        jLabel3.setText("Nama Pasangan :");

        jLabel4.setText("NRP :");

        jLabel5.setText("Agama Pasangan :");

        jLabel6.setText("Golongan Darah Pasangan :");

        jLabel7.setText("Hobby 1 :");

        jLabel8.setText("KPI Pasangan :");

        jLabel9.setText("KTA Jalansenastri :");

        jLabel10.setText("Metode KB :");

        jLabel11.setText("Pendidikan Terakhir Pasangan :");

        jLabel12.setText("Tempat Lahir Pasangan :");

        TextField_nama_istri.setName(""); // NOI18N
        TextField_nama_istri.setPreferredSize(new java.awt.Dimension(220, 20));
        TextField_nama_istri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_nama_istriActionPerformed(evt);
            }
        });

        TextField_nrp_istri.setEditable(false);
        TextField_nrp_istri.setName(""); // NOI18N
        TextField_nrp_istri.setPreferredSize(new java.awt.Dimension(220, 20));

        TextField_hobby_istri.setName(""); // NOI18N
        TextField_hobby_istri.setPreferredSize(new java.awt.Dimension(220, 20));

        TextField_kpi_istri.setName(""); // NOI18N
        TextField_kpi_istri.setPreferredSize(new java.awt.Dimension(220, 20));
        TextField_kpi_istri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_kpi_istriActionPerformed(evt);
            }
        });

        TextField_kta_istri.setName(""); // NOI18N
        TextField_kta_istri.setPreferredSize(new java.awt.Dimension(220, 20));
        TextField_kta_istri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_kta_istriActionPerformed(evt);
            }
        });

        TextField_pendidikan_terakhir_istri.setName(""); // NOI18N
        TextField_pendidikan_terakhir_istri.setPreferredSize(new java.awt.Dimension(220, 20));

        TextField_ttl_istri.setName(""); // NOI18N
        TextField_ttl_istri.setPreferredSize(new java.awt.Dimension(220, 20));

        button_simpan_ubah_istri.setText("Simpan");
        button_simpan_ubah_istri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_simpan_ubah_istriActionPerformed(evt);
            }
        });

        jLabel13.setText("Tanggal Lahir Pasangan :");

        jLabel14.setText("Hobby 2 : ");

        hobi_2.setName(""); // NOI18N
        hobi_2.setPreferredSize(new java.awt.Dimension(220, 20));

        date_tglLahirIstri.setMinimumSize(new java.awt.Dimension(6, 20));
        date_tglLahirIstri.setName(""); // NOI18N
        date_tglLahirIstri.setPreferredSize(new java.awt.Dimension(220, 20));

        hapusIstri.setBackground(new java.awt.Color(255, 51, 51));
        hapusIstri.setText("HAPUS");
        hapusIstri.setMaximumSize(new java.awt.Dimension(65, 30));
        hapusIstri.setMinimumSize(new java.awt.Dimension(65, 30));
        hapusIstri.setPreferredSize(null);
        hapusIstri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusIstriMouseClicked(evt);
            }
        });

        TextField_agama_istri.setEditable(true);
        TextField_agama_istri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "-", "Islam", "Kristen", "Katolik", "Hindu", "Budha" }));

        TextField_gol_darah_istri.setEditable(true);
        TextField_gol_darah_istri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "-", "A", "B", "AB", "O", " " }));

        TextField_kb_istri.setEditable(true);
        TextField_kb_istri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "IUP", "PIL", "SUNIK", "WOW", "MOP", "KONDOM", "SUSUK", "SPIRAL" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(date_tglLahirIstri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextField_ttl_istri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextField_pendidikan_terakhir_istri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextField_kpi_istri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hobi_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(hapusIstri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(button_simpan_ubah_istri)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextField_hobby_istri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextField_nrp_istri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextField_nama_istri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextField_agama_istri, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextField_gol_darah_istri, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextField_kta_istri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextField_kb_istri, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hapusIstri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_nama_istri, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_nrp_istri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextField_agama_istri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TextField_gol_darah_istri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_hobby_istri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(hobi_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TextField_kpi_istri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TextField_kta_istri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TextField_kb_istri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TextField_pendidikan_terakhir_istri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TextField_ttl_istri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(date_tglLahirIstri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(button_simpan_ubah_istri)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TextField_nama_istriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_nama_istriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_nama_istriActionPerformed

    private void button_simpan_ubah_istriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_simpan_ubah_istriActionPerformed
        // TODO add your handling code here:
        Format formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date tanggalLahirIstri = this.date_tglLahirIstri.getDate();
        String tglLahirIstri = formatter.format(tanggalLahirIstri);
        
        String KPIIstri = TextField_kpi_istri.getText();
        String KTAJalasenastri = TextField_kta_istri.getText();
        String NRP = TextField_nrp_istri.getText();
        String agamaIstri = TextField_agama_istri.getSelectedItem().toString();
        String golDarahIstri = TextField_gol_darah_istri.getSelectedItem().toString();
        String hobi1 = TextField_hobby_istri.getText();
        String hobi2 = hobi_2.getText();
        String metodeKb = TextField_kb_istri.getSelectedItem().toString();
        String namaIstri = TextField_nama_istri.getText();
        String penTerakhirIstri = TextField_pendidikan_terakhir_istri.getText();
        String tmptLahirIstri = TextField_ttl_istri.getText();
        //Date tglLahirIstri = date_tglLahirIstri.getDate();
//        DateFormat fmt = new SimpleDateFormat("dd MMMM yyyy");
       // String tglLahirIstri = fmt.format(this.jDateChooser1.getDate());
        int p = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menyimpan edit", "Edit Pasangan", JOptionPane.YES_NO_OPTION);
        
        if(p==0){
            if(this.controlMaster.EditIstriData(NRP, agamaIstri, golDarahIstri, KPIIstri, KTAJalasenastri, metodeKb, penTerakhirIstri, tmptLahirIstri, namaIstri, tglLahirIstri, hobi1, hobi2)==1)
                JOptionPane.showMessageDialog(null, "Berhasil Edit");
        }
        this.dispose();
    }//GEN-LAST:event_button_simpan_ubah_istriActionPerformed

    private void TextField_kpi_istriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_kpi_istriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_kpi_istriActionPerformed

    private void TextField_kta_istriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_kta_istriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_kta_istriActionPerformed

    private void hapusIstriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusIstriMouseClicked
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus pasangan personil", "Hapus Istri", JOptionPane.YES_NO_OPTION);
        
        if(p==0){
            if(this.controlMaster.deleteIstri(TextField_nrp_istri.getText()))
                JOptionPane.showMessageDialog(null, "Terhapus");
        }
        this.dispose();
    }//GEN-LAST:event_hapusIstriMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI_Edit_Istri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Edit_Istri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Edit_Istri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Edit_Istri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Edit_Istri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> TextField_agama_istri;
    public javax.swing.JComboBox<String> TextField_gol_darah_istri;
    public javax.swing.JTextField TextField_hobby_istri;
    public javax.swing.JComboBox<String> TextField_kb_istri;
    public javax.swing.JTextField TextField_kpi_istri;
    public javax.swing.JTextField TextField_kta_istri;
    public javax.swing.JTextField TextField_nama_istri;
    public javax.swing.JTextField TextField_nrp_istri;
    public javax.swing.JTextField TextField_pendidikan_terakhir_istri;
    public javax.swing.JTextField TextField_ttl_istri;
    private javax.swing.JButton button_simpan_ubah_istri;
    public com.toedter.calendar.JDateChooser date_tglLahirIstri;
    private javax.swing.JButton hapusIstri;
    public javax.swing.JTextField hobi_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
