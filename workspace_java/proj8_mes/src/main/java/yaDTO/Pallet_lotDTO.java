package yaDTO;

import java.sql.Date;

public class Pallet_lotDTO {

	private int pallet_id;
	private String pallet_no;
	private int lot_id;
	private int qty;
	private Date created_at;
	private String location;
	public int getPallet_id() {
		return pallet_id;
	}
	public void setPallet_id(int pallet_id) {
		this.pallet_id = pallet_id;
	}
	public String getPallet_no() {
		return pallet_no;
	}
	public void setPallet_no(String pallet_no) {
		this.pallet_no = pallet_no;
	}
	public int getLot_id() {
		return lot_id;
	}
	public void setLot_id(int lot_id) {
		this.lot_id = lot_id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Pallet_lotDTO [pallet_id=" + pallet_id + ", pallet_no=" + pallet_no + ", lot_id=" + lot_id + ", qty="
				+ qty + ", created_at=" + created_at + ", location=" + location + "]";
	}
	
}

