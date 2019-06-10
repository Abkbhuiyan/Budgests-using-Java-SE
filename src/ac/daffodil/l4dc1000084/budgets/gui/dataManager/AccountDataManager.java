
package ac.daffodil.l4dc1000084.budgets.gui.dataManager;

import ac.daffodil.l4dc1000084.budgets.bean.AccountInfo;
import ac.daffodil.l4dc1000084.budgets.bean.ScheduleInfo;
import ac.daffodil.l4dc1000084.budgets.bean.TransactionInfo;
import ac.daffodil.l4dc1000084.budgets.bean.UserInfo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class AccountDataManager {
    private static final String FILE_NAME="Data/accounts";
    
     public static void save(ArrayList<AccountInfo> accountList){
         try{
             FileOutputStream fos = new FileOutputStream(FILE_NAME);
             ObjectOutputStream oos =new ObjectOutputStream(fos);
             oos.writeObject(accountList);
             oos.flush();
             oos.close();
             fos.close();
         }catch(IOException ioe){
             System.err.println( "Cannot save data to the file");
         }
     }
 
     public static ArrayList<AccountInfo> load(){
        ArrayList<AccountInfo> accountList = null;
        try{
            FileInputStream fis=new FileInputStream(FILE_NAME);
            ObjectInputStream ois =new ObjectInputStream(fis);
            accountList=(ArrayList<AccountInfo>)ois.readObject();
            ois.close();
            fis.close();
        }catch (IOException ioe){
             System.err.println("Cannot read data from file");

        }catch(ClassNotFoundException cnfe){
            
            System.err.println( "Cannot find the class");

        }
        return accountList;
    }
     
     
      private static ArrayList<AccountInfo> getAccountList() {
        ArrayList<AccountInfo> accountList = load();
        if (accountList == null) {
            accountList = new ArrayList<AccountInfo>();
        }

        return accountList;
    }

    public static void add(AccountInfo accountInfo) {
        if (accountInfo != null) {
            ArrayList<AccountInfo> accountList =  getAccountList();
            accountList.add(accountInfo);
            save(accountList);
        }
    }

    public static void update(AccountInfo accountInfo) {
        if (accountInfo != null) {
            ArrayList<AccountInfo> accountList = getAccountList();
            for (int i = 0; i < accountList.size(); i++) {
                AccountInfo oldAccount = accountList.get(i);
                if (oldAccount.equals(accountInfo)) {
                    accountList.set(i, accountInfo);
                    save(accountList);
                    break;
                }
            }
        }
    }

    public static void delete(AccountInfo accountInfo) {
        if (accountInfo != null) {
            ArrayList<AccountInfo> accountList =  getAccountList();
            for (int i = 0; i < accountList.size(); i++) {
                AccountInfo oldAccount = accountList.get(i);
                if (oldAccount.equals(accountInfo)) {
                    removeAccountTransactions(accountInfo);
                    removeAccountSchedules(accountInfo);
                    accountList.remove(i);
                    save(accountList);
                    break;
                }
            }
        }
    }
     
     
     
     public static ArrayList<AccountInfo> getUserAccountList() {
        ArrayList<AccountInfo> userAccountList = new ArrayList<AccountInfo>();
        UserInfo user = LoggedInUser.getInstance().getUser();
        if (user != null) {
            ArrayList<AccountInfo> allAccountList = load();
            if (allAccountList != null) {
                for (int i = 0; i < allAccountList.size(); i++) {
                    AccountInfo account = allAccountList.get(i);
                    if (account.getUserInfo().equals(user)) {
                        userAccountList.add(account);
                        System.out.println(account);
                    } else if (UserAccountAuthenticationDataManager.isAccessAllowed(account)) {
                        userAccountList.add(account);
                    }
                }
            }
        }
        
        return userAccountList;
    }
     //function that check account is alresy exist
     public static boolean isAccountExist(String acNumber, String acName){
         ArrayList<AccountInfo> accountList = load();
          
          if(accountList != null && accountList.size()>0){
              for (int i=0; i<accountList.size();i++){
                  AccountInfo accountInfo = accountList.get(i);
                  if(accountInfo.getAccountNo().equalsIgnoreCase(acNumber) && accountInfo.getAccountName().equalsIgnoreCase(acName) ){
                      return true;
                  }
              }
          }
          return false;
     }
     //removing transactions for a account if account is deleted
     public static void removeAccountTransactions(AccountInfo accountInfo){
         ArrayList<TransactionInfo> accountTransactionList = TransactionDataManager.getTransactionList(accountInfo);
         if(accountTransactionList != null){
         for (int i=0; i < accountTransactionList.size(); i++ ){
             TransactionInfo transactionInfo = accountTransactionList.get(i);
             TransactionDataManager.delete(transactionInfo);
         }
        }
     }
      //removing transactions for a account if account is deleted
     public static void removeAccountSchedules(AccountInfo accountInfo){
         ArrayList<ScheduleInfo> accountSCheduleList = ScheduleDataManager.getScheduleList(accountInfo);
         if(accountSCheduleList != null){
         for (int i=0; i < accountSCheduleList.size(); i++ ){
             ScheduleInfo scheduleInfo = accountSCheduleList.get(i);
             ScheduleDataManager.delete(scheduleInfo);
         }
        }
     }
}
