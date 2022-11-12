package Dbutil;

import Beanclass.Crimebean;
import Exception.Crimedetailsexep;

public interface Intr_crimedetails {

	public String addcomplaint(Crimebean cb) throws Crimedetailsexep;
	
	public String updatecomplaintstatus() throws Crimedetailsexep;
	
	public String altercomplaintdetails() throws Crimedetailsexep;
	
	
}
