
package view;

import controller.AlteraSoldado;
import controller.BuscaSoldado;
import controller.ExcluiSoldado;
import model.Atividade;
import model.Soldado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Advertencia;

/**
 * Frame para alterar dados do Soldado e excluir um Soldado.
 * @author Guilherme Souto Cardoso
 * @since Classe criada em: 19/09/2017
 */

public class FrameAlteraSoldado extends javax.swing.JFrame {
    
    /**
     * Creates new form FrameAlteraSoldado
     */
    public FrameAlteraSoldado() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupSexo = new javax.swing.ButtonGroup();
        panelSoldado = new javax.swing.JPanel();
        lbIconSoldado = new javax.swing.JLabel();
        lbDutyCallsSoldado = new javax.swing.JLabel();
        btVoltarSoldado = new javax.swing.JButton();
        btSalvarSoldado = new javax.swing.JButton();
        tfNomeSoldado = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        cbCaserna = new javax.swing.JComboBox<>();
        lbNomeSoldado = new javax.swing.JLabel();
        lbCodigoSoldado = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbCaserna = new javax.swing.JLabel();
        lbMunicipio = new javax.swing.JLabel();
        tfMunicipio = new javax.swing.JTextField();
        lbDataNascimento = new javax.swing.JLabel();
        ftfDataNascimento = new javax.swing.JFormattedTextField();
        lbIdade = new javax.swing.JLabel();
        lbAltura = new javax.swing.JLabel();
        ftfAltura = new javax.swing.JFormattedTextField();
        lbMetros = new javax.swing.JLabel();
        lbSexo = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        ftfCodigoSoldado = new javax.swing.JFormattedTextField();
        ftfIdade = new javax.swing.JFormattedTextField();
        btBuscar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Dados do Soldado");

        panelSoldado.setBackground(new java.awt.Color(0, 102, 51));

        lbIconSoldado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/soldier.png"))); // NOI18N

        lbDutyCallsSoldado.setFont(new java.awt.Font("Perpetua Titling MT", 3, 18)); // NOI18N
        lbDutyCallsSoldado.setForeground(new java.awt.Color(255, 255, 0));
        lbDutyCallsSoldado.setText("Duty Calls");

