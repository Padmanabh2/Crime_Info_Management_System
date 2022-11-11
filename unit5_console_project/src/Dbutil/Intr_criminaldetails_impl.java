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
	public String editcriminaldetails(Criminalbean cb, int id) throws Criminaldetailsexep {
		
		String st = "criminal details not updated";
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("update criminal_details set(cri_name,cri_age,cri_gender,cri_address,cri_bodymark,area_of_arrest,crime_type_or_id) values(?,?,?,?,?,?,?) where cri_id = ?");
			
			ps.setString(1, cb.getCri_name());
			ps.setInt(2, cb.getCri_age());
			ps.setString(3, cb.getCri_gender());
			ps.setString(4, cb.getCri_address());
			ps.setString(5, cb.getCri_bodymark());
			ps.setString(6, cb.getArea_of_arrest());
			ps.setInt(7, cb.getCrime_type_or_id());
			ps.setInt(8, id);
			
			int x = ps.executeUpdate();
			if(x>0) {
				st="criminal details updated successfully...";
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
	public String editcriminalname(String name, int id) throws Criminaldetailsexep{
		
		String st = "criminal details not updated";
		
		Criminalbean cb = new Criminalbean();
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("update criminal_details set cri_name = ? where cri_id = ?");
			
			ps.setString(1, name);
			ps.setInt(2, id);
			
			
			int x = ps.executeUpdate();
			if(x>0) {
				st="criminal name updated successfully...";
			}else {
				throw new Criminaldetailsexep("enter criminal correct id to update name...");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return st;
		
	}

	@Override
	public String editcriminalage(int age, int id) throws Criminaldetailsexep{
		
		
		String st = "criminal details not updated";
		
		Criminalbean cb = new Criminalbean();
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("update criminal_details set cri_age = ? where cri_id = ?");
			
			ps.setInt(1, age);
			ps.setInt(2, id);
			
			
			int x = ps.executeUpdate();
			if(x>0) {
				st="criminal age updated successfully...";
			}else {
				throw new Criminaldetailsexep("enter criminal correct id to update age...");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return st;
		
	}

	@Override
	public String editcriminalgender(String gen, int id) throws Criminaldetailsexep{
		
		String st = "criminal details not updated";
		
		Criminalbean cb = new Criminalbean();
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("update criminal_details set cri_gender = ? where cri_id = ?");
			
			ps.setString(1, gen);
			ps.setInt(2, id);
			
			
			int x = ps.executeUpdate();
			if(x>0) {
				st="criminal gender updated successfully...";
			}else {
				throw new Criminaldetailsexep("enter criminal correct id to update gender...");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return st;
		
	}

	@Override
	public String editcriminaladdress(String add, int id) throws Criminaldetailsexep{
		
		String st = "criminal details not updated";
		
		Criminalbean cb = new Criminalbean();
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("update criminal_details set cri_address= ? where cri_id = ?");
			
			ps.setString(1, add);
			ps.setInt(2, id);
			
			
			int x = ps.executeUpdate();
			if(x>0) {
				st="criminal address updated successfully...";
			}else {
				throw new Criminaldetailsexep("enter criminal correct id to update address...");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return st;
		
	}

	@Override
	public String editcriminalbodymark(String bm, int id) throws Criminaldetailsexep{
		
		String st = "criminal details not updated";
		
		Criminalbean cb = new Criminalbean();
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("update criminal_details set cri_bodymark = ? where cri_id = ?");
			
			ps.setString(1, bm);
			ps.setInt(2, id);
			
			
			int x = ps.executeUpdate();
			if(x>0) {
				st="criminal bm updated successfully...";
			}else {
				throw new Criminaldetailsexep("enter criminal correct id to update bm...");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return st;
		
	}

	@Override
	public String editcriminalarrestarea(String arrarea, int id) throws Criminaldetailsexep{
		
		String st = "criminal details not updated";
		
		Criminalbean cb = new Criminalbean();
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("update criminal_details set area_of_arrest = ? where cri_id = ?");
			
			ps.setString(1, arrarea);
			ps.setInt(2, id);
			
			
			int x = ps.executeUpdate();
			if(x>0) {
				st="criminal area of arrest updated successfully...";
			}else {
				throw new Criminaldetailsexep("enter criminal correct id to update area of arrest...");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return st;
		
	}

	@Override
	public String editcriminalcrimetype(int typeid, int id) throws Criminaldetailsexep{
		
		String st = "criminal details not updated";
		
		Criminalbean cb = new Criminalbean();
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("update criminal_details set crime_type_or_id = ? where cri_id = ?");
			
			ps.setInt(1, typeid);
			ps.setInt(2, id);
			
			
			int x = ps.executeUpdate();
			if(x>0) {
				st="criminal crime id/type updated successfully...";
			}else {
				throw new Criminaldetailsexep("enter criminal correct id to update crime id/type...");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return st;
		
	}
	
	
	
	@Override
	public String deletecriminaldetails(int id) throws Criminaldetailsexep{
	
		String st = "criminal record not deleted with id "+id;
		
		Criminalbean cb = new Criminalbean();
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("delete from criminal_details where cri_id = ?");
		
			ps.setInt(1, id);
			
			int x = ps.executeUpdate();
			if(x>0) {
				st="criminal record deleted successfully...with id "+id;
			}else {
				throw new Criminaldetailsexep("enter correct criminal id to delete criminal record...");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return st;
		
	}

}
