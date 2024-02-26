package crud_swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import crud_swing.dao.ClientDAO;
import crud_swing.dao.IClientDAO;
import crud_swing.domain.Client;

/**
 *
 * @author mdantas
 */
public class MainScreen extends javax.swing.JFrame {
    
    private DefaultTableModel model = new DefaultTableModel();
    private IClientDAO clientDao = new ClientDAO();

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        initCustomComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblName = new javax.swing.JLabel();
        TxtName = new javax.swing.JTextField();
        BtnSave = new javax.swing.JButton();
        LblCpf = new javax.swing.JLabel();
        TxtCpf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableClients = new javax.swing.JTable();
        LblTel = new javax.swing.JLabel();
        LblAddress = new javax.swing.JLabel();
        TxtTel = new javax.swing.JTextField();
        TxtAddress = new javax.swing.JTextField();
        LblNum = new javax.swing.JLabel();
        TxtNum = new javax.swing.JTextField();
        LblCity = new javax.swing.JLabel();
        TxtCity = new javax.swing.JTextField();
        LblState = new javax.swing.JLabel();
        TxtState = new javax.swing.JTextField();
        BtnClean = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        BtnChange = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItemExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LblName.setText("Nome:");

        TxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNameActionPerformed(evt);
            }
        });

        BtnSave.setText("Salvar");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });

        LblCpf.setText("CPF:");

        TxtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCpfActionPerformed(evt);
            }
        });

        TableClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableClientsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableClients);

        LblTel.setText("Telefone:");

        LblAddress.setText("Endereço:");

        TxtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAddressActionPerformed(evt);
            }
        });

        LblNum.setText("Número:");

        LblCity.setText("Cidade:");

        LblState.setText("Estado:");

        TxtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtStateActionPerformed(evt);
            }
        });

        BtnClean.setText("Limpar");
        BtnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCleanActionPerformed(evt);
            }
        });

        BtnDelete.setText("Excluir");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        BtnChange.setText("Atualizar");

        jMenu1.setText("Opções");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        MenuItemExit.setText("Sair");
        MenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblName)
                                .addGap(18, 18, 18)
                                .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblTel)
                                .addGap(18, 18, 18)
                                .addComponent(TxtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LblAddress)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblCpf)
                                .addGap(18, 18, 18)
                                .addComponent(TxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblNum)
                                .addGap(18, 18, 18)
                                .addComponent(TxtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LblCity))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnChange)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LblState)
                                .addGap(18, 18, 18)
                                .addComponent(TxtState, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblName)
                    .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCpf)
                    .addComponent(TxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblAddress)
                        .addComponent(TxtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LblTel))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNum)
                    .addComponent(TxtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCity)
                    .addComponent(TxtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblState)
                    .addComponent(TxtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSave)
                    .addComponent(BtnDelete)
                    .addComponent(BtnChange)
                    .addComponent(BtnClean))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void MenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemExitActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Deseja sair da aplicação?", "Sair",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
        
        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_MenuItemExitActionPerformed

    private void TxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNameActionPerformed

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        String name = TxtName.getText();
        String cpf = TxtCpf.getText();
        String tel = TxtTel.getText();
        String address = TxtAddress.getText();
        String number = TxtNum.getText();
        String city = TxtCity.getText();
        String state = TxtState.getText();
        
        if (!isValidFields(name, cpf, tel, address, number, city, state)) {
            JOptionPane.showMessageDialog(null, "Existem campos a serem preenchidos." 
                    , "ATENÇÃO!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        Client client = new Client(name, cpf, tel, address, number, city, state);
        Boolean isRegistered = this.clientDao.register(client);
        
        if (isRegistered) {
            model.addRow(new Object[]{client.getName(), client.getCpf(), client.getTel(), client.getAddress(),
                                      client.getNumber(), client.getCity(), client.getState()});
            cleanFields();
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado." 
                    , "ATENÇÃO!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BtnSaveActionPerformed

    private void TxtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCpfActionPerformed

    private void TxtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAddressActionPerformed

    private void TxtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtStateActionPerformed

    private void BtnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCleanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCleanActionPerformed

    private void TableClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableClientsMouseClicked
        int selectedRow = TableClients.getSelectedRow();
        String cpf = (String) TableClients.getValueAt(selectedRow, 1);
        
        Client client = this.clientDao.consult(cpf);
        
        TxtName.setText(client.getName());
        TxtCpf.setText(client.getCpf());
        TxtTel.setText(client.getTel());
        TxtAddress.setText(client.getAddress());
        TxtNum.setText(client.getNumber());
        TxtCity.setText(client.getCity());
        TxtState.setText(client.getState());
    }//GEN-LAST:event_TableClientsMouseClicked

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        int selectedRow = TableClients.getSelectedRow();
        
        if (selectedRow >= 0) {
            int result = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir este cliente?", "CUIDADO!",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
            
            if (result == JOptionPane.YES_OPTION) {
                String cpf = (String) TableClients.getValueAt(selectedRow, 1);
                this.clientDao.delete(cpf);
                model.removeRow(selectedRow);
                
                JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!" 
                    , "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                
                cleanFields();
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum cliente excluído." 
                    , "ATENÇÃO!", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_BtnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnChange;
    private javax.swing.JButton BtnClean;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnSave;
    private javax.swing.JLabel LblAddress;
    private javax.swing.JLabel LblCity;
    private javax.swing.JLabel LblCpf;
    private javax.swing.JLabel LblName;
    private javax.swing.JLabel LblNum;
    private javax.swing.JLabel LblState;
    private javax.swing.JLabel LblTel;
    private javax.swing.JMenuItem MenuItemExit;
    private javax.swing.JTable TableClients;
    private javax.swing.JTextField TxtAddress;
    private javax.swing.JTextField TxtCity;
    private javax.swing.JTextField TxtCpf;
    private javax.swing.JTextField TxtName;
    private javax.swing.JTextField TxtNum;
    private javax.swing.JTextField TxtState;
    private javax.swing.JTextField TxtTel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private boolean isValidFields(String ...fields) {
        for (String field : fields) {
            if (field == null || "".equals(field)) {
                return false;
            }
        }
        
        return true;
    }

    private void initCustomComponents() {
        model.addColumn("Nome");
        model.addColumn("CPF");
        model.addColumn("Telefone");
        model.addColumn("Endereço");
        model.addColumn("Número");
        model.addColumn("Cidade");
        model.addColumn("Estado");
        
        TableClients.setModel(model);
    }
    
    private void cleanFields() {
           TxtName.setText("");
           TxtCpf.setText("");
           TxtTel.setText("");
           TxtAddress.setText("");
           TxtNum.setText("");
           TxtCity.setText("");
           TxtState.setText("");
    }
}
