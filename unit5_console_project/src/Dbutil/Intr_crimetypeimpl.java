package Dbutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Beanclass.Crimetypebean;
import Connection.Providecon;
import Exception.Crimetypeexep;

public class Intr_crimetypeimpl implements Intr_crimetype {

	@Override
	public String addcrimetype(String cri_name) throws Crimetypeexep{
		
		String st = "type not added...";
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("insert into crime_type(crime_name) values (?)");
			
			ps.setString(1, cri_name);

			int x = ps.executeUpdate();
			
			if(x>0) {
				st = "type added successfully...";
			}else {
				throw new Crimetypeexep("enter correct name");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return st;
		
	}

	@Override
	public String altercrimetype(String cri_name, int id) throws Crimetypeexep{
		
		String st = "type not updated...";
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("update crime_type set crime_name = ? where crime_id = ?");
			
			ps.setString(1, cri_name);
			ps.setInt(2, id);

			int x = ps.executeUpdate();
			
			if(x>0) {
				st = "type updated successfully...";
			}else {
				throw new Crimetypeexep("enter correct and valid id and name");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return st;
		
	}

	@Override
	public List<Crimetypebean> showcrimetype() throws Crimetypeexep {
		
		List<Crimetypebean> bb = new ArrayList<Crimetypebean>();
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("select * from crime_type");

			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int criid = rs.getInt("crime_id");
				String crnm = rs.getString("crime_name");
				
				bb.add(new Crimetypebean(criid, crnm));
				
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
		return bb;
		
	}

}
