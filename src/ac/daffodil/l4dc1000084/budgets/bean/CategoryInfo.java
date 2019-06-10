
package ac.daffodil.l4dc1000084.budgets.bean;

import java.io.Serializable;
import java.util.Objects;

public class CategoryInfo implements Serializable{
    private String id;
    private String categoryName;
    private String catyegoryType;
    private String categoryDetails;

    public CategoryInfo() {
    }

    public CategoryInfo(String categoryName, String catyegoryType, String categoryDetails) {
        this.categoryName = categoryName;
        this.catyegoryType = catyegoryType;
        this.categoryDetails = categoryDetails;
    }
    
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCatyegoryType() {
        return catyegoryType;
    }

    public void setCatyegoryType(String catyegoryType) {
        this.catyegoryType = catyegoryType;
    }

    public String getCategoryDetails() {
        return categoryDetails;
    }

    public void setCategoryDetails(String categoryDetails) {
        this.categoryDetails = categoryDetails;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return categoryName;
    }

     @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final CategoryInfo other = (CategoryInfo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

   
    
}
