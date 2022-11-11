package Dbutil;

import Beanclass.Criminalbean;
import Exception.Criminaldetailsexep;

public interface Intr_criminaldetails {

	public String addcriminaldetails(Criminalbean cb) throws Criminaldetailsexep;
	
	public String editcriminaldetails();
	
	public String deletecriminaldetails();
	
}
