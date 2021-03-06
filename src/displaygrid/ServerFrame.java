/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package displaygrid;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akshay
 */
public class ServerFrame extends javax.swing.JFrame {

    /**
     * Creates new form DisplayGridServerFrame
     */
    public ServerFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        tabPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        clientTable = new javax.swing.JTable();
        tableToListButton = new javax.swing.JButton();
        removeFromListButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pendingAppClientList = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        appSelection = new javax.swing.JComboBox();
        startButton = new javax.swing.JButton();
        clientStopButton = new javax.swing.JButton();
        disconnectClientButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        activeAppList = new javax.swing.JList();
        appStopButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Display Grid Server");

        clientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Client", "App", "IP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        clientTable.setDragEnabled(true);
        clientTable.setFillsViewportHeight(true);
        jScrollPane3.setViewportView(clientTable);

        tableToListButton.setText(">>");
        tableToListButton.setToolTipText("Add");
        tableToListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableToListButtonActionPerformed(evt);
            }
        });

        removeFromListButton.setText("<<");
        removeFromListButton.setToolTipText("Remove");
        removeFromListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFromListButtonActionPerformed(evt);
            }
        });

        pendingAppClientList.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(pendingAppClientList);

        jLabel2.setText("App:");

        appSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        startButton.setText("Start App");

        clientStopButton.setText("Stop Client");

        disconnectClientButton.setText("Disconnect Client");
        disconnectClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectClientButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tableToListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeFromListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(clientStopButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(disconnectClientButton)
                        .addGap(0, 203, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startButton)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tableToListButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeFromListButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(clientStopButton)
                    .addComponent(disconnectClientButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startButton)
                .addContainerGap())
        );

        tabPane.addTab("Connected Clients", jPanel1);

        jScrollPane1.setViewportView(activeAppList);

        appStopButton.setText("Stop App");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(appStopButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appStopButton)
                .addContainerGap())
        );

        tabPane.addTab("ActiveApps", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeFromListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFromListButtonActionPerformed
        List<Object> selectedItems = pendingAppClientList.getSelectedValuesList();
        for(Object o:selectedItems){
            ((DefaultListModel)pendingAppClientList.getModel()).removeElement(o);
        }
    }//GEN-LAST:event_removeFromListButtonActionPerformed

    private void tableToListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableToListButtonActionPerformed
        int[] selectedRows = clientTable.getSelectedRows();
        
        if(selectedRows.length == 0)return;
        DefaultListModel<Object> listModel = (DefaultListModel<Object>)(pendingAppClientList.getModel());
        for(int i = 0; i < selectedRows.length; i++){
            Object value = ((DefaultTableModel) clientTable.getModel()).getValueAt(selectedRows[i], CLIENT_ID_COL);
            if(!listModel.contains(value)){
                listModel.addElement(value);
            }
        }
    }//GEN-LAST:event_tableToListButtonActionPerformed

    private void disconnectClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectClientButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disconnectClientButtonActionPerformed

    public void setAppList(String[] apps){
        appSelection.setModel(new javax.swing.DefaultComboBoxModel(apps));       
    }
    
    public void renameTableApp(Object newApp, Object client){
        DefaultTableModel m = (DefaultTableModel)clientTable.getModel();
        int rows = m.getRowCount();
        for(int i = 0; i < rows; i++){
            if(m.getValueAt(i, CLIENT_ID_COL).equals(client)){
                String name = (newApp == null)?"":newApp.toString();
                        
                m.setValueAt(newApp, i, CLIENT_APP_COL);
                return;
            }
        }
    }
    
    public void removeClient(String client){
        //remove from table
        DefaultTableModel m = (DefaultTableModel)clientTable.getModel();
        
        int rows = m.getRowCount();
        tableRemove:for(int i = 0; i < rows; i++){
            if(m.getValueAt(i, CLIENT_ID_COL).equals(client)){
                m.removeRow(i);
                break tableRemove;
            }
        }
        clientTable.setModel(m);
        //remove from pending app client list
        DefaultListModel pModel = ((DefaultListModel)pendingAppClientList.getModel());
        pModel.removeElement(client);
        pendingAppClientList.setModel(pModel);
    }
    
    public ArrayList<String> getAllPendingAppClients(){
        DefaultListModel pModel = ((DefaultListModel)pendingAppClientList.getModel());
        int size = pModel.getSize();
        ArrayList<String> pClients = new ArrayList<>();
        for(int i = 0; i < size; i++){
            pClients.add((String)pModel.elementAt(i));
        }
        return pClients;
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
            java.util.logging.Logger.getLogger(ServerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerFrame().setVisible(true);
            }
        });
    }

    public static final int CLIENT_ID_COL = 0;
    public static final int CLIENT_APP_COL = 1;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JList activeAppList;
    public javax.swing.JComboBox appSelection;
    public javax.swing.JButton appStopButton;
    public javax.swing.JButton clientStopButton;
    public javax.swing.JTable clientTable;
    public javax.swing.JButton disconnectClientButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JList pendingAppClientList;
    private javax.swing.JButton removeFromListButton;
    public javax.swing.JButton startButton;
    public javax.swing.JTabbedPane tabPane;
    private javax.swing.JButton tableToListButton;
    // End of variables declaration//GEN-END:variables
}
