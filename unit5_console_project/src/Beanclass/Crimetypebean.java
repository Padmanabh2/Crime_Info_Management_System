package Beanclass;

public class Crimetypebean {

	private int crime_id;
	private String crime_name;
	
	public int getCrime_id() {
		return crime_id;
	}
	public void setCrime_id(int crime_id) {
		this.crime_id = crime_id;
	}
	public String getCrime_name() {
		return crime_name;
	}
	public void setCrime_name(String crime_name) {
		this.crime_name = crime_name;
	}
	@Override
	public String toString() {
		return "Crimetypebean [crime_id=" + crime_id + ", crime_name=" + crime_name + "]";
	}
	
	public Crimetypebean(int crime_id, String crime_name) {
		super();
		this.crime_id = crime_id;
		this.crime_name = crime_name;
	}
	
	public Crimetypebean() {}
	
}
