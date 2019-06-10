
package ac.daffodil.l4dc1000084.budgets.gui.dataManager;

import ac.daffodil.l4dc1000084.budgets.bean.CategoryInfo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CategoryDataManager {
    private static final String FILE_NAME="Data/category";
    
     public static void save(ArrayList<CategoryInfo> categoryList){
         try{
             FileOutputStream fos = new FileOutputStream(FILE_NAME);
             ObjectOutputStream oos =new ObjectOutputStream(fos);
             oos.writeObject(categoryList);
             oos.flush();
             oos.close();
             fos.close();
         }catch(IOException ioe){
             System.err.println( "Cannot save data to the file");
         }
     }
 
     public static ArrayList<CategoryInfo> load(){
        ArrayList<CategoryInfo> categoryList = null;
        try{
            FileInputStream fis=new FileInputStream(FILE_NAME);
            ObjectInputStream ois =new ObjectInputStream(fis);
            categoryList=(ArrayList<CategoryInfo>)ois.readObject();
            ois.close();
            fis.close();
        }catch (IOException ioe){
             System.err.println( "Cannot read data from file");
        }catch(ClassNotFoundException cnfe){
            
            System.err.println( "Cannot find the class");
        }
        return categoryList;
    }
     
     
     private static ArrayList<CategoryInfo> getCategorytList() {
        ArrayList<CategoryInfo> categoryList = load();
        if (categoryList == null) {
            categoryList = new ArrayList<CategoryInfo>();
        }

        return categoryList;
    }
    public static void add(CategoryInfo categoryInfo) {
        if (categoryInfo != null) {
            ArrayList<CategoryInfo> categoryList =  getCategorytList();
            categoryList.add(categoryInfo);
            save(categoryList);
        }
    }

    public static void update(CategoryInfo categoryInfo) {
        if (categoryInfo != null) {
            ArrayList<CategoryInfo> categoryList = getCategorytList();
            for (int i = 0; i < categoryList.size(); i++) {
                CategoryInfo oldCategory = categoryList.get(i);
                if (oldCategory.equals(categoryInfo)) {
                    categoryList.set(i, categoryInfo);
                    save(categoryList);
                    break;
                }
            }
        }
    }

    public static void delete(CategoryInfo categoryInfo) {
        if (categoryInfo != null) {
            ArrayList<CategoryInfo> categoryList =  getCategorytList();
            for (int i = 0; i < categoryList.size(); i++) {
                CategoryInfo oldCategory = categoryList.get(i);
                if (oldCategory.equals(categoryInfo)) {
                    categoryList.remove(i);
                    save(categoryList);
                    break;
                }
            }
        }
    }
}
