
package ac.daffodil.l4dc1000084.budgets.gui;

import ac.daffodil.l4dc1000084.budgets.bean.CategoryInfo;
import ac.daffodil.l4dc1000084.budgets.gui.TableModel.CategoryInfoTableModel;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class CategoryUI extends javax.swing.JInternalFrame {

    public CategoryUI() {
        initComponents();
       
        
         categoryDetailsTalbe.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedRow=categoryDetailsTalbe.getSelectedRow();
              
              if(selectedRow>=0){
                  CategoryInfo categoryInfo = categoryInfoTableModel.getCategory(selectedRow);
                  if(categoryInfo!=null){
                      categoryNameField.setText(categoryInfo.getCategoryName());
                      categoryTypeComboBox.setSelectedItem(categoryInfo.getCatyegoryType());
                      categoryDetailsField.setText(categoryInfo.getCategoryDetails());
                      
                     
                  }
              }
            }
        });
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        categoryComponentPanel = new javax.swing.JPanel();
        categoryNameLabel = new javax.swing.JLabel();
        categoryNameField = new javax.swing.JTextField();
        categoryTypeLabel = new javax.swing.JLabel();
        categoryDetailsLabel = new javax.swing.JLabel();
        detailsScrollPane = new javax.swing.JScrollPane();
        categoryDetailsField = new javax.swing.JTextArea();
        categoryTypeComboBox = new javax.swing.JComboBox<>();
        buttonPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        categoryTablePanel = new javax.swing.JPanel();
        categoryTableScrollPane = new javax.swing.JScrollPane();
        categoryInfoTableModel=new CategoryInfoTableModel();
        categoryDetailsTalbe = new javax.swing.JTable();

        setBackground(java.awt.Color.cyan);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Categories");
        setName("userUIInternalForm"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1056, 627));

        categoryComponentPanel.setBackground(java.awt.Color.cyan);
        categoryComponentPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        categoryNameLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        categoryNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryNameLabel.setText("Category Name");
        categoryNameLabel.setName("firstNaleLabel"); // NOI18N

        categoryNameField.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        categoryTypeLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        categoryTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryTypeLabel.setText("Category Type");
        categoryTypeLabel.setName("firstNaleLabel"); // NOI18N

        categoryDetailsLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        categoryDetailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryDetailsLabel.setText("Details");
        categoryDetailsLabel.setName("firstNaleLabel"); // NOI18N

        categoryDetailsField.setColumns(20);
        categoryDetailsField.setRows(5);
        detailsScrollPane.setViewportView(categoryDetailsField);

        categoryTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Income", "Expense", "Transfer" }));

        javax.swing.GroupLayout categoryComponentPanelLayout = new javax.swing.GroupLayout(categoryComponentPanel);
        categoryComponentPanel.setLayout(categoryComponentPanelLayout);
        categoryComponentPanelLayout.setHorizontalGroup(
            categoryComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryComponentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(categoryComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(categoryNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoryTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoryDetailsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(categoryComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(categoryTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoryNameField))
                .addContainerGap())
        );
        categoryComponentPanelLayout.setVerticalGroup(
            categoryComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryComponentPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(categoryComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(categoryNameField)
                    .addComponent(categoryNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(categoryComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(categoryComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(categoryComponentPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(categoryDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(categoryComponentPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(detailsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        buttonPanel.setBackground(java.awt.Color.cyan);
        buttonPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        addButton.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        addButton.setText("Add Category");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        removeButton.setText("Remove Category");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        updateButton.setText("Update Category");
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

        categoryTablePanel.setBackground(java.awt.Color.cyan);
        categoryTablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Category Details"));

        categoryTableScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        categoryDetailsTalbe.setModel(categoryInfoTableModel);
        categoryTableScrollPane.setViewportView(categoryDetailsTalbe);

        javax.swing.GroupLayout categoryTablePanelLayout = new javax.swing.GroupLayout(categoryTablePanel);
        categoryTablePanel.setLayout(categoryTablePanelLayout);
        categoryTablePanelLayout.setHorizontalGroup(
            categoryTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoryTableScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );
        categoryTablePanelLayout.setVerticalGroup(
            categoryTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoryTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(categoryComponentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoryTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(categoryTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(categoryComponentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        refresh();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        CategoryInfo categoryInfo=new CategoryInfo();
         
         categoryInfo.setId(UUID.randomUUID().toString());
         
         //Validating category name
            if(categoryNameField.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Category Name Cannot be Empty.");
                return;
            }else if (categoryNameField.getText().matches(".*\\d+.*")){
                JOptionPane.showMessageDialog(this, "Category Name Must be Alphabetic, digits are not allowed.");
                return;
            }else{
                categoryInfo.setCategoryName(categoryNameField.getText());
            }

            //validating category type
            if(categoryTypeComboBox.getSelectedIndex()<0){
                JOptionPane.showMessageDialog(this, "You Must Select one Category Type.");
                return;
            }else{
                categoryInfo.setCatyegoryType(categoryTypeComboBox.getSelectedItem().toString());
            }
         
         categoryInfo.setCategoryDetails(categoryDetailsField.getText());
         
         categoryInfoTableModel.addRow(categoryInfo);
       
        refresh();
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
          int selectedRow=categoryDetailsTalbe.getSelectedRow();
                if(selectedRow>=0){
                    CategoryInfo categoryInfo=categoryInfoTableModel.getCategory(selectedRow);
         
                    //Validating category name
                    if(categoryNameField.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(this, "Category Name Cannot be Empty.");
                        return;
                    }else if (categoryNameField.getText().matches(".*\\d+.*")){
                        JOptionPane.showMessageDialog(this, "Category Name Must be Alphabetic, digits are not allowed.");
                        return;
                    }else{
                        categoryInfo.setCategoryName(categoryNameField.getText());
                    }

                    //Validating category type
                    if(categoryTypeComboBox.getSelectedIndex()<0){
                        JOptionPane.showMessageDialog(this, "You Must Select one Category Type.");
                        return;
                    }else{
                        categoryInfo.setCatyegoryType(categoryTypeComboBox.getSelectedItem().toString());
                    }

                    categoryInfo.setCategoryDetails(categoryDetailsField.getText());

                    categoryInfoTableModel.updateRow(selectedRow,categoryInfo);

                   refresh();
                }
                
           
              
    }//GEN-LAST:event_updateButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int selectedRow=categoryDetailsTalbe.getSelectedRow();
            if (selectedRow>=0){
                categoryInfoTableModel.deleteRow(selectedRow);

               refresh();
            }else{
               JOptionPane.showMessageDialog(this, "Please select a row first.");
           }
    }//GEN-LAST:event_removeButtonActionPerformed

    public void refresh(){
        categoryNameField.setText("");
        categoryTypeComboBox.setSelectedIndex(0);
        categoryDetailsField.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel categoryComponentPanel;
    private javax.swing.JTextArea categoryDetailsField;
    private javax.swing.JLabel categoryDetailsLabel;
    private javax.swing.JTable categoryDetailsTalbe;
    private javax.swing.JTextField categoryNameField;
    private javax.swing.JLabel categoryNameLabel;
    private javax.swing.JPanel categoryTablePanel;
    private javax.swing.JScrollPane categoryTableScrollPane;
    private javax.swing.JComboBox<String> categoryTypeComboBox;
    private javax.swing.JLabel categoryTypeLabel;
    private javax.swing.JScrollPane detailsScrollPane;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
private CategoryInfoTableModel categoryInfoTableModel;
}
