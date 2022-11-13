package Criminal_main_class;

import java.util.List;
import java.util.Scanner;

import Beanclass.Criminalbean;
import Dbutil.Intr_criminaldetails_impl;

public class Demosearchcriminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Intr_criminaldetails_impl it1 = new Intr_criminaldetails_impl();
		
		System.out.println("Enter criminal name to search");
		String name = sc.next();
		
		try {
			
			List<Criminalbean> cb = it1.searchonname(name);
			cb.forEach(s -> System.out.println(s));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
