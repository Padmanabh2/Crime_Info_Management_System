package Admin_main_class;

import java.util.Scanner;

import Crime_main_class.Demoaddcomplaint;
import Crime_main_class.Democrimedisplay;
import Crime_main_class.Demodeletecomplaint;
import Crime_main_class.Demoeditcrimedetails;
import Crime_main_class.Demosearchcrime;
import Crime_main_class.Demosolvedandunsolved;
import Crime_main_class.Demosolvedincurrentmonth;
import Crime_main_class.Demoupdatestatus;
import Crimetypeinfo_main_class.Demoaddtype;
import Crimetypeinfo_main_class.Demoaltertype;
import Criminal_main_class.Demoaddcriminal;
import Criminal_main_class.Demodeletecriminal;
import Criminal_main_class.Demodisplaycriminal;
import Criminal_main_class.Demosearchcriminal;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			{
				
				System.out.println("-------------choose the following actions--------------");
				
				System.out.println("Enter 1 to add new complaint");
				System.out.println("Enter 2 to edit complaint details");
				System.out.println("Enter 3 to delete the complaint record");
				System.out.println("Enter 4 to update status of crime record");
				System.out.println("Enter 55 to search crime record");
				System.out.println("Enter 66 to get crime records");
				
				System.out.println("-------------------------------------------------------");
				
				System.out.println("Enter 5 to add criminal details");
				System.out.println("Enter 6 to edit criminal details");
				System.out.println("Enter 7 to delete criminal record");
				System.out.println("Enter 88 to search criminal record");
				System.out.println("Enter 99 to get criminal records");
				
				System.out.println("-------------------------------------------------------");
				
				System.out.println("Enter 11 to add crime - type");
				System.out.println("Enter 22 to alter crime - type");
				
				System.out.println("-------------------------------------------------------");
				
				
				
				System.out.println("Enter 12 to get solved and unsolved complaint");
				
				System.out.println("Enter 14 to get number of crimes in current month");
				
				System.out.println("Press 00 to Log Out");
				
				
				System.out.println("-------------------------------------------------------");
				
				
				
			}
			
			System.out.println("Enter your choice");
			int x = sc.nextInt();
			
			switch(x) {
			
			case 1:
				
				Demoaddcomplaint.main(args);
				
				break;
				
			case 2:
				
				Demoeditcrimedetails.main(args);
				
				break;
				
			case 3:
				
				Demodeletecomplaint.main(args);
				
				break;
				
			case 4:
				
				Demoupdatestatus.main(args);
				
				break;
				
			case 55:
				
				Demosearchcrime.main(args);
				
				break;
				
			case 66:
				
				Democrimedisplay.main(args);
				
				break;
				
			case 5:
				
				Demoaddcriminal.main(args);
				
				break;
				
			case 6:
				
				Demoeditcrimedetails.main(args);
				
				break;
				
			case 7:
				
				Demodeletecriminal.main(args);
				
				break;
				
			case 88:
				
				Demosearchcriminal.main(args);
				
				break;
				
			case 99:
				
				Demodisplaycriminal.main(args);
				
				break;
				
			case 11:
				
				Demoaddtype.main(args);
				
				break;
				
			case 22:
				
				Demoaltertype.main(args);
				
				break;
				
			case 12:
				
				Demosolvedandunsolved.main(args);
				
				break;
				
			case 14:
				
				Demosolvedincurrentmonth.main(args);
				
				break;
				
			case 00:
				
				System.out.println("You are logged out Thank you !!!");
				return;
				
				default:
					
					System.out.println("Enter correct choice");
			
			}
			
		}
		
		
		
	}

}
