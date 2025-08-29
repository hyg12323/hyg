package yaDTO;

public class Lot_semi_consumptioDTO {

	private int lsc_id;
	private int lot_id;
	private int semi_lot_id;
	private int qty_used;
	private String unit;
	public int getLsc_id() {
		return lsc_id;
	}
	public void setLsc_id(int lsc_id) {
		this.lsc_id = lsc_id;
	}
	public int getLot_id() {
		return lot_id;
	}
	public void setLot_id(int lot_id) {
		this.lot_id = lot_id;
	}
	public int getSemi_lot_id() {
		return semi_lot_id;
	}
	public void setSemi_lot_id(int semi_lot_id) {
		this.semi_lot_id = semi_lot_id;
	}
	public int getQty_used() {
		return qty_used;
	}
	public void setQty_used(int qty_used) {
		this.qty_used = qty_used;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	@Override
	public String toString() {
		return "Lot_semi_consumptioDTO [lsc_id=" + lsc_id + ", lot_id=" + lot_id + ", semi_lot_id=" + semi_lot_id
				+ ", qty_used=" + qty_used + ", unit=" + unit + "]";
	}
	
	
}
