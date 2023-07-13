package com.xworkz.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		hospital.branch="btm";
		hospital.chiefDoctor="Prabhas";
		hospital.displayInstance();
		
		Hospital hospital1=new Hospital();
		hospital1.branch="btm1";
		hospital1.chiefDoctor="Prabhas1";
		hospital1.displayInstance();
		
		Hospital hospital2=new Hospital();
		hospital2.branch="btm2";
		hospital2.chiefDoctor="Prabhas2";
		hospital2.displayInstance();
		
		
		// TODO Auto-generated method stub

	}

}
