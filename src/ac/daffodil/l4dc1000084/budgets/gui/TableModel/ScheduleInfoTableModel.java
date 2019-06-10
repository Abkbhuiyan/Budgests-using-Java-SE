
package ac.daffodil.l4dc1000084.budgets.gui.TableModel;
 
import ac.daffodil.l4dc1000084.budgets.bean.ScheduleInfo;
import ac.daffodil.l4dc1000084.budgets.gui.dataManager.ScheduleDataManager;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ScheduleInfoTableModel extends AbstractTableModel {
    private ArrayList<ScheduleInfo> scheduleList;
    
    private String[] columnsName={"Date", "Transaction Type", "Account","Account to Transfer", "Amount","Category", "Payee","Details"};
    
    private static final int INDEX_DATE=0;
    private static final int INDEX_TRANSACTION_TYPE=1;
    private static final int INDEX_ACCOUNT=2;
    private static final int INDEX_ACCOUNT_TO_TRANSFER=3;
    private static final int INDEX_AMOUNT=4;
    private static final int INDEX_CATEGORY=5;
    private static final int INDEX_PAYEE=6;
    private static final int INDEX_DETAILS=7;
    
    public ScheduleInfoTableModel() {
        scheduleList=ScheduleDataManager.getUserScheduleList();
            if(scheduleList==null){
                scheduleList = new ArrayList<ScheduleInfo>();
             }
    }

    @Override
    public int getRowCount() {
       return scheduleList.size();
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
        ScheduleInfo  scheduleInfo = scheduleList.get(row);
         Object value="";
        
        switch(column) {
            case INDEX_DATE:
                value = scheduleInfo.getScheduleDate();
                break;
                
            case INDEX_TRANSACTION_TYPE:
                value = scheduleInfo.getScheduleType();
                break;
                
            case INDEX_AMOUNT:
                value = scheduleInfo.getScheduleAmount();
                break;
              
             case INDEX_ACCOUNT:
                value = scheduleInfo.getAcoountName();
                break;
                
             case INDEX_ACCOUNT_TO_TRANSFER:
                value = scheduleInfo.getAcoountToTransfer();
                break;
             case INDEX_CATEGORY:
                value = scheduleInfo.getScheduleCategory();
                break;
                
             case INDEX_PAYEE:
                value = scheduleInfo.getPayeeName();
                break;
                
             case INDEX_DETAILS:
                value = scheduleInfo.getScheduleDetails();
                break;
                   
        }
       
       return value;
    }
    
    public void addRow(ScheduleInfo scheduleInfo){
        scheduleList.add(scheduleInfo);
        fireTableDataChanged();
        ScheduleDataManager.add(scheduleInfo);
    }
    
      public ScheduleInfo getSchedule(int row){
            return scheduleList.get(row);
        }
        
        public void updateRow(int row, ScheduleInfo scheduleInfo){
          
            scheduleList.set(row, scheduleInfo);
            
            fireTableDataChanged();
            ScheduleDataManager.update(scheduleInfo);
          
        }
        
        public void deleteRow(int row ){
            
            ScheduleInfo scheduleInfo=scheduleList.get(row);
                scheduleList.remove(row);
                fireTableDataChanged();
           ScheduleDataManager.delete(scheduleInfo);
        }     
}
