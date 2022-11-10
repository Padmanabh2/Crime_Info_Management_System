package Admin_main_class;

import java.util.Scanner;

import Dbutil.Intr_admin_impl;

public class Demologin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Intr_admin_impl lt1 = new Intr_admin_impl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter admin user name");
		String unm = sc.next();
		
		System.out.println("Enter admin password");
		String pw = sc.next();
		
		try {
			
			Boolean x = lt1.adminlogin(unm, pw);
			if(x) {
				System.out.println("admin logged in...");
			}else {
				System.out.println("enter correct credentials...");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
