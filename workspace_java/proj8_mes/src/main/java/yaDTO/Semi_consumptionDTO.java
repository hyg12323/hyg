package yaDTO;

public class Semi_consumptionDTO {

	private int sc_id;
	private int semi_lot_id;
	private int raw_lot_id;
	private int qty_used;
	private String unit;
	public int getSc_id() {
		return sc_id;
	}
	public void setSc_id(int sc_id) {
		this.sc_id = sc_id;
	}
	public int getSemi_lot_id() {
		return semi_lot_id;
	}
	public void setSemi_lot_id(int semi_lot_id) {
		this.semi_lot_id = semi_lot_id;
	}
	public int getRaw_lot_id() {
		return raw_lot_id;
	}
	public void setRaw_lot_id(int raw_lot_id) {
		this.raw_lot_id = raw_lot_id;
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
		return "Semi_consumptionDTO [sc_id=" + sc_id + ", semi_lot_id=" + semi_lot_id + ", raw_lot_id=" + raw_lot_id
				+ ", qty_used=" + qty_used + ", unit=" + unit + "]";
	}
	
}
