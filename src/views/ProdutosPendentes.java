package views;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class ProdutosPendentes extends javax.swing.JPanel {

    public ProdutosPendentes() {
        initComponents();
        aumentaEmostra();
    }

    int[] x = {1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5};

    private void aumentaEmostra() {
        int y = 50;
        int height = 580;
        for (int i = 0; i < x.length; i++) {
            System.out.println("x");

            JPanel jPanel2DadosPedido = new javax.swing.JPanel();

            jPanel2DadosPedido.setBackground(new java.awt.Color(204, 204, 204));

            jPanel2DadosPedido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));

            jPanel2DadosPedido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jPanel1Aument.add(jPanel2DadosPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, y, 660, 220));

            y += 250;
            //cliente
            JLabel jLabel2Cliente = new javax.swing.JLabel();

            jLabel2Cliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

            jLabel2Cliente.setForeground(new java.awt.Color(51, 51, 51));

            jLabel2Cliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            jLabel2Cliente.setText("Cliente");

            jLabel2Cliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

            jPanel2DadosPedido.add(jLabel2Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

            //endereco
            JLabel jLabel3Endereco = new javax.swing.JLabel();

            jLabel3Endereco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

            jLabel3Endereco.setForeground(new java.awt.Color(51, 51, 51));

            jLabel3Endereco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            jLabel3Endereco.setText("Endereco");

            jLabel3Endereco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

            jPanel2DadosPedido.add(jLabel3Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

            //telefone
            JLabel jLabel1Telefone = new javax.swing.JLabel();

            jLabel1Telefone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

            jLabel1Telefone.setForeground(new java.awt.Color(51, 51, 51));

            jLabel1Telefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            jLabel1Telefone.setText("Telefone");

            jLabel1Telefone.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

            jPanel2DadosPedido.add(jLabel1Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

            //pedido
            JLabel jLabel4Produto = new javax.swing.JLabel();

            jLabel4Produto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

            jLabel4Produto.setForeground(new java.awt.Color(51, 51, 51));

            jLabel4Produto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            jLabel4Produto.setText("Produto");

            jLabel4Produto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

            jPanel2DadosPedido.add(jLabel4Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

            //preco
            JLabel jLabel5Valor = new javax.swing.JLabel();

            jLabel5Valor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

            jLabel5Valor.setForeground(new java.awt.Color(51, 51, 51));

            jLabel5Valor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            jLabel5Valor.setText("Valor");

            jLabel5Valor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

            jPanel2DadosPedido.add(jLabel5Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

            //status
            JLabel jLabel6Status = new javax.swing.JLabel();

            jLabel6Status.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

            jLabel6Status.setForeground(new java.awt.Color(51, 51, 51));

            jLabel6Status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            jLabel6Status.setText("Status");

            jLabel6Status.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

            jPanel2DadosPedido.add(jLabel6Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

            //separador
            JSeparator jSeparator1 = new javax.swing.JSeparator();

            jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

            jPanel2DadosPedido.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 10, 190));

            //aumentando painel para caber
            if (i > 2) {
                height += 280;
                jPanel1Aument.setPreferredSize(new java.awt.Dimension(772, height));
            }

        }

    }

    private void gerenetePedidos() {

        //250 de x de distancia
        //peidido 1 base    
        JPanel jPanel2DadosPedido = new javax.swing.JPanel();

        jPanel2DadosPedido.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2DadosPedido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));

        jPanel2DadosPedido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

// Código de subcomponentes e layouts - não mostrados aqui
        jPanel1Aument.add(jPanel2DadosPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 660, 220));

//peiddo 2 base
        JPanel jPanel2DadosPedido1 = new javax.swing.JPanel();

        jPanel2DadosPedido1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2DadosPedido1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));

        jPanel2DadosPedido1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

// Código de subcomponentes e layouts - não mostrados aqui
        jPanel1Aument.add(jPanel2DadosPedido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 660, 220));

//codigo de aumentrar painel
        jPanel1Aument = new javax.swing.JPanel();

        jPanel1Aument.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1Aument.setPreferredSize(new java.awt.Dimension(772, 1000));

        jPanel1Aument.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

// Código de subcomponentes e layouts - não mostrados aqui
        jScrollPanePedidos.setViewportView(jPanel1Aument);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPanePedidos = new javax.swing.JScrollPane();
        jPanel1Aument = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1Aument.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1Aument.setPreferredSize(new java.awt.Dimension(772, 580));
        jPanel1Aument.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Pendentes");
        jPanel1Aument.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jScrollPanePedidos.setViewportView(jPanel1Aument);

        add(jScrollPanePedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 580));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1Aument;
    private javax.swing.JScrollPane jScrollPanePedidos;
    // End of variables declaration//GEN-END:variables
}
