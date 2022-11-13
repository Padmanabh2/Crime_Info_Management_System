package Criminal_main_class;

import java.util.List;
import java.util.Scanner;

import Beanclass.Crimebean;
import Beanclass.Criminalbean;
import Dbutil.Intr_crimedetailsimpl;
import Dbutil.Intr_criminaldetails_impl;

public class Demodisplaycriminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Intr_criminaldetails_impl it1 = new Intr_criminaldetails_impl();
		
		{
			
			System.out.println("--------------choose correct option----------------");
			
			System.out.println("enter 1 to select all the records from criminal table");
			System.out.println("enter 2 to select all the records according to their name");
			
			System.out.println("---------------------------------------------------");
			
		}
		
		System.out.println("Enter your choice");
		int ab = sc.nextInt();
		
		
		switch(ab) {
		
		case 1:
			
			try {
				
				List<Criminalbean> lt = it1.showallcriminaldetails();
				lt.forEach(s -> System.out.println(s));
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			break;
			
		case 2:
			
			try {
				
				List<Criminalbean> lt = it1.showaccordingname();
				lt.forEach(s -> System.out.println(s));
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			break;
			
			default:
				System.out.println("Enter valid choice");
		
		}
		
	}

}
