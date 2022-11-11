package Beanclass;

public class Criminalbean {

	private int cri_id;
	private String cri_name;
	private int cri_age;
	private String cri_gender;
	private String cri_address;
	private String cri_bodymark;
	private String area_of_arrest;
	private int crime_type_or_id;
	public int getCri_id() {
		return cri_id;
	}
	public void setCri_id(int cri_id) {
		this.cri_id = cri_id;
	}
	public String getCri_name() {
		return cri_name;
	}
	public void setCri_name(String cri_name) {
		this.cri_name = cri_name;
	}
	public int getCri_age() {
		return cri_age;
	}
	public void setCri_age(int cri_age) {
		this.cri_age = cri_age;
	}
	public String getCri_gender() {
		return cri_gender;
	}
	public void setCri_gender(String cri_gender) {
		this.cri_gender = cri_gender;
	}
	public String getCri_address() {
		return cri_address;
	}
	public void setCri_address(String cri_address) {
		this.cri_address = cri_address;
	}
	public String getCri_bodymark() {
		return cri_bodymark;
	}
	public void setCri_bodymark(String cri_bodymark) {
		this.cri_bodymark = cri_bodymark;
	}
	public String getArea_of_arrest() {
		return area_of_arrest;
	}
	public void setArea_of_arrest(String area_of_arrest) {
		this.area_of_arrest = area_of_arrest;
	}
	public int getCrime_type_or_id() {
		return crime_type_or_id;
	}
	public void setCrime_type_or_id(int crime_type_or_id) {
		this.crime_type_or_id = crime_type_or_id;
	}
	
	public Criminalbean(int cri_id, String cri_name, int cri_age, String cri_gender, String cri_address,
			String cri_bodymark, String area_of_arrest, int crime_type_or_id) {
		super();
		this.cri_id = cri_id;
		this.cri_name = cri_name;
		this.cri_age = cri_age;
		this.cri_gender = cri_gender;
		this.cri_address = cri_address;
		this.cri_bodymark = cri_bodymark;
		this.area_of_arrest = area_of_arrest;
		this.crime_type_or_id = crime_type_or_id;
	}
	
	public Criminalbean( String cri_name, int cri_age, String cri_gender, String cri_address,
			String cri_bodymark, String area_of_arrest, int crime_type_or_id) {
		super();
		
		this.cri_name = cri_name;
		this.cri_age = cri_age;
		this.cri_gender = cri_gender;
		this.cri_address = cri_address;
		this.cri_bodymark = cri_bodymark;
		this.area_of_arrest = area_of_arrest;
		this.crime_type_or_id = crime_type_or_id;
	}
	
	public Criminalbean() {}
	@Override
	public String toString() {
		return "Criminalbean [cri_id=" + cri_id + ", cri_name=" + cri_name + ", cri_age=" + cri_age + ", cri_gender="
				+ cri_gender + ", cri_address=" + cri_address + ", cri_bodymark=" + cri_bodymark + ", area_of_arrest="
				+ area_of_arrest + ", crime_type_or_id=" + crime_type_or_id + "]";
	}
	
	
	
}
