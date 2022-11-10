package Beanclass;

import java.sql.Date;
import java.time.LocalDate;

public class Crimebean {

	private int srno;
	private LocalDate date_of_crime;
	private String place_of_crime;
	private int crime_id;
	private String victime_names;
	private String suspect_names;
	private String status;
	public int getSrno() {
		return srno;
	}
	public void setSrno(int srno) {
		this.srno = srno;
	}
	public LocalDate getDate_of_crime() {
		return date_of_crime;
	}
	public void setDate_of_crime(LocalDate date_of_crime) {
		this.date_of_crime = date_of_crime;
	}
	public String getPlace_of_crime() {
		return place_of_crime;
	}
	public void setPlace_of_crime(String place_of_crime) {
		this.place_of_crime = place_of_crime;
	}
	public int getCrime_id() {
		return crime_id;
	}
	public void setCrime_id(int crime_id) {
		this.crime_id = crime_id;
	}
	public String getVictime_names() {
		return victime_names;
	}
	public void setVictime_names(String victime_names) {
		this.victime_names = victime_names;
	}
	public String getSuspect_names() {
		return suspect_names;
	}
	public void setSuspect_names(String suspect_names) {
		this.suspect_names = suspect_names;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Crimebean(int srno, LocalDate date_of_crime, String place_of_crime, int crime_id, String victime_names,
			String suspect_names, String status) {
		super();
		this.srno = srno;
		this.date_of_crime = date_of_crime;
		this.place_of_crime = place_of_crime;
		this.crime_id = crime_id;
		this.victime_names = victime_names;
		this.suspect_names = suspect_names;
		this.status = status;
	}
	
	public Crimebean() {}
	
	@Override
	public String toString() {
		return "Crimebean [srno=" + srno + ", date_of_crime=" + date_of_crime + ", place_of_crime=" + place_of_crime
				+ ", crime_id=" + crime_id + ", victime_names=" + victime_names + ", suspect_names=" + suspect_names
				+ ", status=" + status + "]";
	}
	
	
	
}
