package com.asiaZeu.OODesign;

public class OODesignDelegationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TicketBookingByAgent agent=new TicketBookingByAgent(new TrainBooking());
agent.bookTicket();

agent=new TicketBookingByAgent(new AirBooking());
agent.bookTicket();
	}

}
