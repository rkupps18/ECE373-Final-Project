package restaurantOwner;

import java.util.ArrayList;

public class Application {

	//Fields 
	private ArrayList<Client> clients = new ArrayList<Client>();
	private ArrayList<Owner> owners = new ArrayList<Owner>();
	private ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
	
	
	//Methods
	public ArrayList<Client> getClients() {
		return clients;
	}

	public ArrayList<Owner> getOwners() {
		return owners;
	}

	public ArrayList<Restaurant> getRestaurants() {
		return restaurants;
	}
	
	public void addClient(Client c1) {
		clients.add(c1);
	}
	
	public void addOwner(Owner o1) {
		owners.add(o1);
	}
	
	
	
}
