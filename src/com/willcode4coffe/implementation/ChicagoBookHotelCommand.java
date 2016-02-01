package com.willcode4coffe.implementation;

import com.willcode4coffe.commands.ReservationReciever;
import com.willcode4coffe.common.Command;

public class ChicagoBookHotelCommand implements Command {

	ReservationReciever reciever;

	public ChicagoBookHotelCommand(ReservationReciever reservationReciever) {

		reciever = reservationReciever;
	}

	// This Method will use the current Reciever passed ( Delhi,Tehran or
	// Chicago)
	public void execute() {

		reciever.bookHotel();
		reciever.showOffers();
		System.out.println("The above will book Hotel in Chicago");
	}

}
