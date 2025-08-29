package yaDTO;

import java.sql.Date;

public class Raw_lotDTO {

	private int raw_lot_id;
	private String raw_lot_no;
	private int material_id;
	private String vendor; 
	private Date recv_date;
	private Date exp_date;
	private int qty_on_hand;
	private String remarks;
	
	public int getRaw_lot_id() {
		return raw_lot_id;
	}
	public void setRaw_lot_id(int raw_lot_id) {
		this.raw_lot_id = raw_lot_id;
	}
	public String getRaw_lot_no() {
		return raw_lot_no;
	}
	public void setRaw_lot_no(String raw_lot_no) {
		this.raw_lot_no = raw_lot_no;
	}
	public int getMaterial_id() {
		return material_id;
	}
	public void setMaterial_id(int material_id) {
		this.material_id = material_id;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public Date getRecv_date() {
		return recv_date;
	}
	public void setRecv_date(Date recv_date) {
		this.recv_date = recv_date;
	}
	public Date getExp_date() {
		return exp_date;
	}
	public void setExp_date(Date exp_date) {
		this.exp_date = exp_date;
	}
	public int getQty_on_hand() {
		return qty_on_hand;
	}
	public void setQty_on_hand(int qty_on_hand) {
		this.qty_on_hand = qty_on_hand;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "Raw_lotDTO [raw_lot_id=" + raw_lot_id + ", raw_lot_no=" + raw_lot_no + ", material_id=" + material_id
				+ ", vendor=" + vendor + ", recv_date=" + recv_date + ", exp_date=" + exp_date + ", qty_on_hand="
				+ qty_on_hand + ", remarks=" + remarks + "]";
	}
	
	
}
