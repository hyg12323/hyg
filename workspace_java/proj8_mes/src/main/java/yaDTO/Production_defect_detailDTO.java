package yaDTO;

public class Production_defect_detailDTO {

	
	private int pdd_id;
	private int pr_id;
	private String defect_code;
	private int qty;
	private String notes;
	public int getPdd_id() {
		return pdd_id;
	}
	public void setPdd_id(int pdd_id) {
		this.pdd_id = pdd_id;
	}
	public int getPr_id() {
		return pr_id;
	}
	public void setPr_id(int pr_id) {
		this.pr_id = pr_id;
	}
	public String getDefect_code() {
		return defect_code;
	}
	public void setDefect_code(String defect_code) {
		this.defect_code = defect_code;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	@Override
	public String toString() {
		return "Production_defect_detailDTO [pdd_id=" + pdd_id + ", pr_id=" + pr_id + ", defect_code=" + defect_code
				+ ", qty=" + qty + ", notes=" + notes + "]";
	}
	
}
