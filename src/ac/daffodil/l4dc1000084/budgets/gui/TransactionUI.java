
package ac.daffodil.l4dc1000084.budgets.gui;

import ac.daffodil.l4dc1000084.budgets.bean.AccountInfo;
import ac.daffodil.l4dc1000084.budgets.bean.CategoryInfo;
import ac.daffodil.l4dc1000084.budgets.bean.TransactionInfo;
import ac.daffodil.l4dc1000084.budgets.gui.TableModel.TransactionInfoTableModel;
import ac.daffodil.l4dc1000084.budgets.gui.dataManager.AccountDataManager;
import ac.daffodil.l4dc1000084.budgets.gui.dataManager.CategoryDataManager;
import ac.daffodil.l4dc1000084.budgets.gui.dataManager.TransactionDataManager;
import java.util.ArrayList;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class TransactionUI extends javax.swing.JInternalFrame {

    public TransactionUI() {
        initComponents();
            loadAccount();
        accountToTransferComboBox.setVisible(false);
        accountToTransferLabel.setVisible(false);
        totalAmountField.setEditable(false); 
        totalAmountField.setText(String.valueOf(transactionInfoTableModel.getTotal()));
        
        //retrieving a transaction
        transactionDetailsTalbe.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                    int selectedRow=transactionDetailsTalbe.getSelectedRow();    
                    
                    if(selectedRow>=0){
                        TransactionInfo transactionInfo=transactionInfoTableModel.getTransaction(selectedRow);
                        
                        if(transactionInfo != null){
                            dateField.setDate(transactionInfo.getTransactionDate());
                            transactionTypeComboBox.setSelectedItem(transactionInfo.getTransactionType());
                            amountField.setText(String.valueOf(transactionInfo.getTransactionAmount()));
                            accountComboBox.setSelectedItem(transactionInfo.getAcoountName());
                            categoryListComboBox.setSelectedItem(transactionInfo.getTransactionCategory());
                            payeeField.setText(transactionInfo.getPayeeName());
                            notesAreaField. setText(transactionInfo.getTransactionDetails());
                            if(transactionInfo.getAcoountToTransfer() != null && transactionInfo.getTransactionType().equalsIgnoreCase("Transfer")){
                                accountToTransferComboBox.setVisible(true);
                                accountToTransferComboBox.setSelectedItem(transactionInfo.getAcoountToTransfer());
                                
                            }                          
                        }
                    }
            }
        });
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transactionComponentsPanel = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        transactionTypeLabel = new javax.swing.JLabel();
        accountLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        dateField = new com.toedter.calendar.JDateChooser();
        amountLabel = new javax.swing.JLabel();
        payeeField = new javax.swing.JTextField();
        notesLabel = new javax.swing.JLabel();
        notesScrollPane = new javax.swing.JScrollPane();
        notesAreaField = new javax.swing.JTextArea();
        transactionTypeComboBox = new javax.swing.JComboBox<>();
        payeeLabel = new javax.swing.JLabel();
        accountComboBox = new javax.swing.JComboBox<>();
        categoryListComboBox = new javax.swing.JComboBox<>();
        accountToTransferLabel = new javax.swing.JLabel();
        accountToTransferComboBox = new javax.swing.JComboBox<>();
        buttonPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        transactionTablePanel = new javax.swing.JPanel();
        transactionTableScrollPane = new javax.swing.JScrollPane();
        transactionInfoTableModel=new TransactionInfoTableModel();
        transactionDetailsTalbe = new javax.swing.JTable();
        totalAmountPanel = new javax.swing.JPanel();
        totalAmountField = new javax.swing.JTextField();
        totalAmountLabel = new javax.swing.JLabel();

        setBackground(java.awt.Color.cyan);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Transaction");
        setName("userUIInternalForm"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1056, 627));

        transactionComponentsPanel.setBackground(java.awt.Color.cyan);
        transactionComponentsPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        dateLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLabel.setText("Date");
        dateLabel.setName("firstNaleLabel"); // NOI18N

        transactionTypeLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        transactionTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        transactionTypeLabel.setText("Transaction Type");
        transactionTypeLabel.setName("firstNaleLabel"); // NOI18N

        accountLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        accountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountLabel.setText("Account");
        accountLabel.setName("firstNaleLabel"); // NOI18N

        categoryLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        categoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryLabel.setText("Category");
        categoryLabel.setName("firstNaleLabel"); // NOI18N

        amountField.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        amountLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        amountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amountLabel.setText("Transaction Amount");
        amountLabel.setName("firstNaleLabel"); // NOI18N

        payeeField.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        notesLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        notesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notesLabel.setText("Notes");
        notesLabel.setName("firstNaleLabel"); // NOI18N

        notesAreaField.setColumns(20);
        notesAreaField.setRows(5);
        notesScrollPane.setViewportView(notesAreaField);

        transactionTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Income", "Expense", "Transfer" }));
        transactionTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionTypeComboBoxActionPerformed(evt);
            }
        });

        payeeLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        payeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        payeeLabel.setText("Payee");
        payeeLabel.setName("firstNaleLabel"); // NOI18N

        accountComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountComboBoxActionPerformed(evt);
            }
        });

        accountToTransferLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        accountToTransferLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountToTransferLabel.setText("Account to Transfer");
        accountToTransferLabel.setName("firstNaleLabel"); // NOI18N

        javax.swing.GroupLayout transactionComponentsPanelLayout = new javax.swing.GroupLayout(transactionComponentsPanel);
        transactionComponentsPanel.setLayout(transactionComponentsPanelLayout);
        transactionComponentsPanelLayout.setHorizontalGroup(
            transactionComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionComponentsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transactionComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accountToTransferLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payeeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amountLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoryLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transactionTypeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(transactionComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notesScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(dateField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transactionTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoryListComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amountField)
                    .addComponent(payeeField)
                    .addComponent(accountToTransferComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        transactionComponentsPanelLayout.setVerticalGroup(
            transactionComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionComponentsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transactionComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateField, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(transactionComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transactionTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transactionTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(transactionComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accountComboBox)
                    .addComponent(accountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(transactionComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(categoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoryListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(transactionComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(amountField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(amountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(transactionComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payeeField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(transactionComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accountToTransferComboBox)
                    .addComponent(accountToTransferLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(transactionComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonPanel.setBackground(java.awt.Color.cyan);
        buttonPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        addButton.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        addButton.setText("Add Transaction");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        removeButton.setText("Remove Transaction");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        updateButton.setText("Update Transaction");
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
                .addComponent(refreshButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(addButton)
                .addGap(25, 25, 25))
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

        transactionTablePanel.setBackground(java.awt.Color.cyan);
        transactionTablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Transaction Details"));

        transactionTableScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        transactionTableScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        transactionDetailsTalbe.setModel(transactionInfoTableModel);
        transactionDetailsTalbe.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        transactionTableScrollPane.setViewportView(transactionDetailsTalbe);

        javax.swing.GroupLayout transactionTablePanelLayout = new javax.swing.GroupLayout(transactionTablePanel);
        transactionTablePanel.setLayout(transactionTablePanelLayout);
        transactionTablePanelLayout.setHorizontalGroup(
            transactionTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(transactionTableScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );
        transactionTablePanelLayout.setVerticalGroup(
            transactionTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(transactionTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        totalAmountPanel.setBackground(java.awt.Color.cyan);
        totalAmountPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        totalAmountField.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        totalAmountLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        totalAmountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalAmountLabel.setText("Total");
        totalAmountLabel.setName("firstNaleLabel"); // NOI18N

        javax.swing.GroupLayout totalAmountPanelLayout = new javax.swing.GroupLayout(totalAmountPanel);
        totalAmountPanel.setLayout(totalAmountPanelLayout);
        totalAmountPanelLayout.setHorizontalGroup(
            totalAmountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalAmountPanelLayout.createSequentialGroup()
                .addComponent(totalAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        totalAmountPanelLayout.setVerticalGroup(
            totalAmountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, totalAmountPanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(totalAmountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(transactionComponentsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transactionTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalAmountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transactionTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transactionComponentsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalAmountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        refresh();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
            TransactionInfo transactionInfo=new TransactionInfo();

            transactionInfo.setTransactionId(UUID.randomUUID().toString());

            //checking transaction date
            if (dateField.getDate()== null){
                JOptionPane.showMessageDialog(this, "Date field cannot be blank.");
                dateField.grabFocus();
                return;

            }else{
                transactionInfo.setTransactionDate(dateField.getDate());
            }
            //checking transactiion type
            if(transactionTypeComboBox.getSelectedIndex()<1){
                JOptionPane.showMessageDialog(this, "Please select one transaction type.");
                transactionTypeComboBox.grabFocus();
                return;
            }else{
                transactionInfo.setTransactionType(transactionTypeComboBox.getSelectedItem().toString());
            }
            //validating transaction amount
            if(amountField.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "You must enter the transaction amount.");
                amountField.grabFocus();
                return;
            }else if(amountField.getText().trim().matches("[a-zA-z]+")){
                JOptionPane.showMessageDialog(this, "You must enter a digit into Amount field.");
                amountField.grabFocus();
                return;
            }else{
                transactionInfo.setTransactionAmount(Double.parseDouble(amountField.getText()));
            }
            //checking transaction account
            if(accountComboBox.getSelectedIndex()<0){
                JOptionPane.showMessageDialog(this, "You must select one account.");
                accountComboBox.grabFocus();
                return;
            }else{
                transactionInfo.setAcoountName((AccountInfo) accountComboBox.getSelectedItem());
            }
            
            if(categoryListComboBox.getSelectedIndex()<0){
                JOptionPane.showMessageDialog(this, "You must select one Transaction category.");
                categoryListComboBox.grabFocus();
                return;
            }else{
                transactionInfo.setTransactionhCategory((CategoryInfo) categoryListComboBox.getSelectedItem());
            }
            
            
            if(transactionTypeComboBox.getSelectedItem().equals("Transfer")){
                transactionInfo.setAcoountToTransfer((AccountInfo) accountToTransferComboBox.getSelectedItem());
            }
             transactionInfo.setPayeeName(payeeField.getText());   
            transactionInfo.setTransactionDetails(notesAreaField.getText());

                TransactionDataManager.updateBalanceForNewTransaction(transactionInfo);
             transactionInfoTableModel.addRow(transactionInfo);
             
             totalAmountField.setText(String.valueOf(transactionInfoTableModel.getTotal()));

             refresh();
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
            int selectedRow=transactionDetailsTalbe.getSelectedRow();
            
            if(selectedRow>=0){
                TransactionInfo transactionInfo=transactionInfoTableModel.getTransaction(selectedRow);
                //checkinh that transaction date is entered
            if (dateField.getDate()== null){
                JOptionPane.showMessageDialog(this, "Date field cannot be blank.");
                dateField.grabFocus();
                return;

            }else{
                transactionInfo.setTransactionDate(dateField.getDate());
            }
            //checking transaction type
            if(transactionTypeComboBox.getSelectedIndex()<1){
                JOptionPane.showMessageDialog(this, "Please select one transaction type.");
                transactionTypeComboBox.grabFocus();
                return;
            }else{
                transactionInfo.setTransactionType(transactionTypeComboBox.getSelectedItem().toString());
            }
            //Amount validation
            if(amountField.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "You must enter the transaction amount.");
                amountField.grabFocus();
                return;
            }else if(amountField.getText().trim().matches("[a-zA-z]+")){
                JOptionPane.showMessageDialog(this, "You must enter a digit into Amount field.");
                amountField.grabFocus();
                return;
            }else{
                transactionInfo.setTransactionAmount(Double.parseDouble(amountField.getText()));
            }
            //Checking account
            if(accountComboBox.getSelectedIndex()<0){
                JOptionPane.showMessageDialog(this, "You must select one account.");
                accountComboBox.grabFocus();
                return;
            }else{
                transactionInfo.setAcoountName((AccountInfo) accountComboBox.getSelectedItem());
            }

            if(categoryListComboBox.getSelectedIndex()<0){
                JOptionPane.showMessageDialog(this, "You must select one Transaction category.");
                categoryListComboBox.grabFocus();
                return;
            }else{
                transactionInfo.setTransactionhCategory((CategoryInfo) categoryListComboBox.getSelectedItem());
            }
            
                transactionInfo.setPayeeName(payeeField.getText());
            
            if(transactionTypeComboBox.getSelectedItem().equals("Transfer")){
                transactionInfo.setAcoountToTransfer((AccountInfo) accountToTransferComboBox.getSelectedItem());
            }
           transactionInfo.setTransactionDetails(notesAreaField.getText());



            TransactionDataManager.updateBalanceForUpdatedTransaction(transactionInfo);
             transactionInfoTableModel.updateRow(selectedRow,transactionInfo);
             totalAmountField.setText(String.valueOf(transactionInfoTableModel.getTotal()));
             refresh();
            }else{
                JOptionPane.showMessageDialog(this, "Please select a row first.");
            }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
         int selectedRow=transactionDetailsTalbe.getSelectedRow();
            if(selectedRow>=0){
                transactionInfoTableModel.deleteRow(selectedRow);
                totalAmountField.setText(String.valueOf(transactionInfoTableModel.getTotal()));
                refresh();
        }else{
             JOptionPane.showMessageDialog(this, "Please select a row first.");
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void transactionTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionTypeComboBoxActionPerformed
        loadCategory();
        if(transactionTypeComboBox.getSelectedItem().equals("Transfer")){
            accountToTransferLabel.setVisible(true);
            accountToTransferComboBox.setVisible(true);
        }else{
            accountToTransferLabel.setVisible(false);
            accountToTransferComboBox.setVisible(false);
        }
    }//GEN-LAST:event_transactionTypeComboBoxActionPerformed

    private void accountComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountComboBoxActionPerformed
        loadAccountToTransfer();
    }//GEN-LAST:event_accountComboBoxActionPerformed

    public void refresh(){
            dateField.setDate(null);
            accountComboBox.setSelectedIndex(0);
            amountField.setText("");
            categoryListComboBox.setSelectedIndex(0);
            transactionTypeComboBox.setSelectedIndex(0);
            payeeField.setText("");
            notesAreaField.setText("");
            if(accountToTransferComboBox.isVisible()){
                accountToTransferComboBox.setSelectedIndex(0);
            }
    }
    
     public void loadAccount(){
        ArrayList<AccountInfo> accountList=AccountDataManager.getUserAccountList();
        accountComboBox.removeAllItems();
        
        if(accountList != null){
            for (int i=0; i <accountList.size();i++){
                AccountInfo accountInfo = accountList.get(i);
                 
                    accountComboBox.addItem(accountInfo);
                 
            }
        }
    }
    public void loadAccountToTransfer(){
        ArrayList<AccountInfo> accountList=AccountDataManager.getUserAccountList();
        accountToTransferComboBox.removeAllItems();
        
        if(accountList != null){
            for (int i=0; i <accountList.size();i++){
                AccountInfo accountInfo = accountList.get(i);
                 if(!accountList.get(i).equals(accountComboBox.getSelectedItem())) {
                     accountToTransferComboBox.addItem(accountInfo);
                 }
            }
        }
    }
    public void loadCategory(){
        ArrayList<CategoryInfo> categoryList=CategoryDataManager.load();
        categoryListComboBox.removeAllItems();
        
        if(categoryList != null){
            if(transactionTypeComboBox.getSelectedItem().equals("Income")){
                
                 for (int i=0; i <categoryList.size();i++){
                     CategoryInfo categoryInfo = categoryList.get(i);
                     if(categoryInfo.getCatyegoryType().equalsIgnoreCase("Income")){
                         categoryListComboBox.addItem(categoryList.get(i));
                     }
                }
            }else if(transactionTypeComboBox.getSelectedItem().equals("Expense")){
                
                 for (int i=0; i <categoryList.size();i++){
                     CategoryInfo categoryInfo = categoryList.get(i);
                     if(categoryInfo.getCatyegoryType().equalsIgnoreCase("Expense")){
                         categoryListComboBox.addItem(categoryList.get(i));
                     }
                }
            }else if(transactionTypeComboBox.getSelectedItem().equals("Transfer")){
                
                 for (int i=0; i <categoryList.size();i++){
                     CategoryInfo categoryInfo = categoryList.get(i);
                     if(categoryInfo.getCatyegoryType().equalsIgnoreCase("Transfer")){
                         categoryListComboBox.addItem(categoryList.get(i));
                     }
                }
            }
        }
    }
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<AccountInfo> accountComboBox;
    private javax.swing.JLabel accountLabel;
    private javax.swing.JComboBox<AccountInfo> accountToTransferComboBox;
    private javax.swing.JLabel accountToTransferLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField amountField;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JComboBox<CategoryInfo> categoryListComboBox;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextArea notesAreaField;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JScrollPane notesScrollPane;
    private javax.swing.JTextField payeeField;
    private javax.swing.JLabel payeeLabel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField totalAmountField;
    private javax.swing.JLabel totalAmountLabel;
    private javax.swing.JPanel totalAmountPanel;
    private javax.swing.JPanel transactionComponentsPanel;
    private javax.swing.JTable transactionDetailsTalbe;
    private javax.swing.JPanel transactionTablePanel;
    private javax.swing.JScrollPane transactionTableScrollPane;
    private javax.swing.JComboBox<String> transactionTypeComboBox;
    private javax.swing.JLabel transactionTypeLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
private TransactionInfoTableModel transactionInfoTableModel;
}
