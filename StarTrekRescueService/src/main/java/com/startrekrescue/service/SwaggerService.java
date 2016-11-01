package com.startrekrescue.service;


import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;

@ApplicationPath("/v1")
public class SwaggerService extends Application{

	public SwaggerService() {
		BeanConfig conf = new BeanConfig();
		conf.setTitle("Star Trek Rescue Service");
		conf.setDescription("Serviço para acesso ao Star Trek Rescue");
		conf.setVersion("1.0.0");
		conf.setHost("localhost:8080");
		conf.setBasePath("/StarTrekRescueService/v1");
		conf.setSchemes(new String[] { "http" });
		conf.setResourcePackage("com.startrekrescue.service");
		conf.setScan(true);
	}
	
	 @Override
	  public Set<Class<?>> getClasses() {
	      Set<Class<?>> resources = new HashSet<>();
	      resources.add(StarTrekRescueService.class);
	      resources.add(ApiListingResource.class);
	      resources.add(SwaggerSerializers.class);
	      return resources;
	   }
}
