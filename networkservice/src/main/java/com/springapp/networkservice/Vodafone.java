package com.springapp.networkservice;

public class Vodafone implements SimCard {
	
	public void calling() {
		System.out.println("Calling using Vodafone sim");
	}
	
	public void internet() {
		System.out.println("Using internet service via Vodafone sim");
	}

}
