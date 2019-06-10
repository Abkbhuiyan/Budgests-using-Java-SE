
package ac.daffodil.l4dc1000084.budgets.gui;

import ac.daffodil.l4dc1000084.budgets.bean.AccountInfo;
import ac.daffodil.l4dc1000084.budgets.gui.TableModel.AccountInfoTableModel;
import ac.daffodil.l4dc1000084.budgets.gui.dataManager.AccountDataManager;
import ac.daffodil.l4dc1000084.budgets.gui.dataManager.LoggedInUser;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class AccountUI extends javax.swing.JInternalFrame {

    public AccountUI() {
        initComponents();
  
         initialAmountField.setText("500.00");
          
         accountDetailsTalbe.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedRow=accountDetailsTalbe.getSelectedRow();
                
                if (selectedRow>=0){
                    AccountInfo accountInfo = accountInfoTableModel.getAccount(selectedRow);
                    if(accountInfo != null){

                        accountNoField.setText(accountInfo.getAccountNo());
                        accountNameField.setText(accountInfo.getAccountName());
                        acHolderField.setText(accountInfo.getAcHolderName());
                        bankNameField.setText(accountInfo.getBankName());
                        occupationComboBox.setSelectedItem(accountInfo.getOccupation());
                        initialAmountField.setText(String.valueOf(accountInfo.getInitialAmount()));
                        accountTypeComboBox.setSelectedItem(accountInfo.getAccountType());
                        billingDateField.setDate(accountInfo.getBillingDate());
                        paymentDateField.setDate(accountInfo.getPaymentDate());
                        notesAreaField.setText(accountInfo.getNotes());
                        
                    }
                }
            }
            
        });
         
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accountComponentsPanel = new javax.swing.JPanel();
        accountNoLabel = new javax.swing.JLabel();
        accountNoField = new javax.swing.JTextField();
        accountNameLabel = new javax.swing.JLabel();
        accountNameField = new javax.swing.JTextField();
        acHolderLabel = new javax.swing.JLabel();
        acHolderField = new javax.swing.JTextField();
        bankLabel = new javax.swing.JLabel();
        bankNameField = new javax.swing.JTextField();
        billingDateLabel = new javax.swing.JLabel();
        billingDateField = new com.toedter.calendar.JDateChooser();
        occupationLabel = new javax.swing.JLabel();
        initialAmountField = new javax.swing.JTextField();
        notesLabel = new javax.swing.JLabel();
        notesScrollPane = new javax.swing.JScrollPane();
        notesAreaField = new javax.swing.JTextArea();
        occupationComboBox = new javax.swing.JComboBox<>();
        accountTypeLabel = new javax.swing.JLabel();
        accountTypeComboBox = new javax.swing.JComboBox<>();
        initialAmountLabel = new javax.swing.JLabel();
        paymentDateLabel = new javax.swing.JLabel();
        paymentDateField = new com.toedter.calendar.JDateChooser();
        buttonPanel = new javax.swing.JPanel();
        createButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        accountTablePanel = new javax.swing.JPanel();
        accountTableScrollPane = new javax.swing.JScrollPane();
        accountInfoTableModel=new AccountInfoTableModel();
        accountDetailsTalbe = new javax.swing.JTable();

        setBackground(java.awt.Color.cyan);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Accounts");
        setName("userUIInternalForm"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1056, 627));

        accountComponentsPanel.setBackground(java.awt.Color.cyan);
        accountComponentsPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        accountNoLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        accountNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountNoLabel.setText("Account No");
        accountNoLabel.setName("firstNaleLabel"); // NOI18N

        accountNoField.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        accountNameLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        accountNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountNameLabel.setText("Account Name");
        accountNameLabel.setName("firstNaleLabel"); // NOI18N

        accountNameField.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        acHolderLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        acHolderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acHolderLabel.setText("Ac Holder Name");
        acHolderLabel.setName("firstNaleLabel"); // NOI18N

        acHolderField.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        bankLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        bankLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bankLabel.setText("Bank");
        bankLabel.setName("firstNaleLabel"); // NOI18N

        bankNameField.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        billingDateLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        billingDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        billingDateLabel.setText("Billing Date");
        billingDateLabel.setName("firstNaleLabel"); // NOI18N

        occupationLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        occupationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        occupationLabel.setText("Occupation Of AC Holder");
        occupationLabel.setName("firstNaleLabel"); // NOI18N

        initialAmountField.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        notesLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        notesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notesLabel.setText("Notes");
        notesLabel.setName("firstNaleLabel"); // NOI18N

        notesAreaField.setColumns(20);
        notesAreaField.setRows(5);
        notesScrollPane.setViewportView(notesAreaField);

        occupationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Student", "Private Job Holder", "Govt. Employee", "Business Man" }));

        accountTypeLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        accountTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountTypeLabel.setText("Account Type");
        accountTypeLabel.setName("firstNaleLabel"); // NOI18N

        accountTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Account Type", "Home", "Shared", "Discretionary" }));

        initialAmountLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        initialAmountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        initialAmountLabel.setText("Initial Amount");
        initialAmountLabel.setName("firstNaleLabel"); // NOI18N

        paymentDateLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        paymentDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paymentDateLabel.setText("Payment Date");
        paymentDateLabel.setName("firstNaleLabel"); // NOI18N

        javax.swing.GroupLayout accountComponentsPanelLayout = new javax.swing.GroupLayout(accountComponentsPanel);
        accountComponentsPanel.setLayout(accountComponentsPanelLayout);
        accountComponentsPanelLayout.setHorizontalGroup(
            accountComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountComponentsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accountComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accountNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acHolderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bankLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paymentDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(billingDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(initialAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(occupationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(accountComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notesScrollPane)
                    .addComponent(occupationComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(accountComponentsPanelLayout.createSequentialGroup()
                        .addGroup(accountComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(accountNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accountNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acHolderField, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bankNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(accountTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(initialAmountField)
                    .addComponent(billingDateField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paymentDateField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        accountComponentsPanelLayout.setVerticalGroup(
            accountComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountComponentsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accountComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(accountComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(accountComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acHolderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acHolderField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(accountComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bankNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(accountComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(occupationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(occupationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(accountComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(accountComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(initialAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(initialAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(accountComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(billingDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billingDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(accountComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paymentDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(accountComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        buttonPanel.setBackground(java.awt.Color.cyan);
        buttonPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        createButton.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        createButton.setText("Create Account");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        removeButton.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        removeButton.setText("Remove Account");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        updateButton.setText("Update Account");
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
                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(removeButton)
                    .addComponent(updateButton)
                    .addComponent(refreshButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        accountTablePanel.setBackground(java.awt.Color.cyan);
        accountTablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Accounts Details"));

        accountTableScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        accountTableScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        accountDetailsTalbe.setModel(accountInfoTableModel);
        accountDetailsTalbe.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        accountTableScrollPane.setViewportView(accountDetailsTalbe);

        javax.swing.GroupLayout accountTablePanelLayout = new javax.swing.GroupLayout(accountTablePanel);
        accountTablePanel.setLayout(accountTablePanelLayout);
        accountTablePanelLayout.setHorizontalGroup(
            accountTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accountTableScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );
        accountTablePanelLayout.setVerticalGroup(
            accountTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accountTableScrollPane)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accountComponentsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accountTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(accountComponentsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        refresh();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        
        AccountInfo accountInfo=new AccountInfo();
        
        accountInfo.setAccountId(UUID.randomUUID().toString());

        accountInfo.setUserInfo(LoggedInUser.getInstance().getUser());
       
        if (accountNoField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Account number field cannot be blank.");
            return;
        }else if (accountNoField.getText().trim().matches("[a-zA-Z]+")){
            JOptionPane.showMessageDialog(this, "Account number should be in digit, characters are not allowed.");
            return;
        }
       
   
        if(accountNameField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Account name cannot be empty");
            return;
         }else if(accountNameField.getText().trim().matches(".*\\d+.*")){
            JOptionPane.showMessageDialog(this, "Please Enter a valid account name.");
            return;
        }
       
        if(AccountDataManager.isAccountExist(accountNoField.getText(), accountNameField.getText())== true){
            JOptionPane.showMessageDialog(AccountUI.this, "This Account is already used try another Account.");
           return;
        }else{
            accountInfo.setAccountNo(accountNoField.getText());
            accountInfo.setAccountName(accountNameField.getText());
        }
        
        
        if(acHolderField.getText().trim().matches(".*\\d+.*")){
            JOptionPane.showMessageDialog(this, "Please Enter a Vslid Name");
            return;
        }else{
            accountInfo.setAcHolderName(acHolderField.getText());
        }
       
        if(bankNameField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "You must Enter a Bank name.");
            return; 
        }else if(bankNameField.getText().trim().matches(".*\\d+.*")){
            JOptionPane.showMessageDialog(this, "Bank name must be in Letter no digits are allowed.");
            return;
        }else{
            accountInfo.setBankName(bankNameField.getText());
        }
       
        if(occupationComboBox.getSelectedIndex()>0){
            accountInfo.setOccupation(occupationComboBox.getSelectedItem().toString());
        }
          if(accountTypeComboBox.getSelectedIndex()>0){
            accountInfo.setAccountType(accountTypeComboBox.getSelectedItem().toString());
        }else{
            JOptionPane.showMessageDialog(this, "One Account type required! Please select one account type");
            return;
        }
       
        if (initialAmountField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "You must keep some money to create an account");
            return;
        }else{
            try{
                 accountInfo.setInitialAmount(Double.parseDouble(initialAmountField.getText()));
            }catch (NumberFormatException nfe){
                 JOptionPane.showMessageDialog(this, "Amount must be in digits.");
                 return;
            }
       
        }
        
        accountInfo.setBillingDate(billingDateField.getDate());
        accountInfo.setPaymentDate(paymentDateField.getDate());
        accountInfo.setNotes(notesAreaField.getText());
        accountInfo.setBalance(accountInfo.getInitialAmount());
        
        accountInfoTableModel.addRow(accountInfo);
        refresh();
    }//GEN-LAST:event_createButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
          int selectedRow=accountDetailsTalbe.getSelectedRow();
                
                if (selectedRow>=0){
                  
                    AccountInfo accountInfo=accountInfoTableModel.getAccount(selectedRow);

                    if (accountNoField.getText().trim().isEmpty()){
                          JOptionPane.showMessageDialog(this, "Account number field cannot be blank.");
                          return;
                    }else if (accountNoField.getText().trim().matches("[a-zA-Z]+")){
                          JOptionPane.showMessageDialog(this, "Account number should be in digit, characters are not allowed.");
                          return;
                    }


                    if(accountNameField.getText().trim().isEmpty()){
                          JOptionPane.showMessageDialog(this, "Account name cannot be empty");
                          return;
                    }else if(accountNameField.getText().trim().matches(".*\\d+.*")){
                          JOptionPane.showMessageDialog(this, "Please Enter a valid account name.");
                          return;
                    }

                    if(AccountDataManager.isAccountExist(accountNoField.getText(), accountNameField.getText())== true){
                          JOptionPane.showMessageDialog(AccountUI.this, "This Account is already used try another Account.");
                         return;
                    }else{
                          accountInfo.setAccountNo(accountNoField.getText());
                          accountInfo.setAccountName(accountNameField.getText());
                    }

                    if(acHolderField.getText().trim().matches(".*\\d+.*")){
                          JOptionPane.showMessageDialog(this, "Please Enter a Vslid Name");
                          return;
                    }else{
                          accountInfo.setAcHolderName(acHolderField.getText());
                    }

                    if(bankNameField.getText().trim().isEmpty()){
                          JOptionPane.showMessageDialog(this, "You must Enter a Bank name.");
                          return; 
                    }else if(bankNameField.getText().trim().matches(".*\\d+.*")){
                          JOptionPane.showMessageDialog(this, "Bank name must be in Letter no digits are allowed.");
                          return;
                    }else{
                          accountInfo.setBankName(bankNameField.getText());
                    }

                    if(occupationComboBox.getSelectedIndex()>0){
                          accountInfo.setOccupation(occupationComboBox.getSelectedItem().toString());
                    }
                    
                    if (initialAmountField.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(this, "You must keep some money to create an account");
                        return;
                    }else{
                        try{
                             accountInfo.setInitialAmount(Double.parseDouble(initialAmountField.getText()));
                        }catch (NumberFormatException nfe){
                             JOptionPane.showMessageDialog(this, "Amount must be in digits.");
                             return;
                        }
       
                     }

                    if(accountTypeComboBox.getSelectedIndex()>0){
                          accountInfo.setAccountType(accountTypeComboBox.getSelectedItem().toString());
                    }else{
                          JOptionPane.showMessageDialog(this, "One Account type required! Please select one account type");
                          return;
                    }


                      accountInfo.setBillingDate(billingDateField.getDate());
                      accountInfo.setPaymentDate(paymentDateField.getDate());
                      accountInfo.setNotes(notesAreaField.getText());



                    accountInfoTableModel.updateRow(selectedRow,accountInfo);
                    refresh();
                    }else{
                    JOptionPane.showMessageDialog(this, "Please select a row first.");
                }
           
              
    }//GEN-LAST:event_updateButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
         int selectedRow=accountDetailsTalbe.getSelectedRow();
                
                if (selectedRow>=0){
                    accountInfoTableModel.deleteRow(selectedRow);
                    refresh();
                }else{
                    JOptionPane.showMessageDialog(this, "Please select a row first.");
                }
    }//GEN-LAST:event_removeButtonActionPerformed

    public void refresh(){
              accountNoField.setText("");
              accountNameField.setText("");
              acHolderField.setText("");
              bankNameField.setText("");
              occupationComboBox.setSelectedIndex(0);
              initialAmountField.setText("500.00");
              accountTypeComboBox.setSelectedIndex(0);
              billingDateField.setDate(null);
              paymentDateField.setDate(null);
              notesAreaField.setText("");
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acHolderField;
    private javax.swing.JLabel acHolderLabel;
    private javax.swing.JPanel accountComponentsPanel;
    private javax.swing.JTable accountDetailsTalbe;
    private javax.swing.JTextField accountNameField;
    private javax.swing.JLabel accountNameLabel;
    private javax.swing.JTextField accountNoField;
    private javax.swing.JLabel accountNoLabel;
    private javax.swing.JPanel accountTablePanel;
    private javax.swing.JScrollPane accountTableScrollPane;
    private javax.swing.JComboBox<String> accountTypeComboBox;
    private javax.swing.JLabel accountTypeLabel;
    private javax.swing.JLabel bankLabel;
    private javax.swing.JTextField bankNameField;
    private com.toedter.calendar.JDateChooser billingDateField;
    private javax.swing.JLabel billingDateLabel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField initialAmountField;
    private javax.swing.JLabel initialAmountLabel;
    private javax.swing.JTextArea notesAreaField;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JScrollPane notesScrollPane;
    private javax.swing.JComboBox<String> occupationComboBox;
    private javax.swing.JLabel occupationLabel;
    private com.toedter.calendar.JDateChooser paymentDateField;
    private javax.swing.JLabel paymentDateLabel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
private AccountInfoTableModel accountInfoTableModel;
}
