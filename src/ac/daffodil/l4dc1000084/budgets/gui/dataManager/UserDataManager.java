
package ac.daffodil.l4dc1000084.budgets.gui.dataManager;

import ac.daffodil.l4dc1000084.budgets.bean.UserInfo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class UserDataManager {
    private static final String FILE_NAME="Data/users";
    
     public static void save(ArrayList<UserInfo> userList){
         try{
             FileOutputStream fos = new FileOutputStream(FILE_NAME);
             ObjectOutputStream oos =new ObjectOutputStream(fos);
             oos.writeObject(userList);
             oos.flush();
             oos.close();
             fos.close();
         }catch(IOException ioe){
             System.err.println( "Cannot save data to the file");
         }
     }
 
     public static ArrayList<UserInfo> load(){
        ArrayList<UserInfo> userList = null;
        try{
            FileInputStream fis=new FileInputStream(FILE_NAME);
            ObjectInputStream ois =new ObjectInputStream(fis);
            userList=(ArrayList<UserInfo>)ois.readObject();
            ois.close();
            fis.close();
        }catch (IOException ioe){
             System.err.println( "Cannot read data from file");
        }catch(ClassNotFoundException cnfe){
            
            System.err.println( "Cannot find the class");
        }
        return userList;
    }
     //checking user name and password is valid
     public static UserInfo getUser(String username, String password){
         ArrayList<UserInfo> userList = load();
         
         if (userList != null && userList.size()>0){
             
             for (int i=0; i<userList.size();i++){
                 UserInfo userInfo = userList.get(i);
                 if(userInfo.getUsername().equalsIgnoreCase(username) && userInfo.getPassword().equals(password)){
                     return  userInfo;
                 }
 
             }
             
         }else{
             if(username.equalsIgnoreCase("admin") && password.equals("secret")){
                 UserInfo userInfo=new UserInfo();
                 userInfo.setId("1");
                 userInfo.setUsername("admin");
                 return userInfo;
             }
         }
         
         return null;
     }
     
     //checking if a username is already exist
      public static boolean checkUsername(String username){
          ArrayList<UserInfo> userList = load();
          
          if(userList != null && userList.size()>0){
              for (int i=0; i<userList.size();i++){
                  UserInfo userInfo = userList.get(i);
                  if(userInfo.getUsername().equalsIgnoreCase(username)){
                      return true;
                  }
              }
          }
        return false;
           
      }
      
      
      
      private static ArrayList<UserInfo> getUserList() {
        ArrayList<UserInfo> accountList = load();
        if (accountList == null) {
            accountList = new ArrayList<UserInfo>();
        }

        return accountList;
    }

    public static void add(UserInfo userInfo) {
        if (userInfo != null) {
            ArrayList<UserInfo> userList =  getUserList();
            userList.add(userInfo);
            save(userList);
        }
    }

    public static void update(UserInfo userInfo) {
        if (userInfo != null) {
            ArrayList<UserInfo> userList = getUserList();
            for (int i = 0; i < userList.size(); i++) {
                UserInfo oldUser = userList.get(i);
                if (oldUser.equals(userInfo)) {
                    userList.set(i, userInfo);
                    save(userList);
                    break;
                }
            }
        }
    }

    public static void delete(UserInfo userInfo) {
        if (userInfo != null) {
            ArrayList<UserInfo> userList =  getUserList();
            for (int i = 0; i < userList.size(); i++) {
                UserInfo oldUser = userList.get(i);
                if (oldUser.equals(userInfo)) {
                    userList.remove(i);
                    save(userList);
                    break;
                }
            }
        }
    }       
}
