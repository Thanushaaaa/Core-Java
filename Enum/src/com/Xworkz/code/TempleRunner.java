package com.Xworkz.code;

public class TempleRunner {

	public static void main(String[] args) {
		Temple temple=new Temple("Btm");
		temple.ticketPrice=TempleTicketPrice.one_thousand;
		temple.prasada=true;
		temple.display();
		Temple temple1=new Temple("Chennai");
		temple.ticketPrice=TempleTicketPrice.two_thousand;
		temple.prasada=true;
		temple.display();
		// TODO Auto-generated method stub

	}

}
