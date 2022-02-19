/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package questao.pkg3;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author Tales Mariano
 */
public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalView
     */
    public PrincipalView() {
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

        jLabel1 = new javax.swing.JLabel();
        jTxtPalavra = new javax.swing.JTextField();
        jBtnValida = new javax.swing.JButton();
        jLblInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Digite uma palavra: ");

        jTxtPalavra.setText(" ");
        jTxtPalavra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPalavraActionPerformed(evt);
            }
        });

        jBtnValida.setText("Verificar Anagramas");
        jBtnValida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnValidaActionPerformed(evt);
            }
        });

        jLblInfo.setText("Quantidade encontrada: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtPalavra, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnValida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLblInfo)
                        .addGap(0, 138, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnValida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblInfo)
                .addGap(10, 10, 10))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtPalavraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPalavraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPalavraActionPerformed

    private void jBtnValidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnValidaActionPerformed
        String ent = jTxtPalavra.getText();
        var validate = validateWord(ent);
        if (validate) {
        int q = findSubsstringsPairs(ent);
        jLblInfo.setText("Quantidade: " + String.valueOf(q));
        } else 
            jLblInfo.setText("Palavra deve ter pelo menos 2 digitos");
        
        
    }//GEN-LAST:event_jBtnValidaActionPerformed

    public static int findSubsstringsPairs (String word) {
    HashMap<String, Integer> map = new HashMap<>();
    boolean validate = validateWord(word);
    int aux = 0;
    int d;
    for (int i = 0; i < word.length(); i++) {
        for (int j = i; j < word.length(); j++) {
            char[] currentSub = word.substring(i, j + 1).toCharArray();
            Arrays.sort(currentSub);
            String strSub = new String(currentSub);
            
            if (map.containsKey(strSub)) {
                map.put(strSub, map.get(strSub) + 1);
            } else {
                map.put(strSub, 1);
            }
        }
    }
    for (var key : map.keySet()) {
       d = map.get(String.valueOf(key));
       aux += (d * (d - 1)) / 2;
    }
    return aux;
}
    
    public static boolean validateWord(String word) {
        boolean validate = false;
        if (word.length() > 1)
            validate = true;
        return validate;
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
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnValida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblInfo;
    private javax.swing.JTextField jTxtPalavra;
    // End of variables declaration//GEN-END:variables
}
