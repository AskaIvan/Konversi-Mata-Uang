/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertion;

import com.sun.glass.events.KeyEvent;

/**
 *
 * @author MSI CORE I7-PC
 */
public class Frame extends javax.swing.JFrame {
    
    float IDR, USD, EUR, MYR, JPY, SAR, konversikan;
    

    /**
     * Creates new form Frame
     */
    public Frame() {
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

        uang = new javax.swing.JTextField();
        matauang = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idr = new javax.swing.JTextField();
        usd = new javax.swing.JTextField();
        eur = new javax.swing.JTextField();
        jpy = new javax.swing.JTextField();
        myr = new javax.swing.JTextField();
        sar = new javax.swing.JTextField();
        convert = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        uang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uangActionPerformed(evt);
            }
        });
        uang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uangKeyTyped(evt);
            }
        });

        matauang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IDR", "USD", "EUR", "MYR", "JPY", "SAR" }));
        matauang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matauangActionPerformed(evt);
            }
        });

        jLabel1.setText("IDR (Rupiah Indonesia)");

        jLabel2.setText("USD (Dolar Amerika Serikat)");

        jLabel4.setText("EUR (Euro)");

        jLabel6.setText("SAR (Arab Saudi Riyal)");

        jLabel7.setText("JPY (Yen Jepang)");

        jLabel8.setText("MYR (Ringgit Malaysia");

        idr.setEditable(false);
        idr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idrActionPerformed(evt);
            }
        });

        usd.setEditable(false);
        usd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usdActionPerformed(evt);
            }
        });

        eur.setEditable(false);
        eur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eurActionPerformed(evt);
            }
        });

        jpy.setEditable(false);
        jpy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpyActionPerformed(evt);
            }
        });

        myr.setEditable(false);
        myr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myrActionPerformed(evt);
            }
        });

        sar.setEditable(false);
        sar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sarActionPerformed(evt);
            }
        });

        convert.setText("Konversi");
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Konversi Mata Uang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(uang, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(matauang, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(myr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jpy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(usd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(convert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(matauang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(convert, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(eur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(myr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jpy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        setSize(new java.awt.Dimension(321, 401));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sarActionPerformed

    private void myrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myrActionPerformed

    private void jpyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpyActionPerformed

    private void eurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eurActionPerformed

    private void usdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usdActionPerformed

    private void idrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idrActionPerformed

    private void matauangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matauangActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_matauangActionPerformed

    private void uangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uangKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE) || c==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_uangKeyTyped

    private void uangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uangActionPerformed

    private void convertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertActionPerformed
        // TODO add your handling code here:
        konversikan = Float.parseFloat(uang.getText());
        if (matauang.getSelectedItem()=="IDR") {
            idr.setText("");
            usd.setText("");
            eur.setText("");
            myr.setText("");
            jpy.setText("");
            sar.setText("");
            USD = (float) (konversikan * 0.0000753);
            EUR = (float) (konversikan * 0.0000672);
            MYR = (float) (konversikan * 0.000323);
            JPY = (float) (konversikan * 0.01);
            SAR = (float) (konversikan * 0.000283);
            usd.setText("" + USD);
            eur.setText("" + EUR);
            myr.setText("" + MYR);
            jpy.setText("" + JPY);
            sar.setText("" + SAR);
        } else if(matauang.getSelectedItem()=="USD") {
            idr.setText("");
            usd.setText("");
            eur.setText("");
            myr.setText("");
            jpy.setText("");
            sar.setText("");
            IDR = (float) (konversikan * 13280.29);
            EUR = (float) (konversikan * 0.89);
            MYR = (float) (konversikan * 4.28);
            JPY = (float) (konversikan * 111.74);
            SAR = (float) (konversikan * 3.75);
            idr.setText("" + IDR);
            eur.setText("" + EUR);
            myr.setText("" + MYR);
            jpy.setText("" + JPY);
            sar.setText("" + SAR);
        }else if(matauang.getSelectedItem()=="EUR") {
            idr.setText("");
            usd.setText("");
            eur.setText("");
            myr.setText("");
            jpy.setText("");
            sar.setText("");
            IDR = (float) (konversikan * 14888.46);
            USD = (float) (konversikan * 1.12);
            MYR = (float) (konversikan * 4.8);
            JPY = (float) (konversikan * 125.27);
            SAR = (float) (konversikan * 4.21);
            idr.setText("" + IDR);
            usd.setText("" + USD);
            myr.setText("" + MYR);
            jpy.setText("" + JPY);
            sar.setText("" + SAR);
        }else if(matauang.getSelectedItem()=="MYR") {
            idr.setText("");
            usd.setText("");
            eur.setText("");
            myr.setText("");
            jpy.setText("");
            sar.setText("");
            IDR = (float) (konversikan * 3099.43);
            USD = (float) (konversikan * 0.23);
            EUR = (float) (konversikan * 0.21);
            JPY = (float) (konversikan * 26.08);
            SAR = (float) (konversikan * 0.88);
            idr.setText("" + IDR);
            usd.setText("" + USD);
            eur.setText("" + EUR);
            jpy.setText("" + JPY);
            sar.setText("" + SAR);
        }else if(matauang.getSelectedItem()=="JPY") {
            idr.setText("");
            usd.setText("");
            eur.setText("");
            myr.setText("");
            jpy.setText("");
            sar.setText("");
            IDR = (float) (konversikan * 118.85);
            USD = (float) (konversikan * 0.01);
            EUR = (float) (konversikan * 0.01);
            MYR = (float) (konversikan * 0.04);
            SAR = (float) (konversikan * 0.03);
            idr.setText("" + IDR);
            usd.setText("" + USD);
            eur.setText("" + EUR);
            myr.setText("" + MYR);
            sar.setText("" + SAR);
        }else if(matauang.getSelectedItem()=="SAR") {
            idr.setText("");
            usd.setText("");
            eur.setText("");
            myr.setText("");
            jpy.setText("");
            sar.setText("");
            IDR = (float) (konversikan * 3538.41);
            USD = (float) (konversikan * 0.27);
            EUR = (float) (konversikan * 0.24);
            MYR = (float) (konversikan * 1.14);
            JPY = (float) (konversikan * 29.77);
            idr.setText("" + IDR);
            usd.setText("" + USD);
            eur.setText("" + EUR);
            myr.setText("" + MYR);
            jpy.setText("" + JPY);
        }
    }//GEN-LAST:event_convertActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convert;
    private javax.swing.JTextField eur;
    private javax.swing.JTextField idr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jpy;
    private javax.swing.JComboBox<String> matauang;
    private javax.swing.JTextField myr;
    private javax.swing.JTextField sar;
    private javax.swing.JTextField uang;
    private javax.swing.JTextField usd;
    // End of variables declaration//GEN-END:variables
}
