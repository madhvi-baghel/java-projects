package com.jspiders.adapterpattern.main;

import com.jspiders.adapterpattern.adapter.EmpEventAdapter;

public class AdapterMain {

	public static void main(String[] args) {
		EmpEventAdapter adapter = new EmpEventAdapter();
		adapter.id = 1;
		adapter.name = "Sara";
		adapter.email = "sara@gmail.com";
		adapter.contact = 9876543210L;
		adapter.designation = "Frontend Developer";
		
		adapter.womensDay();

	}

}
