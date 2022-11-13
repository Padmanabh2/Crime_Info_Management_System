package Crime_main_class;

import java.util.Scanner;

import Dbutil.Intr_crimedetailsimpl;

public class Demosolvedincurrentmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Intr_crimedetailsimpl cb = new Intr_crimedetailsimpl();
		
		System.out.println("Enter year to search record");
		int yr = sc.nextInt();
		
		System.out.println("Enter month to search record");
		int mo = sc.nextInt();
		
		try {
			
			int a = cb.numberofrecords(mo, yr);
			System.out.println(a);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
