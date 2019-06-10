
package ac.daffodil.l4dc1000084.budgets.bean;


import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class AccountInfo implements Serializable{
    
     private String accountId;
     private String accountNo;
     private String accountName;
     private String acHolderName;
     private String bankName;
     
     private String occupation;
     private Double initialAmount ;
     private String accountType;
     private Date billingDate ;
     private Date paymentDate ;
     private String notes;
     private UserInfo userInfo;
     private Double balance ;
     private Double monthEndedBalance ;
     
    
    public AccountInfo() {
    }
    
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAcHolderName() {
        return acHolderName;
    }

    public void setAcHolderName(String acHolderName) {
        this.acHolderName = acHolderName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String accupation) {
        this.occupation = accupation;
    }

    public Double getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(Double initialAmount) {
        this.initialAmount = initialAmount;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Date getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
    
     public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getMonthEndedBalance() {
        return monthEndedBalance;
    }

    public void setMonthEndedBalance(Double monthEndedBalance) {
        this.monthEndedBalance = monthEndedBalance;
    }
    
     
     @Override
    public String toString(){
        return accountName;
    }

   
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.accountId);
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
        final AccountInfo other = (AccountInfo) obj;
        if (!Objects.equals(this.accountId, other.accountId)) {
            return false;
        }
        return true;
    }   
}
