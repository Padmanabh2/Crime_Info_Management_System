package Crime_main_class;

import java.util.Scanner;

import Dbutil.Intr_crimedetailsimpl;

public class Demodeletecomplaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		Intr_crimedetailsimpl it1 = new Intr_crimedetailsimpl();
		
		System.out.println("enter srno/complaint number to be deleted from records");
		int srno5 = sc.nextInt();
		 
		 
		 	try {
				
				String res = it1.deletecomplaint(srno5);
				System.out.println(res);
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
	}

}
