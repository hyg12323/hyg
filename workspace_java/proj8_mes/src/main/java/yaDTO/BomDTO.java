package yaDTO;

public class BomDTO {
	private int bom_id;
	private int parent_item_id;
	private int child_item_id;
	private int quantity;
	public int getBom_id() {
		return bom_id;
	}
	public void setBom_id(int bom_id) {
		this.bom_id = bom_id;
	}
	public int getParent_item_id() {
		return parent_item_id;
	}
	public void setParent_item_id(int parent_item_id) {
		this.parent_item_id = parent_item_id;
	}
	public int getChild_item_id() {
		return child_item_id;
	}
	public void setChild_item_id(int child_item_id) {
		this.child_item_id = child_item_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "BomDTO [bom_id=" + bom_id + ", parent_item_id=" + parent_item_id + ", child_item_id=" + child_item_id
				+ ", quantity=" + quantity + "]";
	}
	
	
	
}
