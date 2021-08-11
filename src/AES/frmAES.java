package AES;




import AES.AES;
import UtilFile.UtilFile;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ntnng
 */
public class frmAES extends javax.swing.JFrame {

    /**
     * Creates new form frmMaHoa
     */
    public frmAES() {
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

        txtKey = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        btnMahoa = new javax.swing.JButton();
        btnGiaima = new javax.swing.JButton();
        txtKetqua = new javax.swing.JTextField();
        btnDuongdan = new javax.swing.JButton();
        btnKey = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AES");

        btnMahoa.setText("Mã hoá");
        btnMahoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMahoaActionPerformed(evt);
            }
        });

        btnGiaima.setText("Giải mã");
        btnGiaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaimaActionPerformed(evt);
            }
        });

        btnDuongdan.setText("Chọn File");
        btnDuongdan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuongdanActionPerformed(evt);
            }
        });

        btnKey.setText("Chọn Key");
        btnKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AES");

        jLabel2.setText("Kết quả");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMahoa)
                        .addGap(31, 31, 31)
                        .addComponent(btnGiaima)
                        .addGap(0, 377, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtData)
                                    .addComponent(txtKey))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnKey, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDuongdan, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(txtKetqua, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKey))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDuongdan))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGiaima)
                    .addComponent(btnMahoa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKetqua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMahoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMahoaActionPerformed
        // TODO add your handling code here:
        String key = txtKey.getText();
        String originalString = txtData.getText();
        if(key.length()<=0 || originalString.length()<=0){
               JOptionPane.showMessageDialog(this, "Kiểm tra lại đường dãn file và key.",
                        "Lỗi", JOptionPane.ERROR_MESSAGE);
            }else{
                    byte[] g = new UtilFile().read(originalString);
                    String s=new String(g) ;
                    byte[] h = new UtilFile().read(key);
                    String k=new String(h) ;
                    String encryptedString = AES.encrypt(s, k);
                    txtKetqua.setText(encryptedString);
                    Path path = Paths.get("C:\\temp\\FileDaDuocMaHoa_AES.txt");
                    try {
                        Files.write(path, encryptedString.getBytes());
                    } catch (IOException ex) {
                        Logger.getLogger(frmAES.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(this, "File đã mã hoá được lưu ở C:\\temp\\ ",
                                    "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
       
    }//GEN-LAST:event_btnMahoaActionPerformed

    private void btnGiaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaimaActionPerformed
        // TODO add your handling code here:
        String key = txtKey.getText();
        String originalString = txtData.getText();
        if(key.length()<=0 || originalString.length()<=0){
               JOptionPane.showMessageDialog(this, "Kiểm tra lại đường dãn file và key.",
                        "Lỗi", JOptionPane.ERROR_MESSAGE);
            }else{
                    byte[] g = new UtilFile().read(originalString);
                    String s=new String(g) ;
                    byte[] h = new UtilFile().read(key);
                    String k=new String(h) ;
                    String decryptedString = AES.decrypt(s, k);
                    txtKetqua.setText(decryptedString);
                    Path path = Paths.get("C:\\temp\\FileDaDuocGiaiMa_AES.txt");
                    try {
                        Files.write(path, decryptedString.getBytes());
                    } catch (IOException ex) {
                        Logger.getLogger(frmAES.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(this, "File đã mã hoá được lưu ở C:\\temp\\ ",
                                    "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnGiaimaActionPerformed

    private void btnDuongdanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuongdanActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
            int returnVal = fc.showOpenDialog(frmAES.this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                txtData.setText(file.getPath());
            }
    }//GEN-LAST:event_btnDuongdanActionPerformed

    private void btnKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeyActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
            int returnVal = fc.showOpenDialog(frmAES.this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                txtKey.setText(file.getPath());
            }
    }//GEN-LAST:event_btnKeyActionPerformed

   
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
            java.util.logging.Logger.getLogger(frmAES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDuongdan;
    private javax.swing.JButton btnGiaima;
    private javax.swing.JButton btnKey;
    private javax.swing.JButton btnMahoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtKetqua;
    private javax.swing.JTextField txtKey;
    // End of variables declaration//GEN-END:variables
}
