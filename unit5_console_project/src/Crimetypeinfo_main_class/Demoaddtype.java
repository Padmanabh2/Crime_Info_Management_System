package Crimetypeinfo_main_class;

import java.util.Scanner;

import Dbutil.Intr_crimetypeimpl;

public class Demoaddtype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Intr_crimetypeimpl it1 = new Intr_crimetypeimpl();
		
		System.out.println("enter type of crime you want to add");
		String type = sc.nextLine();
		
		try {
			
			String ss = it1.addcrimetype(type);
			System.out.println(ss);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
