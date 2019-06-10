
package ac.daffodil.l4dc1000084.budgets.gui.TableModel;
 
import ac.daffodil.l4dc1000084.budgets.bean.AccountInfo;
import ac.daffodil.l4dc1000084.budgets.bean.TransactionInfo;
import ac.daffodil.l4dc1000084.budgets.gui.dataManager.AccountDataManager;
import ac.daffodil.l4dc1000084.budgets.gui.dataManager.TransactionDataManager;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TransactionInfoTableModel extends AbstractTableModel {
    private ArrayList<TransactionInfo> transactionList;
    
    private String[] columnsName={"Date", "Transaction Type", "Account", "Transfer to","Amount","Category", "Payee","Details"};
    
    private static final int INDEX_DATE=0;
    private static final int INDEX_TRANSACTION_TYPE=1;
    private static final int INDEX_ACCOUNT=2;
    private static final int INDEX_TRANSFER_TO =3;
    private static final int INDEX_AMOUNT=4;
    private static final int INDEX_CATEGORY=5;
    private static final int INDEX_PAYEE=6;
    private static final int INDEX_DETAILS=7;
    
    public TransactionInfoTableModel() {
        transactionList=TransactionDataManager.getUserTransactionList();
            if(transactionList==null){
                transactionList = new ArrayList<TransactionInfo>();
             }
    }

    @Override
    public int getRowCount() {
       return transactionList.size();
    }

    @Override
    public int getColumnCount() {
        return columnsName.length;
    }
    
    @Override
    public String getColumnName(int column){
        return columnsName[column];
    }
    @Override
    public Object getValueAt(int row, int column) {
        TransactionInfo  transactionInfo = transactionList.get(row);
         Object value="";
        
        switch(column) {
            case INDEX_DATE:
                value = transactionInfo.getTransactionDate();
                break;
                
            case INDEX_TRANSACTION_TYPE:
                value = transactionInfo.getTransactionType();
                break;
                
            case INDEX_AMOUNT:
                value = transactionInfo.getTransactionAmount();
                break;
              
             case INDEX_ACCOUNT:
                value = transactionInfo.getAcoountName();
                break;
             case INDEX_TRANSFER_TO:
                value = transactionInfo.getAcoountToTransfer();
                break;   
             case INDEX_CATEGORY:
                value = transactionInfo.getTransactionCategory();
                break;
                
             case INDEX_PAYEE:
                value = transactionInfo.getPayeeName();
                break;
                
             case INDEX_DETAILS:
                value = transactionInfo.getTransactionDetails();
                break;
                   
        }
       
       return value;
    }
    
    public void addRow(TransactionInfo transactionInfo){
        transactionList.add(transactionInfo);
        fireTableDataChanged();
        TransactionDataManager.add(transactionInfo);
    }
    
      public TransactionInfo getTransaction(int row){
            return transactionList.get(row);
        }
        
        public void updateRow(int row, TransactionInfo transactionInfo){
          
            transactionList.set(row, transactionInfo);
            
            fireTableDataChanged();
            TransactionDataManager.update(transactionInfo);
          
        }
        
        public void deleteRow(int row ){
            
            TransactionInfo transactionInfo=transactionList.get(row);
                transactionList.remove(row);
                fireTableDataChanged();
           TransactionDataManager.updateBalanceForDeletedTransaction(transactionInfo);
           TransactionDataManager.delete(transactionInfo);
        }
        
        public double getTotal(){
            double total=0;
            double initialAmount=0;
           
            
           ArrayList <AccountInfo> userAccountList=AccountDataManager.getUserAccountList();
           for(int i = 0; i<userAccountList.size();i++){
                AccountInfo accountInfo = userAccountList.get(i);
                total += accountInfo.getBalance();
            }
           
          
            return total;
        }
    
}
