/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InpisView;

import javax.swing.JOptionPane;
import InpisController.ControlMaster;
import InpisModel.Personil;
import inpis.UI_Edit_Istri;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author amazingharry95
 */
public class UI_Edit_Personil extends javax.swing.JFrame {
    UI_Edit_Istri jtRowDataIstri = new UI_Edit_Istri();

    /**
     * Creates new form UI_Edit_Personil
     */
    public UI_Edit_Personil() {
        initComponents();
    }
    
    ControlMaster controlMaster = new ControlMaster();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField23 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField_Nama = new javax.swing.JTextField();
        jTextField_Pangkat = new javax.swing.JTextField();
        jTextField_Korps = new javax.swing.JTextField();
        jTextField_NRP = new javax.swing.JTextField();
        jTextField_Jabatan = new javax.swing.JTextField();
        jTextField_TamatJabatan = new javax.swing.JTextField();
        jTextField_TamatTNI = new javax.swing.JTextField();
        jTextField_TamatPangkatPertama = new javax.swing.JTextField();
        jTextField_TamatPangkatTerakhir = new javax.swing.JTextField();
        jTextField_TempatLahir = new javax.swing.JTextField();
        jTextField_TanggalLahir = new javax.swing.JTextField();
        jTextField_PendidikanUmum = new javax.swing.JTextField();
        jTextField_PendidikanMiliter = new javax.swing.JTextField();
        jTextField_Agama = new javax.swing.JTextField();
        jTextField_GolonganDarah = new javax.swing.JTextField();
        jTextField_NoKTA = new javax.swing.JTextField();
        jTextField_NoASABRI = new javax.swing.JTextField();
        jTextField_NoBPJS = new javax.swing.JTextField();
        jTextField_NoNPWP = new javax.swing.JTextField();
        jTextField_Alamat = new javax.swing.JTextField();
        jTextField_StatusRumah = new javax.swing.JTextField();
        jTextField_NoTelpon = new javax.swing.JTextField();
        jTextField_StatusKeluarga = new javax.swing.JTextField();
        jTextField_Istri = new javax.swing.JTextField();
        jTextField_Anak = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        lihatIstri = new javax.swing.JButton();

        jTextField23.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("EDIT PERSONIL");

        jLabel2.setText("NAMA");

        jLabel3.setText("PANGKAT");

        jLabel4.setText("KORPS");

        jLabel5.setText("NRP");

        jLabel6.setText("JABATAN");

        jLabel7.setText("TAMAT JABATAN");

        jLabel8.setText("TAMAT TNI");

        jLabel9.setText("TAMAT PANGKAT PERTAMA");

        jLabel10.setText("TAMAT PANGKAT TERAKHIR");

        jLabel11.setText("TEMPAT LAHIR");

        jLabel12.setText("TANGGAL LAHIR");

        jLabel13.setText("PENDIDIKAN UMUM");

        jLabel14.setText("PENDIDIKAN MILITER");

        jLabel15.setText("AGAMA");

        jLabel16.setText("GOLONGAN DARAH");

        jLabel17.setText("NOMOR KTA");

        jLabel18.setText("NOMOR ASABRI");

        jLabel19.setText("NOMOR BPJS");

        jLabel20.setText("NOMOR NPWP");

        jLabel21.setText("ALAMAT");

        jLabel22.setText("STATUS RUMAH");

        jLabel23.setText("NOMOR TELPON");

        jLabel24.setText("STATUS KELUARGA");

        jLabel25.setText("NAMA ISTRI");

        jLabel26.setText("NAMA ANAK");

        jTextField_Nama.setText("jTextField1");

        jTextField_Pangkat.setText("jTextField1");

        jTextField_Korps.setText("jTextField1");

        jTextField_NRP.setText("jTextField1");

        jTextField_Jabatan.setText("jTextField1");

        jTextField_TamatJabatan.setText("jTextField1");

