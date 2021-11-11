package restaurantOwner;

import java.util.ArrayList;

public class Restaurant {
	
	//Fields
	private String name;
	private String location;
	//private image menu; // How tf do you add an image? Also missing getters and setters for this
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

	public void addServer(Server s1) {
		servers.add(s1);
		//is this correct?
	}
	
	public void removeServer(Server s1) {
		if(servers.contains(s1)) {
			servers.remove(s1);
		}
		else {
			System.out.println("The server" + s1 + "is not a server here");
		}
	}
	
	public ArrayList<Server> getServers() {
		return servers;
	}

	public void addTable(Table t1) {
		tables.add(t1);
	}
	
	public void removeTable(Table t1) {
		if(tables.contains(t1)) {
			tables.remove(t1);
		}
		else {
			System.out.println("The table" + t1 + "is not a table here");
		}
	}
	
	public ArrayList<Table> getTables() {
		return tables;
	}

	public ArrayList<Reservation> getReservations() {
		return reservations;
	}	
	
	public Reservation searchReservation(Reservation r1) {
		//FIX ME
		//Return below added so it doesn't complain, but its still wrong
		return new Reservation();
	}
	
	public ArrayList<Reservation> checkTableReservations(Table t1){
		//FIX ME
		//Return below added so it doesn't complain, but its still wrong
		return reservations;
	}
	

}
