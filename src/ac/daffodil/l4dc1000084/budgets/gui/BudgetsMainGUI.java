
package ac.daffodil.l4dc1000084.budgets.gui;

import ac.daffodil.l4dc1000084.budgets.gui.dataManager.ScheduleDataManager;
import ac.daffodil.l4dc1000084.budgets.gui.dataManager.TransactionDataManager;
import javax.swing.JOptionPane;


public class BudgetsMainGUI extends javax.swing.JFrame {

    public BudgetsMainGUI() {
        initComponents();
        
        ScheduleDataManager.addScheduledTransactions();
        TransactionDataManager.updateEstimatedBalance();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        formsMenu = new javax.swing.JMenu();
        userMenuItem = new javax.swing.JMenuItem();
        accountsMenuItem = new javax.swing.JMenuItem();
        categoryMenuItem = new javax.swing.JMenuItem();
        transactionMenuItem = new javax.swing.JMenuItem();
        scheduledTransactionMenuItem = new javax.swing.JMenuItem();
        userAccountAuthenticationMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BUDGETS");
        setName("budgetsMainGUI"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1082, 700));

        desktopPane.setBackground(java.awt.Color.cyan);

        menuBar.setBackground(java.awt.Color.lightGray);
        menuBar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        formsMenu.setMnemonic('f');
        formsMenu.setText("Forms");

        userMenuItem.setMnemonic('o');
        userMenuItem.setText("Users");
        userMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userMenuItemActionPerformed(evt);
            }
        });
        formsMenu.add(userMenuItem);

        accountsMenuItem.setMnemonic('s');
        accountsMenuItem.setText("Accounts");
        accountsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountsMenuItemActionPerformed(evt);
            }
        });
        formsMenu.add(accountsMenuItem);

        categoryMenuItem.setMnemonic('a');
        categoryMenuItem.setText("Category");
        categoryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryMenuItemActionPerformed(evt);
            }
        });
        formsMenu.add(categoryMenuItem);

        transactionMenuItem.setText("Transaction");
        transactionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionMenuItemActionPerformed(evt);
            }
        });
        formsMenu.add(transactionMenuItem);

        scheduledTransactionMenuItem.setText("Scheduled Transaction");
        scheduledTransactionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduledTransactionMenuItemActionPerformed(evt);
            }
        });
        formsMenu.add(scheduledTransactionMenuItem);

        userAccountAuthenticationMenuItem.setText("Conrtoll User Acces to Accounts");
        userAccountAuthenticationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAccountAuthenticationMenuItemActionPerformed(evt);
            }
        });
        formsMenu.add(userAccountAuthenticationMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        formsMenu.add(exitMenuItem);

        menuBar.add(formsMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
    
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?");
        
        if (option == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void userMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userMenuItemActionPerformed
        UserUI userUI = new UserUI();
        userUI.setVisible(true);
        desktopPane.add(userUI);
    }//GEN-LAST:event_userMenuItemActionPerformed

    private void accountsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountsMenuItemActionPerformed
        AccountUI accountUI=new AccountUI();
        accountUI.setVisible(true);
        desktopPane.add(accountUI);
    }//GEN-LAST:event_accountsMenuItemActionPerformed

    private void categoryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryMenuItemActionPerformed
        CategoryUI categoryUI = new CategoryUI();
        categoryUI.setVisible(true);
        desktopPane.add(categoryUI);
    }//GEN-LAST:event_categoryMenuItemActionPerformed

    private void transactionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionMenuItemActionPerformed
        TransactionUI transactionUI = new TransactionUI();
        transactionUI.setVisible(true);
        desktopPane.add(transactionUI);
    }//GEN-LAST:event_transactionMenuItemActionPerformed

    private void scheduledTransactionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduledTransactionMenuItemActionPerformed
        ScheduleUI scheduleUI = new ScheduleUI();
        scheduleUI.setVisible(true);
        desktopPane.add(scheduleUI);
    }//GEN-LAST:event_scheduledTransactionMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        JOptionPane.showMessageDialog
				(this, "Budgets version1.0\n\nDeveloped by Abdullah Bin Kasem Bhuiyan");
			
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void userAccountAuthenticationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAccountAuthenticationMenuItemActionPerformed
        UserAutenticationUI autenticationUI = new UserAutenticationUI();
        autenticationUI.setVisible(true);
        desktopPane.add(autenticationUI);
    }//GEN-LAST:event_userAccountAuthenticationMenuItemActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BudgetsMainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem accountsMenuItem;
    private javax.swing.JMenuItem categoryMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu formsMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem scheduledTransactionMenuItem;
    private javax.swing.JMenuItem transactionMenuItem;
    private javax.swing.JMenuItem userAccountAuthenticationMenuItem;
    private javax.swing.JMenuItem userMenuItem;
    // End of variables declaration//GEN-END:variables

}
