package yaDTO;

public class InspectionStandardDTO {
	
	private int standard_id;
	private int item_id;
	private String criteria;
	public int getStandard_id() {
		return standard_id;
	}
	public void setStandard_id(int standard_id) {
		this.standard_id = standard_id;
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getCriteria() {
		return criteria;
	}
	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}
	@Override
	public String toString() {
		return "InspectionStandardDTO [standard_id=" + standard_id + ", item_id=" + item_id + ", criteria=" + criteria
				+ "]";
	}
	
	
}
