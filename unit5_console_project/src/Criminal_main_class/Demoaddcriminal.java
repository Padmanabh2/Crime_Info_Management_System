package Criminal_main_class;

import java.util.Scanner;

import Beanclass.Criminalbean;
import Dbutil.Intr_criminaldetails;
import Dbutil.Intr_criminaldetails_impl;

public class Demoaddcriminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Intr_criminaldetails_impl it1 = new Intr_criminaldetails_impl();
		
		System.out.println("enter criminal name");
		String nm = sc.nextLine();
		
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
		
		try {
			
			String res = it1.addcriminaldetails(new Criminalbean(nm,age,gen,add,bm,arrestarea,cri_id));
			System.out.println(res);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
