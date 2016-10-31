package com.startrek.test;

import org.json.JSONObject;

import junit.framework.TestCase;

import com.startrekrescue.control.Controller;

// classe usada para o testar as funcionalidades do jason
public class TestJason extends TestCase{

	public void test() {
		
		JSONObject obj = new JSONObject();
		Controller controller = new Controller();
		
		obj.put("planicie", controller.getPlanicie());
		int [][] x = (int[][]) obj.get("planicie");
		assertEquals(0, x[0][0]);
		
		
		
		
	}
}
