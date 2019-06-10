
package ac.daffodil.l4dc1000084.budgets.gui.dataManager;

import ac.daffodil.l4dc1000084.budgets.bean.AccountInfo;
import ac.daffodil.l4dc1000084.budgets.bean.UserAccountAuthenticationInfo;
import ac.daffodil.l4dc1000084.budgets.bean.UserInfo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class UserAccountAuthenticationDataManager {
     private static final String FILE_NAME="Data/authenticatedUsers";
    
     
    
     public static void save(ArrayList<UserAccountAuthenticationInfo> authenticatedUsersList){
         try{
             FileOutputStream fos = new FileOutputStream(FILE_NAME);
             ObjectOutputStream oos =new ObjectOutputStream(fos);
             oos.writeObject(authenticatedUsersList);
             oos.flush();
             oos.close();
             fos.close();
         }catch(IOException ioe){
             System.err.println( "Cannot save data to the file");
         }
     }
 
     public static ArrayList<UserAccountAuthenticationInfo> load(){
        ArrayList<UserAccountAuthenticationInfo> authenticatedUsersList = null;
        try{
            FileInputStream fis=new FileInputStream(FILE_NAME);
            ObjectInputStream ois =new ObjectInputStream(fis);
            authenticatedUsersList=(ArrayList<UserAccountAuthenticationInfo>)ois.readObject();
            ois.close();
            fis.close();
        }catch (IOException ioe){
             System.err.println("Cannot read data from file");
        }catch(ClassNotFoundException cnfe){
            System.err.println("Cannot find the class");
        }
        return authenticatedUsersList;
    }
     
     
       private static ArrayList<UserAccountAuthenticationInfo> getAuthenticationList() {
        ArrayList<UserAccountAuthenticationInfo> authenticationList = load();
        if (authenticationList == null) {
            authenticationList = new ArrayList<UserAccountAuthenticationInfo>();
        }

        return authenticationList;
    }

    public static void add(UserAccountAuthenticationInfo authenticationInfo) {
        if (authenticationInfo != null) {
            ArrayList<UserAccountAuthenticationInfo> authenticationList =  getAuthenticationList();
            authenticationList.add(authenticationInfo);
            save(authenticationList);
        }
    }

    public static void update(UserAccountAuthenticationInfo authenticationInfo) {
        if (authenticationInfo != null) {
            ArrayList<UserAccountAuthenticationInfo> authenticationList = getAuthenticationList();
            for (int i = 0; i < authenticationList.size(); i++) {
                UserAccountAuthenticationInfo oldAuthentication = authenticationList.get(i);
                if (oldAuthentication.equals(authenticationInfo)) {
                    authenticationList.set(i, authenticationInfo);
                    save(authenticationList);
                    break;
                }
            }
        }
    }

    public static void delete(UserAccountAuthenticationInfo authenticationInfo) {
        if (authenticationInfo != null) {
            ArrayList<UserAccountAuthenticationInfo> authenticationList =  getAuthenticationList();
            for (int i = 0; i < authenticationList.size(); i++) {
                UserAccountAuthenticationInfo oldAccount = authenticationList.get(i);
                if (oldAccount.equals(authenticationInfo)) {
                    authenticationList.remove(i);
                    save(authenticationList);
                    break;
                }
            }
        }
    }
     
     
     
     
     
     
     
     
     
      public static boolean isAccessAllowed(AccountInfo account) {
        boolean allowed = false;
        UserInfo user = LoggedInUser.getInstance().getUser();
        if (user != null) {
            ArrayList<UserAccountAuthenticationInfo> userAccountList = load();
            if (userAccountList != null) {
                for (int i = 0; i < userAccountList.size(); i++) {
                    UserAccountAuthenticationInfo accountAuthenticationInfo = userAccountList.get(i);
                    if (accountAuthenticationInfo.getUsers().equals(user) && accountAuthenticationInfo.getAccounts().equals(account)) {
                        allowed = true;
                        break;
                    }
                }
            }
        }

        return allowed;
    }

}