        btVoltarSoldado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btVoltarSoldado.setText("Voltar");
        btVoltarSoldado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVoltarSoldado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarSoldadoActionPerformed(evt);
            }
        });

        btSalvarSoldado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSalvarSoldado.setText("Salvar Dados");
        btSalvarSoldado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvarSoldado.setEnabled(false);
        btSalvarSoldado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarSoldadoActionPerformed(evt);
            }
        });

        tfNomeSoldado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        tfEndereco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        cbCaserna.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbCaserna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Infantaria", "Cavalaria", "Artilharia", "Engenharia" }));
        cbCaserna.setSelectedIndex(-1);

        lbNomeSoldado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNomeSoldado.setForeground(new java.awt.Color(255, 255, 255));
        lbNomeSoldado.setText("NOME :");

        lbCodigoSoldado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCodigoSoldado.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigoSoldado.setText("CÓDIGO :");

        lbEndereco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbEndereco.setForeground(new java.awt.Color(255, 255, 255));
        lbEndereco.setText("ENDEREÇO :");

        lbCaserna.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCaserna.setForeground(new java.awt.Color(255, 255, 255));
        lbCaserna.setText("CASERNA :");

        lbMunicipio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbMunicipio.setForeground(new java.awt.Color(255, 255, 255));
        lbMunicipio.setText("MUNICÍPIO :");

        tfMunicipio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        lbDataNascimento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbDataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        lbDataNascimento.setText("DATA DE NASCIMENTO :");

        try {
            ftfDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfDataNascimento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        lbIdade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbIdade.setForeground(new java.awt.Color(255, 255, 255));
        lbIdade.setText("IDADE :");

        lbAltura.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbAltura.setForeground(new java.awt.Color(255, 255, 255));
        lbAltura.setText("ALTURA :");

        try {
            ftfAltura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfAltura.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        lbMetros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbMetros.setForeground(new java.awt.Color(255, 255, 255));
        lbMetros.setText("m");

        lbSexo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbSexo.setForeground(new java.awt.Color(255, 255, 255));
        lbSexo.setText("SEXO :");

        rbMasculino.setBackground(new java.awt.Color(0, 102, 51));
        groupSexo.add(rbMasculino);
        rbMasculino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbMasculino.setForeground(new java.awt.Color(255, 255, 255));
        rbMasculino.setText("Masculino");

        rbFeminino.setBackground(new java.awt.Color(0, 102, 51));
        groupSexo.add(rbFeminino);
        rbFeminino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbFeminino.setForeground(new java.awt.Color(255, 255, 255));
        rbFeminino.setText("Feminino");

        try {
            ftfCodigoSoldado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfCodigoSoldado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        try {
            ftfIdade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfIdade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btExcluir.setText("Excluir Soldado");
        btExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSoldadoLayout = new javax.swing.GroupLayout(panelSoldado);
        panelSoldado.setLayout(panelSoldadoLayout);
        panelSoldadoLayout.setHorizontalGroup(
            panelSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSoldadoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btSalvarSoldado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btVoltarSoldado)
                .addGap(18, 18, 18))
            .addGroup(panelSoldadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbSexo)
                    .addComponent(lbDataNascimento)
                    .addGroup(panelSoldadoLayout.createSequentialGroup()
                        .addGroup(panelSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbDutyCallsSoldado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbIconSoldado, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGroup(panelSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSoldadoLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(lbNomeSoldado))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSoldadoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCodigoSoldado, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbEndereco, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addComponent(lbMunicipio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSoldadoLayout.createSequentialGroup()
                        .addGroup(panelSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNomeSoldado)
                            .addComponent(tfEndereco)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSoldadoLayout.createSequentialGroup()
                                .addGroup(panelSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfMunicipio)
                                    .addGroup(panelSoldadoLayout.createSequentialGroup()
                                        .addGroup(panelSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rbMasculino)
                                            .addComponent(ftfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelSoldadoLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(rbFeminino)
                                                .addGap(0, 28, Short.MAX_VALUE))
                                            .addGroup(panelSoldadoLayout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(lbIdade)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ftfIdade)))))
                                .addGap(18, 18, 18)
                                .addGroup(panelSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelSoldadoLayout.createSequentialGroup()
                                        .addComponent(lbCaserna)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbCaserna, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelSoldadoLayout.createSequentialGroup()
                                        .addComponent(lbAltura)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ftfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbMetros)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelSoldadoLayout.createSequentialGroup()
                        .addComponent(ftfCodigoSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btBuscar)
                        .addGap(27, 27, 27))))
        );
        panelSoldadoLayout.setVerticalGroup(
            panelSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSoldadoLayout.createSequentialGroup()
                .addGroup(panelSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSoldadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbIconSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbDutyCallsSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSoldadoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panelSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCodigoSoldado)
                            .addComponent(ftfCodigoSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBuscar))
                        .addGap(15, 15, 15)
                        .addGroup(panelSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNomeSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNomeSoldado))
                        .addGap(21, 21, 21)
                        .addGroup(panelSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEndereco))))
                .addGap(26, 26, 26)
                .addGroup(panelSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCaserna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCaserna)
                    .addComponent(lbMunicipio)
                    .addComponent(tfMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataNascimento)
                    .addComponent(ftfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIdade)
                    .addComponent(lbAltura)
                    .addComponent(ftfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMetros)
                    .addComponent(ftfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSexo)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(panelSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltarSoldado)
                    .addComponent(btSalvarSoldado)
                    .addComponent(btExcluir))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSoldado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSoldado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarSoldadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarSoldadoActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarSoldadoActionPerformed

    private void btSalvarSoldadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarSoldadoActionPerformed
        String codigoSoldado;
        codigoSoldado = ftfCodigoSoldado.getText();
        Soldado soldado = new Soldado();
        Atividade atividade = new Atividade();
        Advertencia advertencia = new Advertencia();
        
        soldado.setNome(tfNomeSoldado.getText());
        soldado.setEndereco(tfEndereco.getText());
        soldado.setMunicipio(tfMunicipio.getText());
        soldado.setCaserna(cbCaserna.getSelectedItem().toString());
        soldado.setDataNascimento(ftfDataNascimento.getText());
        soldado.setIdade(Integer.parseInt(ftfIdade.getText()));
        soldado.setAltura(Float.parseFloat(ftfAltura.getText()));
        soldado.setSexo(rbMasculino.isSelected() ? "Masculino" : "Feminino");
        
        atividade.setNomeSoldado(tfNomeSoldado.getText());
        advertencia.setNomeSoldado(tfNomeSoldado.getText());
        
        try {
            AlteraSoldado.alterarDadosSoldado(codigoSoldado, soldado, atividade);
            AlteraSoldado.alterarSoldadoAdvertencia(codigoSoldado, advertencia);
        } catch (SQLException ex) {
            Logger.getLogger(FrameAlteraSoldado.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_btSalvarSoldadoActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        String codigo;
        ResultSet rs = null;
        
        codigo = ftfCodigoSoldado.getText();
        
        try {
            rs = BuscaSoldado.localizarSoldadoCodigo(codigo);
        } catch (SQLException ex) {
            Logger.getLogger(FrameAlteraSoldado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            while(rs.next()) {
                tfNomeSoldado.setText(rs.getString("nome"));
                tfEndereco.setText(rs.getString("endereco"));
                tfMunicipio.setText(rs.getString("municipio"));
                cbCaserna.setSelectedItem(rs.getString("caserna"));
                ftfDataNascimento.setText(rs.getString("nascimento"));
                ftfIdade.setText(String.valueOf(rs.getInt("idade")));
                ftfAltura.setText(Float.toString(rs.getFloat("altura")));
                rbMasculino.setSelected(rs.getString("sexo").equals("Masculino"));
                rbFeminino.setSelected(rs.getString("sexo").equals("Feminino"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrameAlteraSoldado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ftfCodigoSoldado.setEditable(false);
        btSalvarSoldado.setEnabled(true);
        btExcluir.setEnabled(true);
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        String codigo;
        codigo = ftfCodigoSoldado.getText();
        
        try {
            ExcluiSoldado.apagarSoldado(codigo);
        } catch (SQLException ex) {
            Logger.getLogger(FrameAlteraSoldado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ftfCodigoSoldado.setText("");
        tfNomeSoldado.setText("");
        tfEndereco.setText("");
        tfMunicipio.setText("");
        cbCaserna.setSelectedIndex(-1);
        ftfDataNascimento.setText("");
        ftfIdade.setText("");
        ftfAltura.setText("");
        groupSexo.clearSelection();
    }//GEN-LAST:event_btExcluirActionPerformed
    
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
            java.util.logging.Logger.getLogger(FrameAlteraSoldado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAlteraSoldado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAlteraSoldado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAlteraSoldado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAlteraSoldado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSalvarSoldado;
    private javax.swing.JButton btVoltarSoldado;
    private javax.swing.JComboBox<String> cbCaserna;
    private javax.swing.JFormattedTextField ftfAltura;
    private javax.swing.JFormattedTextField ftfCodigoSoldado;
    private javax.swing.JFormattedTextField ftfDataNascimento;
    private javax.swing.JFormattedTextField ftfIdade;
    private javax.swing.ButtonGroup groupSexo;
    private javax.swing.JLabel lbAltura;
    private javax.swing.JLabel lbCaserna;
    private javax.swing.JLabel lbCodigoSoldado;
    private javax.swing.JLabel lbDataNascimento;
    private javax.swing.JLabel lbDutyCallsSoldado;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbIconSoldado;
    private javax.swing.JLabel lbIdade;
    private javax.swing.JLabel lbMetros;
    private javax.swing.JLabel lbMunicipio;
    private javax.swing.JLabel lbNomeSoldado;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JPanel panelSoldado;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfMunicipio;
    private javax.swing.JTextField tfNomeSoldado;
    // End of variables declaration//GEN-END:variables
}
