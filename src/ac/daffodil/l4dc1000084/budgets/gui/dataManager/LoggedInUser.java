
package ac.daffodil.l4dc1000084.budgets.gui.dataManager;

import ac.daffodil.l4dc1000084.budgets.bean.UserInfo;


public class LoggedInUser {
     private UserInfo user;
    
    private static LoggedInUser instance;

    private LoggedInUser() {
    }
    
    public static LoggedInUser getInstance(){
        if(instance==null){
            instance=new LoggedInUser();
        }
        
        return instance;
    }
    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }
    
}
