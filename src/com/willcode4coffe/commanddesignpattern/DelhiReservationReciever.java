package com.willcode4coffe.commanddesignpattern;

import com.willcode4coffe.commands.ReservationReciever;

public class DelhiReservationReciever implements ReservationReciever {
	
	public DelhiReservationReciever() { 
		
	}
	public void showOffers() {
		System.out.println("Visit TaJ Mahal for 50 % off");
	}

	public void holdReservation() {
		System.out.println("Reservation is Held for Delhi Flight");
	}

	public void acceptPayment() {
		System.out.println("Payment is accepted in India Rupees");
	}

	public void cancelReservation() {
		System.out.println("The Delhi  Reservation was cancelled");
	}

	public void sendEmail() {
	System.out.println("DhanyaWad,Yatra Enjoy kare");	
	}

	
	public void bookHotel() {
		System.out.println("Your Hotel is booked in Taj , Mumbai");	
		
	}

}
