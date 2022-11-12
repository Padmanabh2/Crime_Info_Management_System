package Dbutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Beanclass.Crimebean;
import Connection.Providecon;
import Exception.Crimedetailsexep;

public class Intr_crimedetailsimpl implements Intr_crimedetails {

	@Override
	public String addcomplaint(Crimebean cb) throws Crimedetailsexep {
		
		String st = "complaint not added..";
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("insert into main(date_of_crime,place_of_crime,crime_id,victime_names,suspect_names) values(?,?,?,?,?)");
			
			ps.setDate(1, cb.getDate_of_crime());
			ps.setString(2, cb.getPlace_of_crime());
			ps.setInt(3, cb.getCrime_id());
			ps.setString(4, cb.getVictime_names());
			ps.setString(5, cb.getSuspect_names());
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				st = "complaint registered successfully...";
			}else {
				throw new Crimedetailsexep("check your date formate or other credentials properly");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return st;
		
	}

	@Override
	public String updatecomplaintstatus() throws Crimedetailsexep {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String altercomplaintdetails()throws Crimedetailsexep {
		// TODO Auto-generated method stub
		return null;
	}

}
