
package ac.daffodil.l4dc1000084.budgets.gui.TableModel;

import ac.daffodil.l4dc1000084.budgets.bean.UserAccountAuthenticationInfo;
import ac.daffodil.l4dc1000084.budgets.gui.dataManager.UserAccountAuthenticationDataManager;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class UserAccountAuthenticationTableModel extends AbstractTableModel{

    private ArrayList <UserAccountAuthenticationInfo> authenticatedUsersList;
    
    private String[] columns={"Users","Accounts", "Details"};
    
    private static final int INDEX_USERS=0; 
    private static final int INDEX_ACCOUNTS=1; 
    private static final int INDEX_DETAILS=2; 

    public UserAccountAuthenticationTableModel() {
        authenticatedUsersList=UserAccountAuthenticationDataManager.load();
        
                if(authenticatedUsersList == null){
                    authenticatedUsersList = new ArrayList<UserAccountAuthenticationInfo>();
               }
    }
    
    
    
    @Override
    public int getRowCount() {
        return authenticatedUsersList.size();
    }

    @Override
    public int getColumnCount() {
       return columns.length;
    }
    
    @Override
    public String getColumnName(int column){
        return columns[column];
    }
    
    
    @Override
    public Object getValueAt(int row, int column) {
        UserAccountAuthenticationInfo accountAuthenticationInfo = authenticatedUsersList.get(row);
        Object value = "";
        
        switch(column){
            case INDEX_USERS:
                value=accountAuthenticationInfo.getUsers();
                break;
             case INDEX_ACCOUNTS:
                value=accountAuthenticationInfo.getAccounts();
                break;   
            case INDEX_DETAILS:
                value=accountAuthenticationInfo.getDetails();
                break; 
        }
        return value;
    }
    
    
    public void addRow(UserAccountAuthenticationInfo accountAuthenticationInfo){
        authenticatedUsersList.add(accountAuthenticationInfo);
        fireTableDataChanged();
        
        UserAccountAuthenticationDataManager.save(authenticatedUsersList);
    }
    
    public UserAccountAuthenticationInfo getAuthenticatedAccount(int row){
        return authenticatedUsersList.get(row);
    }
    
    public void deleteRow(int row){
        authenticatedUsersList.remove(row);
        fireTableDataChanged();
        
        UserAccountAuthenticationDataManager.save(authenticatedUsersList);
    }
    
    public void updateRow(int row,UserAccountAuthenticationInfo accountAuthenticationInfo ){
        authenticatedUsersList.set(row, accountAuthenticationInfo);
        fireTableDataChanged();
        
        UserAccountAuthenticationDataManager.save(authenticatedUsersList);
    }
    
}
