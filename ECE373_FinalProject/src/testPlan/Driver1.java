package testPlan;

import restaurantOwner.Application;

import restaurantOwner.Owner;

public class Driver1 {
	public static void main(String[] args) 
	{
		//Initialize the
		Application ReservationsApp = new Application();
		
		
		//Add restaurant owners to platform
		Owner firstOwner = new Owner();
		Owner secondOwner = new Owner();
		Owner thirdOwner = new Owner();
		
		//Set owner fields
		firstOwner.setName("Roberto Kupps");
		firstOwner.setEmail("roberto@gmail.com");
		firstOwner.setPhone("5204318765");
		firstOwner.setPassword("boat123");
		
		secondOwner.setName("Justin Champagne");
		secondOwner.setEmail("justin@gmail.com");
		secondOwner.setPhone("5204318744");
		secondOwner.setPassword("star123");
		
		thirdOwner.setName("Malcolm Blue");
		thirdOwner.setEmail("malcolm@gmail.com");
		thirdOwner.setPhone("5204312144");
		thirdOwner.setPassword("floor123");
		
		
		//Add Owners to application
		ReservationsApp.addOwner(firstOwner);
		ReservationsApp.addOwner(secondOwner);
		ReservationsApp.addOwner(thirdOwner);
		
		//Print owners to test
		System.out.println(firstOwner.toString());
		System.out.println(secondOwner.toString());
		System.out.println(thirdOwner.toString());
		
		
		
		
		
		
		
		
	}
}
