package com.mycompany.pizzaria;

import Classes.Database;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class frmHome extends javax.swing.JFrame {

    public frmHome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnNovoPedido = new javax.swing.JButton();
        btnPizza = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblConnection = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(464, 406));
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel2.setText("<html>\n<font size=\"6\">Pizzaria do Luigi </font> <br>\nSelecione uma ação abaixo:\n</html>");

        btnNovoPedido.setBackground(new java.awt.Color(242, 242, 242));
        btnNovoPedido.setForeground(new java.awt.Color(0, 162, 232));
        btnNovoPedido.setText("Novo pedido");
        btnNovoPedido.setAlignmentX(0.5F);
        btnNovoPedido.setBorder(null);
        btnNovoPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoPedido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNovoPedido.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnNovoPedido.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPedidoActionPerformed(evt);
            }
        });

        btnPizza.setBackground(new java.awt.Color(242, 242, 242));
        btnPizza.setForeground(new java.awt.Color(0, 162, 232));
        btnPizza.setText("Minhas pizzas");
        btnPizza.setAlignmentX(0.5F);
        btnPizza.setBorder(null);
        btnPizza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPizza.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPizza.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnPizza.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPizzaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(232, 185, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblConnection.setForeground(new java.awt.Color(255, 255, 255));
        lblConnection.setText("Buscando conexão...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConnection, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblConnection, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe Fluent Icons", 0, 256)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPizza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNovoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNovoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoPedidoActionPerformed
        frmNovoPedido frm = new frmNovoPedido(this);
        frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frm.show();
    }//GEN-LAST:event_btnNovoPedidoActionPerformed

    private void btnPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPizzaActionPerformed
        frmCadPizzas frm = new frmCadPizzas();
        frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frm.show();
    }//GEN-LAST:event_btnPizzaActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        Database db = new Database();

        boolean connected = db.isConnected();

        int ping = connected ? db.getPing() : -1;

        if (connected) {
            lblConnection.setText("Conectado (Distância: " + ping + " ms)");
            jPanel1.setBackground(new Color(0, 162, 232));
        } else {
            lblConnection.setText("Verifique sua conexão com a internet!");
            jPanel1.setBackground(new Color(232, 70, 0));
        }
        
        btnPizza.setEnabled(connected);
        btnNovoPedido.setEnabled(connected);
    }//GEN-LAST:event_formWindowGainedFocus

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovoPedido;
    private javax.swing.JButton btnPizza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConnection;
    // End of variables declaration//GEN-END:variables
}
