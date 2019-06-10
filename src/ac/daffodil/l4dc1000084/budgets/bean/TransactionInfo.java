
package ac.daffodil.l4dc1000084.budgets.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


public class TransactionInfo implements Serializable{
    private String transactionId;
    private Date transactionDate;
    private String transactionType;
    private Double transactionAmount;
    private AccountInfo acoountName;
    private AccountInfo acoountToTransfer;
    private CategoryInfo transactionCategory;
    private String payeeName;
    private String transactionDetails;
    
    public TransactionInfo() {
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public AccountInfo getAcoountName() {
        return acoountName;
    }

    public void setAcoountName(AccountInfo acoountName) {
        this.acoountName = acoountName;
    }

    public AccountInfo getAcoountToTransfer() {
        return acoountToTransfer;
    }

    public void setAcoountToTransfer(AccountInfo acoountToTransfer) {
        this.acoountToTransfer = acoountToTransfer;
    }
    
    public CategoryInfo getTransactionCategory() {
        return transactionCategory;
    }

    public void setTransactionhCategory(CategoryInfo transactionCategory) {
        this.transactionCategory = transactionCategory;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(String transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
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
        final TransactionInfo other = (TransactionInfo) obj;
        if (!Objects.equals(this.transactionId, other.transactionId)) {
            return false;
        }
        return true;
    }  
}
