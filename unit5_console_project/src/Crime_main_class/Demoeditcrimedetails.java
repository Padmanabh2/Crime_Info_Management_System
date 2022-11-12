package Crime_main_class;

import java.sql.Date;
import java.util.Scanner;

import Beanclass.Crimebean;
import Dbutil.Intr_crimedetailsimpl;
import Dbutil.Intr_criminaldetails_impl;

public class Demoeditcrimedetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Intr_crimedetailsimpl it1 = new Intr_crimedetailsimpl();
		
		 {
			
			System.out.println("----------select option--------");
			
			System.out.println("enter 1 for full details update");
			System.out.println("enter 2 for updating date of crime");
			System.out.println("enter 3 for updating place of crime");
			System.out.println("enter 4 for updating crime type/id");
			System.out.println("enter 5 for updating victime names");
			System.out.println("enter 6 for updating suspect names");
			
			System.out.println("--------------------------------");
	
		}
		 
		 System.out.println("enter choice number to perform the action");
		 int casex = sc.nextInt();
		

		 switch(casex) {
		 
		 case 1:
			 
			 System.out.println("enter srno/complaint number to be updated");
			 int srno = sc.nextInt();
			 sc.nextLine();
			 
			 boolean flag = true;
				Date dt = null;
				
				while(flag) {
					System.out.println("enter date of crime in yyyy-mm-dd format to update");
					System.out.println("do not use / while entering date use - insted");
					try {
						dt = Date.valueOf(sc.nextLine());
						flag = false;
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
				
				System.out.println("enter place of crime to update");
				String place = sc.nextLine();
				
				System.out.println("enter crime type/id to update");
				int cid = sc.nextInt();
				sc.nextLine();
				
				System.out.println("enter victime names to update");
				String vn = sc.nextLine();
				
				System.out.println("enter suspect names to update");
				String sn = sc.nextLine();
				
				try {
					
					String res = it1.editcrimedetails(new Crimebean(dt,place,cid,vn,sn), srno);
					System.out.println(res);
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
				
		 case 2:
			 
			 System.out.println("enter srno/complaint number to be updated");
			 int srno1 = sc.nextInt();
			 sc.nextLine();
			 
			 boolean flag1 = true;
				Date dt1 = null;
				
				while(flag1) {
					System.out.println("enter date of crime in yyyy-mm-dd format to update");
					System.out.println("do not use / while entering date use - insted");
					try {
						dt1 = Date.valueOf(sc.nextLine());
						flag1 = false;
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
				
				try {
					
					String res = it1.editcrimedate(dt1, srno1);
					System.out.println(res);
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
				
		 case 3:
			 
			 System.out.println("enter srno/complaint number to be updated");
			 int srno2 = sc.nextInt();
			 sc.nextLine();
			 
			 System.out.println("enter place of crime to update in record");
			 String placecrime = sc.nextLine();
			 
			 	try {
					
					String res = it1.editcrimeplace(placecrime, srno2);
					System.out.println(res);
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
				
		 case 4:
			 
			 System.out.println("enter srno/complaint number to be updated");
			 int srno3 = sc.nextInt();
			 sc.nextLine();
			 
			 System.out.println("enter crime type/id to be updated");
			 int cri_type = sc.nextInt();
			 
			 	try {
					
					String res = it1.editcrimetypeorid(cri_type, srno3);
					System.out.println(res);
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
				
		 case 5:
			 
			 System.out.println("enter srno/complaint number to be updated");
			 int srno4 = sc.nextInt();
			 sc.nextLine();
			 
			 System.out.println("enter Victime names to be updated");
			 String vic_names = sc.nextLine();
			 
			 	try {
					
					String res = it1.editcrimevictim(vic_names, srno4);
					System.out.println(res);
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
				
		 case 6:
			 
			 System.out.println("enter srno/complaint number to be updated");
			 int srno5 = sc.nextInt();
			 sc.nextLine();
			 
			 System.out.println("enter Suspect names to be updated");
			 String sus_names = sc.nextLine();
			 
			 	try {
					
					String res = it1.editcrimesuspect(sus_names, srno5);
					System.out.println(res);
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
				
				default:
					System.out.println("enter correct coice/ valid number");
		 
		 }
		 
	}

}
