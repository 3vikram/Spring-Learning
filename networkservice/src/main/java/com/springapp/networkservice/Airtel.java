package com.springapp.networkservice;

public class Airtel implements SimCard{
	
		public void calling() {
			System.out.println("Calling using Airtel sim");
		}
		
		public void internet() {
			System.out.println("Using internet service via Airtel sim");
		}
		
}
