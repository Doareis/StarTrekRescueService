package com.startrek.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import junit.framework.TestCase;
import com.startrekrescue.control.Controller;

/*
 * Testa o servico com a planicie inicial (sem sinalizadores lancados)
 */
public class TestStarTrekRescueService extends TestCase{

	public void test(){
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080");
		
		String planicie = target.path("StarTrekRescueService/rest/service/planicie").request().get(String.class);
		Controller controller = new Controller();
		
		assertEquals(planicie, controller.planicieToString());
	}
	
}
