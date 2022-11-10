package Dbutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.Providecon;
import Exception.Adminexep;

public class Intr_admin_impl implements Intr_admin{

	@Override
	public Boolean adminlogin(String unm, String upwd) throws Adminexep {
		
		Boolean b = false;
		
		try (Connection con = Providecon.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("select * from admindetails where admin_email = ? and admin_pwd = ?");
			
			ps.setString(1, unm);
			ps.setString(2, upwd);
			
			ResultSet rs = ps.executeQuery();
			
			Boolean x = rs.next();
			
			if(x) {
				b=true;
			}else {
				throw new Adminexep("admin exep...");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		return b;
		
	}

}
