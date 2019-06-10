
package ac.daffodil.l4dc1000084.budgets.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


public class ScheduleInfo implements Serializable{
    private String scheduleId;
    private Date scheduleDate;
    private String scheduleType;
    private Double scheduleAmount;
    private AccountInfo acoountName;
    private AccountInfo acoountToTransfer;
    private CategoryInfo scheduleCategory;
    private String payeeName;
    private String scheduleDetails;
    
    public ScheduleInfo() {
    }

    public Date getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String transactionType) {
        this.scheduleType = transactionType;
    }

    public Double getScheduleAmount() {
        return scheduleAmount;
    }

    public void setScheduleAmount(Double transactionAmount) {
        this.scheduleAmount = transactionAmount;
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
    
    public CategoryInfo getScheduleCategory() {
        return scheduleCategory;
    }

    public void setScheduleCategory(CategoryInfo transactionCategory) {
        this.scheduleCategory = transactionCategory;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getScheduleDetails() {
        return scheduleDetails;
    }

    public void setScheduleDetails(String scheduleDetails) {
        this.scheduleDetails = scheduleDetails;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
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
        final ScheduleInfo other = (ScheduleInfo) obj;
        if (!Objects.equals(this.scheduleId, other.scheduleId)) {
            return false;
        }
        return true;
    }

}
