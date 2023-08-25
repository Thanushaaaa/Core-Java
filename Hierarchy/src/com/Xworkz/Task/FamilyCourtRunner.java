package com.Xworkz.Task;

public class FamilyCourtRunner {

	public static void main(String[] args) {
		FamilyCourt familyCourt=new FamilyCourt();
		familyCourt.divorce();
		familyCourt.justice();
		familyCourt.importantCase();
		familyCourt.criminalCase();
		familyCourt.forgeryCase();
		familyCourt.propertyCase();
		familyCourt.theftCase();
		
		CivilCourt civilCourt=new FamilyCourt();
		civilCourt.propertyCase();
		civilCourt.theftCase();
		civilCourt.criminalCase();
		civilCourt.forgeryCase();
		familyCourt.justice();
		familyCourt.importantCase();
		
		HighCourt highCourt=new FamilyCourt();
		highCourt.justice();
		highCourt.importantCase();
		highCourt.criminalCase();
		highCourt.forgeryCase();
		
		SupremeCourt supremeCourt=new FamilyCourt();
		supremeCourt.justice();
		supremeCourt.importantCase();
		

		Court court=new FamilyCourt();
		court.justice();
		
		
		CivilCourt civilCourt1=new CivilCourt();
		civilCourt1.justice();
		civilCourt1.importantCase();
		civilCourt1.criminalCase();
		civilCourt1.forgeryCase();
		civilCourt1.propertyCase();
		civilCourt1.theftCase();
		
		HighCourt highCourt1=new CivilCourt();
		highCourt1.justice();
		highCourt1.importantCase();
		highCourt1.criminalCase();
		highCourt1.forgeryCase();
		
		SupremeCourt supremeCourt1=new CivilCourt();
		supremeCourt1.justice();
		supremeCourt1.importantCase();
		
		Court court1=new CivilCourt();
		court1.justice();
		
		HighCourt highCourt2=new HighCourt();
		highCourt2.justice();
		highCourt2.importantCase();
		highCourt2.criminalCase();
		highCourt2.forgeryCase();
		
		SupremeCourt supremeCourt2=new HighCourt();
		supremeCourt2.justice();
		supremeCourt2.importantCase();
		
		Court court2=new HighCourt();
		court2.justice();
		
		SupremeCourt supremeCourt3=new SupremeCourt();
		supremeCourt3.justice();
		supremeCourt3.importantCase();
				
		Court court3=new SupremeCourt();
		court3.justice();
		
		Court court4=new Court();
		court4.justice();
		
		


		
	}

}
