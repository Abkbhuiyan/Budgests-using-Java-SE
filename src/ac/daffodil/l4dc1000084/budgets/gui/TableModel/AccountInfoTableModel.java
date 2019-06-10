
package ac.daffodil.l4dc1000084.budgets.gui.TableModel;

import ac.daffodil.l4dc1000084.budgets.bean.AccountInfo;
import ac.daffodil.l4dc1000084.budgets.gui.dataManager.AccountDataManager;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class AccountInfoTableModel extends AbstractTableModel{

       private ArrayList<AccountInfo> accountList;
       
      private String[] columnsName={"Ac No","Ac Name","Ac Holder", "Bank", "Occupation", "Initial Amount", "Ac Type","Billing Date","Payment Date","Notes","Balance","Month End Balance"};

       
       private static final int INDEX_AC_NO=0;
       private static final int INDEX_AC_NAME=1;
       private static final int INDEX_HOLDER=2;
       private static final int  INDEX_BANK=3;
       private static final int INDEX_OCCUPATION=4;
       private static final int  INDEX_INITIAL_ACCOUNT=5;
       private static final int INDEX_ACCOUNT_TYPE=6;
       private static final int INDEX_BILLING_DATE=7;
       private static final int INDEX_PAYMENT_DATE=8;
       private static final int INDEX_NOTES=9;
       private static final int INDEX_BALANCE=10;
       private static final int INDEX_MONTH_END=11;
                              
                       
    public AccountInfoTableModel() {
       accountList = AccountDataManager.getUserAccountList();
			if(accountList==null){
                            accountList = new ArrayList<AccountInfo>();
                        }
        
    }
       
       @Override
    public int getRowCount() {
        return accountList.size();
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
        AccountInfo accountInfo = accountList.get(row);
        Object value="";
		switch(column){
                    
                    case INDEX_AC_NO:
                        value=accountInfo.getAccountNo();
                        break;
                    
                    case INDEX_AC_NAME:
                        value=accountInfo.getAccountName();
                        break;
                        
                    case INDEX_HOLDER:
                        value=accountInfo.getAcHolderName();
                        break;
                        
                    case INDEX_BANK:
                        value=accountInfo.getBankName();
                        break;
                        
                    
                        
                    case INDEX_OCCUPATION:
                        value=accountInfo.getOccupation();
                        break;
                        
                    case INDEX_INITIAL_ACCOUNT:
                        value=accountInfo.getInitialAmount();
                        break;
                        
                    case INDEX_ACCOUNT_TYPE:
                        value=accountInfo.getAccountType();
                        break;
                        
                    case INDEX_BILLING_DATE:
                        value=accountInfo.getBillingDate();
                        break;
                        
                     case INDEX_PAYMENT_DATE:
                        value=accountInfo.getPaymentDate();
                        break;   
                        
                    case INDEX_NOTES:
                        value=accountInfo.getNotes();
                        break;
                    case INDEX_BALANCE:
                        value=accountInfo.getBalance();
                        break;   
                        
                    case INDEX_MONTH_END:
                        value=accountInfo.getMonthEndedBalance();
                        break; 
                    
                }
                return value;
    }
    
    
    
    public void addRow(AccountInfo accountInfo){
		accountList.add(accountInfo);
                
		fireTableDataChanged();
                
                AccountDataManager.add(accountInfo);
                 
	}
        
        public AccountInfo getAccount(int row){
            return accountList.get(row);
            
        }
        
        public void updateRow(int row,AccountInfo accountInfo){
            accountList.set(row, accountInfo);
            
            fireTableDataChanged();
            
           AccountDataManager.update(accountInfo);
        }
        
        public void deleteRow(int row){
            AccountInfo accountInfo = accountList.get(row);
            accountList.remove(row);
            fireTableDataChanged();
            AccountDataManager.delete(accountInfo);
        }

}
