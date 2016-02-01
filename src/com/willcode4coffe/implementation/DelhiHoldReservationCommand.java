package com.willcode4coffe.implementation;

import com.willcode4coffe.commands.ReservationReciever;
import com.willcode4coffe.common.Command;

public class DelhiHoldReservationCommand implements Command {

	ReservationReciever reciever;

	public DelhiHoldReservationCommand(ReservationReciever reservationReciever) {

		reciever = reservationReciever;
	}

	public void execute() {

		reciever.holdReservation();
		reciever.showOffers();
		System.out.println("The above will hold a reservation for Delhi");
	}

}
