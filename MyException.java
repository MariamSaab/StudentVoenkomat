package com.gmail.oturisme;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Impossible to add!";
	}

}
