package Crime_main_class;

import java.sql.Date;
import java.util.Scanner;

import Beanclass.Crimebean;
import Dbutil.Intr_crimedetails;
import Dbutil.Intr_crimedetailsimpl;

public class Demoaddcomplaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Intr_crimedetailsimpl it1 = new Intr_crimedetailsimpl();

		
		boolean flag = true;
		Date dt = null;
		
		while(flag) {
			System.out.println("enter date of crime in yyyy-mm-dd format");
			System.out.println("do not use / while entering date use - insted");
			try {
				dt = Date.valueOf(sc.nextLine());
				flag = false;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		System.out.println("enter place of crime");
		String place = sc.nextLine();
		
		System.out.println("enter crime type/id");
		int cid = sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter victime names");
		String vn = sc.nextLine();
		
		System.out.println("enter suspect names");
		String sn = sc.nextLine();
		
		try {
			
			String res = it1.addcomplaint(new Crimebean(dt,place,cid,vn,sn));
			System.out.println(res);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
