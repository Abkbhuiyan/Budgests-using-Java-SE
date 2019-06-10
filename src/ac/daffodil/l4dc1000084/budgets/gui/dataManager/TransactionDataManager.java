
package ac.daffodil.l4dc1000084.budgets.gui.dataManager;


import ac.daffodil.l4dc1000084.budgets.bean.AccountInfo;
import ac.daffodil.l4dc1000084.budgets.bean.TransactionInfo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class TransactionDataManager {
    private static final String FILE_NAME="Data/transactions";
    
     public static void save(ArrayList<TransactionInfo> transactionList){
         try{
             FileOutputStream fos = new FileOutputStream(FILE_NAME);
             ObjectOutputStream oos =new ObjectOutputStream(fos);
             oos.writeObject(transactionList);
             oos.flush();
             oos.close();
             fos.close();
         }catch(IOException ioe){
             System.err.println( "Cannot save data to the file");
         }
     }
 
     public static ArrayList<TransactionInfo> load(){
        ArrayList<TransactionInfo> transactionList = null;
        try{
            FileInputStream fis=new FileInputStream(FILE_NAME);
            ObjectInputStream ois =new ObjectInputStream(fis);
            transactionList=(ArrayList<TransactionInfo>)ois.readObject();
            ois.close();
            fis.close();
        }catch (IOException ioe){
             System.err.println( "Cannot read data from file");
        }catch(ClassNotFoundException cnfe){
            
            System.err.println( "Cannot find the class");
        }
        return transactionList;
    }
     
     private static ArrayList<TransactionInfo> getTransactionList() {
        ArrayList<TransactionInfo> transactionList = load();
        if (transactionList == null) {
            transactionList = new ArrayList<TransactionInfo>();
        }

        return transactionList;
    }

    public static void add(TransactionInfo transaction) {
        if (transaction != null) {
            ArrayList<TransactionInfo> transactionList =  getTransactionList();
            transactionList.add(transaction);
            save(transactionList);
        }
    }

    public static void update(TransactionInfo transaction) {
        if (transaction != null) {
            ArrayList<TransactionInfo> transactionList = getTransactionList();
            for (int i = 0; i < transactionList.size(); i++) {
                TransactionInfo oldTransaction = transactionList.get(i);
                if (oldTransaction.equals(transaction)) {
                    transactionList.set(i, transaction);
                    save(transactionList);
                    break;
                }
            }
        }
    }

    public static void delete(TransactionInfo transaction) {
        if (transaction != null) {
            ArrayList<TransactionInfo> transactionList =  getTransactionList();
            for (int i = 0; i < transactionList.size(); i++) {
                TransactionInfo oldTransaction = transactionList.get(i);
                if (oldTransaction.equals(transaction)) {
                    transactionList.remove(i);
                    save(transactionList);
                    break;
                }
            }
        }
    }
    //getting all transactions of a account
    public static ArrayList<TransactionInfo> getTransactionList(AccountInfo account) {
        ArrayList<TransactionInfo> allTransactionList = load();
        ArrayList<TransactionInfo> accountTransactionList = new ArrayList<TransactionInfo>();
        if (allTransactionList != null) {
            for (int i = 0; i < allTransactionList.size(); i++) {
                TransactionInfo transaction = allTransactionList.get(i);
                if (transaction.getAcoountName().equals(account)) {
                    accountTransactionList.add(transaction);
                }
            }
        }

        return accountTransactionList;
    }

  //getting all transactions of all accounts
       public static ArrayList<TransactionInfo> getTransactionList(ArrayList<AccountInfo> accountList) {
        ArrayList<TransactionInfo> transactionList = new ArrayList<TransactionInfo>();
        for (int i = 0; i < accountList.size(); i++) {
            AccountInfo account = accountList.get(i);
            ArrayList<TransactionInfo> accountTransactionList = getTransactionList(account);
            if (accountTransactionList != null) {
                for (int j = 0; j < accountTransactionList.size(); j++) {
                    TransactionInfo transaction = accountTransactionList.get(j);
                    transactionList.add(transaction);
                }
            }
        }
        return transactionList;
    }
       //getting all transactions for a user
    public static ArrayList<TransactionInfo> getUserTransactionList() {
        ArrayList<AccountInfo> userAccountList = AccountDataManager.getUserAccountList();
        ArrayList<TransactionInfo> userTransactionList = getTransactionList(userAccountList);
        return userTransactionList;
    }
    
    
       //updating balance for new transaction
    public static void updateBalanceForNewTransaction( TransactionInfo transactionInfo){
         ArrayList <AccountInfo> accountList = AccountDataManager.getUserAccountList();
         for (int i=0; i<accountList.size();i++){
            AccountInfo account = accountList.get(i);
            
            if (account.equals(transactionInfo.getAcoountName())){
                if(transactionInfo.getTransactionType().equals("Income")){
                    account.setBalance(account.getBalance() + transactionInfo.getTransactionAmount() );
                    AccountDataManager.update(account); 
                }else if(transactionInfo.getTransactionType().equals("Expense")){
                    account.setBalance(account.getBalance() - transactionInfo.getTransactionAmount() );
                    AccountDataManager.update(account); 
                }else if(transactionInfo.getTransactionType().equals("Transfer")){
                    account.setBalance(account.getBalance() - transactionInfo.getTransactionAmount());
                    AccountDataManager.update(account); 
                    
                    for (int j = 0; j<accountList.size(); j++){
                        AccountInfo accountToTransfer = accountList.get(j);
                        if(transactionInfo.getAcoountToTransfer().equals(accountToTransfer)){
                          accountToTransfer.setBalance(accountToTransfer.getBalance() + transactionInfo.getTransactionAmount());
                            AccountDataManager.update(accountToTransfer);  
                        }
                    }
                     
                }
                        
           }
        }
      
     }
      
      //updating account balance if any exixting transaction is modified
      public static void updateBalanceForUpdatedTransaction(TransactionInfo transactionInfo){
          if (transactionInfo != null){
              ArrayList<TransactionInfo> transactionList = TransactionDataManager.getUserTransactionList();
              for(int i=0; i<transactionList.size();i++){
                  TransactionInfo oldTransaction = transactionList.get(i);
          
                if(oldTransaction.equals(transactionInfo)){
                    ArrayList <AccountInfo> accountList = AccountDataManager.getUserAccountList();
                    for (int j=0; j<accountList.size();j++){
                       AccountInfo account = accountList.get(j);
                         
                       if (account.equals(oldTransaction.getAcoountName())){
                              if(oldTransaction.getTransactionType().equals("Income")){
                                  account.setBalance(account.getBalance() - oldTransaction.getTransactionAmount() );
                                  AccountDataManager.update(account);
                              }else if(oldTransaction.getTransactionType().equals("Expense")){
                                  account.setBalance(account.getBalance() + oldTransaction.getTransactionAmount() );
                                  AccountDataManager.update(account);
                              }if(oldTransaction.getTransactionType().equals("Transfer")){
                                  account.setBalance(account.getBalance() + oldTransaction.getTransactionAmount());
                                  AccountDataManager.update(account);
                                  for (int k = 0; k<accountList.size(); k++){
                                        AccountInfo accountToTransfer = accountList.get(k);
                                        if(oldTransaction.getAcoountToTransfer().equals(accountToTransfer)){
                                            accountToTransfer.setBalance(accountToTransfer.getBalance() - oldTransaction.getTransactionAmount());
                                            AccountDataManager.update(accountToTransfer);  
                                        }
                                    }
                              }
                         }
                          
                       
                if (account.equals(transactionInfo.getAcoountName())){
                           switch (transactionInfo.getTransactionType()) {
                               case "Income":
                                   account.setBalance(account.getBalance() + transactionInfo.getTransactionAmount() );
                                   AccountDataManager.update(account);
                                   break;
                               case "Expense":
                                   account.setBalance(account.getBalance() - transactionInfo.getTransactionAmount() );
                                   AccountDataManager.update(account);
                                   break;
                               case "Transfer":
                                   account.setBalance(account.getBalance() - transactionInfo.getTransactionAmount());
                                   AccountDataManager.update(account);
                                   for (int k = 0; k<accountList.size(); k++){
                                       AccountInfo accountToTransfer = accountList.get(k);
                                       if(transactionInfo.getAcoountToTransfer().equals(accountToTransfer)){
                                           accountToTransfer.setBalance(accountToTransfer.getBalance() + transactionInfo.getTransactionAmount());
                                           AccountDataManager.update(accountToTransfer);
                                       }
                                      
                                   }     
                                   break;   
                               default:
                                   break;
                                   
                           }
                     } 
                 }
             }
         }
     }
 }

      //updating account balance if any exixting transaction is deleted
 public static void updateBalanceForDeletedTransaction(TransactionInfo transactionInfo){
     if(transactionInfo != null){
         ArrayList<TransactionInfo> transactionList = TransactionDataManager.getUserTransactionList();
         for (int i = 0; i < transactionList.size(); i++) {
                TransactionInfo oldTransaction = transactionList.get(i);
                if (oldTransaction.equals(transactionInfo)) {
                    ArrayList <AccountInfo> accountList = AccountDataManager.getUserAccountList();
                    for (int j=0; j<accountList.size();j++){
                        AccountInfo account = accountList.get(j);
                        if(oldTransaction.getTransactionType().equals("Income")){
                            account.setBalance(account.getBalance()- oldTransaction.getTransactionAmount());
                            AccountDataManager.update(account);
                        }else if(oldTransaction.getTransactionType().equals("Expense")){
                            account.setBalance(account.getBalance() + oldTransaction.getTransactionAmount());
                            AccountDataManager.update(account);
                        }else if(oldTransaction.getTransactionType().equals("Transfer")){
                            account.setBalance(account.getBalance() + oldTransaction.getTransactionAmount());
                            AccountDataManager.update(account);
                            
                            for (int k = 0; k<accountList.size(); k++){
                                AccountInfo accountToTransfer = accountList.get(k);
                                if(transactionInfo.getAcoountToTransfer().equals(accountToTransfer)){
                                    accountToTransfer.setBalance(accountToTransfer.getBalance()- transactionInfo.getTransactionAmount());
                                    AccountDataManager.update(accountToTransfer);
                                }
                            }   
                        }
                    } 
                }
            }
     }
 }     
      
 
 
 
  //Calculating estimated month ended balance
    
         public static long getDayCount(Date start, Date end) {
        long diff = -1;
        try {
          Date dateStart = start;
          Date dateEnd = end;

          diff = Math.round((dateEnd.getTime() - dateStart.getTime()) / (double) 86400000);
        } catch (DateTimeException e) {
            System.err.println(e);
        }
           return diff;
       }
        
               public static int  remainingDayCount(){
        Date currentDate = new Date();
        int remainingDays = 0; 
        Calendar calendar = Calendar.getInstance();
        int currentDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.setTime(currentDate);
        int month = calendar.get(Calendar.MONTH);
        switch (month) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                remainingDays = 31 - currentDayOfMonth;
                break;
            case 1:
                remainingDays = 29 - currentDayOfMonth;
                break;
            default:
                remainingDays = 30 - currentDayOfMonth;
                break;
        }
       return remainingDays;
    }
     
            
    public static ArrayList<TransactionInfo> transactionsFortheAccountWithinSixMonths(AccountInfo accountInfo) {
        ArrayList<TransactionInfo> transactionList = getTransactionList(accountInfo);
        ArrayList<TransactionInfo> validtransactionList = new ArrayList<TransactionInfo>();
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.MONTH, -6);
        Date lastDateToCheck = calendar.getTime();   
        
        int days = (int) getDayCount(lastDateToCheck, currentDate);
        System.out.println(days);
        for (int i =0; i <transactionList.size(); i++){
            TransactionInfo transactionInfo =transactionList.get(i);
            if(transactionInfo.getTransactionDate().before(currentDate) && transactionInfo.getTransactionDate().after(lastDateToCheck)) {
                validtransactionList.add(transactionInfo);
            }
        }
     return validtransactionList;
        
    }
    
    


    public static double totalIncomeForLastSixMonth(AccountInfo accountInfo){
         ArrayList<TransactionInfo> transactionList = transactionsFortheAccountWithinSixMonths(accountInfo);
          Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.MONTH, -6);
         Date lastDateToCheck = calendar.getTime(); 
         int days = (int) getDayCount(lastDateToCheck, currentDate);
         
         double income = 0;
         double avgIncome =0;
         for(int i =0; i<transactionList.size(); i++ ){
             TransactionInfo transactionInfo = transactionList.get(i);
             
             if(transactionInfo.getTransactionType().equalsIgnoreCase("Income")){
                 income = income + transactionInfo.getTransactionAmount();
                
             }
         }
         
         
         avgIncome = income / days;
         return avgIncome;
    }
    
    public static double averageExpenseForLastSixMonth(AccountInfo accountInfo){
         ArrayList<TransactionInfo> transactionList = transactionsFortheAccountWithinSixMonths(accountInfo);
         
         Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.MONTH, -6);
        Date lastDateToCheck = calendar.getTime();   
        
        int days = (int) getDayCount(lastDateToCheck, currentDate);
        double expense = 0;
        double avgexpense = 0 ; 
        
         for(int i =0; i<transactionList.size(); i++ ){
             TransactionInfo transactionInfo = transactionList.get(i);
             
             if(transactionInfo.getTransactionType().equalsIgnoreCase("Expense")){
                 expense = expense + transactionInfo.getTransactionAmount();
                 
             }
         }
       
        System.out.println(remainingDayCount());
         avgexpense = expense /days;
         return avgexpense * remainingDayCount();
         
    }
    

        
    public static void updateEstimatedBalance(){
        ArrayList<AccountInfo> accountList = AccountDataManager.getUserAccountList();
        if (accountList != null){
            for (int i=0; i < accountList.size(); i++){
            AccountInfo accountInfo = accountList.get(i);
            double estimatedBalance = accountInfo.getBalance()-averageExpenseForLastSixMonth(accountInfo);
            accountInfo.setMonthEndedBalance(estimatedBalance);
            AccountDataManager.update(accountInfo);
            System.out.println( AccountDataManager.getUserAccountList().get(i).getMonthEndedBalance());
        }
        }
        
    }
  
}
