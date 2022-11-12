package Crime_main_class;

import java.util.Scanner;

import Dbutil.Intr_crimedetailsimpl;

public class Demoupdatestatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Intr_crimedetailsimpl it1 = new Intr_crimedetailsimpl();
		
		
		{
			
			System.out.println("-------------make following choices------------");
			System.out.println("update status to solved enter 1");
			System.out.println("update status to not-solved enter 2");
			System.out.println("-----------------------------------------------");
			
		}
		
		System.out.println("Enter correct option to perform action");
		int choice = sc.nextInt();
		
		
		switch(choice) {
		
		case 1:
			
			System.out.println("enter srno/complaint number to update status to solved");
			int srno5 = sc.nextInt();
			 
			 
			 	try {
					
					String res = it1.updatecomplaintstatus(srno5);
					System.out.println(res);
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			 	break;
			 	
		case 2:
			
			System.out.println("enter srno/complaint number to update status to Not-Solved");
			int srno6 = sc.nextInt();
			 
			 
			 	try {
					
					String res = it1.updatenotsolved(srno6);
					System.out.println(res);
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
		
		}
		
		
	}

}
