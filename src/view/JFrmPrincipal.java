/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

<<<<<<< HEAD
import view.JDlgUsuariosNovo;
import view.JDlgFornecedorNovo;
import view.JDlgProduto;
import view.JDlgTipo;;
=======
>>>>>>> 69a4caa (provinha enviada)

/**
 *
 * @author u09219761190
 */
public class JFrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFrmPrincipal
     */
    public JFrmPrincipal() {
        initComponents();
        setTitle("Sistema de Compra e venda");
        setExtendedState(MAXIMIZED_BOTH);
        
    
    }

    JFrmPrincipal(JFrmLogin aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMnuCadastros = new javax.swing.JMenu();
        jMnuUsuarios = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMnuSair = new javax.swing.JMenuItem();
        jMnuMovimentos = new javax.swing.JMenu();
        jMnuVendas = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMnuCadastros.setMnemonic('U');
        jMnuCadastros.setText("Cadastros");

        jMnuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMnuUsuarios.setText("Usuarios");
        jMnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUsuariosActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuUsuarios);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produto.png"))); // NOI18N
        jMenuItem2.setText("Produto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMenuItem2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-produto-30.png"))); // NOI18N
        jMenuItem4.setText("Tipo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-fornecedor-30.png"))); // NOI18N
        jMenuItem5.setText("Fornecedor");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMenuItem5);
        jMnuCadastros.add(jSeparator1);

        jMnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        jMnuSair.setMnemonic('S');
        jMnuSair.setText("Sair");
        jMnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSairActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuSair);

        jMenuBar1.add(jMnuCadastros);

        jMnuMovimentos.setText("Movimentos");

        jMnuVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMnuVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-mega-sales-30.png"))); // NOI18N
        jMnuVendas.setText("Vendas");
        jMnuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVendasActionPerformed(evt);
            }
        });
        jMnuMovimentos.add(jMnuVendas);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-sucesso-do-carrinho-de-compras-30.png"))); // NOI18N
        jMenuItem3.setText("Compra");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMnuMovimentos.add(jMenuItem3);

        jMenuBar1.add(jMnuMovimentos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSairActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_jMnuSairActionPerformed

    private void jMnuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMnuVendasActionPerformed

    private void jMnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuariosActionPerformed
        // TODO add your handling code here:
<<<<<<< HEAD
        JDlgUsuariosNovo jDlgUsuariosNovo = new JDlgUsuariosNovo(this, true);
        jDlgUsuariosNovo.setVisible(true);
=======
        JDlgUsuario jDlgUsuario = new JDlgUsuario(this, true);
        jDlgUsuario.setVisible(true);
>>>>>>> 69a4caa (provinha enviada)
    }//GEN-LAST:event_jMnuUsuariosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
<<<<<<< HEAD
        JDlgProduto jDlgProduto = new JDlgProduto(this, true);
        jDlgProduto.setVisible(true);
=======
        JDlgProdutoNovo jDlgProdutoNovo = new JDlgProdutoNovo(this, true);
        jDlgProdutoNovo.setVisible(true);
>>>>>>> 69a4caa (provinha enviada)
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
<<<<<<< HEAD
        JDlgTipo jDlgTipo = new JDlgTipo(this, true);
        jDlgTipo.setVisible(true);
=======
        JDlgTipoNovo jlgTipoNovo = new JDlgTipoNovo(this, true);
        jlgTipoNovo.setVisible(true);
>>>>>>> 69a4caa (provinha enviada)
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
<<<<<<< HEAD
        JDlgFornecedorNovo jDlgFornecedorNovo = new JDlgFornecedorNovo(this, true);
        jDlgFornecedorNovo.setVisible(true);
=======
        JDlgFornecedor1 jDlgFornecedor1 = new JDlgFornecedor1(this, true);
        jDlgFornecedor1.setVisible(true);
>>>>>>> 69a4caa (provinha enviada)
         
                        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu jMnuCadastros;
    private javax.swing.JMenu jMnuMovimentos;
    private javax.swing.JMenuItem jMnuSair;
    private javax.swing.JMenuItem jMnuUsuarios;
    private javax.swing.JMenuItem jMnuVendas;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
