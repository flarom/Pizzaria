package com.mycompany.pizzaria;

import Classes.Tamanho;
import Classes.Sabor;
import com.mycompany.pizzaria.dialogs.dlgAddSabor;
import com.mycompany.pizzaria.dialogs.dlgAddTamanho;
import com.mycompany.pizzaria.dialogs.dlgEditSabor;
import com.mycompany.pizzaria.dialogs.dlgEditTamanho;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class frmCadPizzas extends javax.swing.JFrame {

    public frmCadPizzas() {
        initComponents();
        loadTables();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSabores = new javax.swing.JTable();
        btnRemoveSabor = new javax.swing.JButton();
        btnEditSabor = new javax.swing.JButton();
        btnCadSabor = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTamanhos = new javax.swing.JTable();
        btnCadTamanho = new javax.swing.JButton();
        btnEditTamanho = new javax.swing.JButton();
        btnRemoveTamanho = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Minas pizzas");
        setMaximumSize(new java.awt.Dimension(625, 2147483647));
        setMinimumSize(new java.awt.Dimension(691, 739));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Sabores");

        tblSabores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Multiplicador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSabores.setToolTipText("");
        jScrollPane1.setViewportView(tblSabores);

        btnRemoveSabor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remove.png"))); // NOI18N
        btnRemoveSabor.setText("Remover");
        btnRemoveSabor.setBorder(null);
        btnRemoveSabor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemoveSabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveSaborActionPerformed(evt);
            }
        });

        btnEditSabor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png"))); // NOI18N
        btnEditSabor.setText("Editar");
        btnEditSabor.setBorder(null);
        btnEditSabor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditSabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditSaborActionPerformed(evt);
            }
        });

        btnCadSabor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnCadSabor.setText("Adicionar");
        btnCadSabor.setBorder(null);
        btnCadSabor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadSabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadSaborActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCadSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 79, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnEditSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Tamanhos");

        tblTamanhos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTamanhos);

        btnCadTamanho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnCadTamanho.setText("Adicionar");
        btnCadTamanho.setBorder(null);
        btnCadTamanho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadTamanhoActionPerformed(evt);
            }
        });

        btnEditTamanho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png"))); // NOI18N
        btnEditTamanho.setText("Editar");
        btnEditTamanho.setBorder(null);
        btnEditTamanho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditTamanhoActionPerformed(evt);
            }
        });

        btnRemoveTamanho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remove.png"))); // NOI18N
        btnRemoveTamanho.setText("Remover");
        btnRemoveTamanho.setBorder(null);
        btnRemoveTamanho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemoveTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveTamanhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCadTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadSaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadSaborActionPerformed
        dlgAddSabor dlg = new dlgAddSabor();
        dlg.setModal(true);
        dlg.show();
        loadTables();
    }//GEN-LAST:event_btnCadSaborActionPerformed

    private void btnCadTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadTamanhoActionPerformed
        dlgAddTamanho dlg = new dlgAddTamanho();
        dlg.setModal(true);
        dlg.show();
        loadTables();
    }//GEN-LAST:event_btnCadTamanhoActionPerformed

    private void btnRemoveSaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveSaborActionPerformed
        try {
            int[] linhas = tblSabores.getSelectedRows();
            
            if (linhas.length > 1 && JOptionPane.showConfirmDialog(this, "Você tem certeza de que quer excluir multiplos itens?") != JOptionPane.YES_OPTION) return;
            
            int[] ids = new int[linhas.length];

            for (int i = 0; i < linhas.length; i++) {
                ids[i] = Integer.parseInt((String) tblSabores.getValueAt(linhas[i], 0));
            }

            Sabor s = new Sabor();
            s.RemoveRange(ids);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Algo deu errado, verifique a sua conexão com a internet \nERRO: " + e.getMessage());
        }

        loadTables();
    }//GEN-LAST:event_btnRemoveSaborActionPerformed

    private void btnEditSaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditSaborActionPerformed
        try {
            int linha = tblSabores.getSelectedRow();

            if (linha == -1) {
                return;
            }
            if (tblSabores.getSelectedRows().length > 1) {
                return;
            }

            int id = Integer.parseInt((String) tblSabores.getValueAt(linha, 0));
            String nome = (String) tblSabores.getValueAt(linha, 1);
            double multiplicador = Double.parseDouble((String) tblSabores.getValueAt(linha, 2));

            dlgEditSabor dlg = new dlgEditSabor(id, nome, multiplicador);
            dlg.setModal(true);
            dlg.show();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Algo deu errado, verifique a sua conexão com a internet \nERRO:" + e);
        }

        loadTables();
    }//GEN-LAST:event_btnEditSaborActionPerformed

    private void btnEditTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditTamanhoActionPerformed
        try {
            int linha = tblTamanhos.getSelectedRow();

            if (linha == -1) {
                return;
            }
            if (tblTamanhos.getSelectedRows().length > 1) {
                return;
            }

            int id = Integer.parseInt((String) tblTamanhos.getValueAt(linha, 0));
            String nome = (String) tblSabores.getValueAt(linha, 1);
            double preco = Double.parseDouble((String) tblSabores.getValueAt(linha, 2));

            dlgEditTamanho dlg = new dlgEditTamanho(id, nome, preco);
            dlg.setModal(true);
            dlg.show();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Algo deu errado, verifique a sua conexão com a internet \nERRO:" + e);
        }

        loadTables();
    }//GEN-LAST:event_btnEditTamanhoActionPerformed

    private void btnRemoveTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveTamanhoActionPerformed
        try {
            int[] linhas = tblTamanhos.getSelectedRows();
            
            if (linhas.length > 1 && JOptionPane.showConfirmDialog(this, "Você tem certeza de que quer excluir multiplos itens?") != JOptionPane.YES_OPTION) return;
            
            int[] ids = new int[linhas.length];

            for (int i = 0; i < linhas.length; i++) {
                ids[i] = Integer.parseInt((String) tblSabores.getValueAt(linhas[i], 0));
            }

            Sabor s = new Sabor();
            s.RemoveRange(ids);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Algo deu errado, verifique a sua conexão com a internet \nERRO: " + e.getMessage());
        }

        loadTables();
    }//GEN-LAST:event_btnRemoveTamanhoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadPizzas().setVisible(true);
            }
        });
    }

    private void loadTables() {
        try {
        String[] sabColumns = {"ID", "Nome", "Multiplicador"};
        String[] tamColumns = {"ID", "Nome", "Preço"};

        Sabor sabor = new Sabor();
        Tamanho tamanho = new Tamanho();

        String[][] sabores = sabor.Read();
        String[][] tamanhos = tamanho.Read();

        DefaultTableModel sabTableModel = new DefaultTableModel(sabores, sabColumns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        DefaultTableModel tamTableModel = new DefaultTableModel(tamanhos, tamColumns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        sabTableModel.setRowCount(0);
        for (String[] row : sabores) {
            sabTableModel.addRow(row);
        }
        tamTableModel.setRowCount(0);
        for (String[] row : tamanhos) {
            tamTableModel.addRow(row);
        }

        tblSabores.setModel(sabTableModel);
        tblTamanhos.setModel(tamTableModel);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "Algo deu errado, verifique a sua conexão com a internet \nERRO: " + e);
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadSabor;
    private javax.swing.JButton btnCadTamanho;
    private javax.swing.JButton btnEditSabor;
    private javax.swing.JButton btnEditTamanho;
    private javax.swing.JButton btnRemoveSabor;
    private javax.swing.JButton btnRemoveTamanho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblSabores;
    private javax.swing.JTable tblTamanhos;
    // End of variables declaration//GEN-END:variables
}
