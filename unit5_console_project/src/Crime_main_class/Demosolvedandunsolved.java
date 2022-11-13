package Crime_main_class;

import Dbutil.Intr_crimedetailsimpl;

public class Demosolvedandunsolved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Intr_crimedetailsimpl it1 = new Intr_crimedetailsimpl();
		
		try {
			
			int solved = it1.solvedcrimes();
			System.out.println("solved Crimes are "+solved);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			
			int unsolved = it1.unsolvedcrimes();
			System.out.println("unsolved Crimes are "+unsolved);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
