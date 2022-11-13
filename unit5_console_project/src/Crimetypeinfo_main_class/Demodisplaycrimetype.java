package Crimetypeinfo_main_class;

import java.util.List;

import Beanclass.Crimetypebean;
import Dbutil.Intr_crimetypeimpl;

public class Demodisplaycrimetype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Intr_crimetypeimpl ct = new Intr_crimetypeimpl();
		
		try {
			
			List<Crimetypebean> aa = ct.showcrimetype();
			aa.forEach(s -> System.out.println(s));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
