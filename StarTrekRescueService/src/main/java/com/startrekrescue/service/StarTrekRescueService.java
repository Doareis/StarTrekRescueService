package com.startrekrescue.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.startrekrescue.control.ServiceController;
import com.startrekrescue.model.bean.Localizacao;

@Path("/service")
public class StarTrekRescueService {

	@POST
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	@Path("/sinalizador")
	public String lancaSinalizador(Localizacao local){
		
		ServiceController.getController().lancaSinalizador(local.getX(), local.getY());
		return "Sinalizador lançado com sucesso";

	}
	
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/planicie")
	public String getPlanicie(){
		
		return ServiceController.getController().planicieToString();

	}
}
