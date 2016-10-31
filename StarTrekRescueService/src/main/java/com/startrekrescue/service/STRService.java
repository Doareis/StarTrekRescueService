package com.startrekrescue.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.startrekrescue.control.Controller;

@Path("/planicie")
public class STRService {

	@GET
	@Produces("application/json; charset=UTF-8")
	public String sMsg(){
		
		Controller controller = new Controller();
		return controller.planicieToString();

	}
	
}
