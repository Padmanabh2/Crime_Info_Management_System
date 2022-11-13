package Dbutil;

import java.util.List;

import Beanclass.Criminalbean;
import Exception.Criminaldetailsexep;

public interface Intr_criminaldetails {

	public String addcriminaldetails(Criminalbean cb) throws Criminaldetailsexep;
	
	public String editcriminaldetails(Criminalbean cb, int id) throws Criminaldetailsexep;
	
	
	public String editcriminalname(String name, int id) throws Criminaldetailsexep;
	
	public String editcriminalage(int age, int id) throws Criminaldetailsexep;
	
	public String editcriminalgender(String gen, int id) throws Criminaldetailsexep;
	
	public String editcriminaladdress(String add, int id) throws Criminaldetailsexep;
	
	public String editcriminalbodymark(String bm, int id) throws Criminaldetailsexep;
	
	public String editcriminalarrestarea(String arrarea, int id) throws Criminaldetailsexep;
	
	public String editcriminalcrimetype(int typeid, int id) throws Criminaldetailsexep;
	
	
	public String deletecriminaldetails(int id) throws Criminaldetailsexep;
	
	public List<Criminalbean> showallcriminaldetails() throws Criminaldetailsexep;
	
	public List<Criminalbean> showaccordingname() throws Criminaldetailsexep;
	
}
