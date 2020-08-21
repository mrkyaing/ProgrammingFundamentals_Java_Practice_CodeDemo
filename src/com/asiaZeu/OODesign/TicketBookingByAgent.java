package com.asiaZeu.OODesign;

public class TicketBookingByAgent implements TravelBooking{
	 TravelBooking t;
	 
	public TicketBookingByAgent(TravelBooking t) {
	
		this.t = t;
	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
	t.bookTicket();
	}

}
