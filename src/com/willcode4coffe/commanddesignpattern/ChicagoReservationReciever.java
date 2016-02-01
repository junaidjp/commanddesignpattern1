package com.willcode4coffe.commanddesignpattern;

import com.willcode4coffe.commands.ReservationReciever;

public class ChicagoReservationReciever implements ReservationReciever {

	public ChicagoReservationReciever() { 
		
	}
	
	public void showOffers() {
		System.out.println("Visit Brookfield Zoo for 70% off");
	}

	public void holdReservation() {
		System.out.println("Reservation is Held for Chicago flight");
	}

	public void acceptPayment() {
		System.out.println("Payment is accepted in USD Dollars");
	}

	public void cancelReservation() {
		System.out.println("The Chicago   Reservation was cancelled");
	}

	public void sendEmail() {
		System.out.println("Thank you for booking, Enjoy");
	}

	public void bookHotel() {
		System.out.println("Your Hotel is booked in Hilton, Chicago");

	}

}
