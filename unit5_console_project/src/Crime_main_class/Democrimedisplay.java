package Crime_main_class;

import java.util.List;
import java.util.Scanner;

import Beanclass.Crimebean;
import Dbutil.Intr_crimedetailsimpl;

public class Democrimedisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Intr_crimedetailsimpl it1 = new Intr_crimedetailsimpl();
		
		{
			
			System.out.println("--------------choose correct option----------------");
			
			System.out.println("enter 1 to select all the records from complaint table");
			System.out.println("enter 2 to select all the records according to crime id/type");
			
			System.out.println("---------------------------------------------------");
			
		}
		
		System.out.println("Enter your choice");
		int ab = sc.nextInt();
		
		switch(ab) {
		
		case 1:
			
			try {
				
				List<Crimebean> lt = it1.showallcomplainttable();
				lt.forEach(s -> System.out.println(s));
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			break;
			
		case 2:
			
			try {
				
				List<Crimebean> lt11 = it1.showallcomplaintbyplaceofcrime();
				lt11.forEach(ss -> System.out.println(ss));
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			break;
			
			default:
				System.out.println("please make correct choice");
		
		}
		
		
	}

}
