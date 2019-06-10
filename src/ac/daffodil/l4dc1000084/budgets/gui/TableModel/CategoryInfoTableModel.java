
package ac.daffodil.l4dc1000084.budgets.gui.TableModel;

import ac.daffodil.l4dc1000084.budgets.bean.CategoryInfo;
import ac.daffodil.l4dc1000084.budgets.gui.dataManager.CategoryDataManager;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class CategoryInfoTableModel extends AbstractTableModel{
    private ArrayList<CategoryInfo> categoryList;
    
    private String[] columsName={"Category", "Category type","Details"};
    
    private static final int INDEX_CATEGORY=0;
    private static final int INDEX_CATEGORY_TYPE=1;
    private static final int INDEX_CATEGORY_DETAILS=2;

    public CategoryInfoTableModel() {
        categoryList=CategoryDataManager.load();
        if (categoryList==null){
            categoryList=new ArrayList<>();
        }
    }

    @Override
    public int getRowCount() {
        return categoryList.size();
    }

    @Override
    public int getColumnCount() {
        return columsName.length;
    }

    @Override
    public String getColumnName(int column){
        return columsName[column];
    }
    @Override
    public Object getValueAt(int row, int column) {
       CategoryInfo categoryInfo=categoryList.get(row);
       Object value=null;
       switch(column){
           case INDEX_CATEGORY:
               value = categoryInfo.getCategoryName();
               break;
           
           case INDEX_CATEGORY_TYPE:
               value = categoryInfo.getCatyegoryType();
               break;
               
           case INDEX_CATEGORY_DETAILS:
               value = categoryInfo.getCategoryDetails();
               break;
       }
       return value;
    }
    
    public CategoryInfo getCategory(int row){
        return categoryList.get(row);
    }
    
    public void addRow(CategoryInfo categoryInfo){
        categoryList.add(categoryInfo);
        
        fireTableDataChanged();
        
        CategoryDataManager.save(categoryList);
    }
    
    public void updateRow(int row, CategoryInfo categoryInfo){
        categoryList.set(row, categoryInfo);
        
        fireTableDataChanged();
        CategoryDataManager.save(categoryList);
    }
    
    public void deleteRow(int row){
        categoryList.remove(row);
        
        fireTableDataChanged();
        CategoryDataManager.save(categoryList);
    } 
}
