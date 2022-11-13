package Crime_main_class;

import java.util.List;
import java.util.Scanner;

import Beanclass.Crimebean;
import Dbutil.Intr_crimedetailsimpl;

public class Demosearchcrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter victime name to search");
		String nm = sc.next();
		
		Intr_crimedetailsimpl it1 = new Intr_crimedetailsimpl();
		
		try {
			
			List<Crimebean> cb = it1.searchvictimename(nm);
			cb.forEach(ab -> System.out.println(ab));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
