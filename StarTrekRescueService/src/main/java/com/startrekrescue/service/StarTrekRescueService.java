package com.startrekrescue.service;

import io.swagger.annotations.Api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.startrekrescue.control.ServiceController;
import com.startrekrescue.model.bean.Localizacao;

@Api
@Path("/service")
public class StarTrekRescueService {

	@POST
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	@Path("/sinalizador")
	public String lancaSinalizador(Localizacao local){
		
		if (local != null){
			int coordenadaX = local.getX() - 1;
			int coordenadaY = local.getY() - 1;
			ServiceController.getController().lancaSinalizador(coordenadaX, coordenadaY);
			return "Sinalizador lançado com sucesso";
		}
		else {
			return "Coordenadas de lançamento são inválidas";
		}

	}
	
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/planicie")
	public String getPlanicie(){
		
		return ServiceController.getController().planicieToString();

	}
}
