package Dbutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
		}
		
		return st;
		
	}

}
