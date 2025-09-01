package yaDTO;

import java.io.Serializable;

public class Bom_HeadDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private int bomId;
    private int productId;
    private String status;
    private Integer modifiedBy;
    private Integer createdBy;

    public int getBomId() { return bomId; }
    public void setBomId(int bomId) { this.bomId = bomId; }

    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Integer getModifiedBy() { return modifiedBy; }
    public void setModifiedBy(Integer modifiedBy) { this.modifiedBy = modifiedBy; }

    public Integer getCreatedBy() { return createdBy; }
    public void setCreatedBy(Integer createdBy) { this.createdBy = createdBy; }
    
    
	@Override
	public String toString() {
		return "Bom_HeadDTO [bomId=" + bomId + ", productId=" + productId + ", status=" + status + ", modifiedBy="
				+ modifiedBy + ", createdBy=" + createdBy + "]";
	}
    
    
    
}

