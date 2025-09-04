package yaDTO;


public class ItemMasterDTO {
	private int item_id;
	private String item_name;
	private String type;
	private String specification;
	private String unit;
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	@Override
	public String toString() {
		return "ItemMasterDTO [item_id=" + item_id + ", item_name=" + item_name + ", type=" + type + ", specification="
				+ specification + ", unit=" + unit + "]";
	}
	
	

}
