package Dbutil;

import java.sql.Date;

import Beanclass.Crimebean;
import Exception.Crimedetailsexep;
import Exception.Criminaldetailsexep;

public interface Intr_crimedetails {

	public String addcomplaint(Crimebean cb) throws Crimedetailsexep;
	
	public String updatecomplaintstatus(int id) throws Crimedetailsexep;
	
	public String updatenotsolved(int id) throws Crimedetailsexep;
	
	
	
	public String editcrimedetails(Crimebean cb, int srno) throws Crimedetailsexep;
	
	public String editcrimedate(Date dt, int id) throws Crimedetailsexep;
	
	public String editcrimeplace(String place, int id) throws Crimedetailsexep;
	
	public String editcrimetypeorid(int cri_id, int id) throws Crimedetailsexep;
	
	public String editcrimevictim(String vic_name, int id) throws Crimedetailsexep;
	
	public String editcrimesuspect(String sus_name, int id) throws Crimedetailsexep;
	
	
	public String deletecomplaint(int srno) throws Crimedetailsexep;
	
	
}
