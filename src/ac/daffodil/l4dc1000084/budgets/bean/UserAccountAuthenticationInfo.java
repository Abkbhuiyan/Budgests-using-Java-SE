
package ac.daffodil.l4dc1000084.budgets.bean;

import java.io.Serializable;
import java.util.Objects;


public class UserAccountAuthenticationInfo implements Serializable{
    private String id;
    private UserInfo users;
    private AccountInfo accounts;
    private String details;

    public UserAccountAuthenticationInfo() {
    }

    public UserInfo getUsers() {
        return users;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setUsers(UserInfo users) {
        this.users = users;
    }

    public AccountInfo getAccounts() {
        return accounts;
    }

    public void setAccounts(AccountInfo accounts) {
        this.accounts = accounts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UserAccountAuthenticationInfo other = (UserAccountAuthenticationInfo) obj;
        return true;
    }  
}
