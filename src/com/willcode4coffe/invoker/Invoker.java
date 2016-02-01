package com.willcode4coffe.invoker;

import com.willcode4coffe.common.Command;

public class Invoker {

	Command command;

	public Invoker() {

	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void run() {
		command.execute();
	}
}
