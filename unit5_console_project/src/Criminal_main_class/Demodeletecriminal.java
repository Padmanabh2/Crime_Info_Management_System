package Criminal_main_class;

import java.util.Scanner;

import Dbutil.Intr_criminaldetails_impl;

public class Demodeletecriminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Intr_criminaldetails_impl it1 = new Intr_criminaldetails_impl();
		
		System.out.println("enter criminal id to delete the recorc...");
		int id = sc.nextInt();
		
		try {
			
			String ss = it1.deletecriminaldetails(id);
			System.out.println(ss);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
