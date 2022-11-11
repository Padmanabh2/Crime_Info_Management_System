package Dbutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Beanclass.Criminalbean;
import Connection.Providecon;
import Exception.Criminaldetailsexep;

public class Intr_criminaldetails_impl implements Intr_criminaldetails {

	@Override
	public String addcriminaldetails(Criminalbean cb) throws Criminaldetailsexep {
		
		String st = "criminal not added..";
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("insert into criminal_details (cri_name,cri_age,cri_gender,cri_address,cri_bodymark,area_of_arrest,crime_type_or_id) values(?,?,?,?,?,?,?)");
			
			ps.setString(1, cb.getCri_name());
			ps.setInt(2, cb.getCri_age());
			ps.setString(3, cb.getCri_gender());
			ps.setString(4, cb.getCri_address());
			ps.setString(5, cb.getCri_bodymark());
			ps.setString(6, cb.getArea_of_arrest());
			ps.setInt(7, cb.getCrime_type_or_id());
			
			int x = ps.executeUpdate();
			if(x>0) {
				st="criminal details added successfully...";
			}else {
				throw new Criminaldetailsexep("enter criminal details correctly");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return st;
		
	}

	@Override
	public String editcriminaldetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletecriminaldetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
