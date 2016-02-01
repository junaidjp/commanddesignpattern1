package com.willcode4coffe.testing;

import com.willcode4coffe.commanddesignpattern.ChicagoReservationReciever;
import com.willcode4coffe.commanddesignpattern.DelhiReservationReciever;
import com.willcode4coffe.implementation.ChicagoBookHotelCommand;
import com.willcode4coffe.implementation.DelhiHoldReservationCommand;
import com.willcode4coffe.invoker.Invoker;

public class TestReservationCommands {

	public TestReservationCommands() {

		Invoker invoker = new Invoker();
		ChicagoReservationReciever chicagoResReciever = new ChicagoReservationReciever();
		ChicagoBookHotelCommand chicagoBookHotel = new ChicagoBookHotelCommand(chicagoResReciever);
		invoker.setCommand(chicagoBookHotel);
		invoker.run();
		
		DelhiReservationReciever delhiResReciever = new DelhiReservationReciever();
		DelhiHoldReservationCommand delhiReservation = new DelhiHoldReservationCommand(delhiResReciever);
		invoker.setCommand(delhiReservation);
		invoker.run();

	}

	public static void main(String args[]) {
		TestReservationCommands testReservation = new TestReservationCommands();
	}

}
