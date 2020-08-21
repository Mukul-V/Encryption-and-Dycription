
package encryption_decryption;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Encryption_Form extends javax.swing.JFrame {

    JFileChooser jfc,jfc1;
    String s ;
    String key;
    
    public Encryption_Form() 
    {
        initComponents();
        s="";
        key="";
        jfc = new JFileChooser();
        jfc1=new JFileChooser();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtKey = new javax.swing.JPasswordField();
        btnEncrypt = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnEncryptWithoutLibrary = new javax.swing.JButton();
        chkSelect = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 51, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("Encryption Using Advanced Encryption Standard (AES) algorithm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 16, 970, 100));

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Type your Text");

        txtInput.setColumns(20);
        txtInput.setRows(5);
        jScrollPane1.setViewportView(txtInput);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 740, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 116, 970, 460));

        jPanel4.setBackground(new java.awt.Color(204, 51, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setText("Type your key");

        btnEncrypt.setBackground(new java.awt.Color(255, 204, 255));
        btnEncrypt.setText("Encrypt");
        btnEncrypt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEncryptMouseClicked(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });

        btnEncryptWithoutLibrary.setText("Encrypt without Java Library");
        btnEncryptWithoutLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEncryptWithoutLibraryMouseClicked(evt);
            }
        });

        chkSelect.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chkSelect.setForeground(new java.awt.Color(255, 255, 0));
        chkSelect.setText("Select File");
        chkSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(chkSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEncryptWithoutLibrary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEncrypt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKey)
                            .addComponent(btnEncrypt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEncryptWithoutLibrary))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(chkSelect)))
                .addContainerGap())
        );

        jLabel3.getAccessibleContext().setAccessibleName("Type Your Key");

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 574, 970, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncryptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncryptMouseClicked
   
        
        key=txtKey.getText();
        s = txtInput.getText();
        
        if (!(s.equalsIgnoreCase(""))) 
        {
                int opt = JOptionPane.showConfirmDialog(this,"Do u want to save the  data?y/n");
                if (opt == JOptionPane.YES_OPTION)
                {
                        jfc.showSaveDialog(this);
                        try 
                        {
                                FileWriter fw = new FileWriter(jfc.getSelectedFile());
                                String data = txtInput.getText();
                                fw.write(data + "\n");
                                fw.close();
                                
                                
                                File inputFile = new File(jfc.getSelectedFile().getAbsolutePath());
                              //  JOptionPane.showMessageDialog(this, jfc.getSelectedFile().getAbsolutePath(),"Error", JOptionPane.ERROR_MESSAGE);
                                File encryptedFile = new File(jfc.getSelectedFile().getParent()+"\\encrypt.txt");
                                //File decryptedFile = new File("file3.txt");

                                try 
                                {
                                    CryptoUtils.encrypt(key, inputFile, encryptedFile);
                                    JOptionPane.showMessageDialog(this, "Encryption Successfull","Encryption", JOptionPane.ERROR_MESSAGE);
                                } 
                                catch (CryptoException ex)
                                {
                                     JOptionPane.showMessageDialog(this, ex.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
                                }
                        }

                        catch (Exception e) 
                        {
                            JOptionPane.showMessageDialog(this, "Error in write","Error", JOptionPane.ERROR_MESSAGE);
                        }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Please save it","Error", JOptionPane.ERROR_MESSAGE);
                }
        }
        else
        {
             JOptionPane.showMessageDialog(this, "Please enter text","Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEncryptMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
          
        txtKey.setText("");
        txtInput.setText("");
                 
    }//GEN-LAST:event_btnResetMouseClicked

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnEncryptWithoutLibraryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncryptWithoutLibraryMouseClicked
        
        key=txtKey.getText();
        key="1a25s8fe5dsg65ad";
        
        if(chkSelect.isSelected())
        {
            
        }
        else
        {
           // s= txtInput.getText();
        }
        
        

		//	k = "1a25s8fe5dsg65ad";
	
                        
        if (!(s.equalsIgnoreCase(""))) 
        {
                int opt = JOptionPane.showConfirmDialog(this,"Do u want to save the  data?y/n");
                if (opt == JOptionPane.YES_OPTION)
                {
    
                        try 
                        {
                                jfc1.showSaveDialog(this);
                                byte[] enc = AES.encrypt(s.getBytes(), key.getBytes());
                                FileOutputStream fs=new FileOutputStream(jfc1.getSelectedFile());
                                fs.write(enc);
                                fs.close();
                                JOptionPane.showMessageDialog(this, "Encryption Successfull","Encryption", JOptionPane.ERROR_MESSAGE);
                        }
                        catch (Exception e) 
                        {
                            JOptionPane.showMessageDialog(this, "Error in write","Error", JOptionPane.ERROR_MESSAGE);
                        }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Please save it","Error", JOptionPane.ERROR_MESSAGE);
                }
        }
        else
        {
             JOptionPane.showMessageDialog(this, "Please enter text","Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnEncryptWithoutLibraryMouseClicked

    private void chkSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSelectActionPerformed
        // TODO add your handling code here:
        if(chkSelect.isSelected())
        {
            s="";
            jfc.showOpenDialog(this);
            try
            {
                FileInputStream fn = new FileInputStream (jfc.getSelectedFile());
                byte Data;
                while((Data=(byte)fn.read())!=-1)
                {
                    s=s+(char)Data;
                }
                JOptionPane.showMessageDialog(this,s);
             }
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(this, "Error in open","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            s="";
        }
    }//GEN-LAST:event_chkSelectActionPerformed

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
            java.util.logging.Logger.getLogger(Encryption_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encryption_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encryption_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encryption_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encryption_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnEncrypt;
    private javax.swing.JButton btnEncryptWithoutLibrary;
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox chkSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtInput;
    private javax.swing.JPasswordField txtKey;
    // End of variables declaration//GEN-END:variables
}
