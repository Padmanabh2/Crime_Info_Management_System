package Criminal_main_class;

import java.util.Scanner;

import Beanclass.Criminalbean;
import Dbutil.Intr_criminaldetails_impl;

public class Demoeditcriminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Intr_criminaldetails_impl it1 = new Intr_criminaldetails_impl();
		
		 {
			
			System.out.println("----------select option--------");
			
			System.out.println("enter 1 for full details update");
			System.out.println("enter 2 for name update");
			System.out.println("enter 3 for age update");
			System.out.println("enter 4 for gender update");
			System.out.println("enter 5 for address update");
			System.out.println("enter 6 for bodymark update");
			System.out.println("enter 7 for area of arrest update");
			System.out.println("enter 8 for crime type/id update");
	
		}
		
		 	System.out.println("enter choice number");
			int select = sc.nextInt();
			
			switch(select) {
			
			case 1:
				System.out.println("enter criminal name");
				String nm = sc.next();

				System.out.println("enter criminal age");
				int age = sc.nextInt();
				sc.nextLine();
				
				System.out.println("enter criminal gender");
				String gen = sc.nextLine();
				
				System.out.println("enter criminal address");
				String add = sc.nextLine();
				
				System.out.println("enter criminal bodymark");
				String bm = sc.nextLine();
				
				System.out.println("enter criminals area of arrest");
				String arrestarea = sc.nextLine();
				
				System.out.println("enter crime id in which criminal is involved");
				int cri_id = sc.nextInt();
				
				System.out.println("enter criminal id to update details for him?her");
				int idd1 = sc.nextInt();
				
				try {
					
					String res = it1.editcriminaldetails(new Criminalbean(nm,age,gen,add,bm,arrestarea,cri_id), idd1);
					System.out.println(res);
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
				
			case 2:
				
				System.out.println("enter criminal id to update details");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("enter criminal name");
				String nm1 = sc.nextLine();
				
				try {
					
					String res = it1.editcriminalname(nm1, id);
					System.out.println(res);
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
				
			case 3:
				
				System.out.println("enter criminal id to update details");
				int id1 = sc.nextInt();
				sc.nextLine();
				System.out.println("enter criminal age");
				int age1 = sc.nextInt();
				
				try {
					
					String res = it1.editcriminalage(age1, id1);
					System.out.println(res);
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
				
			case 4:
				
				System.out.println("enter criminal id to update details");
				int id2 = sc.nextInt();
				sc.nextLine();
				System.out.println("enter criminal gender");
				String gen1 = sc.nextLine();
				
				try {
					
					String res = it1.editcriminalgender(gen1, id2);
					System.out.println(res);
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
				
			case 5:
				
				System.out.println("enter criminal id to update details");
				int id3 = sc.nextInt();
				sc.nextLine();
				System.out.println("enter criminal address");
				String add2 = sc.nextLine();
				
				try {
					
					String res = it1.editcriminaladdress(add2, id3);
					System.out.println(res);
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
				
			case 6:
				
				System.out.println("enter criminal id to update details");
				int id4 = sc.nextInt();
				sc.nextLine();
				System.out.println("enter criminal bodymark");
				String bm2 = sc.nextLine();
				
				try {
					
					String res = it1.editcriminalbodymark(bm2, id4);
					System.out.println(res);
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
				
			case 7:
				
				System.out.println("enter criminal id to update details");
				int id5 = sc.nextInt();
				sc.nextLine();
				System.out.println("enter criminal area of arrest");
				String aarea = sc.nextLine();
				
				try {
					
					String res = it1.editcriminalarrestarea(aarea, id5);
					System.out.println(res);
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
				
			case 8:
				
				System.out.println("enter criminal id to update details");
				int id6 = sc.nextInt();
				
				System.out.println("enter criminal crime type/id");
				int typeid = sc.nextInt();
				
				try {
					
					String res = it1.editcriminalcrimetype(typeid, id6);
					System.out.println(res);
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
				
				default:
					System.out.println("Please enter a valid choice to operate");
			
			}
		
		
		
	
	}

}
