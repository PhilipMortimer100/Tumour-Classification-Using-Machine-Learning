/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aitumourclasification;

import javax.swing.JOptionPane;

/**
 *
 * @author mortimer
 */
public class MenuUI extends javax.swing.JFrame {

    /**
     * Creates new form MenuUI
     */
    NeuralNetwork ne;

    public MenuUI(){
        initComponents();
        jTextArea1.setText("Please note: This may take a while to load once start has been pressed. Please be patient, it will load."+
                System.lineSeparator()+" This project also requires a large amount of system memory so it may be possible that your system does not"+
                System.lineSeparator()+" have enough memory (RAM) available to run the application. It requires about 1800 MB of RAM. Note: the system "+
                System.lineSeparator()+" takes around 45 seconds to load and may need two or three minutes, depending on the speed of the device you have."
        +System.lineSeparator()+" Please press the start button to start loading the system."+System.lineSeparator()
        +"This sytem achieves an accuracy of 82.6 percent, outperfroming dermatoligsts, who perform at between 65% and 80% accuracy- according to: "
        +System.lineSeparator()+"( G. Argenziano and H. P. Soyer, 'Dermoscopy of pigmented skin lesions–a valuable tool for early diagnosis of melanoma,' The Lancet Oncology, vol. 2, no. 7, pp. 443–449, 2001.) "
        +System.lineSeparator()+"This piece also outperforms some recent state-of-the art attempts using the datset, which achieve a slightly lower accuracy (typically about 79%),"+System.lineSeparator()+" although it is less accurate than the latest state of the art systems (which achieve about 93 percent accuracy)."
        +System.lineSeparator()+" The most notable state-of-the art systems are highlighted in Table 6 of 'Convolutional Neural Networks for Classifying Melanoma Images' by Sagar and Jacob. This system "
        +System.lineSeparator()+" outperforms state of the art attemtps from 2016 and 2017 and medical professionals."+
                System.lineSeparator()+" My system could be further improved by using a convolutional neural network.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manualBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        manualBtn.setText("Start");
        manualBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(527, 527, 527)
                .addComponent(manualBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 1093, Short.MAX_VALUE)
                        .addComponent(exitBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(manualBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(exitBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void manualBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualBtnActionPerformed
        // TODO add your handling code here:
               this.dispose();
        this.setVisible(false);
        Visualisation man = new Visualisation();
        man.setVisible(true);
        man.begin(ne);
    }//GEN-LAST:event_manualBtnActionPerformed
public void init(NeuralNetwork net){
    this.ne=net;
    this.getRootPane().setDefaultButton(manualBtn);
}
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
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton manualBtn;
    // End of variables declaration//GEN-END:variables
}
