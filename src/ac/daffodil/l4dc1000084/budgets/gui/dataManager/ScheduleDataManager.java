
package ac.daffodil.l4dc1000084.budgets.gui.dataManager;

import ac.daffodil.l4dc1000084.budgets.bean.AccountInfo;
import ac.daffodil.l4dc1000084.budgets.bean.ScheduleInfo;
import ac.daffodil.l4dc1000084.budgets.bean.TransactionInfo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;


public class ScheduleDataManager {
    private static final String FILE_NAME="Data/schedules";
    
     public static void save(ArrayList<ScheduleInfo> scheduleList){
         try{
             FileOutputStream fos = new FileOutputStream(FILE_NAME);
             ObjectOutputStream oos =new ObjectOutputStream(fos);
             oos.writeObject(scheduleList);
             oos.flush();
             oos.close();
             fos.close();
         }catch(IOException ioe){
             System.err.println( "Cannot save data to the file");
         }
     }
 
     public static ArrayList<ScheduleInfo> load(){
        ArrayList<ScheduleInfo> scheduleList = null;
        try{
            FileInputStream fis=new FileInputStream(FILE_NAME);
            ObjectInputStream ois =new ObjectInputStream(fis);
            scheduleList=(ArrayList<ScheduleInfo>)ois.readObject();
            ois.close();
            fis.close();
        }catch (IOException ioe){
             System.err.println( "Cannot read data from file");
        }catch(ClassNotFoundException cnfe){
            
            System.err.println( "Cannot find the class");
        }
        return scheduleList;
    }
     
     private static ArrayList<ScheduleInfo> getScheduleList() {
        ArrayList<ScheduleInfo> scheduleList = load();
        if (scheduleList == null) {
            scheduleList = new ArrayList<ScheduleInfo>();
        }

        return scheduleList;
    }

    public static void add(ScheduleInfo schedule) {
        if (schedule != null) {
            ArrayList<ScheduleInfo> scheduleList =  ScheduleDataManager.getScheduleList();
            scheduleList.add(schedule);
            save(scheduleList);
        }
    }

    public static void update(ScheduleInfo schedule) {
        if (schedule != null) {
            ArrayList<ScheduleInfo> scheduleList = ScheduleDataManager.getScheduleList();
            for (int i = 0; i < scheduleList.size(); i++) {
                ScheduleInfo oldTransaction = scheduleList.get(i);
                if (oldTransaction.equals(schedule)) {
                    scheduleList.set(i, schedule);
                    save(scheduleList);
                    break;
                }
            }
        }
    }

    public static void delete(ScheduleInfo schedule) {
        if (schedule != null) {
            ArrayList<ScheduleInfo> scheduleList =  ScheduleDataManager.getScheduleList();
            for (int i = 0; i < scheduleList.size(); i++) {
                ScheduleInfo oldTransaction = scheduleList.get(i);
                if (oldTransaction.equals(schedule)) {
                    scheduleList.remove(i);
                    save(scheduleList);
                    break;
                }
            }
        }
    }
    //getting schedules for a account
    public static ArrayList<ScheduleInfo> getScheduleList(AccountInfo account) {
        ArrayList<ScheduleInfo> allScheduleList = load();
        ArrayList<ScheduleInfo> accountScheduleList = new ArrayList<ScheduleInfo>();
        if (allScheduleList != null) {
            for (int i = 0; i < allScheduleList.size(); i++) {
                ScheduleInfo schedule = allScheduleList.get(i);
                if (schedule.getAcoountName().equals(account)) {
                    accountScheduleList.add(schedule);
                }
            }
        }

        return accountScheduleList;
    }

  //getting schedule for all account
        public static ArrayList<ScheduleInfo> getScheduleList(ArrayList<AccountInfo> accountList) {
        ArrayList<ScheduleInfo> scheduleList = new ArrayList<ScheduleInfo>();
        for (int i = 0; i < accountList.size(); i++) {
            AccountInfo account = accountList.get(i);
            ArrayList<ScheduleInfo> accountScheduleList = ScheduleDataManager.getScheduleList(account);
            if (accountScheduleList != null) {
                for (int j = 0; j < accountScheduleList.size(); j++) {
                    ScheduleInfo schedule = accountScheduleList.get(j);
                    scheduleList.add(schedule);
                }
            }
        }
        return scheduleList;
    }
        //getting all schedules for a user
    public static ArrayList<ScheduleInfo> getUserScheduleList() {
        ArrayList<AccountInfo> userAccountList = AccountDataManager.getUserAccountList();
        ArrayList<ScheduleInfo> userScheduleList = getScheduleList(userAccountList);
        return userScheduleList;
    }

     
    //Checking pending schedules
        public static ArrayList<ScheduleInfo> getPendingScheduleList() {
            
        ArrayList<ScheduleInfo> pendingScheduleList = new ArrayList<ScheduleInfo>();
        ArrayList<ScheduleInfo> userScheduleList = getUserScheduleList();

        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 0; i < userScheduleList.size(); i++) {
            ScheduleInfo schedule = userScheduleList.get(i);
            if (schedule.getScheduleDate()!= null) {
                if (dateFormat.format(schedule.getScheduleDate()).equals(dateFormat.format(now))) {
                    pendingScheduleList.add(schedule);
                } else if (schedule.getScheduleDate().before(now)) {
                    pendingScheduleList.add(schedule);
                }
            }
        }

        return pendingScheduleList;
    }
        //updating schedule date
    public static void moveScheduleToNextMonth(ScheduleInfo schedule) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(schedule.getScheduleDate());
        calendar.add(Calendar.MONTH, 1);

        schedule.setScheduleDate(calendar.getTime());

        update(schedule);
    }
   //adding a transaction based on schedule
    public static void addScheduledTransactions() {
        ArrayList<ScheduleInfo> pendingScheduleList = getPendingScheduleList();
        for (int i = 0; i < pendingScheduleList.size(); i++) {
            ScheduleInfo schedule = pendingScheduleList.get(i);

            TransactionInfo transaction = new TransactionInfo();
            transaction.setTransactionId(UUID.randomUUID().toString());
            transaction.setAcoountName(schedule.getAcoountName());
            transaction.setTransactionAmount(schedule.getScheduleAmount());
            transaction.setTransactionType(schedule.getScheduleType());
            transaction.setTransactionhCategory(schedule.getScheduleCategory());
            transaction.setTransactionDate(schedule.getScheduleDate());
            transaction.setPayeeName(schedule.getPayeeName());
            transaction.setTransactionDetails(schedule.getScheduleDetails());
            

            TransactionDataManager.add(transaction);

            moveScheduleToNextMonth(schedule);
        }
    }

}
