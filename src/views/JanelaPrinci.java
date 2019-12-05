package views;

import java.awt.Color;
import javax.swing.JOptionPane;


public class JanelaPrinci extends javax.swing.JFrame {


    public JanelaPrinci() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1Princi = new javax.swing.JPanel();
        jPanel1DadosEmpresa = new javax.swing.JPanel();
        jLabel1Empresa = new javax.swing.JLabel();
        jLabel7Pendentes = new javax.swing.JLabel();
        jLabel3Finalizados = new javax.swing.JLabel();
        jLabel6Cancelados = new javax.swing.JLabel();
        jPanel1Opts = new javax.swing.JPanel();
        jLabel20Minimizar = new javax.swing.JLabel();
        jLabel21Fechar = new javax.swing.JLabel();
        jPanel1Exibicao = new javax.swing.JPanel();
        jPanelSliderMostrarPaineis = new diu.swe.habib.JPanelSlider.JPanelSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1050, 687));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1050, 687));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1Princi.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1Princi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1DadosEmpresa.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1DadosEmpresa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1Empresa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1Empresa.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1Empresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1Empresa.setText("Empresa");
        jLabel1Empresa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1DadosEmpresa.add(jLabel1Empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel7Pendentes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7Pendentes.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7Pendentes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7Pendentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pendente.png"))); // NOI18N
        jLabel7Pendentes.setText("Pedidos Pendentes");
        jLabel7Pendentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7Pendentes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7Pendentes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel7Pendentes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel7PendentesMouseMoved(evt);
            }
        });
        jLabel7Pendentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7PendentesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7PendentesMouseExited(evt);
            }
        });
        jPanel1DadosEmpresa.add(jLabel7Pendentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 130, 200, 120));

        jLabel3Finalizados.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3Finalizados.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3Finalizados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3Finalizados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/confirmado.png"))); // NOI18N
        jLabel3Finalizados.setText("Pedidos Finalizados");
        jLabel3Finalizados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3Finalizados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3Finalizados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel3Finalizados.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel3FinalizadosMouseMoved(evt);
            }
        });
        jLabel3Finalizados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3FinalizadosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3FinalizadosMouseExited(evt);
            }
        });
        jPanel1DadosEmpresa.add(jLabel3Finalizados, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 320, 190, 120));

        jLabel6Cancelados.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6Cancelados.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6Cancelados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6Cancelados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cancelado.png"))); // NOI18N
        jLabel6Cancelados.setText("Pedidos Cancelados");
        jLabel6Cancelados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6Cancelados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6Cancelados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel6Cancelados.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel6CanceladosMouseMoved(evt);
            }
        });
        jLabel6Cancelados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6CanceladosMouseExited(evt);
            }
        });
        jPanel1DadosEmpresa.add(jLabel6Cancelados, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 510, 190, 120));

        jPanel1Princi.add(jPanel1DadosEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 690));

        jPanel1Opts.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1Opts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel20Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MinimizarMouseClicked(evt);
            }
        });
        jPanel1Opts.add(jLabel20Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));

        jLabel21Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Multiply_32px.png"))); // NOI18N
        jLabel21Fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21FecharMouseClicked(evt);
            }
        });
        jPanel1Opts.add(jLabel21Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        jPanel1Princi.add(jPanel1Opts, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 790, 110));

        jPanel1Exibicao.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1Exibicao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1Exibicao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelSliderMostrarPaineis.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSliderMostrarPaineis.setBorder(null);
        jPanel1Exibicao.add(jPanelSliderMostrarPaineis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 580));

        jPanel1Princi.add(jPanel1Exibicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 790, 580));

        getContentPane().add(jPanel1Princi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//GEN-FIRST:event_jLabel8MouseMoved

//GEN-LAST:event_jLabel8MouseMoved

    private void jLabel20MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MinimizarMouseClicked
        this.setState(JanelaPrinci.ICONIFIED);
    }//GEN-LAST:event_jLabel20MinimizarMouseClicked

    private void jLabel21FecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21FecharMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int res = JOptionPane.showConfirmDialog(null, "REALMENTE DESEJA SAIR?", "SAIR", dialog);
        if (res == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel21FecharMouseClicked

    private void jLabel7PendentesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7PendentesMouseMoved
        jLabel7Pendentes.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel7PendentesMouseMoved

    private void jLabel7PendentesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7PendentesMouseExited
        jLabel7Pendentes.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(204,204,204)));       
    }//GEN-LAST:event_jLabel7PendentesMouseExited

    private void jLabel3FinalizadosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3FinalizadosMouseMoved
        jLabel3Finalizados.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel3FinalizadosMouseMoved

    private void jLabel3FinalizadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3FinalizadosMouseExited
        jLabel3Finalizados.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(204,204,204)));  
    }//GEN-LAST:event_jLabel3FinalizadosMouseExited

    private void jLabel6CanceladosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6CanceladosMouseMoved
        jLabel6Cancelados.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel6CanceladosMouseMoved

    private void jLabel6CanceladosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6CanceladosMouseExited
        jLabel6Cancelados.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(204,204,204)));  
    }//GEN-LAST:event_jLabel6CanceladosMouseExited

    //mostrando area de pedidos pendentes
    private void jLabel7PendentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7PendentesMouseClicked
        ProdutosPendentes pp = new ProdutosPendentes();
        jPanelSliderMostrarPaineis.add(pp);
        jPanelSliderMostrarPaineis.nextPanel(10, pp, rootPaneCheckingEnabled);
    }//GEN-LAST:event_jLabel7PendentesMouseClicked
    //mostrando area de pedidos enviados
    private void jLabel3FinalizadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3FinalizadosMouseClicked
        ProdutosEnviados pe = new ProdutosEnviados();
        jPanelSliderMostrarPaineis.add(pe);
        jPanelSliderMostrarPaineis.nextPanel(10, pe, rootPaneCheckingEnabled);
    }//GEN-LAST:event_jLabel3FinalizadosMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrinci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new JanelaPrinci().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1Empresa;
    private javax.swing.JLabel jLabel20Minimizar;
    private javax.swing.JLabel jLabel21Fechar;
    private javax.swing.JLabel jLabel3Finalizados;
    private javax.swing.JLabel jLabel6Cancelados;
    private javax.swing.JLabel jLabel7Pendentes;
    private javax.swing.JPanel jPanel1DadosEmpresa;
    private javax.swing.JPanel jPanel1Exibicao;
    private javax.swing.JPanel jPanel1Opts;
    private javax.swing.JPanel jPanel1Princi;
    private diu.swe.habib.JPanelSlider.JPanelSlider jPanelSliderMostrarPaineis;
    // End of variables declaration//GEN-END:variables
}
