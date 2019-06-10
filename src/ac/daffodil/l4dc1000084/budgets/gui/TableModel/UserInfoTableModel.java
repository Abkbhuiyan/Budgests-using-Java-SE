
package ac.daffodil.l4dc1000084.budgets.gui.TableModel;

import ac.daffodil.l4dc1000084.budgets.bean.UserInfo;
import ac.daffodil.l4dc1000084.budgets.gui.dataManager.UserDataManager;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class UserInfoTableModel extends AbstractTableModel{

       private ArrayList<UserInfo> userList;
       
       private String[] columnsName={"First Name","Last Nale","Father's Name","Mothers Name",
           "Birth Date", "Gender", "National ID", "Nationality","Username","Email"};

       
       private static final int INDEX_FIRST_NAME=0;
       private static final int INDEX_LAST_NAME=1;
       private static final int INDEX_FATHER_NAME=2;
       private static final int  INDEX_MOTHER_NAME=3;
       private static final int INDEX_DOB=4;
       private static final int  INDEX_GENDER=5;
       private static final int INDEX_NATIONAL_ID=6;
       private static final int INDEX_ADDRESS=7;
       private static final int INDEX_USER_NAME=8;
       private static final int INDEX_EMAIL=9;
      
       
                              
                       
    public UserInfoTableModel() {
        userList = UserDataManager.load();
			if(userList == null){
                            userList = new ArrayList<UserInfo>();
                        }
        
    }
       
       @Override
    public int getRowCount() {
        return userList.size();
    }

    @Override
    public int getColumnCount() {
       return columnsName.length;
    }
   
       @Override
    public String getColumnName(int column) {
		return columnsName[column];
		
	}
    @Override
    public Object getValueAt(int row, int column) {
        UserInfo userInfo = userList.get(row);
        String value="";
		switch(column){
                    
                    case INDEX_FIRST_NAME:
                        value=userInfo.getFirstName();
                        break;
                    
                    case INDEX_LAST_NAME:
                        value=userInfo.getLastName();
                        break;
                        
                    case INDEX_FATHER_NAME:
                        value=userInfo.getFatherName();
                        break;
                        
                    case INDEX_MOTHER_NAME:
                        value=userInfo.getMotherName();
                        break;
                        
                    case INDEX_DOB:
                        value=String.valueOf(userInfo.getDateOfBirth());
                        break;
                        
                    case INDEX_GENDER:
                        value=userInfo.getGender();
                        break;
                        
                    case INDEX_NATIONAL_ID:
                        value=userInfo.getNationalID();
                        break;
                        
                    
                        
                    case INDEX_ADDRESS:
                        value=userInfo.getAddress();
                        break;
                        
                    case INDEX_USER_NAME:
                        value=userInfo.getUsername();
                        break;
                        
                    case INDEX_EMAIL:
                        value=userInfo.getEmail();
                        break;
                        
                    
                  
                }
                return value;
    }
    
    
    
    public void addRow(UserInfo userInfo){
		userList.add(userInfo);
		fireTableDataChanged();
                
                UserDataManager.save(userList);
                 
	}
        
        public UserInfo getUser(int row){
            return userList.get(row);
            
        }
        
        public void updateRow(int row,UserInfo userInfo){
            userList.set(row, userInfo);
            
            fireTableDataChanged();
            
            UserDataManager.save(userList);
        }
        
        public void deleteRow(int row){
            userList.remove(row);
            fireTableDataChanged();
            UserDataManager.save(userList);
        }
        
    
}
