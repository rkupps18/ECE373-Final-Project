package testPlan;

import restaurantOwner.Application;
import restaurantOwner.Client;
import restaurantOwner.Owner;
import restaurantOwner.Restaurant;
import restaurantOwner.Server;
import restaurantOwner.Table;

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
		
		
		
		
		
		
		
		
		//Add Tables to each Restaurant
		Table t1r1 = new Table();
		Table t2r1 = new Table();
		Table t3r1 = new Table();
		Table t4r1 = new Table();
		
		Table t1r2 = new Table();
		Table t2r2 = new Table();
		Table t3r2 = new Table();
		Table t4r2 = new Table();
		
		Table t1r3 = new Table();
		Table t2r3 = new Table();
		Table t3r3 = new Table();
		Table t4r3 = new Table();
		
		
		//Set Table fields
		t1r1.setTableCapacity(10);
		t1r1.setTableNumber(1);
		t2r1.setTableCapacity(8);
		t2r1.setTableNumber(2);
		t3r1.setTableCapacity(5);
		t3r1.setTableNumber(3);
		t4r1.setTableCapacity(2);
		t4r1.setTableNumber(4);
		
		t1r2.setTableCapacity(10);
		t1r2.setTableNumber(1);
		t2r2.setTableCapacity(8);
		t2r2.setTableNumber(2);
		t3r2.setTableCapacity(5);
		t3r2.setTableNumber(3);
		t4r2.setTableCapacity(2);
		t4r2.setTableNumber(4);
		
		t1r3.setTableCapacity(10);
		t1r3.setTableNumber(1);
		t2r3.setTableCapacity(8);
		t2r3.setTableNumber(2);
		t3r3.setTableCapacity(5);
		t3r3.setTableNumber(3);
		t4r3.setTableCapacity(2);
		t4r3.setTableNumber(4);
		
		//addTables to Restaurant
		firstRestaurant.addTable(t1r1);
		firstRestaurant.addTable(t2r1);
		firstRestaurant.addTable(t3r1);
		firstRestaurant.addTable(t4r1);
		
		secondRestaurant.addTable(t1r2);
		secondRestaurant.addTable(t2r2);
		secondRestaurant.addTable(t3r2);
		secondRestaurant.addTable(t4r2);
		
		thirdRestaurant.addTable(t1r3);
		thirdRestaurant.addTable(t2r3);
		thirdRestaurant.addTable(t3r3);
		thirdRestaurant.addTable(t4r3);
		
		//Print tables to test
		System.out.println("Tables:" + "\n");
		firstRestaurant.printTables();
		System.out.println("\n");
		secondRestaurant.printTables();
		System.out.println("\n");
		thirdRestaurant.printTables();
		System.out.println("\n");
		
		
		
		
		
		
		
		//Add Servers to platform
		Server robot1r1 = new Server();
		Server robot2r1 = new Server();
		
		Server robot1r2 = new Server();
		Server robot2r2 = new Server();
		
		Server robot1r3 = new Server();
		Server robot2r3 = new Server();
		
		//Set server fields
		robot1r1.setServerID(1);
		robot2r1.setServerID(2);
		
		robot1r2.setServerID(1);
		robot2r2.setServerID(2);
		
		robot1r3.setServerID(1);
		robot2r3.setServerID(2);
		
		//Assign Servers to Table
		robot1r1.addTable(t1r1);
		robot1r1.addTable(t2r1);
		robot2r1.addTable(t3r1);
		robot2r1.addTable(t4r1);
		
		robot1r2.addTable(t1r2);
		robot1r2.addTable(t2r2);
		robot2r2.addTable(t3r2);
		robot2r2.addTable(t4r2);
		
		robot1r3.addTable(t1r3);
		robot1r3.addTable(t2r3);
		robot2r3.addTable(t3r3);
		robot2r3.addTable(t4r3);
		
		//Add Server to Restaurant
		firstRestaurant.addServer(robot1r1);
		firstRestaurant.addServer(robot2r1);
		
		secondRestaurant.addServer(robot1r2);
		secondRestaurant.addServer(robot2r2);
		
		thirdRestaurant.addServer(robot1r3);
		thirdRestaurant.addServer(robot2r3);
		
		//Print servers to test
		System.out.println("Tables:" + "\n");
		firstRestaurant.printServers();
		secondRestaurant.printServers();
		thirdRestaurant.printServers();
		
		
	}
}
