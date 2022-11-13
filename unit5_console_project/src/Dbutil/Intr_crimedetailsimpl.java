package Dbutil;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	public String updatecomplaintstatus(int id) throws Crimedetailsexep {
		
		String st = "Status is not-solved...";
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("update main set status='solved' where srno = ?");
			
			ps.setInt(1, id);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				st = "Status updated to solved...";
			}else {
				throw new Crimedetailsexep("enter srno/complaint number in correct format");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return st;
		
	}

	@Override
	public String updatenotsolved(int id) throws Crimedetailsexep {
		
		String st = "Status is SOLVED...";
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("update main set status='not_solved' where srno = ?");
			
			ps.setInt(1, id);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				st = "Status updated to NOT_SOLVED...";
			}else {
				throw new Crimedetailsexep("enter srno/complaint number in correct format");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return st;
	}
	
	//-------------------------------------------------------------------
	
	
	@Override
	public String editcrimedetails(Crimebean cb, int srno) throws Crimedetailsexep {
		
		String st = "complaint not updated..";
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("update main set date_of_crime = ?, place_of_crime = ?, crime_id = ?, victime_names = ?, suspect_names = ? where srno = ?");
			
			ps.setDate(1, cb.getDate_of_crime());
			ps.setString(2, cb.getPlace_of_crime());
			ps.setInt(3, cb.getCrime_id());
			ps.setString(4, cb.getVictime_names());
			ps.setString(5, cb.getSuspect_names());
			ps.setInt(6, srno);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				st = "complaint details updated successfully...";
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
	public String editcrimedate(Date dt, int id) throws Crimedetailsexep {
		
		String st = "Date not updated..";
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("update main set date_of_crime = ? where srno = ?");
			
			ps.setDate(1, dt);
			ps.setInt(2, id);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				st = "Date details updated successfully...";
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
	public String editcrimeplace(String place, int id) throws Crimedetailsexep {
		
		String st = "Place of crime not updated..";
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("update main set place_of_crime = ? where srno = ?");
			
			ps.setString(1, place);
			ps.setInt(2, id);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				st = "Place of crime details updated successfully...";
			}else {
				throw new Crimedetailsexep("check your input formate or other credentials properly");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return st;
		
	}

	@Override
	public String editcrimetypeorid(int cri_id, int id) throws Crimedetailsexep {
		
		String st = "Crime type/id not updated..";
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("update main set crime_id = ? where srno = ?");
			
			ps.setInt(1, cri_id);
			ps.setInt(2, id);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				st = "Crime type/id details updated successfully...";
			}else {
				throw new Crimedetailsexep("check your input formate or other credentials properly");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return st;
		
	}

	@Override
	public String editcrimevictim(String vic_name, int id) throws Crimedetailsexep {
		
		String st = "Victime names not updated..";
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("update main set victime_names = ? where srno = ?");
			
			ps.setString(1, vic_name);
			ps.setInt(2, id);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				st = "Victime name details updated successfully...";
			}else {
				throw new Crimedetailsexep("check your input formate or other credentials properly");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return st;
		
	}

	@Override
	public String editcrimesuspect(String sus_name, int id) throws Crimedetailsexep {
		
		String st = "Suspect names not updated..";
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("update main set suspect_names = ? where srno = ?");
			
			ps.setString(1, sus_name);
			ps.setInt(2, id);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				st = "Suspect name details updated successfully...";
			}else {
				throw new Crimedetailsexep("check your input formate or other credentials properly");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return st;
		
	}

	
	//-------------------------------------------------------------------------------
	
	
	@Override
	public String deletecomplaint(int srno) throws Crimedetailsexep {
		
		String st = "Record not deleted...";
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("delete from main where srno = ?");
			
			ps.setInt(1, srno);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				st = "Record deleted successfully with id:  "+srno;
			}else {
				throw new Crimedetailsexep("check your input formate properly it must be integer");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return st;
		
	}

	@Override
	public List<Crimebean> showallcomplainttable() throws Crimedetailsexep {
		
		List<Crimebean> cb = new ArrayList<Crimebean>();
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("select * from main");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int srno = rs.getInt("srno");
				Date dt = rs.getDate("date_of_crime");
				String place = rs.getString("place_of_crime");
				int crimeid = rs.getInt("crime_id");
				String vnm = rs.getString("victime_names");
				String snm = rs.getString("suspect_names");
				String status = rs.getString("status");
				
				cb.add(new Crimebean(srno,dt,place,crimeid,vnm,snm,status));
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new Crimedetailsexep("some error occured...");
		}
		
		return cb;
		
	}

	@Override
	public List<Crimebean> showallcomplaintbyplaceofcrime() throws Crimedetailsexep {
		
		List<Crimebean> cb = new ArrayList<Crimebean>();
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("select * from main group by place_of_crime order by crime_id desc");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int srno = rs.getInt("srno");
				Date dt = rs.getDate("date_of_crime");
				String place = rs.getString("place_of_crime");
				int crimeid = rs.getInt("crime_id");
				String vnm = rs.getString("victime_names");
				String snm = rs.getString("suspect_names");
				String status = rs.getString("status");
				
				cb.add(new Crimebean(srno,dt,place,crimeid,vnm,snm,status));
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new Crimedetailsexep("some error occured...");
		}
		
		return cb;
		
	}

	@Override
	public List<Crimebean> searchvictimename(String vic_name) throws Crimedetailsexep {
		
		List<Crimebean> cb = new ArrayList<Crimebean>();
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("select * from main where victime_names = ?");
			
			ps.setString(1, vic_name);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int srno = rs.getInt("srno");
				Date dt = rs.getDate("date_of_crime");
				String place = rs.getString("place_of_crime");
				int crimeid = rs.getInt("crime_id");
				String vnm = rs.getString("victime_names");
				String snm = rs.getString("suspect_names");
				String status = rs.getString("status");
				
				cb.add(new Crimebean(srno,dt,place,crimeid,vnm,snm,status));
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new Crimedetailsexep("enter victime name correctly");
		}
		
		return cb;
	}


}
