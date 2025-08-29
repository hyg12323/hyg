package yaDTO;



public class MaterialDTO {

	private int material_id;
	private String material_code;
	private String material_name;
	private String unit ;
	
	public int getMaterial_id() {
		return material_id;
	}
	public void setMaterial_id(int material_id) {
		this.material_id = material_id;
	}
	public String getMaterial_code() {
		return material_code;
	}
	public void setMaterial_code(String material_code) {
		this.material_code = material_code;
	}
	public String getMaterial_name() {
		return material_name;
	}
	public void setMaterial_name(String material_name) {
		this.material_name = material_name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	@Override
	public String toString() {
		return "MaterialDTO [material_id=" + material_id + ", material_code=" + material_code + ", material_name="
				+ material_name + ", unit=" + unit + "]";
	} 
	
}
