package com.cat.task;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

public class PrintTask extends Task {
	public String message;

	@Override
	public void execute() throws BuildException {
		System.out.println(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
