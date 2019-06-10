
package ac.daffodil.l4dc1000084.budgets.gui;

import ac.daffodil.l4dc1000084.budgets.bean.AccountInfo;
import ac.daffodil.l4dc1000084.budgets.bean.UserAccountAuthenticationInfo;
import ac.daffodil.l4dc1000084.budgets.bean.UserInfo;
import ac.daffodil.l4dc1000084.budgets.gui.TableModel.UserAccountAuthenticationTableModel;
import ac.daffodil.l4dc1000084.budgets.gui.dataManager.AccountDataManager;
import ac.daffodil.l4dc1000084.budgets.gui.dataManager.LoggedInUser;
import ac.daffodil.l4dc1000084.budgets.gui.dataManager.UserDataManager;
import java.util.ArrayList;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class UserAutenticationUI extends javax.swing.JInternalFrame {

    public UserAutenticationUI() {
        initComponents();
       
        loadUser();
        loadAccount();
      
        userAuthenticationDetailsTalbe.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                    int selectedRow = userAuthenticationDetailsTalbe.getSelectedRow();    
                    
                    if(selectedRow >= 0){
                        UserAccountAuthenticationInfo accountAuthenticationInfo=authenticationTableModel.getAuthenticatedAccount(selectedRow);
                        
                        if(accountAuthenticationInfo != null){
                            
                           accountsComboBox.setSelectedItem(accountAuthenticationInfo.getAccounts());
                           
                           usersComboBox.setSelectedItem(accountAuthenticationInfo.getUsers());
                           DetailsField.setText(accountAuthenticationInfo.getDetails());
                        }
                    }
            }
        });
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        authenticationComponentPanel = new javax.swing.JPanel();
        usersLabel = new javax.swing.JLabel();
        accountsLabel = new javax.swing.JLabel();
        categoryDetailsLabel = new javax.swing.JLabel();
        detailsScrollPane = new javax.swing.JScrollPane();
        DetailsField = new javax.swing.JTextArea();
        accountsComboBox = new javax.swing.JComboBox<>();
        usersComboBox = new javax.swing.JComboBox<>();
        buttonPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        authenticationTablePanel = new javax.swing.JPanel();
        authenticationTableScrollPane = new javax.swing.JScrollPane();
        authenticationTableModel = new UserAccountAuthenticationTableModel();
        userAuthenticationDetailsTalbe = new javax.swing.JTable();

        setBackground(java.awt.Color.cyan);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Authentication to Account");
        setName("userUIInternalForm"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1056, 627));

        authenticationComponentPanel.setBackground(java.awt.Color.cyan);
        authenticationComponentPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        usersLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        usersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usersLabel.setText("Users");
        usersLabel.setName("firstNaleLabel"); // NOI18N

        accountsLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        accountsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountsLabel.setText("Accounts");
        accountsLabel.setName("firstNaleLabel"); // NOI18N

        categoryDetailsLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        categoryDetailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryDetailsLabel.setText("Details");
        categoryDetailsLabel.setName("firstNaleLabel"); // NOI18N

        DetailsField.setColumns(20);
        DetailsField.setRows(5);
        detailsScrollPane.setViewportView(DetailsField);

        javax.swing.GroupLayout authenticationComponentPanelLayout = new javax.swing.GroupLayout(authenticationComponentPanel);
        authenticationComponentPanel.setLayout(authenticationComponentPanelLayout);
        authenticationComponentPanelLayout.setHorizontalGroup(
            authenticationComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(authenticationComponentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(authenticationComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(categoryDetailsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(usersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(authenticationComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accountsComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usersComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(detailsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                .addContainerGap())
        );
        authenticationComponentPanelLayout.setVerticalGroup(
            authenticationComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(authenticationComponentPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(authenticationComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(authenticationComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(authenticationComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(authenticationComponentPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(categoryDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(authenticationComponentPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(detailsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        buttonPanel.setBackground(java.awt.Color.cyan);
        buttonPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        addButton.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        addButton.setText("Authenticate");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        removeButton.setText("Remove ");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        updateButton.setText("Update Authentication");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        refreshButton.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        refreshButton.setText("Refresh Fields");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refreshButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(removeButton)
                    .addComponent(updateButton)
                    .addComponent(refreshButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        authenticationTablePanel.setBackground(java.awt.Color.cyan);
        authenticationTablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("User Authentication Details"));

        authenticationTableScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        userAuthenticationDetailsTalbe.setModel(authenticationTableModel);
        authenticationTableScrollPane.setViewportView(userAuthenticationDetailsTalbe);

        javax.swing.GroupLayout authenticationTablePanelLayout = new javax.swing.GroupLayout(authenticationTablePanel);
        authenticationTablePanel.setLayout(authenticationTablePanelLayout);
        authenticationTablePanelLayout.setHorizontalGroup(
            authenticationTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(authenticationTableScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );
        authenticationTablePanelLayout.setVerticalGroup(
            authenticationTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(authenticationTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(authenticationComponentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(authenticationTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(authenticationTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(authenticationComponentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        clear();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
       UserAccountAuthenticationInfo userAccountAuthenticationInfo =new UserAccountAuthenticationInfo();
            userAccountAuthenticationInfo.setId(UUID.randomUUID().toString());
            userAccountAuthenticationInfo.setUsers((UserInfo) usersComboBox.getSelectedItem());
            userAccountAuthenticationInfo.setAccounts((AccountInfo) accountsComboBox.getSelectedItem());
            userAccountAuthenticationInfo.setDetails(DetailsField.getText());
       authenticationTableModel.addRow(userAccountAuthenticationInfo);
        clear();
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
         int selectedRow = userAuthenticationDetailsTalbe.getSelectedRow();
         
            if(selectedRow>=0){
                UserAccountAuthenticationInfo userAccountAuthenticationInfo =authenticationTableModel.getAuthenticatedAccount(selectedRow);
         
                    userAccountAuthenticationInfo.setUsers((UserInfo) usersComboBox.getSelectedItem());
                    userAccountAuthenticationInfo.setAccounts((AccountInfo) accountsComboBox.getSelectedItem());
                    userAccountAuthenticationInfo.setDetails(DetailsField.getText());
                authenticationTableModel.updateRow(selectedRow, userAccountAuthenticationInfo);
                clear();
            }else{
                JOptionPane.showMessageDialog(this, "Please select a row first.");
            }
              
    }//GEN-LAST:event_updateButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int selectedRow = userAuthenticationDetailsTalbe.getSelectedRow();
         
            if(selectedRow>=0){
                authenticationTableModel.deleteRow(selectedRow);
            }else{
                JOptionPane.showMessageDialog(this, "Please select a row first.");
            }
    }//GEN-LAST:event_removeButtonActionPerformed

    

    public void clear(){
   accountsComboBox.setSelectedIndex(0);
   usersComboBox.setSelectedIndex(0);
   DetailsField.setText("");
}

public void loadUser(){
        ArrayList<UserInfo> userList=UserDataManager.load();
        accountsComboBox.removeAllItems();
        
        if(userList != null){
            for (int i=0; i <userList.size();i++){
                UserInfo userInfo= userList.get(i);
                UserInfo user = LoggedInUser.getInstance().getUser();
                if(!userInfo.equals(user)){
                    usersComboBox.addItem(userInfo);
                }
                    
            }
        }
    }

 public void loadAccount(){
        ArrayList<AccountInfo> accountList = AccountDataManager.getUserAccountList();
        accountsComboBox.removeAllItems();
        
        if(accountList != null){
            for (int i=0; i <accountList.size();i++){
                AccountInfo accountInfo = accountList.get(i);
                    accountsComboBox.addItem(accountInfo); 
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DetailsField;
    private javax.swing.JComboBox<AccountInfo> accountsComboBox;
    private javax.swing.JLabel accountsLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel authenticationComponentPanel;
    private javax.swing.JPanel authenticationTablePanel;
    private javax.swing.JScrollPane authenticationTableScrollPane;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JLabel categoryDetailsLabel;
    private javax.swing.JScrollPane detailsScrollPane;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JTable userAuthenticationDetailsTalbe;
    private javax.swing.JComboBox<UserInfo> usersComboBox;
    private javax.swing.JLabel usersLabel;
    // End of variables declaration//GEN-END:variables
private UserAccountAuthenticationTableModel authenticationTableModel;
}
