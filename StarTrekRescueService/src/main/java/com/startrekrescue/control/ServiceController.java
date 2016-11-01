package com.startrekrescue.control;


public class ServiceController {
	
	private final static Controller controller = new Controller();

	public static Controller getController(){
		return controller;
	}
}
