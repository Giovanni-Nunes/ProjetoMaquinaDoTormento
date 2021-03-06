/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

/**
 *
 * @author Java
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemEmpresa = new javax.swing.JMenuItem();
        jMenuItemFuncionario = new javax.swing.JMenuItem();
        jMenuOrcamento = new javax.swing.JMenu();
        jMenuItemCadastroOrcamento = new javax.swing.JMenuItem();
        jMenuOrdemDeServico = new javax.swing.JMenu();
        jMenuItemPesquisaOS = new javax.swing.JMenuItem();
        jMenuPecas = new javax.swing.JMenu();
        jMenuItemCadastrarPecas = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastro.png"))); // NOI18N
        jMenuCadastro.setText("CADASTRO   |");

        jMenuItemCliente.setText("CLIENTE");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCliente);

        jMenuItemEmpresa.setText("EMPRESA");
        jMenuCadastro.add(jMenuItemEmpresa);

        jMenuItemFuncionario.setText("FUNCION??RIO");
        jMenuCadastro.add(jMenuItemFuncionario);

        jMenuBar1.add(jMenuCadastro);

        jMenuOrcamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/orcamento_32.png"))); // NOI18N
        jMenuOrcamento.setText("OR??AMENTO   |");

        jMenuItemCadastroOrcamento.setText("CADASTRAR OR??AMENTO");
        jMenuItemCadastroOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroOrcamentoActionPerformed(evt);
            }
        });
        jMenuOrcamento.add(jMenuItemCadastroOrcamento);

        jMenuBar1.add(jMenuOrcamento);

        jMenuOrdemDeServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/os21.png"))); // NOI18N
        jMenuOrdemDeServico.setText("ORDEM DE SERVI??O   |");

        jMenuItemPesquisaOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jMenuItemPesquisaOS.setText("O.S. PESQUISA");
        jMenuOrdemDeServico.add(jMenuItemPesquisaOS);

        jMenuBar1.add(jMenuOrdemDeServico);

        jMenuPecas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pe??as.png"))); // NOI18N
        jMenuPecas.setText("PE??AS   |");

        jMenuItemCadastrarPecas.setText("CADASTRAR PE??AS");
        jMenuItemCadastrarPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarPecasActionPerformed(evt);
            }
        });
        jMenuPecas.add(jMenuItemCadastrarPecas);

        jMenuBar1.add(jMenuPecas);

        jMenuRelatorio.setText("RELAT??RIOS   |");
        jMenuBar1.add(jMenuRelatorio);

        jMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair.png"))); // NOI18N
        jMenuSair.setText("SAIR");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastroOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroOrcamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCadastroOrcamentoActionPerformed

    private void jMenuItemCadastrarPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarPecasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCadastrarPecasActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        // TODO add your handling code here:
        CadastroCliente cadcliente = new CadastroCliente();

        cadcliente.setVisible(true);
        dispose();

    }//GEN-LAST:event_jMenuItemClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemCadastrarPecas;
    private javax.swing.JMenuItem jMenuItemCadastroOrcamento;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemEmpresa;
    private javax.swing.JMenuItem jMenuItemFuncionario;
    private javax.swing.JMenuItem jMenuItemPesquisaOS;
    private javax.swing.JMenu jMenuOrcamento;
    private javax.swing.JMenu jMenuOrdemDeServico;
    private javax.swing.JMenu jMenuPecas;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}
