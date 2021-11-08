package restaurantOwner;

import java.util.ArrayList;

public class Restaurant {
	
	//Fields
	private String name;
	private String location;
	//private image menu; // How tf do you add an image?
	private Owner restaurantOwner;
	private ArrayList<Server> servers = new ArrayList<Server>();
	private ArrayList<Table> tables = new ArrayList<Table>();
	private ArrayList<Reservation> reservations = new ArrayList<Reservation>();

	
	
	//Methods
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Owner getRestaurantOwner() {
		return restaurantOwner;
	}

	public void setRestaurantOwner(Owner restaurantOwner) {
		this.restaurantOwner = restaurantOwner;
	}

	public ArrayList<Server> getServers() {
		return servers;
	}

	public ArrayList<Table> getTables() {
		return tables;
	}

	public ArrayList<Reservation> getReservations() {
		return reservations;
	}	
	

}
