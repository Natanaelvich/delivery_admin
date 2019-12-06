package views;

import Dao.UserDao;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class TelaDeLogin extends javax.swing.JFrame {

   public static int idUSER; 
    public TelaDeLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2Login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField1User = new javax.swing.JTextField();
        jLabel3Fechar = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11UserAdnSenhaIncorret = new javax.swing.JLabel();
        jTextField2Senha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2Login.setBackground(new java.awt.Color(216, 216, 216));
        jPanel2Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Usuario");
        jPanel2Login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Senha");
        jPanel2Login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2Login.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 190, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2Login.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 355, 190, 10));

        jTextField1User.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1User.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1User.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1User.setBorder(null);
        jPanel2Login.add(jTextField1User, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 190, 40));

        jLabel3Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Multiply_32px.png"))); // NOI18N
        jLabel3Fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3FecharMouseClicked(evt);
            }
        });
        jPanel2Login.add(jLabel3Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Enter_ON.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2Login.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 130, 40));

        jLabel11UserAdnSenhaIncorret.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11UserAdnSenhaIncorret.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2Login.add(jLabel11UserAdnSenhaIncorret, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jTextField2Senha.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2Login.add(jTextField2Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 315, 190, 40));

        jPanel1.add(jPanel2Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 410, 560));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/admin.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 790, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3FecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3FecharMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int res = JOptionPane.showConfirmDialog(null, "REALMENTE DESEJA SAIR?", "SAIR", dialog);
        if (res == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel3FecharMouseClicked

    //login
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //verificando se esta cadastrado
        boolean exist = UserDao.getUserAndSenha(jTextField1User.getText(), jTextField2Senha.getText());
        if (exist) {
            JanelaPrinci janelaPrinci = new JanelaPrinci();
            System.out.println(idUSER+" tela de login");
            this.dispose();
            janelaPrinci.setVisible(true);
        } else {
            jLabel11UserAdnSenhaIncorret.setText("Nome ou senha INCORRETOS");
            vibrarLabelSenhaIncorreta(jLabel11UserAdnSenhaIncorret);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    //vibrar label 
        private void vibrarLabelSenhaIncorreta( JLabel labelVibrar) {
        int p = labelVibrar.getX();
         new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 3; i++) {
                        labelVibrar.setLocation(p - 10, labelVibrar.getY());
                        sleep(20);
                        labelVibrar.setLocation(p + 10, labelVibrar.getY());
                        sleep(20);
                    }
                    sleep(20);
                    labelVibrar.setLocation(p, labelVibrar.getY());
                } catch (InterruptedException ex) {
                    Logger.getLogger(TelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();

    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked


    }//GEN-LAST:event_jButton1MouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new TelaDeLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11UserAdnSenhaIncorret;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3Fechar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2Login;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTextField jTextField1User;
    public static javax.swing.JPasswordField jTextField2Senha;
    // End of variables declaration//GEN-END:variables
}
