package com.startrek.test;

import junit.framework.TestCase;

import org.json.JSONObject;

import com.startrekrescue.model.bean.Localizacao;

// classe usada para o testar as funcionalidades do jason
public class TestJSon extends TestCase{

	public void test() {
		
		JSONObject obj = new JSONObject();
		Localizacao local = new Localizacao(3, 3);
		obj.put("localizacao", local);
		
		Localizacao localJson = (Localizacao) obj.get("localizacao");
		System.out.println(obj.toString());
		assertEquals(3, localJson.getX());
		
	}
}
