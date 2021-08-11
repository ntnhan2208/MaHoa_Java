package RSA;

import RSA.RSA;
import UtilFile.UtilFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ntnng
 */
public class frmRSA extends javax.swing.JFrame {

   
    public frmRSA() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTaoKey = new javax.swing.JButton();
        txtKey1 = new javax.swing.JTextField();
        btnChonkey1 = new javax.swing.JButton();
        btnChonData1 = new javax.swing.JButton();
        txtData1 = new javax.swing.JTextField();
        btnMahoa = new javax.swing.JButton();
        btnChonkey2 = new javax.swing.JButton();
        btnChonData2 = new javax.swing.JButton();
        txtKey2 = new javax.swing.JTextField();
        txtData2 = new javax.swing.JTextField();
        btnGiaima = new javax.swing.JButton();
        RSA = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RSA");

        btnTaoKey.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnTaoKey.setText("Tạo Key");
        btnTaoKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoKeyActionPerformed(evt);
            }
        });

        btnChonkey1.setText("Chọn Private Key");
        btnChonkey1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonkey1ActionPerformed(evt);
            }
        });

        btnChonData1.setText("Chọn file muốn mã hoá");
        btnChonData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonData1ActionPerformed(evt);
            }
        });

        btnMahoa.setText("Mã hoá");
        btnMahoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMahoaActionPerformed(evt);
            }
        });

        btnChonkey2.setText("Chọn Public Key");
        btnChonkey2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonkey2ActionPerformed(evt);
            }
        });

        btnChonData2.setText("Chọn file cần giải mã");
        btnChonData2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonData2ActionPerformed(evt);
            }
        });

        btnGiaima.setText("Giải mã");
        btnGiaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaimaActionPerformed(evt);
            }
        });

        RSA.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RSA.setForeground(new java.awt.Color(255, 51, 0));
        RSA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RSA.setText("RSA");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Phần dành cho mã hoá file");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Phần dành cho giải mã file");

        jLabel3.setText("*Tạo Private Key và Public Key ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTaoKey, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMahoa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGiaima, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKey1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(txtData1)
                            .addComponent(txtKey2)
                            .addComponent(txtData2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnChonData2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnChonkey2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnChonData1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnChonkey1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addComponent(RSA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RSA)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaoKey, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKey1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChonkey1))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChonData1))
                .addGap(37, 37, 37)
                .addComponent(btnMahoa, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKey2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChonkey2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChonData2))
                .addGap(18, 18, 18)
                .addComponent(btnGiaima, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaoKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoKeyActionPerformed
        RSAKeyGen rsa = null;
        try {
            rsa = new RSAKeyGen(1024);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(frmRSA.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            
            rsa.writeKeyToFile("C:/temp/");
            JOptionPane.showMessageDialog(this, "PrivateKey và PublicKey được lưu ở C:\\temp\\ ",
                                    "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(frmRSA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTaoKeyActionPerformed

    private void btnChonkey1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonkey1ActionPerformed
       JFileChooser fc = new JFileChooser();
            int returnVal = fc.showOpenDialog(frmRSA.this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                txtKey1.setText(file.getPath());
            }
    }//GEN-LAST:event_btnChonkey1ActionPerformed

    private void btnChonData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonData1ActionPerformed
       JFileChooser fc = new JFileChooser();
            int returnVal = fc.showOpenDialog(frmRSA.this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                txtData1.setText(file.getPath());
            }
    }//GEN-LAST:event_btnChonData1ActionPerformed

    private void btnMahoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMahoaActionPerformed
        String d=txtData1.getText();
        String pbk=txtKey1.getText();
        byte[] d1a=new UtilFile().read(d);
        String d1b=new String(d1a);
        try {
           
            PrivateKey privateKey=new RSA().readPrivateKeyFromFile(pbk);
            String cipherText = new RSA().encryptText(d1b, privateKey);
            Path path = Paths.get("C:\\temp\\FileDaDuocMaHoa_RSA.txt");
                    try {
                        Files.write(path, cipherText.getBytes());
                    } catch (IOException ex) {
                        Logger.getLogger(frmRSA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(this, "File đã mã hoá được lưu ở C:\\temp\\ ",
                                    "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(frmRSA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(frmRSA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(frmRSA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(frmRSA.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_btnMahoaActionPerformed

    private void btnChonkey2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonkey2ActionPerformed
            JFileChooser fc = new JFileChooser();
            int returnVal = fc.showOpenDialog(frmRSA.this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                txtKey2.setText(file.getPath());
            }
    }//GEN-LAST:event_btnChonkey2ActionPerformed

    private void btnChonData2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonData2ActionPerformed
       JFileChooser fc = new JFileChooser();
            int returnVal = fc.showOpenDialog(frmRSA.this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                txtData2.setText(file.getPath());
            }
    }//GEN-LAST:event_btnChonData2ActionPerformed

    private void btnGiaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaimaActionPerformed
        String d=txtData2.getText();
        String pbk=txtKey2.getText();
        byte[] d2a=new UtilFile().read(d);
        String d2b=new String(d2a);
        try {
            PublicKey publicKey=new RSA().readPublicKeyFromFile(pbk);
            try {
                String decryptedText= new RSA().decryptText(d2b, publicKey);
                Path path = Paths.get("C:\\temp\\FileDaDuocGiaiMa_RSA.txt");
                    try {
                        Files.write(path, decryptedText.getBytes());
                    } catch (IOException ex) {
                        Logger.getLogger(frmRSA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(this, "File đã mã hoá được lưu ở C:\\temp\\ ",
                                    "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                Logger.getLogger(frmRSA.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(frmRSA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(frmRSA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(frmRSA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGiaimaActionPerformed

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
            java.util.logging.Logger.getLogger(frmRSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRSA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RSA;
    private javax.swing.JButton btnChonData1;
    private javax.swing.JButton btnChonData2;
    private javax.swing.JButton btnChonkey1;
    private javax.swing.JButton btnChonkey2;
    private javax.swing.JButton btnGiaima;
    private javax.swing.JButton btnMahoa;
    private javax.swing.JButton btnTaoKey;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtData1;
    private javax.swing.JTextField txtData2;
    private javax.swing.JTextField txtKey1;
    private javax.swing.JTextField txtKey2;
    // End of variables declaration//GEN-END:variables
}
