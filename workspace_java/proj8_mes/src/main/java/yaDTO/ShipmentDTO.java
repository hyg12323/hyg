package yaDTO;

import java.sql.Date;

public class ShipmentDTO {

	private int ship_id;
	private int pallet_id;
	private String customer;
	private Date ship_date;
	private int qty;
	private String driver;
	public int getShip_id() {
		return ship_id;
	}
	public void setShip_id(int ship_id) {
		this.ship_id = ship_id;
	}
	public int getPallet_id() {
		return pallet_id;
	}
	public void setPallet_id(int pallet_id) {
		this.pallet_id = pallet_id;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public Date getShip_date() {
		return ship_date;
	}
	public void setShip_date(Date ship_date) {
		this.ship_date = ship_date;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	@Override
	public String toString() {
		return "ShipmentDTO [ship_id=" + ship_id + ", pallet_id=" + pallet_id + ", customer=" + customer
				+ ", ship_date=" + ship_date + ", qty=" + qty + ", driver=" + driver + "]";
	}
	
}
