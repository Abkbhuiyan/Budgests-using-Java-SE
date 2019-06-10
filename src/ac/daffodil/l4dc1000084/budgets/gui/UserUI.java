
package ac.daffodil.l4dc1000084.budgets.gui;

import ac.daffodil.l4dc1000084.budgets.bean.UserInfo;
import ac.daffodil.l4dc1000084.budgets.gui.TableModel.UserInfoTableModel;
import ac.daffodil.l4dc1000084.budgets.gui.dataManager.UserDataManager;
import java.util.Arrays;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.apache.commons.validator.GenericValidator;


public class UserUI extends javax.swing.JInternalFrame {

    public UserUI() {
        initComponents();
        
        //Selecting a account information
          userDetailsTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        @Override
            public void valueChanged(ListSelectionEvent e) {
                 int selectedRow=userDetailsTable.getSelectedRow();
                
                if (selectedRow>=0){
                    UserInfo  userInfo = userInfoTableModel.getUser(selectedRow);
                    if(userInfo != null){
                        firstNameField.setText(userInfo.getFirstName());
                        lastNameField.setText(userInfo.getLastName());
                        fatherNameField.setText(userInfo.getFatherName());
                        motherNameField.setText(userInfo.getMotherName());
                        dobField.setDate(userInfo.getDateOfBirth());
                        if(userInfo.getGender().equals(maleRadioButton.getText())){
                            maleRadioButton.setSelected(true);
                        }else if (userInfo.getGender().equals(femaleRadioButton.getText())){
                           femaleRadioButton.setSelected(true);
                        }else if (userInfo.getGender().equals(otherRadioButton.getText())){
                           otherRadioButton.setSelected(true);
                        }
                        nidNoField.setText(userInfo.getNationalID());
                        nationalityField.setText(userInfo.getNationality());
                        addressAreaField.setText(userInfo.getAddress());
                        usernameField.setEditable(false);
                        emailField.setText(userInfo.getEmail());
                        phoneField.setText(userInfo.getPhone());
                        passwordField.setText(userInfo.getPassword());
                        confirmPasswordField.setText(userInfo.getPassword());
                        
                    }
                }
            }
            
        });
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        userComponentsPanel = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        fatherNameLabel = new javax.swing.JLabel();
        fatherNameField = new javax.swing.JTextField();
        motherNameLabel = new javax.swing.JLabel();
        motherNameField = new javax.swing.JTextField();
        motherNameLabel1 = new javax.swing.JLabel();
        dobField = new com.toedter.calendar.JDateChooser();
        genderLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        otherRadioButton = new javax.swing.JRadioButton();
        nIDNoLabel = new javax.swing.JLabel();
        nidNoField = new javax.swing.JTextField();
        nationalityLabel = new javax.swing.JLabel();
        nationalityField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressScrollPane = new javax.swing.JScrollPane();
        addressAreaField = new javax.swing.JTextArea();
        emailField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        confirmPasswordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        buttonPanel = new javax.swing.JPanel();
        createButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        userTablePanel = new javax.swing.JPanel();
        userTableScrollPane = new javax.swing.JScrollPane();
        userInfoTableModel=new UserInfoTableModel();
        userDetailsTable = new javax.swing.JTable();

        setBackground(java.awt.Color.cyan);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Users");
        setName("userUIInternalForm"); // NOI18N

        userComponentsPanel.setBackground(java.awt.Color.cyan);
        userComponentsPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        firstNameLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        firstNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstNameLabel.setText("First Name:");
        firstNameLabel.setName("firstNaleLabel"); // NOI18N

        firstNameField.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        lastNameLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lastNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastNameLabel.setText("Last Name");
        lastNameLabel.setName("firstNaleLabel"); // NOI18N

        lastNameField.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        fatherNameLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        fatherNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fatherNameLabel.setText("Father's Name");
        fatherNameLabel.setName("firstNaleLabel"); // NOI18N

        fatherNameField.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        motherNameLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        motherNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        motherNameLabel.setText("Mother's Name:");
        motherNameLabel.setName("firstNaleLabel"); // NOI18N

        motherNameField.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        motherNameLabel1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        motherNameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        motherNameLabel1.setText("Date Of Birth: ");
        motherNameLabel1.setName("firstNaleLabel"); // NOI18N

        genderLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        genderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genderLabel.setText("Gender: ");
        genderLabel.setName("firstNaleLabel"); // NOI18N

        genderButtonGroup.add(maleRadioButton);
        maleRadioButton.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        maleRadioButton.setText("Male");

        genderButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        femaleRadioButton.setText("Female");

        genderButtonGroup.add(otherRadioButton);
        otherRadioButton.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        otherRadioButton.setText("Other");

        nIDNoLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        nIDNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nIDNoLabel.setText("NID NO:");
        nIDNoLabel.setName("firstNaleLabel"); // NOI18N

        nidNoField.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        nationalityLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        nationalityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nationalityLabel.setText("Nationality:");
        nationalityLabel.setName("firstNaleLabel"); // NOI18N

        nationalityField.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        addressLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        addressLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLabel.setText("Address:");
        addressLabel.setName("firstNaleLabel"); // NOI18N

        addressAreaField.setColumns(20);
        addressAreaField.setRows(5);
        addressScrollPane.setViewportView(addressAreaField);

        emailField.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        emailLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLabel.setText("Email: ");
        emailLabel.setName("firstNaleLabel"); // NOI18N

        phoneLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        phoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phoneLabel.setText("Phone:");
        phoneLabel.setName("firstNaleLabel"); // NOI18N

        phoneField.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        usernameLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLabel.setText("Username:");
        usernameLabel.setName("firstNaleLabel"); // NOI18N

        usernameField.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("Password:");
        passwordLabel.setName("firstNaleLabel"); // NOI18N

        confirmPasswordLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        confirmPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmPasswordLabel.setText("Confirm Password:");
        confirmPasswordLabel.setName("firstNaleLabel"); // NOI18N

        javax.swing.GroupLayout userComponentsPanelLayout = new javax.swing.GroupLayout(userComponentsPanel);
        userComponentsPanel.setLayout(userComponentsPanelLayout);
        userComponentsPanelLayout.setHorizontalGroup(
            userComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userComponentsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userComponentsPanelLayout.createSequentialGroup()
                        .addComponent(firstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34)
                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userComponentsPanelLayout.createSequentialGroup()
                        .addComponent(lastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34)
                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userComponentsPanelLayout.createSequentialGroup()
                        .addComponent(fatherNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34)
                        .addComponent(fatherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userComponentsPanelLayout.createSequentialGroup()
                        .addGroup(userComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nationalityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genderLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(motherNameLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(motherNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nIDNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(userComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nidNoField)
                            .addComponent(motherNameField)
                            .addComponent(dobField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(userComponentsPanelLayout.createSequentialGroup()
                                .addComponent(maleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(femaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(otherRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nationalityField)
                            .addComponent(addressScrollPane)
                            .addComponent(emailField)
                            .addComponent(phoneField)
                            .addComponent(usernameField)
                            .addComponent(passwordField)
                            .addComponent(confirmPasswordField))))
                .addContainerGap())
        );
        userComponentsPanelLayout.setVerticalGroup(
            userComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userComponentsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fatherNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fatherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motherNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(motherNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(maleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(otherRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(femaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nationalityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nationalityField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nIDNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nidNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonPanel.setBackground(java.awt.Color.cyan);
        buttonPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        createButton.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        createButton.setText("Create User");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        removeButton.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        removeButton.setText("Remove User");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        updateButton.setText("Update User");
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
                .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeButton)
                .addGap(18, 18, 18)
                .addComponent(createButton)
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

        userTablePanel.setBackground(java.awt.Color.cyan);
        userTablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("User Details"));

        userTableScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        userTableScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        userDetailsTable.setModel(userInfoTableModel);
        userDetailsTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        userTableScrollPane.setViewportView(userDetailsTable);

        javax.swing.GroupLayout userTablePanelLayout = new javax.swing.GroupLayout(userTablePanel);
        userTablePanel.setLayout(userTablePanelLayout);
        userTablePanelLayout.setHorizontalGroup(
            userTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );
        userTablePanelLayout.setVerticalGroup(
            userTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userTableScrollPane)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userComponentsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userComponentsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        refresh();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
            UserInfo userInfo=new UserInfo();
            
            userInfo.setId(UUID.randomUUID().toString());
            //Validating First Name Field 
            if(firstNameField.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(UserUI.this, "You must Enter First Name.");
                     firstNameField.grabFocus();
                return;
           }else if (firstNameField.getText().trim().matches(".*\\d+.*")){
                JOptionPane.showMessageDialog(UserUI.this, "Only Alphabets are allowed into name.");
                     firstNameField.grabFocus();
                return;
           }else{
               userInfo.setFirstName(firstNameField.getText());
           }
            //Validating Last Name Field 
          if(lastNameField.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(UserUI.this, "You must Enter Last Name.");
                     lastNameField.grabFocus();
                return;
           }else if (lastNameField.getText().trim().matches(".*\\d+.*")){
                JOptionPane.showMessageDialog(UserUI.this, "Only Alphabets are allowed into name.");
                    lastNameField.grabFocus();
                return;
           }else{
               userInfo.setLastName(lastNameField.getText());
           }
            //Validating Father Name Field 
          if(fatherNameField.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(UserUI.this, "You must Enter Your Father's Name.");
                   fatherNameField.grabFocus();
                return;
           }else if (fatherNameField.getText().trim().matches(".*\\d+.*")){
                JOptionPane.showMessageDialog(UserUI.this, "Only Alphabets are allowed into name.");
                   fatherNameField.grabFocus();
                return;
           }else{
               userInfo.setFatherName(fatherNameField.getText());
           }
            //Validating Mother Name Field 
         if(motherNameField.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(UserUI.this, "You must Enter your Mother's Name.");
                    motherNameField.grabFocus();
                return;
           }else if (motherNameField.getText().trim().matches(".*\\d+.*")){
                JOptionPane.showMessageDialog(UserUI.this, "Only Alphabets are allowed into name.");
                   motherNameField.grabFocus();
                return;
           }else{
               userInfo.setMotherName(motherNameField.getText());
           }

         //Checking if Date of birth is not given
         if (dobField.getDate()==null){
             JOptionPane.showMessageDialog(UserUI.this, "Date of birth is required.");
             dobField.grabFocus();
             return;

         }else{
             userInfo.setDateOfBirth(dobField.getDate());
         }


         //Cheking if gender is selected
          if (maleRadioButton.isSelected()){
              userInfo.setGender(maleRadioButton.getText());
          }else if (femaleRadioButton.isSelected()){
              userInfo.setGender(femaleRadioButton.getText());
          }else if (otherRadioButton.isSelected()){
              userInfo.setGender(otherRadioButton.getText());
          }else{
           JOptionPane.showMessageDialog(this, "You must select gender");
           return;
          }

          //Checking if NID field contain any unusual value
          if (nidNoField.getText().trim().matches("[a-zA-Z]+")){
                JOptionPane.showMessageDialog(UserUI.this, "Only Numbers are allowed into NID.");
                   nidNoField.grabFocus();
                return;
           }else{
              userInfo.setNationalID(nidNoField.getText());
          }


          userInfo.setNationality(nationalityField.getText());

          userInfo.setAddress(addressAreaField.getText());



          //Email validation
          if (GenericValidator.isBlankOrNull(emailField.getText())){
               JOptionPane.showMessageDialog(UserUI.this, "YOu must enter an email.");
              return;
          }else if (GenericValidator.isEmail(emailField.getText())){
              userInfo.setEmail(emailField.getText());
          }else{
              JOptionPane.showMessageDialog(UserUI.this, "Invalid email, please enter a valid email.");
              return;
          }
          
          //validating if phone field contains any alphabet
          if(phoneField.getText().trim().matches("[a-zA-Z]+")){
              JOptionPane.showMessageDialog(UserUI.this, "Invalid phone no, please enter a valid phone.");
              return;
          }else{
              userInfo.setPhone(phoneField.getText());
          }
          
          //validating Username
          if (GenericValidator.isBlankOrNull(usernameField.getText())){
              JOptionPane.showMessageDialog(UserUI.this, "Username field cannot be empty.");
              return;
          }else if (UserDataManager.checkUsername(usernameField.getText())==true){
              JOptionPane.showMessageDialog(UserUI.this, "This user name is already used try another username.");
              return;
          }else{
              userInfo.setUsername(usernameField.getText());
          }
            
          // validating password
           if(passwordField.getPassword().length<3 || passwordField.getPassword().length>20){
                JOptionPane.showMessageDialog(UserUI.this, "Passwor should between 3 to 20 character.");
                   passwordField.grabFocus();
            return;
          }
           else{
                if(Arrays.equals(passwordField.getPassword(), confirmPasswordField.getPassword())){
                     userInfo.setPassword((passwordField.getText())); 
                 }else{
                    JOptionPane.showMessageDialog(this, "Password did not match");
                    passwordField.grabFocus();
                    return;
                }
          }

           userInfoTableModel.addRow(userInfo);
           refresh();
    }//GEN-LAST:event_createButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
         int selectedRow=userDetailsTable.getSelectedRow();
           
                if (selectedRow>=0){
                       UserInfo userInfo=userInfoTableModel.getUser(selectedRow);
                       
                      //Validating First Name Field  
                    if(firstNameField.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(UserUI.this, "You must Enter First Name.");
                             firstNameField.grabFocus();
                        return;
                   }else if (firstNameField.getText().trim().matches(".*\\d+.*")){
                        JOptionPane.showMessageDialog(UserUI.this, "Only Alphabets are allowed into name.");
                             firstNameField.grabFocus();
                        return;
                   }else{
                       userInfo.setFirstName(firstNameField.getText());
                   }
                    //Validating Last Name Field 
                  if(lastNameField.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(UserUI.this, "You must Enter Last Name.");
                             lastNameField.grabFocus();
                        return;
                   }else if (lastNameField.getText().trim().matches(".*\\d+.*")){
                        JOptionPane.showMessageDialog(UserUI.this, "Only Alphabets are allowed into name.");
                            lastNameField.grabFocus();
                        return;
                   }else{
                       userInfo.setLastName(lastNameField.getText());
                   }
                  //Validating Father Name Field 
                  if(fatherNameField.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(UserUI.this, "You must Enter Your Father's Name.");
                           fatherNameField.grabFocus();
                        return;
                   }else if (fatherNameField.getText().trim().matches(".*\\d+.*")){
                        JOptionPane.showMessageDialog(UserUI.this, "Only Alphabets are allowed into name.");
                           fatherNameField.grabFocus();
                        return;
                   }else{
                       userInfo.setFatherName(fatherNameField.getText());
                   }
                  //Validating Mother Name Field 
                 if(motherNameField.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(UserUI.this, "You must Enter your Mother's Name.");
                            motherNameField.grabFocus();
                        return;
                   }else if (motherNameField.getText().trim().matches(".*\\d+.*")){
                        JOptionPane.showMessageDialog(UserUI.this, "Only Alphabets are allowed into name.");
                           motherNameField.grabFocus();
                        return;
                   }else{
                       userInfo.setMotherName(motherNameField.getText());
                   }

                 //checking if date of birth is not given
                 if (dobField.getDate()==null){
                     JOptionPane.showMessageDialog(UserUI.this, "Date of birth is required.");
                     dobField.grabFocus();
                     return;

                 }else{
                     userInfo.setDateOfBirth(dobField.getDate());
                 }


                 //checking if gender is selected
                  if (maleRadioButton.isSelected()){
                      userInfo.setGender(maleRadioButton.getText());
                  }else if (femaleRadioButton.isSelected()){
                      userInfo.setGender(femaleRadioButton.getText());
                  }else{
                   JOptionPane.showMessageDialog(this, "You must select gender");
                   return;
                  }

                  //checking if NID field contain any unusual value
                  if (nidNoField.getText().trim().matches("[a-zA-Z]+")){
                        JOptionPane.showMessageDialog(UserUI.this, "Only Numbers are allowed into NID.");
                           nidNoField.grabFocus();
                        return;
                   }else{
                      userInfo.setNationalID(nidNoField.getText());
                  }


                  userInfo.setNationality(nationalityField.getText());

                  userInfo.setAddress(addressAreaField.getText());


                  //Email validation
                if (GenericValidator.isBlankOrNull(emailField.getText())){
                 JOptionPane.showMessageDialog(UserUI.this, "YOu must enter an email.");
                return;
                  }else if (GenericValidator.isEmail(emailField.getText())){
                      userInfo.setEmail(emailField.getText());
                  }else{
                      JOptionPane.showMessageDialog(UserUI.this, "Invalid email, please enter a valid email.");
                      return;
                  }
                //Validating if any alphabet conatains into phone field 
                  if(phoneField.getText().trim().matches("[a-zA-Z]+")){
                      JOptionPane.showMessageDialog(UserUI.this, "Invalid phone no, please enter a valid phone.");
                      return;
                  }else{
                      userInfo.setPhone(phoneField.getText());
                  }
                  
                  
                  //Validating password
                   if(passwordField.getPassword().length<3 || passwordField.getPassword().length>20){
                        JOptionPane.showMessageDialog(UserUI.this, "Passwor should between 3 to 20 character.");
                           passwordField.grabFocus();
                    return;
                  }
                   else{
                        if(Arrays.equals(passwordField.getPassword(), confirmPasswordField.getPassword())){
                             userInfo.setPassword((passwordField.getText())); 
                         }else{
                            JOptionPane.showMessageDialog(this, "Password did not match");
                            passwordField.grabFocus();
                            return;
                        }
                      }
                   
            userInfoTableModel.updateRow(selectedRow,userInfo);
            refresh();
            usernameField.setEditable(true);
            }else{
                JOptionPane.showMessageDialog(this, "Please select a row first.");
            }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int selectedRow=userDetailsTable.getSelectedRow();
                
                if (selectedRow>=0){
                    userInfoTableModel.deleteRow(selectedRow);
                    refresh();
                    usernameField.setEditable(true);
                }else{
                    JOptionPane.showMessageDialog(this, "Please select a row first.");
                }
    }//GEN-LAST:event_removeButtonActionPerformed

    public void refresh(){
            firstNameField.setText("");
            lastNameField.setText("");
            fatherNameField.setText("");
            motherNameField.setText("");
            dobField.setDate(null);
            genderButtonGroup.clearSelection();
            nidNoField.setText("");
            nationalityField.setText("");
            addressAreaField.setText("");
            usernameField.setText("");
            emailField.setText("");
            phoneField.setText("");
            passwordField.setText("");
            confirmPasswordField.setText("");
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressAreaField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JScrollPane addressScrollPane;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JButton createButton;
    private com.toedter.calendar.JDateChooser dobField;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField fatherNameField;
    private javax.swing.JLabel fatherNameLabel;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField motherNameField;
    private javax.swing.JLabel motherNameLabel;
    private javax.swing.JLabel motherNameLabel1;
    private javax.swing.JLabel nIDNoLabel;
    private javax.swing.JTextField nationalityField;
    private javax.swing.JLabel nationalityLabel;
    private javax.swing.JTextField nidNoField;
    private javax.swing.JRadioButton otherRadioButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JPanel userComponentsPanel;
    private javax.swing.JTable userDetailsTable;
    private javax.swing.JPanel userTablePanel;
    private javax.swing.JScrollPane userTableScrollPane;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
private UserInfoTableModel  userInfoTableModel;
}
