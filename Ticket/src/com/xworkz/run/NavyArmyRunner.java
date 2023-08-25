package com.xworkz.run;

import com.xworkz.implement.NavyArmyRule;
import com.xworkz.implement.StylistSaloon;
import com.xworkz.implement.StudentHostelRules;
import com.xworkz.implement.PatientHospitalRules;
import com.xworkz.implement.AgraMetroRules;
import com.xworkz.implement.BranchHotelRules;
import com.xworkz.implement.GodTempleRules;
import com.xworkz.implement.CargoAirportRules;
import com.xworkz.implement.MovieTheaterRules;
import com.xworkz.implement.MotherHomeRules;
import com.xworkz.implement.EmployeeHusbandRules;
import com.xworkz.implement.EmployeeWifeRules;
import com.xworkz.implement.CityPubRules;
import com.xworkz.implement.AmazonCompanyRules;
import com.xworkz.implement.SbiBankRules;
import com.xworkz.implement.ProductPatentRules;
import com.xworkz.implement.CollegeVtuRules;

public class NavyArmyRunner {

	public static void main(String[] args) {
		NavyArmyRule navyArmyRule = new NavyArmyRule();
		navyArmyRule.protect();
		System.out.println(NavyArmyRule.NAME);
		System.out.println(navyArmyRule.dressColor);
		StylistSaloon stylistSaloon = new StylistSaloon();
		stylistSaloon.pay();
		System.out.println(StylistSaloon.LOCATION);
		System.out.println(stylistSaloon.name);
		StudentHostelRules studentHostelRules = new StudentHostelRules();
		studentHostelRules.visit();
		System.out.println(StudentHostelRules.NAME);
		System.out.println(studentHostelRules.studentName);
		PatientHospitalRules patientHospitalRules = new PatientHospitalRules();
		patientHospitalRules.treat();
		System.out.println(PatientHospitalRules.LOCATION);
		System.out.println(patientHospitalRules.doctorName);
		AgraMetroRules agraMetroRules = new AgraMetroRules();
		agraMetroRules.swipe();
		System.out.println(AgraMetroRules.LOCATION);
		System.out.println(agraMetroRules.name);
		BranchHotelRules branchHotelRules = new BranchHotelRules();
		branchHotelRules.stay();
		System.out.println(branchHotelRules.branch);
		System.out.println(BranchHotelRules.NAME);
		GodTempleRules godTempleRules = new GodTempleRules();
		godTempleRules.pray();
		System.out.println(GodTempleRules.TEMPLE_NAME);
		System.out.println(godTempleRules.ticketPrice);
		CargoAirportRules cargoAirportRules = new CargoAirportRules();
		cargoAirportRules.fly();
		System.out.println(CargoAirportRules.LOCATION);
		System.out.println(cargoAirportRules.ticketPrice);
		MovieTheaterRules movieTheaterRules = new MovieTheaterRules();
		movieTheaterRules.watch();
		System.out.println(MovieTheaterRules.NAME);
		System.out.println(movieTheaterRules.price);
		MotherHomeRules motherHomeRules = new MotherHomeRules();
		motherHomeRules.work();
		System.out.println(MotherHomeRules.NAME);
		System.out.println(motherHomeRules.location);
		EmployeeHusbandRules employeeHusbandRules = new EmployeeHusbandRules();
		employeeHusbandRules.cookWell();
		System.out.println(EmployeeHusbandRules.AGE);
		System.out.println(employeeHusbandRules.name);
		EmployeeWifeRules employeeWifeRules = new EmployeeWifeRules();
		employeeWifeRules.shop();
		System.out.println(employeeWifeRules.age);
		System.out.println(EmployeeWifeRules.NAME);
		CityPubRules cityPubRules = new CityPubRules();
		cityPubRules.dance();
		System.out.println(CityPubRules.NAME);
		System.out.println(cityPubRules.ownerName);
		AmazonCompanyRules amazonCompanyRules = new AmazonCompanyRules();
		amazonCompanyRules.work();
		System.out.println(AmazonCompanyRules.COMPANY_NAME);
		System.out.println(amazonCompanyRules.location);
		SbiBankRules sbiBankRules = new SbiBankRules();
		sbiBankRules.loan();
		System.out.println(SbiBankRules.NAME);
		System.out.println(sbiBankRules.location);
		ProductPatentRules productPatentRules = new ProductPatentRules();
		productPatentRules.apply();
		System.out.println(ProductPatentRules.PERSON_NAME);
		System.out.println(productPatentRules.productName);
		CollegeVtuRules collegeVtuRules = new CollegeVtuRules();
		collegeVtuRules.attend();
		System.out.println(CollegeVtuRules.COLLEGE_NAME);
		System.out.println(collegeVtuRules.studentName);

	}

}
