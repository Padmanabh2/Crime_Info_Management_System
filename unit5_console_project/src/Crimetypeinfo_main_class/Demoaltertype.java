package Crimetypeinfo_main_class;

import java.util.Scanner;

import Dbutil.Intr_crimetypeimpl;

public class Demoaltertype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Intr_crimetypeimpl it1 = new Intr_crimetypeimpl();
		
		System.out.println("enter id of crime you want to alter");
		int id = sc.nextInt();
		
		System.out.println("enter crime type you want to alter");
		String nm = sc.next();
		
		try {
			
			String ss = it1.altercrimetype(nm, id);
			System.out.println(ss);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
