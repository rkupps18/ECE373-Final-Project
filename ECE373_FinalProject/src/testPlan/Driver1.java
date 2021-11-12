package testPlan;

import restaurantOwner.Application;
import restaurantOwner.Client;
import restaurantOwner.Owner;
import restaurantOwner.Restaurant;

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
		System.out.println("Owners:" + "\n");
		ReservationsApp.printOwners();
		
		
		//Add Restaurants to platform
		Restaurant firstRestaurant = new Restaurant();
		Restaurant secondRestaurant = new Restaurant();
		Restaurant thirdRestaurant = new Restaurant();
		
		//Set Restaurant fields
		firstRestaurant.setName("Roberto's Restaurant");
		firstRestaurant.setLocation("1809 N Park Ave");
		firstRestaurant.setRestaurantOwner(firstOwner);
		
		secondRestaurant.setName("Justin's Restaurant");
		secondRestaurant.setLocation("1701 N Park Ave");
		secondRestaurant.setRestaurantOwner(secondOwner);
		
		thirdRestaurant.setName("Malcolm's Restaurant");
		thirdRestaurant.setLocation("1654 N Park Ave");
		thirdRestaurant.setRestaurantOwner(thirdOwner);
		
		//Add Restaurants to Application
		ReservationsApp.addRestaurant(firstRestaurant);
		ReservationsApp.addRestaurant(secondRestaurant);
		ReservationsApp.addRestaurant(thirdRestaurant);
		
		//print Restaurants to test
		System.out.println("Restaurants:" + "\n");
		ReservationsApp.printRestaurants();
		
		
		
		//Add clients to platform
		Client firstClient = new Client();
		Client secondClient = new Client();
		Client thirdClient = new Client();
		
		//Set Client Fields
		firstClient.setName("Daniel Johnson");
		firstClient.setEmail("daniel@gmail.com");
		firstClient.setPhone("5203568743");
		firstClient.setPassword("play123");
		
		secondClient.setName("Abraham Lincoln");
		secondClient.setEmail("abraham@gmail.com");
		secondClient.setPhone("5203228743");
		secondClient.setPassword("sing123");
		
		thirdClient.setName("Alex Stevens");
		thirdClient.setEmail("alex@gmail.com");
		thirdClient.setPhone("5203525367");
		thirdClient.setPassword("stay123");
		
		//Add Owners to application
		ReservationsApp.addClient(firstClient);
		ReservationsApp.addClient(secondClient);
		ReservationsApp.addClient(thirdClient);
		
		//Print clients to test
		System.out.println("Clients:" + "\n");
		ReservationsApp.printClients();
		
		
		
		
		
	}
}