        jTextField_TamatTNI.setText("jTextField1");
        jTextField_TamatTNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TamatTNIActionPerformed(evt);
            }
        });

        jTextField_TamatPangkatPertama.setText("jTextField1");

        jTextField_TamatPangkatTerakhir.setText("jTextField1");

        jTextField_TempatLahir.setText("jTextField1");

        jTextField_TanggalLahir.setText("jTextField1");

        jTextField_PendidikanUmum.setText("jTextField1");

        jTextField_PendidikanMiliter.setText("jTextField1");

        jTextField_Agama.setText("jTextField1");

        jTextField_GolonganDarah.setText("jTextField1");

        jTextField_NoKTA.setText("jTextField1");

        jTextField_NoASABRI.setText("jTextField1");

        jTextField_NoBPJS.setText("jTextField1");

        jTextField_NoNPWP.setText("jTextField1");

        jTextField_Alamat.setText("jTextField1");

        jTextField_StatusRumah.setText("jTextField1");

        jTextField_NoTelpon.setText("jTextField1");

        jTextField_StatusKeluarga.setText("jTextField24");

        jTextField_Istri.setText("jTextField24");

        jTextField_Anak.setText("jTextField24");

        jButton2.setText("LIHAT ANAK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonDelete.setBackground(new java.awt.Color(255, 0, 51));
        buttonDelete.setText("DELETE");
        buttonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDeleteMouseClicked(evt);
            }
        });
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        lihatIstri.setText("LIHAT ISTRI");
        lihatIstri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatIstriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_TamatPangkatTerakhir)
                            .addComponent(jTextField_TempatLahir)
                            .addComponent(jTextField_TanggalLahir)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonDelete)
                            .addComponent(jTextField_Nama, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(jTextField_Pangkat)
                            .addComponent(jTextField_Korps)
                            .addComponent(jTextField_NRP)
                            .addComponent(jTextField_Jabatan)
                            .addComponent(jTextField_TamatJabatan)
                            .addComponent(jTextField_TamatTNI)
                            .addComponent(jTextField_TamatPangkatPertama))))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel13))
                .addGap(20, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_PendidikanMiliter, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_PendidikanUmum, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Agama, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_GolonganDarah, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_NoKTA, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_NoASABRI, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_NoBPJS, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_NoNPWP, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_StatusRumah, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_NoTelpon, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lihatIstri)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_Istri, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jTextField_StatusKeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_Anak, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buttonDelete))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel13)
                    .addComponent(jLabel24)
                    .addComponent(jTextField_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_PendidikanUmum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_StatusKeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel14)
                    .addComponent(jLabel25)
                    .addComponent(jTextField_Pangkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_PendidikanMiliter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Istri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel15)
                    .addComponent(jLabel26)
                    .addComponent(jTextField_Korps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Agama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Anak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel16)
                            .addComponent(jTextField_NRP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_GolonganDarah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel17)
                            .addComponent(jTextField_Jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_NoKTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(lihatIstri))))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel18)
                    .addComponent(jTextField_TamatJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_NoASABRI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel19)
                    .addComponent(jTextField_TamatTNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_NoBPJS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel20)
                    .addComponent(jTextField_TamatPangkatPertama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_NoNPWP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel21)
                    .addComponent(jTextField_TamatPangkatTerakhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel22)
                    .addComponent(jTextField_TempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_StatusRumah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel23)
                    .addComponent(jTextField_TanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_NoTelpon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField_TamatTNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TamatTNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TamatTNIActionPerformed

    private void buttonDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDeleteMouseClicked

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus", "Hapus Personil", JOptionPane.YES_NO_OPTION);
        
        if(p==0){
            if(this.controlMaster.deletePersonil(jTextField_NRP.getText()))
                JOptionPane.showMessageDialog(null, "Terhapus");
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void lihatIstriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatIstriActionPerformed
        // TODO add your handling code here:
        try{
            String nrp = jTextField_NRP.getText();
           /*List<String> Istri = new ArrayList<String>();
            Istri = ControlMaster.ambilDataIstrilbyID(nrp);*/
           List<String> Istri = controlMaster.ambilDataIstrilbyID(nrp);
           String lahirIstri = Istri.get(11);
           java.util.Date lahirIstriDate = new SimpleDateFormat("dd-MM-yyyy").parse(lahirIstri);
            
            this.jtRowDataIstri.setVisible(true);
            this.jtRowDataIstri.pack();
            //this.jtRowData.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.jtRowDataIstri.TextField_agama_istri.setText(Istri.get(0));
            this.jtRowDataIstri.TextField_gol_darah_istri.setText(Istri.get(1));
            this.jtRowDataIstri.TextField_hobby_istri.setText(Istri.get(2));
            this.jtRowDataIstri.TextField_kb_istri.setText(Istri.get(3));
            this.jtRowDataIstri.TextField_kpi_istri.setText(Istri.get(4));
            this.jtRowDataIstri.TextField_kta_istri.setText(Istri.get(5));
            this.jtRowDataIstri.TextField_nama_istri.setText(Istri.get(6));
            this.jtRowDataIstri.TextField_nrp_istri.setText(Istri.get(7));
            this.jtRowDataIstri.TextField_pendidikan_terakhir_istri.setText(Istri.get(8));
            this.jtRowDataIstri.TextField_ttl_istri.setText(Istri.get(9));
            this.jtRowDataIstri.hobi_2.setText(Istri.get(10));
            this.jtRowDataIstri.jDateChooser1.setDate(lahirIstriDate);
            
            
            
            
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_lihatIstriActionPerformed

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
            java.util.logging.Logger.getLogger(UI_Edit_Personil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Edit_Personil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Edit_Personil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Edit_Personil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Edit_Personil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField23;
    public javax.swing.JTextField jTextField_Agama;
    public javax.swing.JTextField jTextField_Alamat;
    public javax.swing.JTextField jTextField_Anak;
    public javax.swing.JTextField jTextField_GolonganDarah;
    public javax.swing.JTextField jTextField_Istri;
    public javax.swing.JTextField jTextField_Jabatan;
    public javax.swing.JTextField jTextField_Korps;
    public javax.swing.JTextField jTextField_NRP;
    public javax.swing.JTextField jTextField_Nama;
    public javax.swing.JTextField jTextField_NoASABRI;
    public javax.swing.JTextField jTextField_NoBPJS;
    public javax.swing.JTextField jTextField_NoKTA;
    public javax.swing.JTextField jTextField_NoNPWP;
    public javax.swing.JTextField jTextField_NoTelpon;
    public javax.swing.JTextField jTextField_Pangkat;
    public javax.swing.JTextField jTextField_PendidikanMiliter;
    public javax.swing.JTextField jTextField_PendidikanUmum;
    public javax.swing.JTextField jTextField_StatusKeluarga;
    public javax.swing.JTextField jTextField_StatusRumah;
    public javax.swing.JTextField jTextField_TamatJabatan;
    public javax.swing.JTextField jTextField_TamatPangkatPertama;
    public javax.swing.JTextField jTextField_TamatPangkatTerakhir;
    public javax.swing.JTextField jTextField_TamatTNI;
    public javax.swing.JTextField jTextField_TanggalLahir;
    public javax.swing.JTextField jTextField_TempatLahir;
    private javax.swing.JButton lihatIstri;
    // End of variables declaration//GEN-END:variables
}
