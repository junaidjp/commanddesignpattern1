package com.willcode4coffe.commanddesignpattern;

import com.willcode4coffe.commands.ReservationReciever;

public class TehranReservationReciever implements ReservationReciever {
	public TehranReservationReciever() { 
		
	}
	public void showOffers() {
		System.out.println("Visit shiraz for 40 %");
	}

	public void holdReservation() {
		System.out.println("Reservation is Held for tehran Flight");
	}

	public void acceptPayment() {
		System.out.println("Payment is accepted in tehran riyals");
	}

	public void cancelReservation() {
		System.out.println("The Tehran  Reservation was cancelled");
	}

	public void sendEmail() {
		System.out.println("Shukran");
	}

	public void bookHotel() {
		System.out.println("Your Hotel is booked in Taj , Mumbai");

	}

}
