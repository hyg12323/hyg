package yaDTO;


public class ItemDTO {

	private int  product_id;
	private String item_code;
	private String item_name;
	private String unit;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getItem_code() {
		return item_code;
	}
	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	@Override
	public String toString() {
		return "ItemDTO [product_id=" + product_id + ", item_code=" + item_code + ", item_name=" + item_name + ", unit="
				+ unit + "]";
	}
	
}
